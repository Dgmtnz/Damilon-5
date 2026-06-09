import java.util.Scanner;

public class PantallaOtraGalaxia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   *       .          *        .    *         .         *      \n"+
        "       .        *         .        *       .       *           \n"+
        "  *        .         *       .        *        .        *      \n"+
        "      .        *         .       *        .        *           \n"+
        "  .       *        .        *        .       *        .        \n"+
        "     *        .       *         .        *       .       *     \n"+
        "  .       *        .        *        .       *        .        \n"+
        "                                                               \n"+
        "         *    @@@@@@@@@@@@@@@@@@@@@@@    *        .            \n"+
        "    .        @@@@@@@@@@@@@@@@@@@@@@@@@        *         .      \n"+
        "        *   @@@    OTRA GALAXIA       @@@   .        *         \n"+
        "   .       @@@   NUNCA CARTOGRAFIADA   @@@      .              \n"+
        "       *    @@@@@@@@@@@@@@@@@@@@@@@@@  *    *         .        \n"+
        "  *          @@@@@@@@@@@@@@@@@@@@@@@        .    *             \n"+
        "                                                               \n"+
        "   .       *        .        *        .       *        .       \n"+
        "      *        .        *        .        *       .       *    \n"+
        "   .       *        .        *        .       *        .       \n");
        System.out.println("-- OTRA GALAXIA -- FINAL SECRETO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Cruzas el portal y la realidad se distorsiona. Cuando todo se estabiliza...");
        System.out.println("Estás en una galaxia completamente diferente. Nunca antes explorada por ningún ser conocido.");
        System.out.println("Las estrellas tienen colores imposibles. Los planetas flotan en formaciones perfectas.");
        System.out.println("Una civilización avanzada te detecta y te da la bienvenida como primer visitante intergaláctico.");
        System.out.println("Te conviertes en el puente entre dos galaxias. Tu historia será contada por eons.");
        System.out.println("");
        System.out.println("*** FINAL SECRETO: EXPLORADOR INTERGALACTICO ***");
        System.out.println("¡Felicidades! Este es el final más raro y épico del juego.");
        System.out.println("");
        System.out.println("¿Quieres volver a jugar?");
        System.out.println("1. Si");
        System.out.println("2. No");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            Main.jugador = new Jugador();
            Juego.pantallaActual = new PantallaPuertoEspacial();
        } else {
            System.out.println("¡Gracias por descubrir el final secreto!");
            System.exit(0);
        }
    }
}
