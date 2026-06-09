import java.util.Scanner;

public class PantallaFundarColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [NAVE] --> [PLANETA] --> [COLONIA INICIAL] --> [CIUDAD]      \n"+
        "                                                                \n"+
        "     .oO( SUEÑO: FUNDAR UNA NUEVA CIVILIZACION )Oo.            \n"+
        "                                                                \n"+
        "   Inversión inicial requerida: 10000$                          \n"+
        "   Riesgo: Alto - Recompensa: Ilimitada                         \n"+
        "                                                                \n");
        System.out.println("-- FUNDAR UNA COLONIA ESPACIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Has decidido dejar atrás la vida errante. Quieres algo permanente.");
        System.out.println("Fundar tu propia colonia en un planeta virgen. Ser el primer gobernador.");
        System.out.println("");
        if (Main.getJugador().dinero < 10000) {
            System.out.println("Necesitas al menos 10000$ para la inversión inicial.");
            System.out.println("Solo tienes " + Main.getJugador().dinero + "$. Consigue más dinero primero.");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaPuertoEspacialSin4();
            return;
        }
        System.out.println("Tienes fondos suficientes. ¿Estás listo para comprometerte?");
        System.out.println("1. Sí, invertir 10000$ y comenzar la búsqueda del planeta");
        System.out.println("2. No, quizás en otro momento");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Main.getJugador().dinero -= 10000;
                System.out.println("¡Inversión realizada! Ahora a encontrar el planeta perfecto.");
                System.out.println("Dinero -10000$ | Experiencia +500");
                Main.getJugador().experiencia += 500;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaElegirPlanetaColonia();
                break;

            case 2:
                System.out.println("Quizás cuando tengas más recursos.");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacialSin4();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
