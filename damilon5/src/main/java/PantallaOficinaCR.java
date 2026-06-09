import java.util.Scanner;

public class PantallaOficinaCR extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   ===================================================           \n"+
        "   ||  OFICINA DE CAZARRECOMPENSAS GALÁCTICA        ||           \n"+
        "   ===================================================           \n"+
        "   ||  [OBJETIVO 1]  [OBJETIVO 2]  [OBJETIVO ELITE]  ||          \n"+
        "   ||                                                ||           \n"+
        "   ||  Recompensas actualizadas cada ciclo lunar     ||           \n"+
        "   ||  Mínimo 3 capturas para rango de élite         ||           \n"+
        "   ===================================================           \n"+
        "                                                                \n");
        System.out.println("-- OFICINA DE CAZARRECOMPENSAS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La oficina de cazarrecompensas huele a tabaco y sudor espacial.");
        System.out.println("La directora Mira te mira de arriba abajo. 'Nuevo. Bien. Tenemos trabajo.'");
        System.out.println("'Aquí no preguntamos el motivo de la recompensa. Solo cobras cuando traes al objetivo.'");
        System.out.println("");
        System.out.println("¿Qué misión eliges?");
        System.out.println("1. Capturar al contrabandista Lix (recompensa 8000$, riesgo bajo)");
        System.out.println("2. Cazar al pirata Korrox (recompensa 20000$, riesgo alto)");
        System.out.println("3. Revisar el tablón de objetivos élite (requiere 2 capturas previas)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Lix opera desde la estación minera del sector 7. Misión aceptada.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMisionCR2();
                Juego.pantallaActual = new PantallaMisionCR1();
                break;

            case 2:
                System.out.println("Korrox es peligroso. Tres cazarrecompensas ya han muerto intentándolo.");
                System.out.println("'Si crees que puedes, adelante. Pero no digas que no te avisamos.'");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaDilemaMoral();
                Juego.pantallaActual = new PantallaMisionCR2();
                break;

            case 3:
                System.out.println("'Élite. Eso requiere historial probado.' Mira consulta los registros.");
                System.out.println("'Tienes suficientes capturas. Hay un objetivo... especial. Léelo bien.'");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMisionEliteCR();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
