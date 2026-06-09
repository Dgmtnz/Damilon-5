import java.util.Scanner;

public class PantallaPortalIntergalactico extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                    .oOOOOOOOOOOOOOOOOOo.                     \n"+
        "                 .oOOOO  .oOOOOOOo.  OOOOo.                   \n"+
        "               .oOOOO  oOOOO   OOOOo  OOOOo.                  \n"+
        "              oOOOO  oOOOO       OOOOo  OOOOo                  \n"+
        "             oOOOO  oOOO    ***    OOOo  OOOOo                 \n"+
        "            oOOOO  oOOO   *****   OOOo  OOOOo                  \n"+
        "            oOOOO  oOOO  *     *  OOOo  OOOOo                  \n"+
        "            oOOOO  oOOO   *****   OOOo  OOOOo                  \n"+
        "            oOOOO  oOOO    ***    OOOo  OOOOo                  \n"+
        "             oOOOO  oOOOO       OOOOo  OOOOo                   \n"+
        "              oOOOO  oOOOO   OOOOo  OOOOo                      \n"+
        "               .oOOOO  .oOOOOOOo.  OOOOo.                     \n"+
        "                 .oOOOOOOOOOOOOOOOOOOo.                       \n"+
        "                    .oOOOOOOOOOOOo.                            \n");
        System.out.println("-- PORTAL INTERGALACTICO ACTIVADO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡El artefacto ha abierto un portal! Una puerta de energía pura se materializa ante ti.");
        System.out.println("A través del portal se vislumbra otro sistema estelar totalmente desconocido.");
        System.out.println("Tus sensores no reconocen ninguna de sus estrellas. Esto está más allá de cualquier mapa.");
        System.out.println("");
        System.out.println("Opciones:");
        System.out.println("1. Entrar al portal (aventura máxima, sin retorno)");
        System.out.println("2. Reportar el portal a la comunidad científica y volver");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Con el corazón a mil, aceleras la nave hacia el portal...");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaOtraGalaxia();
                break;

            case 2:
                System.out.println("Reportas el descubrimiento. La comunidad científica te proclama explorador del siglo.");
                System.out.println("Dinero +50000$ | Experiencia +5000");
                Main.getJugador().dinero += 50000;
                Main.getJugador().experiencia += 5000;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
