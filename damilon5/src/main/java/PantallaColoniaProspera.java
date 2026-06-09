import java.util.Scanner;

public class PantallaColoniaProspera extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "          =.=:                                                  \n"+
        "         =o*+**OOO+                                             \n"+
        "            .**++:                                =.            \n"+
        "                                o:               :***=          \n"+
        "                              :+o*=                             \n"+
        "                              oOO0O                             \n"+
        "                 :o*          :***=     .         :             \n"+
        "                 +0O :+     -  +o+:  :  o:      .+=.            \n"+
        " -. =   =  -:-..  O* +o   -*o*:+O=O: O- 0= OO.+*+o:  *.+.      *\n"+
        "         *+*++:-o=O0++OO++oOOOO*o=*+.0oo0*:O0+oo*=.+*+oO:   +=:+\n"+
        "  :   .==       *o0QO*+oOO000ooOQ0+o0OOOoQQ0O*: +*=++-= -.++ o**\n"+
        "-+0+  :=ooo***O0QQ++oo*oooQo*ooooO+*o*Oo*oOoo+OO++=***. -:oo    \n"+
        "+ *o.*=**oo*oooOQO* *oo+OO0OOo+*oOQQOQQO*+++Oooo+=+=+**=. . .  :\n"+
        "*O-oO++*=  =o+-*o*o***= +O*o00O+ooQ0ooOo*+**O0QQ**++:-***+ .   :\n"+
        "+O.**--   ++  ::*==+-+*--= =-*0oo.  .+==-::==+++.++*+*- -o+OO0OO\n"+
        "      :=  +.== =*o*OO*o=:-     -+*   +=      .-++:**Q0QQQo=.+-=:\n"+
        "       ::: . +=:*O*QQO*  -:    :-*==  **+**oo*++*+++Oo+MQQOOWMQ0\n"+
        "      -+ooo*=.        ++-        +.-OO* :  +=-: o0:    + =OOOoo+\n"+
        " =+*oO*o+o**+          ++=:        .: . :.  *Ooo***++.    .:    \n"+
        "O*Oooo++++**           -+*o+   +    .  : -= -=+0OOQooo+- .     .\n"+
        "+-:=++o+               :oo+= . oo -+           .  +++-.         \n"+
        "++..:+              =o0Q* :* :  . o0        .:   -=+*+       + .\n"+
        " .             *0Q+ OMQ**o*+          -      +   =*ooM0-        \n"+
        "               oOo+ *o*.:+=--         *          .+o=+QW0*      \n");
        System.out.println("-- COLONIA PROSPERA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Cinco años después de la primera piedra, Nueva Aurora es una ciudad reconocida.");
        System.out.println("2500 habitantes. Un mercado galáctico. Una universidad. Un hospital.");
        System.out.println("La Federación Galáctica te otorga el título de Fundador de Ciudad.");
        System.out.println("");
        System.out.println("Ingresos anuales de la ciudad: 100000$ | Experiencia +5000");
        Main.getJugador().dinero += 100000;
        Main.getJugador().experiencia += 5000;

        try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("*** FINAL: FUNDADOR DE CIUDAD ***");
        System.out.println("Tu legado es permanente. Nueva Aurora existirá por siglos.");
        System.out.println("");
        System.out.println("¿Qué haces ahora?");
        System.out.println("1. Retirarte como gobernador y volver a la vida de aventurero");
        System.out.println("2. Quedarte y gobernar Nueva Aurora permanentemente (Final)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Dejas la gobernación en manos de un consejo elegido. Vuelves a las estrellas.");
            System.out.println("Pero Nueva Aurora siempre será tuya.");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaPuertoEspacial();
        } else {
            System.out.println("Te quedas. Gobernarás Nueva Aurora con sabiduría durante décadas.");
            System.out.println("Tu ciudad se convertirá en la capital del sector.");
            System.out.println("Dinero +200000$ (legado de gobernador) | Vida máxima +50");
            Main.getJugador().dinero += 200000;
            Main.getJugador().vidaMax += 50;
            Main.getJugador().vida = Main.getJugador().vidaMax;
            try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("¿Quieres volver a jugar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int resp = scanner.nextInt();
            if (resp == 1) {
                Main.jugador = new Jugador();
                Juego.pantallaActual = new PantallaPuertoEspacial();
            } else {
                System.out.println("¡Gracias por jugar!");
                System.exit(0);
            }
        }
    }
}
