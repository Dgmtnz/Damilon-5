import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.websocket.WsContext;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebServer {

    private final Map<String, GameSession> sessions = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        new WebServer().start(port);
    }

    public void start(int port) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add(staticFiles -> {
                staticFiles.hostedPath = "/";
                staticFiles.directory = "public";
                staticFiles.location = Location.CLASSPATH;
            });
            config.showJavalinBanner = false;
            config.jetty.modifyWebSocketServletFactory(factory ->
                    factory.setIdleTimeout(Duration.ofHours(1)));
        });

        app.get("/health", ctx -> ctx.result("ok"));

        app.ws("/ws", ws -> {
            ws.onConnect(ctx -> {
                try {
                    GameSession session = new GameSession(message -> {
                        if (ctx.session.isOpen()) {
                            ctx.send(message);
                        }
                    });
                    sessions.put(ctx.sessionId(), session);
                    ctx.send("{\"type\":\"connected\"}");
                    session.start();
                } catch (IOException e) {
                    ctx.send("{\"type\":\"error\",\"data\":\"No se pudo iniciar la partida\"}");
                    ctx.session.close();
                }
            });

            ws.onMessage(ctx -> {
                String message = ctx.message();
                if (message.contains("\"type\":\"ping\"") || message.contains("\"type\": \"ping\"")) {
                    ctx.send("{\"type\":\"pong\"}");
                    return;
                }
                GameSession session = sessions.get(ctx.sessionId());
                if (session == null) {
                    return;
                }
                if (message.startsWith("{")) {
                    session.handleInput(extractInputData(message));
                } else {
                    session.handleInput(message);
                }
            });

            ws.onClose(ctx -> closeSession(ctx));
            ws.onError(ctx -> closeSession(ctx));
        });

        app.start(port);
        System.out.println("Damilon 5 web server listening on port " + port);
    }

    private void closeSession(WsContext ctx) {
        GameSession session = sessions.remove(ctx.sessionId());
        if (session != null) {
            session.stop();
        }
    }

    private String extractInputData(String json) {
        int dataIndex = json.indexOf("\"data\"");
        if (dataIndex < 0) {
            return json;
        }
        int colon = json.indexOf(':', dataIndex);
        int firstQuote = json.indexOf('"', colon + 1);
        if (firstQuote < 0) {
            return json;
        }
        StringBuilder value = new StringBuilder();
        boolean escaping = false;
        for (int i = firstQuote + 1; i < json.length(); i++) {
            char c = json.charAt(i);
            if (escaping) {
                switch (c) {
                    case 'n' -> value.append('\n');
                    case 'r' -> value.append('\r');
                    case 't' -> value.append('\t');
                    case '"' -> value.append('"');
                    case '\\' -> value.append('\\');
                    default -> value.append(c);
                }
                escaping = false;
            } else if (c == '\\') {
                escaping = true;
            } else if (c == '"') {
                break;
            } else {
                value.append(c);
            }
        }
        return value.toString();
    }
}
