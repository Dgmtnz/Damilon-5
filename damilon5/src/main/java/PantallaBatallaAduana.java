public class PantallaBatallaAduana extends Pantalla {

    Enemigo guardia1 = new Enemigo("Guardia Imperial", Main.getJugador().vidaMax / 3, Main.getJugador().nivel, 4, 4);
    Enemigo guardia2 = new Enemigo("Guardia Imperial 2", Main.getJugador().vidaMax / 3, Main.getJugador().nivel - 1, 3, 4);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                               ...                              \n"+
        "                         .::-====--:::::.                       \n"+
        "                                                                \n"+
        "                  :                         .: :.::             \n"+
        "               :  =                         :+ ::..*-           \n"+
        "   :         oo  :+.         ::        .    =o*+-  Q0           \n"+
        "   +         0o :+o=      ..-++==+*O0QQWQo*+++==:  .o:.:        \n"+
        "        :+ : +   +*=.   .+*O0O****oO0MWWQO*+++*:    =*.         \n"+
        "         : -.   --++=+*oo0Q&&WMQ0o+++*++.  :*0o=*oO*:           \n"+
        "          =+*++ +    +:.-+oQQ0Oo*+=-:      -*0*++::- +:         \n"+
        "           :*     ::      .-=+- .:.        .+o+..=: +o+         \n"+
        "           +O: .:=*=        ..    :         ++=+--  :*.         \n"+
        "           .+    =+.                        -=::.   : =+        \n"+
        "         ++    *  -                         .-     =  *O        \n"+
        "         *:    =+-=                          .        :*        \n"+
        "         +        .                                   =         \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                  ..                                            \n"+
        "                   .         ...:::...        .                 \n"+
        "                          .:-==-=-=----:.                       \n"+
        "                                 ...   ..                       \n"+
        "                           :=-==-:.                             \n"+
        "                         .:-++-   =:                            \n"+
        "                          :=*+:   .                             \n");
        System.out.println("-- GUARDIAS DE ADUANA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los guardias imperiales abren fuego. ¡Sin salida!");

        while (Main.getJugador().vida > 0 && (guardia1.vida > 0 || guardia2.vida > 0)) {
            if (Main.getJugador().velocidad >= guardia1.velocidad) {
                Main.getJugador().atacarA2(guardia1, guardia2);
                if (guardia1.vida <= 0 && guardia2.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia1.vida > 0) guardia1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia2.vida > 0) guardia2.atacar(Main.getJugador());
            } else {
                if (guardia1.vida > 0) guardia1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guardia2.vida > 0) guardia2.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(guardia1, guardia2);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Los guardias te han capturado. Destino: la cárcel imperial.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaCarcel();
        } else {
            System.out.println("¡Escapas del checkpoint! Con el cargamento, a toda velocidad.");
            Main.getJugador().dinero += 12000;
            Main.getJugador().experiencia += 1200;
            System.out.println("Dinero +12000$ | Experiencia +1200");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaContrabandistaHub();
        }
    }
}
