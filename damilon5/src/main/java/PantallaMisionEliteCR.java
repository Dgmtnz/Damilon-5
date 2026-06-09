import java.util.Scanner;

public class PantallaMisionEliteCR extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   *** CLASIFICADO - NIVEL OMEGA ***                            \n"+
        "                                                                \n"+
        "   OBJETIVO: SEÑOR NEXUS                                        \n"+
        "   El mayor criminal del sector conocido                        \n"+
        "   Responsable de 40 estaciones destruidas                      \n"+
        "   Recompensa: 100000$                                          \n"+
        "   Intentos previos: 12 cazarrecompensas muertos                \n"+
        "                                                                \n");
        System.out.println("-- MISION ELITE: EL SEÑOR NEXUS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El Señor Nexus controla una fortaleza espacial privada con un ejército propio.");
        System.out.println("Para llegar a él necesitas atravesar todas sus defensas.");
        System.out.println("Mira te dice: 'Si traes a Nexus, serás el mejor cazarrecompensas de la historia.'");
        System.out.println("");
        System.out.println("¿Cómo atacas la fortaleza?");
        System.out.println("1. Asalto frontal con tu nave");
        System.out.println("2. Infiltración por los sistemas de mantenimiento");
        System.out.println("3. Hacerte pasar por mercenario contratado por Nexus");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Tu nave esquiva los disparos de las torretas y amarras en la bahía de emergencia.");
                System.out.println("Nexus te espera. 'Valiente. Lástima que seas estúpido.' ¡Combate final!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMejorCRGalaxia();
                Juego.pantallaActual = new PantallaBatallaMegacriminal();
                break;

            case 2:
                System.out.println("Te cuelas por las tuberías de ventilación durante 3 horas.");
                System.out.println("Llegas directamente al cuarto de control. Nexus está ahí.");
                System.out.println("'¿Cómo has...?' No termina la frase. ¡Combate!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMejorCRGalaxia();
                Juego.pantallaActual = new PantallaBatallaMegacriminal();
                break;

            case 3:
                System.out.println("Entras como 'Mercenario Oryx'. Nexus te recibe personalmente.");
                System.out.println("En el mejor momento, sacas las esposas neutrónicas.");
                System.out.println("Nexus lo ve venir. '¡Traidor!' Y saca su arma. ¡Combate!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaMejorCRGalaxia();
                Juego.pantallaActual = new PantallaBatallaMegacriminal();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
