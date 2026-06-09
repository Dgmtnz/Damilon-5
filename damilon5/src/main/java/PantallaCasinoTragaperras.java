import java.util.Random;
import java.util.Scanner;

public class PantallaCasinoTragaperras extends Pantalla {

    private static final String[] SYMBOLS = {" 7 ", " * ", " $ ", "BAR", " @ ", " o "};
    private static final int[]    PAYOUTS  = {10, 7, 5, 4, 3, 2};
    private final Random rng = new Random();

    @Override
    public void mostrarSprite() {
        System.out.println(
"  +----------------------------------------------------------+\n"+
"  |        T R A G A P E R R A S   O R B I T A L            |\n"+
"  |  ========================================================|\n"+
"  |                                                          |\n"+
"  |    +---------+    +---------+    +---------+             |\n"+
"  |    |         |    |         |    |         |             |\n"+
"  |    |   ???   |    |   ???   |    |   ???   |             |\n"+
"  |    |         |    |         |    |         |             |\n"+
"  |    +---------+    +---------+    +---------+             |\n"+
"  |                                                          |\n"+
"  |   PAGOS (3 iguales):  7:x10  *:x7  $:x5  BAR:x4        |\n"+
"  |                       @:x3   o:x2  | 2 iguales: devuelve|\n"+
"  +----------------------------------------------------------+\n"
        );
        System.out.println("-- TRAGAPERRAS ORBITAL --");
    }

    @Override
    public void mostrarOpciones() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            System.out.println("Saldo: " + Main.getJugador().dinero + "$");

            if (Main.getJugador().dinero < 100) {
                System.out.println("No tienes suficientes creditos (minimo 100$). Volviendo al casino...");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }

            System.out.println("\n¿Cuanto apuestas? (100 - " + Main.getJugador().dinero + "$, o 0 para salir):");
            int apuesta;
            try { apuesta = scanner.nextInt(); } catch (Exception e) { scanner = new Scanner(System.in); continue; }

            if (apuesta == 0) {
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }
            if (apuesta < 100 || apuesta > Main.getJugador().dinero) {
                System.out.println("Apuesta invalida.");
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                continue;
            }

            Main.getJugador().dinero -= apuesta;

            System.out.println("\nGirando...");
            try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }

            int i1 = rng.nextInt(SYMBOLS.length);
            int i2 = rng.nextInt(SYMBOLS.length);
            int i3 = rng.nextInt(SYMBOLS.length);

            System.out.println("  [ ??? ]   [ ??? ]   [ ??? ]");
            try { Thread.sleep(600); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("  [" + SYMBOLS[i1] + "]   [ ??? ]   [ ??? ]");
            try { Thread.sleep(600); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("  [" + SYMBOLS[i1] + "]   [" + SYMBOLS[i2] + "]   [ ??? ]");
            try { Thread.sleep(600); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("  [" + SYMBOLS[i1] + "]   [" + SYMBOLS[i2] + "]   [" + SYMBOLS[i3] + "]");
            System.out.println();

            if (i1 == i2 && i2 == i3) {
                int ganancia = PAYOUTS[i1] * apuesta;
                System.out.println("*** JACKPOT!  3x" + SYMBOLS[i1].trim() + "  ***");
                System.out.println("Ganas: " + ganancia + "$  (x" + PAYOUTS[i1] + ")");
                Main.getJugador().dinero += ganancia;
            } else if (i1 == i2 || i2 == i3 || i1 == i3) {
                System.out.println("Par! Recuperas tu apuesta de " + apuesta + "$.");
                Main.getJugador().dinero += apuesta;
            } else {
                System.out.println("Sin suerte. Pierdes " + apuesta + "$.");
            }

            System.out.println("Saldo: " + Main.getJugador().dinero + "$");
            System.out.println("\n1. Volver a girar  |  2. Volver al casino");
            int choice;
            try { choice = scanner.nextInt(); } catch (Exception e) { choice = 2; }
            if (choice != 1) {
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }
        }
    }
}
