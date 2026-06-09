import java.util.Scanner;

public class PantallaCasinoGalactico extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println(
"  +------------------------------------------------------------+\n"+
"  |  * * * * * *  CASINO ORBITAL XVII  * * * * * *            |\n"+
"  +------------------------------------------------------------+\n"+
"  |                                                            |\n"+
"  |  .----------.   .-----------.   .-----------.             |\n"+
"  |  | [7] [7]  |   |  .======. |   |  [A] [K]  |            |\n"+
"  |  | [*] [7]  |   | ( RULETA) |   |  [Q] [J]  |            |\n"+
"  |  | [BAR]    |   |  '======' |   |  [2] [5]  |            |\n"+
"  |  |  SLOTS   |   |   0 - 36  |   |   POKER   |            |\n"+
"  |  '----------'   '-----------'   '-----------'             |\n"+
"  |                                                            |\n"+
"  |       \"En el espacio, siempre gana la casa.\"              |\n"+
"  +------------------------------------------------------------+\n"
        );
        System.out.println("-- CASINO ORBITAL XVII --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Luces de neón galácticas. El tintineo de créditos. El olor a fortuna y ruina.");
        System.out.println("Un dron de seguridad te escanea: 'Bienvenido al Casino Orbital XVII.'");
        System.out.println("Saldo: " + Main.getJugador().dinero + "$");
        System.out.println("");
        System.out.println("1. Tragaperras (apuesta min: 100$)");
        System.out.println("2. Ruleta Galactica (apuesta min: 200$)");
        System.out.println("3. Poker 5 cartas - Jacks or Better (apuesta min: 500$)");
        System.out.println("4. Salir del casino");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        try { opcion = scanner.nextInt(); } catch (Exception e) { mostrarOpciones(); return; }

        switch (opcion) {
            case 1:
                Juego.pantallaActual = new PantallaCasinoTragaperras();
                break;
            case 2:
                Juego.pantallaActual = new PantallaCasinoRuleta();
                break;
            case 3:
                Juego.pantallaActual = new PantallaCasinoPoker();
                break;
            case 4:
                System.out.println("Sales del casino con " + Main.getJugador().dinero + "$ en el bolsillo.");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaContinuarTuCamino();
                break;
            default:
                System.out.println("Opcion invalida.");
                mostrarOpciones();
                break;
        }
    }
}
