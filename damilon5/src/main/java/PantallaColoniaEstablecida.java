import java.util.Scanner;

public class PantallaColoniaEstablecida extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [GOBERNACION]  [MERCADO]  [HOSPITAL]  [ESCUELA]              \n"+
        "       |||            |||        |||         |||                \n"+
        "      =====          =====      =====       =====               \n"+
        "   ================================================================\n"+
        "                         COLONIA NUEVA AURORA                   \n"+
        "                         Poblacion: 50 colonos                  \n"+
        "   ================================================================\n"+
        "                                                                \n");
        System.out.println("-- COLONIA ESTABLECIDA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La Colonia Nueva Aurora está en pie. Eres el Gobernador.");
        System.out.println("Los colonos te respetan y confían en tus decisiones.");
        System.out.println("Pero gobernar una colonia en el espacio profundo nunca es fácil.");
        System.out.println("");
        System.out.println("¿Cuál es tu prioridad como gobernador?");
        System.out.println("1. Expandir la colonia (más colonos, más recursos)");
        System.out.println("2. Fortalecer las defensas (prepararse para amenazas)");
        System.out.println("3. Negociar con otras facciones (alianzas y comercio)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Anuncias apertura de la colonia. 200 nuevos colonos llegan en meses.");
                System.out.println("La colonia crece... pero también sus problemas.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCrecimientoColonia();
                break;

            case 2:
                System.out.println("Inviertes en defensas. Torretas, escudos energéticos, drones patrulla.");
                System.out.println("Dinero -8000$ | La colonia está más segura.");
                if (Main.getJugador().dinero >= 8000) {
                    Main.getJugador().dinero -= 8000;
                }
                Main.getJugador().experiencia += 600;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCrecimientoColonia();
                break;

            case 3:
                System.out.println("Contactas con el Imperio, los Rebeldes y los comerciantes independientes.");
                System.out.println("La diplomacia tiene su precio, pero también sus recompensas.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaNegociacionColonia();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
