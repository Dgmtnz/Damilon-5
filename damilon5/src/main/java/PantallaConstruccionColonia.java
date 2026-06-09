import java.util.Scanner;
import java.util.Random;

public class PantallaConstruccionColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                               *                                \n"+
        "                                                                \n"+
        "                         :                                      \n"+
        "                                                                \n"+
        "                                       =                        \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                 :                              \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "               -=*+=                          :                 \n"+
        "             +oo  :+o*.                  +::.  =o+              \n"+
        "          .*oO*-   *o*oO+        ..:    o+       +o+:           \n"+
        "       .+ -O=   +oO*   o+O     =+OMO+:::=+****.    :O-          \n"+
        "      +o   +o   *0          +OOO0QMo:    o.  +oo:  +*           \n"+
        "   +*  o     +*  oo+*-  +*OO+MMOo*Q0MMQ .:    .0  *+   +-+=--   \n"+
        "   00: +    .+o: +O=O0+=*oOQWOoo*+QOM&MOoo:+. O+: *+  :O: =+=:::\n"+
        "  :o  +O   :0o  =QQ-**+*oO*Q@0Oooo0*oOOQo+*oO+00+  Q*       ----\n"+
        ".= -.      *OQO-**0o +o:+o*O00O00Qo    +0M0*0OOO:+0O+         ..\n"+
        "             +o*=.   ++   +=+*+00Oo*++*oooo+****:--             \n"+
        "                      ==..:+++-::=+=++==-= .:                   \n"+
        "                      ++++=                                     \n"+
        "                                  . :                           \n"+
        "                                  +..                           \n");
        System.out.println("-- CONSTRUCCION --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los primeros colonos llegan. Son 50 personas con sueños y esperanzas.");
        System.out.println("Tú eres el Gobernador. Cada decisión afecta sus vidas.");
        System.out.println("");
        System.out.println("¿Cuál es tu primera prioridad de construcción?");
        System.out.println("1. Defensa (muro perimetral y torretas)");
        System.out.println("2. Agricultura (invernaderos y sistemas de irrigación)");
        System.out.println("3. Energía (generadores y paneles solares)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        Random random = new Random();

        System.out.println("La construcción avanza durante semanas. Los colonos trabajan duro.");
        System.out.println("Dinero -5000$ (materiales de construcción)");
        if (Main.getJugador().dinero >= 5000) {
            Main.getJugador().dinero -= 5000;
        }
        Main.getJugador().experiencia += 800;

        if (random.nextInt(10) < 3) {
            System.out.println("");
            System.out.println("¡Alerta! Merodeadores espaciales han detectado la nueva colonia y atacan.");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaSiguiente = new PantallaColoniaEstablecida();
            Juego.pantallaActual = new PantallaBatallaDefensaColonia();
        } else {
            System.out.println("La construcción termina sin incidentes. La colonia está en pie.");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaColoniaEstablecida();
        }
    }
}
