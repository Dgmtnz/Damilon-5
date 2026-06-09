import java.util.Scanner;

public class PantallaCrisisColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   !!! ALERTA MAXIMA - COLONIA NUEVA AURORA !!!                \n"+
        "                                                                \n"+
        "   AMENAZA INMINENTE: FLOTA INVASORA DETECTADA                 \n"+
        "   Naves enemigas: 12                                           \n"+
        "   Tiempo estimado de llegada: 6 horas                          \n"+
        "                                                                \n"+
        "   !!! TODOS LOS COLONOS EN ALERTA !!!                         \n"+
        "                                                                \n");
        System.out.println("-- CRISIS: INVASION INMINENTE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Una flota de 12 naves desconocidas se aproxima a la colonia.");
        System.out.println("Los sensores indican intenciones hostiles. Tienes 6 horas.");
        System.out.println("");
        System.out.println("¿Cómo preparas la defensa?");
        System.out.println("1. Evacuar a los colonos y defender desde la nave");
        System.out.println("2. Fortalecer las defensas terrestres y resistir");
        System.out.println("3. Intentar contactar con los invasores antes de que ataquen");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Evacúas a los colonos. La colonia queda vacía pero los tuyos están seguros.");
                System.out.println("Desde tu nave, enfrentas a los invasores en el espacio.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaColoniaProspera();
                Juego.pantallaActual = new PantallaBatallaInvasionColonia();
                break;

            case 2:
                System.out.println("Te quedas. Si va a caer, caerá con su gobernador defendiéndola.");
                System.out.println("Los invasores aterrizan. El combate es inevitable.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaColoniaProspera();
                Juego.pantallaActual = new PantallaBatallaInvasionColonia();
                break;

            case 3:
                System.out.println("Envías un mensaje de paz. Silencio por 2 horas. Luego responden.");
                System.out.println("'Gobernador. Nosotros también huimos de alguien. Necesitamos refugio.'");
                System.out.println("Son refugiados, no invasores. La crisis se convierte en oportunidad.");
                System.out.println("La colonia crece con 300 nuevos miembros. Dinero +20000$ | Experiencia +3000");
                Main.getJugador().dinero += 20000;
                Main.getJugador().experiencia += 3000;
                try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaColoniaProspera();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
