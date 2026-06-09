import java.util.Scanner;

public class PantallaColaboracionCientifica extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "      @@@@@@@@@    .oOOOOo.    @@@@@@@@@    .oOOOOo.           \n"+
        "     @@@     @@@  oOO    OOo  @@@     @@@  oOO    OOo          \n"+
        "    @@@       @@@ oOO    OOo @@@       @@@ oOO    OOo           \n"+
        "    @@@       @@@ oOO    OOo @@@       @@@ oOO    OOo           \n"+
        "    @@@       @@@ oOO    OOo @@@       @@@ oOO    OOo           \n"+
        "     @@@     @@@  oOO    OOo  @@@     @@@  oOO    OOo          \n"+
        "      @@@@@@@@@    .oOOOOo.    @@@@@@@@@    .oOOOOo.           \n"+
        "                                                                \n"+
        "         CIENCIA        +       DESCUBRIMIENTO                  \n"+
        "                                                                \n");
        System.out.println("-- COLABORACION CIENTIFICA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los científicos llegan y se vuelven locos de entusiasmo con las ruinas.");
        System.out.println("Juntos pasan semanas estudiando los grabados, el artefacto central y la tecnología.");
        System.out.println("Finalmente, el Dr. Nexari te llama: '¡Lo hemos descifrado! Esta civilización dominaba");
        System.out.println("la física cuántica a una escala inimaginable. ¡Y lo dejaron todo aquí para quien lo encontrara!'");
        System.out.println("");
        System.out.println("El equipo científico comparte el crédito del descubrimiento contigo.");
        System.out.println("Te conviertes en el mayor explorador de la historia conocida.");
        System.out.println("Dinero +200000$ | Experiencia +10000 | Velocidad +50");
        Main.getJugador().dinero += 200000;
        Main.getJugador().experiencia += 10000;
        Main.getJugador().velocidad += 50;

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("*** FINAL CIENTIFICO: EL GRAN DESCUBRIMIENTO ***");
        System.out.println("¡Felicidades! Encontraste uno de los finales más ricos del juego.");
        System.out.println("");
        System.out.println("¿Quieres volver a jugar?");
        System.out.println("1. Si");
        System.out.println("2. No");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            Main.jugador = new Jugador();
            Juego.pantallaActual = new PantallaPuertoEspacial();
        } else {
            System.out.println("¡Gracias por jugar!");
            System.exit(0);
        }
    }
}
