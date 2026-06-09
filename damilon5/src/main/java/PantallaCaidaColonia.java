import java.util.Scanner;

public class PantallaCaidaColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "         ......                                                 \n"+
        "                    ..                                          \n"+
        "               ..                                               \n"+
        "              .::.                                              \n"+
        "             .-=-=-:.                                           \n"+
        "            .:-=====--:       .-=:                              \n"+
        "           ..:::-==========-=-:=++-:.                           \n"+
        "         ..::.....:-===+++++++++++++:                           \n"+
        "       .     ....  .:====--=++*+=++--                           \n"+
        "               .. ...:--:..=+++=.:                              \n"+
        "                    :-:.  .==+*+.                               \n"+
        "              .=-         -++***++=+++==                        \n"+
        "             .-++=. .:    :++***********=                       \n"+
        "             .=++=+++oo+  -=++++++oo*+*+-  -                    \n"+
        "              :=++=*o0*:   -++++=o00o*o***+*o                   \n"+
        "           .  +++oOO00o+*=++.*o*+OQ0ooooo*oOoO*=....            \n"+
        "        .:==:=+*+OOQWMOoOOOo++*OOO0MM0OO00MQoOOo+++oO*          \n"+
        "        .=-oo==-:+oM&WWQ0MMOO**0QoOQQQQ0QMW0--++o0+oO*          \n"+
        "   ...:::=.=O0OooooooQ0QMWWWQQO*:- :=*O00M@&MMM0oO*oo  .:..--::.\n"+
        "      .:::  oQ00o       *OOO*Oo:   -OOoM&MMQ0&MoO+**o: -:=-:::++\n"+
        "        +* .oo        +:   -o*o*++=+o0O*=.   O++o*o**=+*: : :=:=\n"+
        "   .    =              ++= =O0++*+:       .=-+*oo*ooo+*-++=:+*+=\n"+
        "    .    ..        +:  .: :  . -==:==o+.:-+:.-+++ .++=**=- ..++-\n"+
        "          :ooOooo*+*+:    .-:  .  .***: ::=:.-++:==:=--.==+-+=++\n"+
        ". ++:::      +oOOOoo**: .  +++.++--:-=-+=+++=====+-::     .+++=+\n"+
        "  :            .*o*oOo*- +-+- +---:...       .-:           :.   \n"+
        "     ..           +*=. . .:=:.+                                 \n"+
        ": .. :  :  .:   ..++ .          =++**+.=                  :+    \n"+
        "           . ..:.       :+    .                                 \n"+
        "                        :-  .                         :=.       \n");
        System.out.println("-- CAIDA DE LA COLONIA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La colonia ha caído. Los invasores la controlan ahora.");
        System.out.println("Malherido, te arrastras hasta tu nave y escapas.");
        System.out.println("Los colonos se dispersan por la galaxia. Algunos mueren. Otros sobreviven.");
        System.out.println("Llevas el peso de ese fracaso contigo.");
        System.out.println("");
        System.out.println("Pero tú sigues vivo. Y mientras vivas, hay posibilidad de revancha.");
        System.out.println("Dinero -5000$ (pérdidas en el ataque)");
        if (Main.getJugador().dinero >= 5000) {
            Main.getJugador().dinero -= 5000;
        } else {
            Main.getJugador().dinero = 0;
        }
        Main.getJugador().vida = Main.getJugador().vidaMax / 2;

        try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("¿Qué haces?");
        System.out.println("1. Volver al puerto espacial y lamerte las heridas");
        System.out.println("2. Buscar aliados para reconquistar la colonia");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        if (opcion == 2) {
            System.out.println("La revancha tendrá que esperar. Primero necesitas fuerzas.");
            System.out.println("Guardas el plan de reconquista para cuando seas más poderoso.");
        }
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        Juego.pantallaActual = new PantallaPuertoEspacial();
    }
}
