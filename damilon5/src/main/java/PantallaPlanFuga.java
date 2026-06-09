import java.util.Scanner;

public class PantallaPlanFuga extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [CELDA] --> [PASILLO] --> [BLOQUE B] --> [EXTERIOR]         \n"+
        "      ?             ?              ?              ?             \n"+
        "                                                                \n"+
        "   NOTAS DE FUGA:                                               \n"+
        "   - Turno de guardia: cada 4 horas                             \n"+
        "   - Punto débil: ventilación del bloque B                      \n"+
        "   - Acceso a la azotea: 3ª planta                              \n"+
        "                                                                \n");
        System.out.println("-- PLANEANDO LA FUGA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Llevas semanas observando rutinas, contando guardias, memorizando pasillos.");
        System.out.println("Tu compañero de celda, un veterano llamado Ox, también quiere escapar.");
        System.out.println("'He estado aquí 8 años. Conozco cada centímetro de esta prisión.'");
        System.out.println("");
        System.out.println("¿Cómo planeas la fuga?");
        System.out.println("1. Plan A: por los conductos de ventilación (sigiloso)");
        System.out.println("2. Plan B: soborno al guardia corrupto (arriesgado)");
        System.out.println("3. Plan C: revuelta de presos como distracción (caótico)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ox te muestra el plano de los conductos. 'Si no hacemos ruido, nos los colamos.'");
                System.out.println("'Pero si alguien nos detecta, tendremos que pelear para salir.'");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMinijuegoFuga();
                break;

            case 2:
                System.out.println("'El guardia Plex lleva 3 años aquí y tiene deudas de juego.' Ox te guiña el ojo.");
                if (Main.getJugador().dinero >= 5000) {
                    Main.getJugador().dinero -= 5000;
                    System.out.println("Le ofreces 5000$ a Plex. Después de un silencio largo... asiente.");
                    System.out.println("Dinero -5000$ | Esta noche, la puerta lateral estará abierta.");
                    try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                    System.out.println("¡Escapas sin disparar un tiro! La libertad sabe dulce.");
                    Main.getJugador().experiencia += 1500;
                    Juego.pantallaActual = new PantallaFugitivo();
                } else {
                    System.out.println("'No tienes suficiente. Plex no se fía.' El plan B fracasa.");
                    System.out.println("Tendrás que usar el Plan A.");
                    try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                    Juego.pantallaActual = new PantallaMinijuegoFuga();
                }
                break;

            case 3:
                System.out.println("'Una revuelta. Ambicioso.' Ox convence a 20 presos más.");
                System.out.println("Al día siguiente, el caos estalla. Guardias por todos lados.");
                System.out.println("Es tu momento. Corres hacia la salida de emergencia.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaFugitivo();
                Juego.pantallaActual = new PantallaBatallaGuardianesFuga();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
