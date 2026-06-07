(function () {
    const statusEl = document.getElementById("status");
    const reconnectBtn = document.getElementById("reconnect-btn");
    const terminalEl = document.getElementById("terminal");

    const GAME_COLS = 80;
    const GAME_ROWS_MIN = 24;
    const PING_INTERVAL_MS = 25000;

    const term = new Terminal({
        cursorBlink: true,
        convertEol: true,
        fontFamily: '"IBM Plex Mono", "Fira Code", "Consolas", monospace',
        fontSize: 12,
        lineHeight: 1,
        letterSpacing: 0,
        theme: {
            background: "#000000",
            foreground: "#d8e1e8",
            cursor: "#3ddc97"
        },
        scrollback: 1000,
        cols: GAME_COLS,
        rows: GAME_ROWS_MIN
    });

    term.open(terminalEl);

    function getCellSize() {
        const dims = term._core?._renderService?.dimensions?.css;
        return {
            width: dims?.cell?.width || 7,
            height: dims?.cell?.height || 14
        };
    }

    function fitTerminal() {
        const width = terminalEl.clientWidth - 8;
        const height = terminalEl.clientHeight - 8;
        if (width <= 0 || height <= 0) {
            return;
        }

        let fontSize = 12;
        term.options.fontSize = fontSize;
        term.options.lineHeight = 1;
        term.resize(GAME_COLS, GAME_ROWS_MIN);

        let cell = getCellSize();
        while (fontSize > 9 && cell.width * GAME_COLS > width) {
            fontSize -= 1;
            term.options.fontSize = fontSize;
            term.resize(GAME_COLS, GAME_ROWS_MIN);
            cell = getCellSize();
        }

        let rows = Math.max(GAME_ROWS_MIN, Math.floor(height / cell.height));
        while (rows > GAME_ROWS_MIN && rows * cell.height > height) {
            rows -= 1;
        }

        term.resize(GAME_COLS, rows);
    }

    function clearTerminal() {
        term.clear();
        term.scrollToTop();
    }

    function writeOutput(data) {
        if (!data) {
            return;
        }
        if (data.indexOf("\u001b[2J") !== -1 || data.indexOf("\x1b[2J") !== -1) {
            clearTerminal();
            data = data
                .replace(/\u001b\[2J\u001b\[[0-9;]*H/g, "")
                .replace(/\x1b\[2J\x1b\[[0-9;]*H/g, "");
        }
        if (data) {
            term.write(data);
            term.scrollToBottom();
        }
    }

    let fitTimer = null;
    function scheduleFit() {
        if (fitTimer) {
            clearTimeout(fitTimer);
        }
        fitTimer = setTimeout(() => {
            fitTimer = null;
            fitTerminal();
        }, 50);
    }

    window.addEventListener("resize", scheduleFit);
    new ResizeObserver(scheduleFit).observe(terminalEl);
    requestAnimationFrame(fitTerminal);

    let ws = null;
    let inputBuffer = "";
    let pingTimer = null;

    function wsUrl() {
        const protocol = window.location.protocol === "https:" ? "wss:" : "ws:";
        return protocol + "//" + window.location.host + "/ws";
    }

    function setStatus(text, connected) {
        statusEl.textContent = text;
        statusEl.classList.toggle("connected", !!connected);
    }

    function stopPing() {
        if (pingTimer) {
            clearInterval(pingTimer);
            pingTimer = null;
        }
    }

    function startPing() {
        stopPing();
        pingTimer = setInterval(() => {
            if (ws && ws.readyState === WebSocket.OPEN) {
                ws.send(JSON.stringify({ type: "ping" }));
            }
        }, PING_INTERVAL_MS);
    }

    function showReconnect() {
        reconnectBtn.classList.remove("hidden");
    }

    function hideReconnect() {
        reconnectBtn.classList.add("hidden");
    }

    function sendInput(data) {
        if (!ws || ws.readyState !== WebSocket.OPEN) {
            return;
        }
        ws.send(JSON.stringify({ type: "input", data: data }));
    }

    function handleMessage(raw) {
        let message;
        try {
            message = JSON.parse(raw);
        } catch (error) {
            writeOutput(raw);
            return;
        }

        switch (message.type) {
            case "connected":
                setStatus("Conectado", true);
                hideReconnect();
                break;
            case "output":
                writeOutput(message.data || "");
                break;
            case "clear":
                clearTerminal();
                break;
            case "prompt":
                MobileBar.renderPrompt(message);
                break;
            case "pong":
                break;
            case "error":
                writeOutput("\r\n[Error] " + (message.data || "desconocido") + "\r\n");
                setStatus("Error", false);
                break;
            case "closed":
                setStatus("Partida finalizada", false);
                showReconnect();
                break;
            default:
                break;
        }
    }

    function connect() {
        if (ws && (ws.readyState === WebSocket.OPEN || ws.readyState === WebSocket.CONNECTING)) {
            return;
        }

        setStatus("Conectando…", false);
        hideReconnect();
        ws = new WebSocket(wsUrl());

        ws.addEventListener("open", () => {
            setStatus("Conectado", true);
            startPing();
        });

        ws.addEventListener("message", (event) => {
            handleMessage(event.data);
        });

        ws.addEventListener("close", () => {
            stopPing();
            setStatus("Desconectado", false);
            showReconnect();
        });

        ws.addEventListener("error", () => {
            setStatus("Error de conexión", false);
        });
    }

    reconnectBtn.addEventListener("click", () => {
        stopPing();
        if (ws) {
            ws.onclose = null;
            ws.close();
            ws = null;
        }
        clearTerminal();
        connect();
    });

    term.onData((data) => {
        inputBuffer += data;
        if (data === "\r") {
            sendInput(inputBuffer);
            inputBuffer = "";
            return;
        }
        if (data === "\u007f") {
            if (inputBuffer.length > 0) {
                inputBuffer = inputBuffer.slice(0, -1);
                term.write("\b \b");
            }
            return;
        }
        term.write(data);
    });

    MobileBar.init(sendInput);
    connect();
})();
