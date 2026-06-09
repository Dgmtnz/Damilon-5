import java.util.Scanner;

public class PantallaNegociacionColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [IMPERIO]      [COLONIA]      [REBELDES]                    \n"+
        "       |              |              |                          \n"+
        "       +--------> [MESA] <----------+                           \n"+
        "                      |                                         \n"+
        "              [COMERCIANTES]                                    \n"+
        "                                                                \n"+
        "          -- MESA DE NEGOCIACION GALÁCTICA --                   \n"+
        "                                                                \n");
        System.out.println("-- NEGOCIACION COLONIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Organizas una cumbre diplomática en la colonia.");
        System.out.println("El Imperio quiere protección a cambio de tributos.");
        System.out.println("Los Rebeldes ofrecen alianza a cambio de refugio.");
        System.out.println("Los comerciantes quieren rutas de comercio exclusivas.");
        System.out.println("");
        System.out.println("¿Con quién negocias primero?");
        System.out.println("1. El Imperio (estabilidad y protección militar)");
        System.out.println("2. Los Rebeldes (libertad y solidaridad)");
        System.out.println("3. Los comerciantes (prosperidad económica)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Firmas un Tratado de Protección Imperial. El Imperio garantiza tu seguridad.");
                System.out.println("A cambio, pagas un 10% de los ingresos como tributo. Un precio por la paz.");
                System.out.println("Dinero +10000$ (financiación imperial inicial) | Experiencia +1000");
                Main.getJugador().dinero += 10000;
                Main.getJugador().experiencia += 1000;
                break;

            case 2:
                System.out.println("Firmas una alianza rebelde. La libertad tiene un costo: el Imperio no te perdonará.");
                System.out.println("Pero los rebeldes son leales. La colonia tendrá su propio ejército de voluntarios.");
                System.out.println("Experiencia +2000 | La colonia es libre pero vigilada.");
                Main.getJugador().experiencia += 2000;
                break;

            case 3:
                System.out.println("Abres rutas comerciales. En 6 meses la colonia es el hub comercial del sector.");
                System.out.println("Ingresos pasivos garantizados. Dinero +25000$ | Experiencia +1200");
                Main.getJugador().dinero += 25000;
                Main.getJugador().experiencia += 1200;
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                return;
        }

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        Juego.pantallaActual = new PantallaCrecimientoColonia();
    }
}
