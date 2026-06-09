import java.util.Scanner;
import java.util.Random;

public class PantallaMinijuegoFuga extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [VENTILACION] --> [PASILLO OSCURO] --> [PATIO] --> [MURO]   \n"+
        "        TU                  ???               !!!         FIN   \n"+
        "                                                                \n"+
        "   SIGILO MAXIMO - UN RUIDO Y TODO TERMINA                      \n"+
        "                                                                \n");
        System.out.println("-- MINIJUEGO: FUGA POR LOS CONDUCTOS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Te arrastras por los conductos de ventilación en completo silencio.");
        System.out.println("Ox va delante. Tres intersecciones. En cada una, debes elegir bien.");
        System.out.println("");
        System.out.println("INTERSECCION 1: Escuchas pasos de guardia a la izquierda.");
        System.out.println("1. Ir a la izquierda (ruta más corta, hay un guardia)");
        System.out.println("2. Ir a la derecha (más larga, posiblemente segura)");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcion1 = scanner.nextInt();
        int exitos = 0;

        if (opcion1 == 2) {
            System.out.println("Buena elección. El pasillo de la derecha está despejado.");
            exitos++;
        } else {
            System.out.println("El guardia casi os detecta. Os quedáis paralizados 5 minutos sin respirar.");
        }

        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("INTERSECCION 2: Una alarma de baja intensidad suena en el bloque A.");
        System.out.println("1. Aprovechar el caos de la alarma y correr");
        System.out.println("2. Esperar a que pase y seguir en sigilo");

        int opcion2 = scanner.nextInt();
        if (opcion2 == 1) {
            System.out.println("La distracción funciona. Cruzáis el patio exterior sin problemas.");
            exitos++;
        } else {
            System.out.println("Esperáis demasiado. Un guardia de refuerzo entra al conducto.");
        }

        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("INTERSECCION FINAL: El muro exterior. Un guardia en la torre de vigilancia.");
        System.out.println("1. Escalar el muro ahora, mientras mira para otro lado");
        System.out.println("2. Lanzar una piedra para distraerle y escalar");

        int opcion3 = scanner.nextInt();
        if (opcion3 == 1 || opcion3 == 2) {
            exitos++;
        }

        System.out.println("");
        if (exitos >= 2) {
            System.out.println("¡Lográis cruzar el muro! La oscuridad de la noche os protege.");
            System.out.println("¡FUGA EXITOSA! Libertad. Por fin libertad.");
            Main.getJugador().experiencia += 2000;
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaFugitivo();
        } else {
            System.out.println("Un guardia os detecta en el último momento. ¡Alarma general!");
            System.out.println("¡Combate o quedarse encerrado para siempre!");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaSiguiente = new PantallaFugitivo();
            Juego.pantallaActual = new PantallaBatallaGuardianesFuga();
        }
    }
}
