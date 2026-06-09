import java.util.Scanner;

public class PantallaRuinasAntiguas extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "         @@@       @@@@@@@@@      @@@@@@@       @@@@@@@        \n"+
        "        @@@@@     @@@@@@@@@@@@   @@@@@@@@@     @@@@@@@@@       \n"+
        "       @@@@@@@   @@@@@   @@@@@  @@@@@  @@@@   @@@@@  @@@@@     \n"+
        "      @@@ @@@   @@@@     @@@@@  @@@@         @@@@     @@@@     \n"+
        "     @@@   @@@  @@@@     @@@@@  @@@@         @@@@     @@@@     \n"+
        "    @@@@@@@@@@@  @@@@@   @@@@@  @@@@@  @@@@   @@@@@  @@@@@     \n"+
        "   @@@@@@@@@@@@@  @@@@@@@@@@@@   @@@@@@@@@     @@@@@@@@@       \n"+
        "  @@@         @@@  @@@@@@@@@      @@@@@@@       @@@@@@@        \n"+
        "                                                                \n"+
        "  ||      ||   ||      ||   ||   ||      ||   ||      ||       \n"+
        "  ||      ||   ||      ||   ||   ||      ||   ||      ||       \n"+
        "  ||      ||   ||      ||   ||   ||      ||   ||      ||       \n"+
        "  @@@@@@@@@@   @@@@@@@@@@   @@   @@@@@@@@@@   @@@@@@@@@@       \n"+
        "                                                                \n"+
        "  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~     \n"+
        "  .........................................................     \n"+
        "  =========================================================     \n");
        System.out.println("-- RUINAS DE UNA CIVILIZACION ANTIGUA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Las ruinas son inmensas. Grabados en un idioma desconocido cubren cada superficie.");
        System.out.println("En el centro de la sala principal hay un pedestal con un objeto que emite una luz pulsante.");
        System.out.println("Pero mientras te acercas, un guardián mecánico antiguo se activa y te bloquea el paso.");
        System.out.println("");
        System.out.println("Opciones:");
        System.out.println("1. Luchar contra el guardián");
        System.out.println("2. Intentar comunicarte con él");
        System.out.println("3. Huir de las ruinas");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("El guardián te ataca. ¡Prepárate para luchar!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaArtefactoAntiguo();
                Juego.pantallaActual = new PantallaBatallaGuardianRuinas();
                break;

            case 2:
                System.out.println("Intentas comunicarte... El guardián te escanea durante largos segundos.");
                System.out.println("Finalmente se aparta lentamente. Parece que reconoció tu buena voluntad.");
                System.out.println("Dinero +0, Experiencia +500");
                Main.getJugador().experiencia += 500;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaArtefactoAntiguo();
                break;

            case 3:
                System.out.println("Huyes de las ruinas. Quizás otro día...");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaContinuarTuCamino();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
