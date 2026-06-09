import java.util.Scanner;

public class PantallaDilemaMoral extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "       ?????         [RECOMPENSA: 30000$]          ?????         \n"+
        "      ?     ?                                     ?     ?        \n"+
        "      ?  !  ?    OBJETIVO: DR. ELYRA             ?  ?  ?        \n"+
        "      ?     ?    'Científica, madre de 3'        ?     ?        \n"+
        "       ?????      Crimen: Robo datos             ?????          \n"+
        "                  (datos que pueden salvar vidas)               \n"+
        "                                                                \n");
        System.out.println("-- DILEMA MORAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El siguiente objetivo en el tablón es la Dra. Elyra.");
        System.out.println("Recompensa: 30000$. Pero cuando investigas... los datos que 'robó' son");
        System.out.println("fórmulas de una cura para la plaga de Kethara que el laboratorio quería suprimir.");
        System.out.println("El cliente que puso la recompensa es la megacorporación que perdería millones.");
        System.out.println("");
        System.out.println("¿Qué haces?");
        System.out.println("1. Capturar a la Dra. Elyra (cobrar la recompensa)");
        System.out.println("2. Ignorar la misión y volver a la oficina");
        System.out.println("3. Proteger a la Dra. Elyra y enfrentarte a los mercenarios del laboratorio");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Capturas a la Dra. Elyra. Millones morirán de la plaga. Cobras tus 30000$.");
                System.out.println("Tendrás el dinero pero no podrás mirarte al espejo.");
                Main.getJugador().dinero += 30000;
                Main.getJugador().experiencia += 1000;
                try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaOficinaCR();
                break;

            case 2:
                System.out.println("Rechazas la misión. Sin dinero, pero con la consciencia tranquila.");
                System.out.println("La Dra. Elyra sigue libre.");
                Main.getJugador().experiencia += 500;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaOficinaCR();
                break;

            case 3:
                System.out.println("'Dra. Elyra, soy cazarrecompensas pero no tengo intención de entregarte.'");
                System.out.println("'El laboratorio ya envió mercenarios. Necesitamos movernos rápido.'");
                System.out.println("Los mercenarios aparecen. ¡Combate para proteger a la científica!");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMisionEliteCR();
                Juego.pantallaActual = new PantallaMisionEliteCR();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
