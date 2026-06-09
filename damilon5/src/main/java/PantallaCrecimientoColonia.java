import java.util.Scanner;
import java.util.Random;

public class PantallaCrecimientoColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   COLONIA NUEVA AURORA - AÑO 2                                 \n"+
        "   Poblacion: 250 colonos                                       \n"+
        "   Recursos: Suficientes                                         \n"+
        "   Moral: Alta                                                   \n"+
        "   Amenaza: DESCONOCIDA                                         \n"+
        "                                                                \n"+
        "   [===][===][===][===][===][===][===][===]                      \n"+
        "                                                                \n");
        System.out.println("-- CRECIMIENTO DE LA COLONIA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La colonia crece. 250 colonos, edificios, cosechas, una economía propia.");
        System.out.println("Los ingresos de la colonia te generan rentas regulares.");
        System.out.println("Dinero +15000$ (rentas del primer año) | Experiencia +1500");
        Main.getJugador().dinero += 15000;
        Main.getJugador().experiencia += 1500;

        try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }

        Random random = new Random();
        int evento = random.nextInt(3);

        System.out.println("");
        System.out.println("¡Alerta de gobernación!");

        if (evento == 0) {
            System.out.println("Una plaga de insectos alienígenas destroza los cultivos.");
            System.out.println("¿Qué haces?");
            System.out.println("1. Usar pesticidas químicos (eficaz, pero daña el ecosistema)");
            System.out.println("2. Traer depredadores naturales de otro planeta");
            System.out.println("3. Quemar los campos afectados y replantar");
        } else if (evento == 1) {
            System.out.println("Un grupo de colonos quiere democratizar la colonia y votarte fuera.");
            System.out.println("¿Qué haces?");
            System.out.println("1. Aceptar las elecciones (democracia)");
            System.out.println("2. Dispersar a los rebeldes con guardias");
            System.out.println("3. Proponer un consejo mixto como compromiso");
        } else {
            System.out.println("Una facción del Imperio llega con una 'oferta': pagar tributo o ser 'protegidos'.");
            System.out.println("¿Qué haces?");
            System.out.println("1. Pagar el tributo (10000$)");
            System.out.println("2. Rechazar y preparar la defensa");
            System.out.println("3. Negociar un acuerdo comercial en lugar del tributo");
        }

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            case 2:
            case 3:
                System.out.println("Tomas la decisión. La colonia sigue adelante. La crisis se resuelve, por ahora.");
                Main.getJugador().experiencia += 500;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCrisisColonia();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
