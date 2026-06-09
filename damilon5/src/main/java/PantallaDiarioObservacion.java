import java.util.Scanner;

public class PantallaDiarioObservacion extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "              _______________                                   \n"+
        "             |               |                                  \n"+
        "             |  DIARIO DE    |                                  \n"+
        "             |  CAMPO        |                                  \n"+
        "             |               |                                  \n"+
        "             |  * Ritos      |                                  \n"+
        "             |  * Lenguaje   |                                  \n"+
        "             |  * Ecología   |                                  \n"+
        "             |  * Historia   |                                  \n"+
        "             |_______________|                                  \n"+
        "                                                                \n");
        System.out.println("-- DIARIO DE OBSERVACION ETNOGRAFICA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Tu diario sobre la tribu se publica en todos los canales científicos de la galaxia.");
        System.out.println("La Academia Galáctica de Ciencias lo declara 'El Estudio del Siglo'.");
        System.out.println("Recibes el Premio Nexari de Etnografía Intergaláctica, dotado con una gran suma.");
        System.out.println("");
        System.out.println("Dinero +25000$ | Experiencia +3000 | Velocidad +10");
        Main.getJugador().dinero += 25000;
        Main.getJugador().experiencia += 3000;
        Main.getJugador().velocidad += 10;

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("Con la fama y el dinero del premio, ¿qué haces a continuación?");
        System.out.println("1. Volver al puerto espacial y buscar nuevas aventuras");
        System.out.println("2. Dedicarte a la ciencia de forma permanente (Final Científico)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Con el bolsillo lleno y la reputación por las nubes, vuelves al puerto.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 2:
                System.out.println("Te conviertes en el mayor etnógrafo intergaláctico de la historia.");
                System.out.println("Tu legado perdura por siglos. Un final tranquilo pero glorioso.");
                System.out.println("");
                System.out.println("*** FINAL: EL ETNOGRAFO DEL UNIVERSO ***");
                System.out.println("Dinero +100000$ adicionales por derechos de publicación.");
                Main.getJugador().dinero += 100000;
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("¿Quieres volver a jugar?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int resp = scanner.nextInt();
                if (resp == 1) {
                    Main.jugador = new Jugador();
                    Juego.pantallaActual = new PantallaPuertoEspacial();
                } else {
                    System.out.println("¡Gracias por jugar!");
                    System.exit(0);
                }
                break;

            default:
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;
        }
    }
}
