import java.io.IOException;
import java.io.PrintStream;
import java.util.function.Consumer;

public class GameSession implements Runnable {

    private final GameIO gameIO;
    private final Consumer<String> sendMessage;
    private volatile boolean running = true;
    private Thread gameThread;

    public GameSession(Consumer<String> sendMessage) throws IOException {
        this.sendMessage = sendMessage;
        this.gameIO = new GameIO();
        this.gameIO.setOnOutput(text -> {
            if (text == null || text.isEmpty()) {
                return;
            }
            sendJson("output", escapeJson(text));
        });
        this.gameIO.setOnAwaitingInput(this::sendPrompt);
        this.gameIO.setOnClearScreen(() -> sendMessage.accept("{\"type\":\"clear\"}"));
    }

    public void start() {
        gameThread = new Thread(this, "damilon5-game");
        gameThread.setDaemon(true);
        gameThread.start();
    }

    public void handleInput(String data) {
        try {
            if (!data.endsWith("\n") && !data.endsWith("\r")) {
                data = data + "\n";
            }
            gameIO.sendInput(data);
        } catch (IOException e) {
            sendJson("error", escapeJson("No se pudo enviar la entrada: " + e.getMessage()));
        }
    }

    public void stop() {
        running = false;
        gameIO.close();
        if (gameThread != null) {
            gameThread.interrupt();
        }
    }

    @Override
    public void run() {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        java.io.InputStream originalIn = System.in;

        try {
            System.setOut(gameIO.getPrintStream());
            System.setErr(gameIO.getErrorStream());
            System.setIn(gameIO.getInputStream());
            Main.webMode = true;

            Main main = new Main();
            main.iniciarJuegoWeb();
        } catch (Exception e) {
            if (running) {
                sendJson("error", escapeJson("Error en la partida: " + e.getMessage()));
            }
        } finally {
            Main.webMode = false;
            System.setOut(originalOut);
            System.setErr(originalErr);
            System.setIn(originalIn);
            gameIO.close();
            sendJson("closed", "\"\"");
        }
    }

    private void sendPrompt() {
        OutputParser.PromptInfo prompt = OutputParser.parse(gameIO.getOutputBuffer());
        StringBuilder json = new StringBuilder();
        json.append("{\"type\":\"prompt\",\"mode\":\"").append(prompt.mode).append("\",\"choices\":[");
        for (int i = 0; i < prompt.choices.size(); i++) {
            OutputParser.Choice choice = prompt.choices.get(i);
            if (i > 0) {
                json.append(',');
            }
            json.append("{\"value\":").append(escapeJson(choice.value))
                    .append(",\"label\":").append(escapeJson(choice.label)).append("}");
        }
        json.append("]}");
        sendMessage.accept(json.toString());
    }

    private void sendJson(String type, String valueFragment) {
        sendMessage.accept("{\"type\":\"" + type + "\",\"data\":" + valueFragment + "}");
    }

    static String escapeJson(String text) {
        if (text == null) {
            return "\"\"";
        }
        StringBuilder escaped = new StringBuilder(text.length() + 16);
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '\\' -> escaped.append("\\\\");
                case '"' -> escaped.append("\\\"");
                case '\r' -> escaped.append("\\r");
                case '\n' -> escaped.append("\\n");
                case '\t' -> escaped.append("\\t");
                default -> {
                    if (c < 0x20) {
                        escaped.append(String.format("\\u%04x", (int) c));
                    } else {
                        escaped.append(c);
                    }
                }
            }
        }
        return "\"" + escaped + "\"";
    }
}
