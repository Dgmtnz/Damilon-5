import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PantallaCasinoPoker extends Pantalla {

    // Card encoding: rank = card % 13, suit = card / 13
    // Ranks: 0=2, 1=3, ..., 8=10, 9=J, 10=Q, 11=K, 12=A
    // Suits: 0=S, 1=H, 2=D, 3=C
    private static final String[] RANK_STR = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private static final String[] SUIT_STR = {"S","H","D","C"};

    private String cardStr(int card) {
        return "[" + RANK_STR[card % 13] + SUIT_STR[card / 13] + "]";
    }

    private String evaluateHand(int[] hand) {
        int[] rankCount = new int[13];
        for (int c : hand) rankCount[c % 13]++;

        int[] ranks = new int[5];
        for (int i = 0; i < 5; i++) ranks[i] = hand[i] % 13;
        Arrays.sort(ranks);

        int[] suitCount = new int[4];
        for (int c : hand) suitCount[c / 13]++;
        boolean isFlush = false;
        for (int s : suitCount) if (s == 5) { isFlush = true; break; }

        int maxCount = 0;
        for (int c : rankCount) if (c > maxCount) maxCount = c;

        boolean isNormalStraight = (maxCount == 1) && (ranks[4] - ranks[0] == 4);
        boolean isAceLowStraight = (maxCount == 1) &&
            ranks[4] == 12 && ranks[3] == 3 && ranks[2] == 2 && ranks[1] == 1 && ranks[0] == 0;
        boolean isStraight = isNormalStraight || isAceLowStraight;

        int[] sortedCounts = rankCount.clone();
        Arrays.sort(sortedCounts);
        int secondCount = sortedCounts[11];

        if (isFlush && isNormalStraight && ranks[0] == 8) return "ROYAL_FLUSH";
        if (isFlush && isStraight)                        return "STRAIGHT_FLUSH";
        if (maxCount == 4)                                return "FOUR_OF_A_KIND";
        if (maxCount == 3 && secondCount == 2)            return "FULL_HOUSE";
        if (isFlush)                                      return "FLUSH";
        if (isStraight)                                   return "STRAIGHT";
        if (maxCount == 3)                                return "THREE_OF_A_KIND";
        if (maxCount == 2 && secondCount == 2)            return "TWO_PAIR";
        if (maxCount == 2) {
            for (int r = 9; r <= 12; r++) {
                if (rankCount[r] == 2) return "JACKS_OR_BETTER";
            }
            return "LOW_PAIR";
        }
        return "HIGH_CARD";
    }

    private int getMultiplier(String handKey) {
        switch (handKey) {
            case "ROYAL_FLUSH":     return 100;
            case "STRAIGHT_FLUSH":  return 50;
            case "FOUR_OF_A_KIND":  return 25;
            case "FULL_HOUSE":      return 9;
            case "FLUSH":           return 6;
            case "STRAIGHT":        return 4;
            case "THREE_OF_A_KIND": return 3;
            case "TWO_PAIR":        return 2;
            case "JACKS_OR_BETTER": return 1;
            default:                return 0;
        }
    }

    private String getHandLabel(String handKey) {
        switch (handKey) {
            case "ROYAL_FLUSH":     return "ESCALERA REAL  (x100)";
            case "STRAIGHT_FLUSH":  return "ESCALERA DE COLOR  (x50)";
            case "FOUR_OF_A_KIND":  return "POKER  (x25)";
            case "FULL_HOUSE":      return "FULL HOUSE  (x9)";
            case "FLUSH":           return "COLOR  (x6)";
            case "STRAIGHT":        return "ESCALERA  (x4)";
            case "THREE_OF_A_KIND": return "TRIO  (x3)";
            case "TWO_PAIR":        return "DOBLE PAREJA  (x2)";
            case "JACKS_OR_BETTER": return "PAR DE J/Q/K/A  (x1 - recuperas)";
            case "LOW_PAIR":        return "PAR BAJO  (sin pago)";
            default:                return "CARTA ALTA  (sin pago)";
        }
    }

    private void showHand(int[] hand) {
        StringBuilder top  = new StringBuilder("  ");
        StringBuilder mid  = new StringBuilder("  ");
        StringBuilder bot  = new StringBuilder("  ");
        StringBuilder nums = new StringBuilder("  ");
        for (int i = 0; i < 5; i++) {
            String cs = cardStr(hand[i]);
            int w = cs.length() + 2; // [XY] → 4 or [10Y] → 5 chars
            top.append(".").append("-".repeat(w)).append(".  ");
            mid.append("| ").append(cs).append(" |  ");
            bot.append("'").append("-".repeat(w)).append("'  ");
            nums.append(" ").append(i + 1).append(" ".repeat(w - 1)).append("   ");
        }
        System.out.println(top);
        System.out.println(mid);
        System.out.println(bot);
        System.out.println(nums);
    }

    @Override
    public void mostrarSprite() {
        System.out.println(
"  +----------------------------------------------------------+\n"+
"  |         P O K E R  -  J A C K S  O R  B E T T E R      |\n"+
"  |  ========================================================|\n"+
"  |                                                          |\n"+
"  |   .----. .----. .----. .----. .----.                    |\n"+
"  |   | AS | | KH | | QD | | JC | |10S |                   |\n"+
"  |   '----' '----' '----' '----' '----'                    |\n"+
"  |                                                          |\n"+
"  |   RF:x100  SF:x50  4K:x25  FH:x9   F:x6                |\n"+
"  |   ST:x4    3K:x3   2P:x2   J+:x1  (resto pierde)       |\n"+
"  +----------------------------------------------------------+\n"
        );
        System.out.println("-- POKER: JACKS OR BETTER --");
    }

    @Override
    public void mostrarOpciones() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            System.out.println("Saldo: " + Main.getJugador().dinero + "$");

            if (Main.getJugador().dinero < 500) {
                System.out.println("No tienes suficientes creditos (minimo 500$). Volviendo al casino...");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }

            System.out.println("\n¿Cuanto apuestas? (500 - " + Main.getJugador().dinero + "$, o 0 para salir):");
            int apuesta;
            try { apuesta = scanner.nextInt(); } catch (Exception e) { scanner = new Scanner(System.in); continue; }

            if (apuesta == 0) {
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }
            if (apuesta < 500 || apuesta > Main.getJugador().dinero) {
                System.out.println("Apuesta invalida.");
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                continue;
            }

            Main.getJugador().dinero -= apuesta;

            // Build and shuffle deck
            List<Integer> deck = new ArrayList<>();
            for (int i = 0; i < 52; i++) deck.add(i);
            Collections.shuffle(deck);

            // Deal 5 cards
            int[] hand = new int[5];
            for (int i = 0; i < 5; i++) hand[i] = deck.remove(0);

            System.out.println("\nTu mano inicial:");
            showHand(hand);
            System.out.println();

            // Read discard selection
            System.out.println("Cartas a descartar (ej: 1 3 5), o 0 para no descartar:");
            try { scanner.nextLine(); } catch (Exception e) {} // consume leftover newline
            String discardLine;
            try { discardLine = scanner.nextLine().trim(); } catch (Exception e) { discardLine = "0"; }

            if (!discardLine.equals("0") && !discardLine.isEmpty()) {
                String[] parts = discardLine.split("\\s+");
                for (String p : parts) {
                    try {
                        int pos = Integer.parseInt(p) - 1; // 0-indexed
                        if (pos >= 0 && pos < 5) {
                            hand[pos] = deck.remove(0);
                        }
                    } catch (NumberFormatException ignored) {}
                }
            }

            System.out.println("\nMano final:");
            showHand(hand);
            System.out.println();

            String resultKey = evaluateHand(hand);
            int multiplier = getMultiplier(resultKey);
            System.out.println("Resultado: " + getHandLabel(resultKey));

            if (multiplier > 0) {
                int cobro = multiplier * apuesta;
                if (multiplier == 1) {
                    System.out.println("Recuperas tu apuesta: " + cobro + "$");
                } else {
                    System.out.println("¡GANASTE! Cobras: " + cobro + "$  (x" + multiplier + ")");
                }
                Main.getJugador().dinero += cobro;
            } else {
                System.out.println("Sin combinacion ganadora. Pierdes " + apuesta + "$.");
            }

            System.out.println("Saldo: " + Main.getJugador().dinero + "$");
            System.out.println("\n1. Volver a jugar  |  2. Volver al casino");
            int choice;
            try { choice = scanner.nextInt(); } catch (Exception e) { choice = 2; }
            if (choice != 1) {
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }
        }
    }
}
