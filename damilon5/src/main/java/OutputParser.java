import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputParser {

    public static class Choice {
        public final String value;
        public final String label;

        public Choice(String value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    public static class PromptInfo {
        public final String mode;
        public final List<Choice> choices;

        public PromptInfo(String mode, List<Choice> choices) {
            this.mode = mode;
            this.choices = choices;
        }
    }

    private static final Pattern MENU_OPTION = Pattern.compile("^\\s*(\\d+)\\.\\s+(.+)$", Pattern.MULTILINE);
    private static final Pattern PULSA_OPTION = Pattern.compile("Pulsa\\s+(\\d+)\\s+para\\s+(.+)", Pattern.CASE_INSENSITIVE);

    public static PromptInfo parse(String output) {
        if (output == null || output.isBlank()) {
            return defaultNumeric();
        }

        String tail = output.length() > 4000 ? output.substring(output.length() - 4000) : output;
        String lower = tail.toLowerCase();

        if (lower.contains("w/a/s/d") || lower.contains("usa w, a, s, d") || lower.contains("mueve con w")) {
            return new PromptInfo("wasd", List.of(
                    new Choice("w", "Arriba"),
                    new Choice("a", "Izquierda"),
                    new Choice("s", "Abajo"),
                    new Choice("d", "Derecha")
            ));
        }

        if (lower.contains("a=izq") || lower.contains("a = izq") || lower.contains("mueve (a=izq")) {
            return new PromptInfo("ad", List.of(
                    new Choice("a", "Izquierda"),
                    new Choice("d", "Derecha"),
                    new Choice("", "Esperar")
            ));
        }

        if (lower.contains("secuencia") || lower.contains("introduce la secuencia") || lower.contains("repite la secuencia")) {
            return new PromptInfo("text", List.of(new Choice("", "Escribir secuencia")));
        }

        Map<String, String> menuOptions = new LinkedHashMap<>();
        Matcher menuMatcher = MENU_OPTION.matcher(tail);
        while (menuMatcher.find()) {
            menuOptions.put(menuMatcher.group(1), menuMatcher.group(2).trim());
        }
        if (!menuOptions.isEmpty()) {
            return toPrompt("numeric", menuOptions);
        }

        Map<String, String> pulsaOptions = new LinkedHashMap<>();
        Matcher pulsaMatcher = PULSA_OPTION.matcher(tail);
        while (pulsaMatcher.find()) {
            pulsaOptions.put(pulsaMatcher.group(1), pulsaMatcher.group(2).trim());
        }
        if (!pulsaOptions.isEmpty()) {
            return toPrompt("numeric", pulsaOptions);
        }

        if (lower.contains("elige una opción") || lower.contains("elige una opcion") || lower.contains("opciones:")) {
            return defaultNumeric();
        }

        return defaultNumeric();
    }

    private static PromptInfo defaultNumeric() {
        List<Choice> choices = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            choices.add(new Choice(String.valueOf(i), String.valueOf(i)));
        }
        return new PromptInfo("numeric", choices);
    }

    private static PromptInfo toPrompt(String mode, Map<String, String> options) {
        List<Choice> choices = new ArrayList<>();
        for (Map.Entry<String, String> entry : options.entrySet()) {
            choices.add(new Choice(entry.getKey(), truncate(entry.getValue(), 40)));
        }
        return new PromptInfo(mode, choices);
    }

    private static String truncate(String text, int max) {
        if (text.length() <= max) {
            return text;
        }
        return text.substring(0, max - 1) + "…";
    }
}
