import java.util.Scanner;

public class PantallaMisionSuicidaImperial extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!         \n"+
        "   !!                                                  !!        \n"+
        "   !!    MISION CLASIFICADA: NIVEL OMEGA               !!        \n"+
        "   !!    OBJETIVO: BASE REBELDE CENTRAL                !!        \n"+
        "   !!    PROBABILIDAD DE SUPERVIVENCIA: 12%            !!        \n"+
        "   !!    RECOMPENSA: MAXIMA GLORIA IMPERIAL            !!        \n"+
        "   !!                                                  !!        \n"+
        "   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!         \n"+
        "                                                                \n");
        System.out.println("-- MISION SUICIDA IMPERIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La misión es clara: infiltrarte en la base rebelde central y eliminar a su líder.");
        System.out.println("Sin apoyo. Sin refuerzos. Sin posibilidad de extracción.");
        System.out.println("Si tienes éxito, la guerra termina. Si fallas, nadie sabrá que fuiste.");
        System.out.println("");
        System.out.println("¿Cómo te preparas para el asalto?");
        System.out.println("1. Ataque directo y frontal (fuerza bruta)");
        System.out.println("2. Infiltrarte sigilosamente");
        System.out.println("3. Crear una distracción y colarte en el caos");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Entras disparando. Alarm as por todas partes. ¡El jefe rebelde sale a enfrentarte!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaHeroeImperial();
                Juego.pantallaActual = new PantallaBatallaJefeRebelde();
                break;

            case 2:
                System.out.println("Te mueves en silencio por los conductos de ventilación. Llegas al centro de mando.");
                System.out.println("El jefe rebelde está solo. Pero te detecta con un sensor.");
                System.out.println("'Sabía que vendría alguien. ¿Imperial o traidor?' ¡Combate inminente!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaHeroeImperial();
                Juego.pantallaActual = new PantallaBatallaJefeRebelde();
                break;

            case 3:
                System.out.println("Lanzas un señuelo al lado opuesto de la base. Funciona... casi.");
                System.out.println("Llegas al jefe rebelde pero ya está alerta. ¡Al combate!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaHeroeImperial();
                Juego.pantallaActual = new PantallaBatallaJefeRebelde();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
