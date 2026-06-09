public class PantallaBatallaCriminalPeligroso extends Pantalla {

    Enemigo korrox = new Enemigo("Korrox el Pirata", Main.getJugador().vidaMax, Main.getJugador().nivel * 2, 6, 7);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                            :-:.                                \n"+
        "       .=                :++**+-::                              \n"+
        "                                          +:+-                  \n"+
        "              .              +oO0++=                            \n"+
        "    +       .    :.-        - -*0**                      -      \n"+
        "                   =:         .:.+                              \n"+
        "                    :        :-*+-  =+                          \n"+
        "       =             +=: =*::. =+  .Oo0O+=+*         =     .   .\n"+
        "      +.              ==***++     -*o*Q0*:           +  -     .-\n"+
        "  .   o=                   -  + =-+*=   +*-=         o= =   :  .\n"+
        "  .   *              -=-.    =o+==:-.   .*oo**+      *+ :   :   \n"+
        " ...  +       -     :.        :+:-      ..  -oQo     -=     .   \n"+
        "  ..  +      .* : .    =  :-    -. .    ++..  =0o:   .-         \n"+
        ".. .  -       . :     :=  *o  :+=      ++. +   +0+    :         \n"+
        "      .     ..  :        ++ .=+**== .= .-    :-++**+  .  +.     \n"+
        "   . :       -==.   .: -+++      .**.  =:        **O00OOoOQO00+ \n"+
        "     :+. -*OOO*-. :-++  +-      -*.-*+=*+=      :: .+*OQMWMQ0+  \n"+
        " ..:+*o*o00*+.    -+: :-::   . .:+ .=*o+=:            .=++: ..:.\n"+
        ". +o00OOo+       :+*.:-.  .. .   : .=+oO+= .         .:    .::..\n"+
        "     .         +*Oo-         :       +o0O*       -              \n"+
        "             :o0Qo           :. -     =.O*.                     \n"+
        "           =+0Q0+    .:      :                              .+  \n"+
        "      .  .0o0Qo ..          :  ::-         :         -          \n"+
        "       . QM0Q*              :++=-:::.       .        .          \n"+
        "  .     OW0O+.              :++=-:...::     =+.                 \n"+
        " -*+    +=         ...     =+******+==--        ..-.            \n"+
        "      ..         .:--=     -==*+*+++-:-::-.     .....::.        \n"+
        "        ..                    :::                               \n"+
        "          .:-.                                +                 \n"+
        "                 .:-=:.    =++++=:: .         -+:               \n"+
        "             .:-++:-::  .  =+++===+:.:..                        \n");
        System.out.println("-- KORROX EL PIRATA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Korrox es el criminal más peligroso que has enfrentado.");

        while (Main.getJugador().vida > 0 && korrox.vida > 0) {
            if (Main.getJugador().velocidad >= korrox.velocidad) {
                Main.getJugador().atacar(korrox);
                if (korrox.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                korrox.atacar(Main.getJugador());
            } else {
                korrox.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(korrox);
            }
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Korrox era demasiado. Victima número 16 registrada.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Korrox ha caído! Su leyenda termina aquí.");
            Main.getJugador().dinero += 20000;
            Main.getJugador().experiencia += 3000;
            System.out.println("Dinero +20000$ | Experiencia +3000");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaDilemaMoral();
        }
    }
}
