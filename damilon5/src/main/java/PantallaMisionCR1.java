import java.util.Scanner;

public class PantallaMisionCR1 extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [OBJETIVO: LIX]                                              \n"+
        "   Raza: Humano                                                 \n"+
        "   Crimen: Contrabando de armas                                 \n"+
        "   Ultima ubicación: Estación Minera Sector 7                   \n"+
        "   Recompensa: 8000$                                            \n"+
        "   Estado: VIVO (preferiblemente)                               \n"+
        "                                                                \n");
        System.out.println("-- MISION CR1: CAPTURA DE LIX --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Llegas a la estación minera. Lix está en el bar apostando con los mineros.");
        System.out.println("No parece saber que le persiguen. Tienes ventaja.");
        System.out.println("");
        System.out.println("¿Cómo lo capturas?");
        System.out.println("1. Atacarle directamente y reducirle");
        System.out.println("2. Engañarle: fingir ser un comprador de mercancía");
        System.out.println("3. Esperar a que salga solo y emboscarle");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Entras y le gritas '¡Lix! La policía te busca.' Se levanta y saca un arma.");
                System.out.println("¡Combate en el bar de la estación minera!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaBatallaCriminalMenor();
                break;

            case 2:
                System.out.println("Te presentas como 'comprador de armas'. Lix pica el anzuelo.");
                System.out.println("En un momento de descuido le colocas las esposas neutrónicas. ¡Capturado!");
                System.out.println("Recompensa cobrada sin disparar un solo tiro. Profesional.");
                Main.getJugador().dinero += 8000;
                Main.getJugador().experiencia += 1000;
                System.out.println("Dinero +8000$ | Experiencia +1000");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaOficinaCR();
                break;

            case 3:
                System.out.println("Esperas dos horas. Lix sale. Le sigues al almacén. ¡Emboscada perfecta!");
                System.out.println("Lix intenta resistirse pero no tiene escapatoria. ¡Capturado!");
                Main.getJugador().dinero += 8000;
                Main.getJugador().experiencia += 800;
                System.out.println("Dinero +8000$ | Experiencia +800");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaOficinaCR();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
