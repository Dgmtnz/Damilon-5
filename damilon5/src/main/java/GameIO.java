import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GameIO {

    private final PipedInputStream pipedIn;
    private final PipedOutputStream pipedOut;
    private final StringBuilder outputBuffer = new StringBuilder();
    private final SessionInputStream sessionIn;
    private final PrintStream gameOut;
    private final PrintStream gameErr;

    private Consumer<String> onOutput;
    private Runnable onAwaitingInput;
    private Runnable onClearScreen;

    private volatile boolean inputNotified;

    public GameIO() throws IOException {
        pipedIn = new PipedInputStream(64 * 1024);
        pipedOut = new PipedOutputStream(pipedIn);
        sessionIn = new SessionInputStream(pipedIn);
        gameOut = new PrintStream(new SessionOutputStream(System.out), true, StandardCharsets.UTF_8);
        gameErr = new PrintStream(new SessionOutputStream(System.err), true, StandardCharsets.UTF_8);
    }

    public void setOnOutput(Consumer<String> onOutput) {
        this.onOutput = onOutput;
    }

    public void setOnAwaitingInput(Runnable onAwaitingInput) {
        this.onAwaitingInput = onAwaitingInput;
    }

    public void setOnClearScreen(Runnable onClearScreen) {
        this.onClearScreen = onClearScreen;
    }

    public InputStream getInputStream() {
        return sessionIn;
    }

    public PrintStream getPrintStream() {
        return gameOut;
    }

    public PrintStream getErrorStream() {
        return gameErr;
    }

    public String getOutputBuffer() {
        synchronized (outputBuffer) {
            return outputBuffer.toString();
        }
    }

    public void sendInput(String data) throws IOException {
        synchronized (pipedOut) {
            inputNotified = false;
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            pipedOut.write(bytes);
            pipedOut.flush();
        }
    }

    public void close() {
        try {
            pipedOut.close();
        } catch (IOException ignored) {
        }
        try {
            pipedIn.close();
        } catch (IOException ignored) {
        }
        gameOut.close();
        gameErr.close();
    }

    private void appendOutput(String text) {
        if (text == null || text.isEmpty()) {
            return;
        }
        synchronized (outputBuffer) {
            outputBuffer.append(text);
            if (outputBuffer.length() > 200_000) {
                outputBuffer.delete(0, outputBuffer.length() - 100_000);
            }
        }
        if (onOutput != null) {
            onOutput.accept(text);
        }
    }

    private void notifyAwaitingInput() {
        if (inputNotified) {
            return;
        }
        inputNotified = true;
        if (onAwaitingInput != null) {
            onAwaitingInput.run();
        }
    }

    private class SessionOutputStream extends OutputStream {
        private final PrintStream original;
        private final StringBuilder lineBuffer = new StringBuilder();
        private final byte[] pending = new byte[4];
        private int pendingLen = 0;

        SessionOutputStream(PrintStream original) {
            this.original = original;
        }

        @Override
        public void write(int b) throws IOException {
            write(new byte[] {(byte) b}, 0, 1);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            byte[] input;
            if (pendingLen > 0) {
                input = new byte[pendingLen + len];
                System.arraycopy(pending, 0, input, 0, pendingLen);
                System.arraycopy(b, off, input, pendingLen, len);
                pendingLen = 0;
                off = 0;
                len = input.length;
                b = input;
            }

            int index = off;
            int end = off + len;
            while (index < end) {
                int charBytes = utf8CharByteLength(b[index]);
                if (index + charBytes > end) {
                    System.arraycopy(b, index, pending, 0, end - index);
                    pendingLen = end - index;
                    return;
                }
                appendDecoded(new String(b, index, charBytes, StandardCharsets.UTF_8));
                index += charBytes;
            }
        }

        private int utf8CharByteLength(byte firstByte) {
            int value = firstByte & 0xFF;
            if (value < 0x80) {
                return 1;
            }
            if ((value & 0xE0) == 0xC0) {
                return 2;
            }
            if ((value & 0xF0) == 0xE0) {
                return 3;
            }
            if ((value & 0xF8) == 0xF0) {
                return 4;
            }
            return 1;
        }

        private void appendDecoded(String text) {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                lineBuffer.append(c);
                if (c == '\n') {
                    flushLine();
                }
            }
        }

        @Override
        public void flush() throws IOException {
            if (pendingLen > 0) {
                appendDecoded(new String(pending, 0, pendingLen, StandardCharsets.UTF_8));
                pendingLen = 0;
            }
            if (lineBuffer.length() > 0) {
                flushLine();
            }
        }

        private void flushLine() {
            String text = lineBuffer.toString();
            lineBuffer.setLength(0);
            if (text.contains("\u001B[2J")) {
                synchronized (outputBuffer) {
                    outputBuffer.setLength(0);
                }
                if (onClearScreen != null) {
                    onClearScreen.run();
                }
                original.print(text);
                return;
            }
            appendOutput(text);
            original.print(text);
        }

        @Override
        public void close() throws IOException {
            flush();
        }
    }

    private class SessionInputStream extends InputStream {
        private final PipedInputStream source;

        SessionInputStream(PipedInputStream source) {
            this.source = source;
        }

        @Override
        public int read() throws IOException {
            waitForInput();
            return source.read();
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            waitForInput();
            return source.read(b, off, len);
        }

        private void waitForInput() throws IOException {
            if (source.available() == 0) {
                notifyAwaitingInput();
            }
        }
    }
}
