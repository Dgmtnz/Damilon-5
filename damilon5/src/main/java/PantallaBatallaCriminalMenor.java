public class PantallaBatallaCriminalMenor extends Pantalla {

    Enemigo lix = new Enemigo("Lix el Contrabandista", Main.getJugador().vidaMax / 3, Main.getJugador().nivel - 1, 2, 3);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                      :==.                                      \n"+
        ".::.               *0QMWWWMQO                                   \n"+
        "                   :+*ooOoo*+                                   \n"+
        "                    ..::::.      .                     . .=.  ..\n"+
        "  .....             ..::::.     -=+*O*+o               .        \n"+
        "*++=      :                      +0MM0**+           +**ooooOO0O0\n"+
        "O0000*+..+0*+++=:: ..             oO0o**o=      ...+QOMQQMOMQM0Q\n"+
        "O0M00M0--*+ .-=+*++-.    .        +OQOQ0+=+   ..:-:*Q*Q0QQMM0QMQ\n"+
        "MWMWQMQ===:      . *o*   -:    :.  OO*OOo+:=   ::-=+o0MMMQMQQQQQ\n"+
        "O000QM*=--++==  - +Qo++ .+= .       ooo*        .-====+*******++\n"+
        "0000Q*-=:-+==+ o0:0o .: .=:  .=-  .=  =   :+o:  :.-:==+++++++==+\n"+
        "****=.=-.:++++ =0*o*::   =***+*+  -=  +o**O0o.  +--::..=+++=: =+\n"+
        "++===.:: :++==.  =        =*+  +.**+: oOOQQ- -  =+++=+. -=---:::\n"+
        "++=-. :. .....  .+=            *=*oo= *OOo: +*++-++:*+. .::. == \n"+
        ".=.**           :. +-          * ++*   .   +*oo++o+ -+ :+   :..:\n"+
        "+O +o +.    ..  =.+++          -.+++      +*++=.*+  +=  .: .:  .\n"+
        "+* :+:+:..:.    ++**:     .     .-o.  .  ..  ++=-   ==   ++++..=\n"+
        "          =:               *+..:.++        =.*+:.   =+          \n"+
        " *Q      :**+ :++.   =o*oO+0O--:-+       .** *+     *+    =:    \n"+
        "=o+       :::**oOo==ooO*=+**::+++        .+- *+     *+  ..      \n"+
        ".+:====-:-=--:=++*+++=O*+**=.-+=          +.=+      --.         \n"+
        " + oOOo*++**+--+**++++**++++ :-           -.==       ++:.       \n"+
        "-*=OQQ0*++++*******+.      -*+            -===      -++=        \n"+
        "+o*O0Oo+++++++=:           .+             :++       .++    ..   \n"+
        "*++:                       =+              -=:      -++     :   \n"+
        "                                    -. :  .: +-     ++-         \n"+
        "                                         ----:     .*+:.        \n"+
        "                                           -       .**          \n"+
        "                                   ==:     .       +*           \n"+
        "                                          .:      ++:           \n"+
        "                                           .     oOO+           \n");
        System.out.println("-- LIX EL CONTRABANDISTA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Lix desenfunda! Los vasos salen volando del bar.");

        while (Main.getJugador().vida > 0 && lix.vida > 0) {
            if (Main.getJugador().velocidad >= lix.velocidad) {
                Main.getJugador().atacar(lix);
                if (lix.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                lix.atacar(Main.getJugador());
            } else {
                lix.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(lix);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Lix te ha dejado KO. El contrabandista escapa.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Lix está reducido! Le esposas y le llevas a la oficina.");
            Main.getJugador().dinero += 8000;
            Main.getJugador().experiencia += 900;
            System.out.println("Dinero +8000$ | Experiencia +900");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaOficinaCR();
        }
    }
}
