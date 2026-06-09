import java.util.Scanner;

public class PantallaDecisionDobleAgente extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "         [IMPERIO]  <----- TU ------->  [REBELDES]              \n"+
        "           /|\\                              /|\\                 \n"+
        "            |                                |                  \n"+
        "           |||          LEALTAD?            |||                 \n"+
        "                                                                \n"+
        "         Gloria                           Libertad              \n"+
        "         Poder                            Justicia              \n"+
        "         Control                          Caos                  \n"+
        "                                                                \n");
        System.out.println("-- DECISION: DOBLE AGENTE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Estás en el cruce de caminos más importante de tu vida.");
        System.out.println("El Imperio te ofrece riqueza y poder. Los rebeldes te ofrecen libertad y causa.");
        System.out.println("O puedes intentar jugar ambos bandos... aunque eso tiene un precio.");
        System.out.println("");
        System.out.println("¿Cuál es tu lealtad definitiva?");
        System.out.println("1. Permanecer leal al Imperio (reportar a los rebeldes)");
        System.out.println("2. Unirte a los rebeldes y luchar contra el Imperio");
        System.out.println("3. Intentar ser doble agente (alto riesgo)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Reportas la ubicación rebelde al Imperio. Los soldados llegan en horas.");
                System.out.println("Sin embargo, los rebeldes sospechan y te persiguen.");
                System.out.println("¡Combate contra los soldados imperiales que vienen a 'protegerte'... o no!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaHeroeImperial();
                Juego.pantallaActual = new PantallaBatallaSoldadosImperiales();
                break;

            case 2:
                System.out.println("'Bienvenido a la Resistencia.' El líder rebelde te estrecha la mano.");
                System.out.println("Tu primera misión: eliminar al jefe rebelde traidor que trabaja para el Imperio.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMisionSuicidaImperial();
                Juego.pantallaActual = new PantallaBatallaJefeRebelde();
                break;

            case 3:
                System.out.println("Intentas servirte de ambos bandos. Durante semanas funciona...");
                System.out.println("Pero un error de cálculo y ambos bandos descubren tu doble juego.");
                System.out.println("¡Los dos te atacan al mismo tiempo!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaHeroeImperial();
                Juego.pantallaActual = new PantallaBatallaEspiaDescubierto();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
