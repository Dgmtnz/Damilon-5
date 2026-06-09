import java.util.Scanner;

public class PantallaMisionPasarAduana extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [CHECKPOINT IMPERIAL - ADUANA SECTOR 4]                     \n"+
        "                                                                \n"+
        "   GUARDIA: 'Identificación y manifiesto de carga.'             \n"+
        "   TU: *sudor frío*                                             \n"+
        "                                                                \n"+
        "   Cargamento: [SELLADO - CONTENIDO DESCONOCIDO]               \n"+
        "                                                                \n");
        System.out.println("-- MISION: PASAR LA ADUANA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Llegas al checkpoint imperial con el cargamento sellado.");
        System.out.println("Dos guardias te piden documentación. Tus papeles son falsos, pero convincentes.");
        System.out.println("");
        System.out.println("¿Cómo procedes?");
        System.out.println("1. Presentar los documentos falsos con calma");
        System.out.println("2. Intentar sobornar al guardia");
        System.out.println("3. Forzar el paso (combate inevitable)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Presentas los documentos. El guardia los estudia. Segundos eternos...");
                System.out.println("'Todo en orden. Puede pasar.' El alivio es físico.");
                Main.getJugador().dinero += 12000;
                Main.getJugador().experiencia += 1000;
                System.out.println("Dinero +12000$ (pago del contrabandista) | Experiencia +1000");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaContrabandistaHub();
                break;

            case 2:
                System.out.println("'¿Me estás intentando sobornar?' El guardia entrecierra los ojos.");
                System.out.println("Hay un 50-50: acepta o llama refuerzos.");
                if (Main.getJugador().dinero >= 3000) {
                    Main.getJugador().dinero -= 3000;
                    System.out.println("El guardia mira los créditos. Los guarda. 'Pase.'");
                    System.out.println("Dinero -3000$ | Pago de contrabandista: +12000$");
                    Main.getJugador().dinero += 12000;
                    Main.getJugador().experiencia += 800;
                    try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                    Juego.pantallaActual = new PantallaContrabandistaHub();
                } else {
                    System.out.println("'No tienes suficiente para comprar mi silencio, criminal.'");
                    System.out.println("¡Llama refuerzos! ¡Combate!");
                    try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                    Juego.pantallaSiguiente = new PantallaContrabandistaHub();
                    Juego.pantallaActual = new PantallaBatallaAduana();
                }
                break;

            case 3:
                System.out.println("Pisas el acelerador. Los guardias saltan y desenfundan.");
                System.out.println("¡Te atrapan en la bahía de atraque! ¡Combate inevitable!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaContrabandistaHub();
                Juego.pantallaActual = new PantallaBatallaAduana();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
