import java.util.Scanner;

public class PantallaMisionCR2 extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [OBJETIVO: KORROX]                                           \n"+
        "   Raza: Alienígena Tipo-IV                                     \n"+
        "   Crimen: Piratería, 15 asesinatos, destrucción de naves       \n"+
        "   Ultima ubicación: Nebulosa de Sangre                         \n"+
        "   Recompensa: 20000$                                           \n"+
        "   Advertencia: EXTREMADAMENTE PELIGROSO                        \n"+
        "                                                                \n");
        System.out.println("-- MISION CR2: CAZA DE KORROX --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Korrox opera desde una nave pirata camuflada en la Nebulosa de Sangre.");
        System.out.println("Para llegar a él necesitas atravesar a sus hombres.");
        System.out.println("Al abordar la nave pirata, Korrox aparece personalmente.");
        System.out.println("'Otro cazarrecompensas. ¿Cuántos hacéis ya? No importa. Ninguno volvió.'");
        System.out.println("");
        System.out.println("¿Qué haces?");
        System.out.println("1. Enfrentarte a Korrox en combate abierto");
        System.out.println("2. Intentar negociar una rendición");
        System.out.println("3. Activar la autodestrucción de la nave pirata y huir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Muere con honor al menos.' Korrox lanza su primer golpe.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaDilemaMoral();
                Juego.pantallaActual = new PantallaBatallaCriminalPeligroso();
                break;

            case 2:
                System.out.println("Korrox se ríe. 'Rendirme. Qué gracioso.' Y ataca.");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaDilemaMoral();
                Juego.pantallaActual = new PantallaBatallaCriminalPeligroso();
                break;

            case 3:
                System.out.println("Encuentras el panel de autodestrucción y lo activas. '60 segundos.'");
                System.out.println("Korrox grita y corre hacia los pods de escape. Tú también corres.");
                System.out.println("La nave explota. Korrox no logra escapar. Objetivo neutralizado.");
                Main.getJugador().dinero += 20000;
                Main.getJugador().experiencia += 2500;
                System.out.println("Dinero +20000$ | Experiencia +2500");
                try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaDilemaMoral();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
