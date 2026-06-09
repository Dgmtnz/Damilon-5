import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PantallaCasinoRuleta extends Pantalla {

    private final Random rng = new Random();

    private static final Set<Integer> ROJOS = new HashSet<>(Arrays.asList(
        1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36
    ));

    private String colorOf(int n) {
        if (n == 0) return "VERDE";
        return ROJOS.contains(n) ? "ROJO" : "NEGRO";
    }

    @Override
    public void mostrarSprite() {
        System.out.println(
"  +----------------------------------------------------------+\n"+
"  |           R U L E T A   G A L A C T I C A               |\n"+
"  |  ========================================================|\n"+
"  |                                                          |\n"+
"  |         .--------------------------------.               |\n"+
"  |        / 0   1   2   3   4   5   6   7   \\              |\n"+
"  |       |  8   9  10  11  12  13  14  15    |             |\n"+
"  |       | 16  17  18  19  20  21  22  23    |             |\n"+
"  |       | 24  25  26  27  28  29  30  31    |             |\n"+
"  |        \\ 32  33  34  35  36              /              |\n"+
"  |         '--------------------------------'               |\n"+
"  |                                                          |\n"+
"  |   Rojo/Negro: x2  |  Par/Impar: x2  |  Docena: x3      |\n"+
"  |   Numero exacto: x35  |  0 = gana la casa               |\n"+
"  +----------------------------------------------------------+\n"
        );
        System.out.println("-- RULETA GALACTICA --");
    }

    @Override
    public void mostrarOpciones() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            System.out.println("Saldo: " + Main.getJugador().dinero + "$");

            if (Main.getJugador().dinero < 200) {
                System.out.println("No tienes suficientes creditos (minimo 200$). Volviendo al casino...");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }

            System.out.println("\nTipo de apuesta:");
            System.out.println("1. Rojo / Negro  (x2)");
            System.out.println("2. Par / Impar   (x2)");
            System.out.println("3. Docena  1-12 / 13-24 / 25-36  (x3)");
            System.out.println("4. Numero exacto 0-36  (x35)");
            System.out.println("0. Salir al casino");

            int tipoBet;
            try { tipoBet = scanner.nextInt(); } catch (Exception e) { scanner = new Scanner(System.in); continue; }

            if (tipoBet == 0) {
                Juego.pantallaActual = new PantallaCasinoGalactico();
                return;
            }
            if (tipoBet < 1 || tipoBet > 4) { System.out.println("Opcion invalida."); continue; }

            String betDesc = "";
            int betParam = -1;

            if (tipoBet == 1) {
                System.out.println("1. Rojo  |  2. Negro");
                int sub; try { sub = scanner.nextInt(); } catch (Exception e) { continue; }
                if (sub == 1)      { betDesc = "ROJO";  betParam = 1; }
                else if (sub == 2) { betDesc = "NEGRO"; betParam = 2; }
                else { System.out.println("Opcion invalida."); continue; }

            } else if (tipoBet == 2) {
                System.out.println("1. Par  |  2. Impar");
                int sub; try { sub = scanner.nextInt(); } catch (Exception e) { continue; }
                if (sub == 1)      { betDesc = "PAR";   betParam = 1; }
                else if (sub == 2) { betDesc = "IMPAR"; betParam = 2; }
                else { System.out.println("Opcion invalida."); continue; }

            } else if (tipoBet == 3) {
                System.out.println("1. Primera (1-12)  |  2. Segunda (13-24)  |  3. Tercera (25-36)");
                int sub; try { sub = scanner.nextInt(); } catch (Exception e) { continue; }
                if (sub < 1 || sub > 3) { System.out.println("Opcion invalida."); continue; }
                betParam = sub;
                betDesc  = sub == 1 ? "DOCENA 1-12" : sub == 2 ? "DOCENA 13-24" : "DOCENA 25-36";

            } else {
                System.out.println("Elige un numero del 0 al 36:");
                int sub; try { sub = scanner.nextInt(); } catch (Exception e) { continue; }
                if (sub < 0 || sub > 36) { System.out.println("Numero invalido."); continue; }
                betParam = sub;
                betDesc  = "NUMERO " + sub;
            }

            System.out.println("¿Cuanto apuestas? (200 - " + Main.getJugador().dinero + "$):");
            int apuesta;
            try { apuesta = scanner.nextInt(); } catch (Exception e) { continue; }
            if (apuesta < 200 || apuesta > Main.getJugador().dinero) {
                System.out.println("Apuesta invalida.");
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                continue;
            }

            Main.getJugador().dinero -= apuesta;

            System.out.println("\nLa bola rueda...");
            try { Thread.sleep(1200); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("  . . . . . . . . . .");
            try { Thread.sleep(800); } catch (InterruptedException e) { e.printStackTrace(); }

            int resultado = rng.nextInt(37);
            String color = colorOf(resultado);

            System.out.println("\n>>> RESULTADO: " + resultado + " [" + color + "] <<<");
            System.out.println("Tu apuesta: " + betDesc + "  (" + apuesta + "$)");

            boolean win = false;
            int multiplier = 0;

            if (resultado == 0 && tipoBet != 4) {
                System.out.println("¡Cero verde! La casa se lo lleva todo.");
            } else {
                if (tipoBet == 1) {
                    win = (betParam == 1 && color.equals("ROJO")) || (betParam == 2 && color.equals("NEGRO"));
                    multiplier = 2;
                } else if (tipoBet == 2) {
                    win = (betParam == 1 && resultado % 2 == 0) || (betParam == 2 && resultado % 2 != 0);
                    multiplier = 2;
                } else if (tipoBet == 3) {
                    win = (betParam == 1 && resultado >= 1  && resultado <= 12) ||
                          (betParam == 2 && resultado >= 13 && resultado <= 24) ||
                          (betParam == 3 && resultado >= 25 && resultado <= 36);
                    multiplier = 3;
                } else {
                    win = resultado == betParam;
                    multiplier = 35;
                }

                if (win) {
                    int ganancia = multiplier * apuesta;
                    System.out.println("¡GANASTE! Cobras: " + ganancia + "$  (x" + multiplier + ")");
                    Main.getJugador().dinero += ganancia;
                } else {
                    System.out.println("Mala suerte. Pierdes " + apuesta + "$.");
                }
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
