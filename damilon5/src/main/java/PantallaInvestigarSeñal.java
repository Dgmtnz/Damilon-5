import java.util.Scanner;

public class PantallaInvestigarSeñal extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "              .    .       .  .   . .   .  . . . . .           \n"+
        "           .       .  .                .      .  .  .          \n"+
        "     .   .    .   .  .  .  .   .  .  .  .  .     .            \n"+
        "             .                 .                               \n"+
        "  . .  .   .   .   .     . .   .   .    .    .   .  .  .      \n"+
        "          .  .  .    .  .   . . .   .   .  .   .   .          \n"+
        "   .  .       .   . .  .  .   .   .  .    .   .   . .  .      \n"+
        "        .  .   .     .    .  .  .  .   .    .   .    .   .    \n"+
        "                                                               \n"+
        "         .  .   @@@@@@@@@@@@@@@@@@@@@@@@   .  .  .            \n"+
        "   .  .      . @@@@@@@@@@@@@@@@@@@@@@@@@@ .    .   .  .       \n"+
        "       .  .   @@@@@                @@@@@@@  .    .      .     \n"+
        "   .        . @@@@@   SEÑAL         @@@@@@    .    .  .       \n"+
        "       .  .   @@@@@   DETECTADA     @@@@@@  .   .    .        \n"+
        "   .        . @@@@@                @@@@@@@    .    .   .      \n"+
        "       .      @@@@@@@@@@@@@@@@@@@@@@@@@@@  .    .    .        \n"+
        "   .  .     .  @@@@@@@@@@@@@@@@@@@@@@@@@  .  .    .   .       \n"+
        "                @@@@@@@@@@@@@@@@@@@@@@   .    .  .    .       \n"+
        "                                                               \n"+
        "   .  . .   .  .    .  .  .  .    .  .   .   .  .  .  .      \n"+
        "       .  .    .   .  .  .   .  .   .   .  .   .   .  .  .   \n"+
        "   . .    .  .  .    .  .  .   .  .  .  .   .    .    .       \n"+
        "          .  .   .  .   .  .  .   .   .   .   .    .  .   .   \n");
        System.out.println("-- SEÑAL MISTERIOSA DETECTADA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Decides investigar la señal misteriosa, guiado por la curiosidad y la promesa de descubrimiento.");
        System.out.println("La señal te lleva a través de sistemas estelares desconocidos, más allá de los límites cartografiados de la galaxia.");
        System.out.println("Finalmente llegas a un sistema solar con un planeta misterioso. En la superficie detectas una estructura masiva:");
        System.out.println("unas ruinas de una civilización claramente anterior a cualquier conocida. La señal proviene de ahí.");
        System.out.println("");
        System.out.println("Opciones:");
        System.out.println("1. Entrar en las ruinas a explorarlas");
        System.out.println("2. Llamar a los científicos de la nave de investigación para colaborar");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Te acercas a las ruinas con cautela...");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaRuinasAntiguas();
                break;

            case 2:
                System.out.println("Contactas a los científicos. En pocas horas llegan emocionados.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaColaboracionCientifica();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
