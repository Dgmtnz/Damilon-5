(function () {
    const mobileBar = document.getElementById("mobile-bar");
    const choiceScroll = document.getElementById("choice-scroll");
    const actionRow = document.getElementById("action-row");
    const textRow = document.getElementById("text-row");
    const textInput = document.getElementById("text-input");
    const textSend = document.getElementById("text-send");
    const gameShell = document.querySelector(".game-shell");

    let sendInput = null;

    function isMobileUi() {
        return window.matchMedia("(max-width: 768px), (pointer: coarse)").matches;
    }

    function updateVisibility() {
        if (!isMobileUi()) {
            mobileBar.classList.add("hidden");
            gameShell.classList.remove("has-mobile-bar");
            return;
        }
        mobileBar.classList.remove("hidden");
        gameShell.classList.add("has-mobile-bar");
    }

    function clearRows() {
        choiceScroll.innerHTML = "";
        actionRow.innerHTML = "";
        actionRow.classList.add("hidden");
        textRow.classList.add("hidden");
    }

    function createButton(label, value, title) {
        const button = document.createElement("button");
        button.type = "button";
        button.className = "choice-btn";
        button.textContent = label;
        button.title = title || label;
        button.addEventListener("click", () => {
            if (!sendInput) return;
            if (value === "") {
                sendInput("\n");
            } else {
                sendInput(value + "\n");
            }
        });
        return button;
    }

    function renderPrompt(prompt) {
        if (!isMobileUi()) {
            return;
        }

        clearRows();
        const mode = prompt.mode || "numeric";
        const choices = prompt.choices || [];

        if (mode === "text") {
            textRow.classList.remove("hidden");
            textInput.value = "";
            textInput.focus();
            return;
        }

        if (mode === "wasd" || mode === "ad") {
            actionRow.classList.remove("hidden");
            choices.forEach((choice) => {
                const label = choice.value === "" ? "↵" : choice.value.toUpperCase();
                actionRow.appendChild(createButton(label, choice.value, choice.label));
            });
        }

        choices.forEach((choice) => {
            if (mode === "wasd" || mode === "ad") {
                return;
            }
            const label = choice.value || "?";
            choiceScroll.appendChild(createButton(label, choice.value, choice.label));
        });

        if (choiceScroll.children.length === 0) {
            for (let i = 1; i <= 9; i++) {
                choiceScroll.appendChild(createButton(String(i), String(i), String(i)));
            }
        }
    }

    function init(onSend) {
        sendInput = onSend;
        updateVisibility();
        window.addEventListener("resize", updateVisibility);

        textSend.addEventListener("click", () => {
            if (!sendInput || !textInput.value) return;
            sendInput(textInput.value + "\n");
            textInput.value = "";
        });

        textInput.addEventListener("keydown", (event) => {
            if (event.key === "Enter" && textInput.value) {
                sendInput(textInput.value + "\n");
                textInput.value = "";
            }
        });
    }

    window.MobileBar = {
        init,
        renderPrompt,
        updateVisibility
    };
})();
