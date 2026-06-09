import java.util.Scanner;

public class PantallaMisionRivalContrabandista extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [OBJETIVO: DRAX - RIVAL CONTRABANDISTA]                     \n"+
        "   Ubicación: Asteroide TK-9                                    \n"+
        "   Nivel de amenaza: ALTO                                       \n"+
        "   Recompensa: 10000$                                           \n"+
        "                                                                \n");
        System.out.println("-- MISION: RIVAL CONTRABANDISTA DRAX --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Llegas al asteroide TK-9. La base de Drax es un laberinto de contenedores.");
        System.out.println("Drax te detecta. 'Otro enviado de Reto Voss. Aburrido. ¿Cuántos me manda?'");
        System.out.println("");
        System.out.println("¿Cómo lo resuelves?");
        System.out.println("1. Combatir directamente contra Drax");
        System.out.println("2. Proponer una alianza (traicionar a Reto Voss)");
        System.out.println("3. Intentar capturarlo vivo");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Siempre lo mismo. Vamos pues.' Drax desenfunda.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaBatallaRivalContrabandista();
                break;

            case 2:
                System.out.println("Drax te escucha. 'Traicionar a Voss... interesante.'");
                System.out.println("'Si es serio, juntos podríamos controlar todo el sector.'");
                System.out.println("Formas una alianza. Pero Reto Voss se enterará...");
                Main.getJugador().dinero += 15000;
                Main.getJugador().experiencia += 1500;
                System.out.println("Dinero +15000$ (acuerdo de alianza) | Experiencia +1500");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaJefeMercadoNegro();
                break;

            case 3:
                System.out.println("Drax no tiene intención de rendirse. ¡Combate!");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaBatallaRivalContrabandista();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
