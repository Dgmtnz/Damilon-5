public class PantallaBatallaGuardianesFuga extends Pantalla {

    Enemigo guardia1 = new Enemigo("Guardia Carcelario", Main.getJugador().vidaMax / 3, Main.getJugador().nivel, 3, 3);
    Enemigo guardia2 = new Enemigo("Guardia Refuerzo", Main.getJugador().vidaMax / 4, Main.getJugador().nivel - 1, 2, 3);

    @Override
    public void mostrarSprite() {
        System.out.println("     =     :                ...::::::.                          \n"+
        "     =                         .....                            \n"+
        "    :=                 ..--=-::::..                  .          \n"+
        "    +=                   ..                          :=  .      \n"+
        "    ++.     +                                        :+  ::     \n"+
        "     +=     +         ....                           .+  --     \n"+
        "   =+==:    .     -*00*+-...                         -+  .=  -  \n"+
        " =++++=:         .:+0WQ**o=:.                       :=*   -++--:\n"+
        "  ++++=:        .  -+*++oO+=:.               +o*.  :--+:  -++=::\n"+
        "   +*++:     **=.    :o+  :-:               +o0o+.:-==+=  =-+:  \n"+
        "    -++.             =OOO*  :  .         =+=    +.-=++++=+-     \n"+
        "      +- .           :+=*oo    :     -O00oO+   +*-+++**+-       \n"+
        "       :                 -*- . -.   :oo+  :+   --:+0W0*+.       \n"+
        "                        -**+=+=-   -*+=   .:=:==+**oOo+*:       \n"+
        "        *+:-             .: ...       =--+= ==.=++*+=*++-       \n"+
        "-     :o* -:                                    -: :.:-=-:... ..\n"+
        "=    =o+  .            .:...         .          +     =+:  ..   \n"+
        ":   +=- =-.           .-====-:::..               .     -++:.    \n"+
        ":  =:  :+ --         ++-++++++++++==-           : .::     .::   \n"+
        "  +:  :+- +*        ==-:+++++++++====-  -++.     -  ::      :+. \n"+
        ".+    =:=**:     .  =+ -+++++=++++++=+- :.+O-     +  .     .  =+\n"+
        "+      :*o*      =  .+ :++=--==---=--=-:   =      +*.           \n"+
        "       ***.      :     =+++===========-=.          *o:          \n"+
        "      +**=       .     :::    .. ...:...           +**-         \n"+
        "     :**-.:.:.        :+++++++++++++==:.          . .**+        \n"+
        "     .                                                 =-       \n"+
        "        .      ..    :++++++++++++++++=.                        \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                   : =+++++++++++++++++=                        \n"+
        "                     .-----::...                                \n"+
        "                                                                \n");
        System.out.println("-- GUARDIAS DE LA PRISION --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Los guardias te cortan el paso! ¡O luchas o vuelves a la celda!");

        while (Main.getJugador().vida > 0 && (guardia1.vida > 0 || guardia2.vida > 0)) {
            if (Main.getJugador().velocidad >= guardia1.velocidad) {
                Main.getJugador().atacarA2(guardia1, guardia2);
                if (guardia1.vida <= 0 && guardia2.vida <= 0) break;
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia1.vida > 0) guardia1.atacar(Main.getJugador());
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia2.vida > 0) guardia2.atacar(Main.getJugador());
            } else {
                if (guardia1.vida > 0) guardia1.atacar(Main.getJugador());
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia2.vida > 0) guardia2.atacar(Main.getJugador());
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(guardia1, guardia2);
            }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Te han reducido. La fuga fracasa. De vuelta a la celda con sentencia extendida.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaCarcel();
        } else {
            System.out.println("¡Los guardias están reducidos! Ox grita: '¡CORRE!'");
            System.out.println("Saltáis el muro y desaparecéis en la noche. ¡LIBRES!");
            Main.getJugador().experiencia += 1800;
            System.out.println("Experiencia +1800");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaFugitivo();
        }
    }
}
