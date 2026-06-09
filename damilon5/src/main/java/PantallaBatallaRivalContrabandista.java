public class PantallaBatallaRivalContrabandista extends Pantalla {

    Enemigo drax = new Enemigo("Drax el Rival", Main.getJugador().vidaMax, Main.getJugador().nivel + 2, 5, 6);

    @Override
    public void mostrarSprite() {
        System.out.println("          .                                                     \n"+
        "        =-.                                                     \n"+
        "        :=.                                                     \n"+
        "                     .   +oooooooo**. +:                        \n"+
        "                .       .o00QQQQQQQ0==*     *+                  \n"+
        "                       .-+++******+=--     .**+.                \n"+
        "                    .  .:-+**++oO*+=-.       ++=-               \n"+
        "=:        .-      .:  ::=+o00o -=..--::.  .    -                \n"+
        "==:      --:.   .+=  ..=++***= .   :+:::.           +          .\n"+
        "     ...=*+:-=*****ooOO*Oo*+*+     -*+- :.       . +*-          \n"+
        "::.. ..:==*++=+***ooO0Q== =o-      .=:-  .-      =*+            \n"+
        ":  .      ++  =*+-=++=:+: -:*=    *0o+   :+   .- =*+            \n"+
        "          ==   =-.-::-=++     .:=oOQ0*  .:=   .: -=             \n"+
        "...       .    .  :..::-+: -+           . -      =+.            \n"+
        " ::            -  .:...:-===+-          .==   . =++:            \n"+
        "         =+:   :=  .-  .:::::.          ..:*+ .     =           \n"+
        "         ==++ .-+++- .  .::::              +      .Oo           \n"+
        ".:=-   -       -:-+:    .:.               :*     +*+            \n"+
        "+=.++-  .         :  .-===                .+   +*+            ..\n"+
        ".= .--=           =+++=+++            .:. :+   =      :=++++=:-:\n"+
        "  :.:=::  :+      =-===+++       -=   :. .++               .    \n"+
        "+--+*******+        =--=       +++++:  .  =:           =-.      \n"+
        "   ::..+=         .:===+     :+++++++     .+=:.        .-::     \n"+
        "                  :+++---     *+++++=-     :++=       ..        \n"+
        "          .       =+-=+++=    *****+++-     ::::..              \n"+
        "          .  ..--:+-:=++++    +****++==      :-. ....           \n"+
        "             .:..=::====+     -++====-=      ..:.               \n"+
        "             ====  :-=.        :                 .              \n"+
        "               .  .-:=---     ::-=:                             \n"+
        "             .:   ...:--     :*+++=:                            \n"+
        "                 ==   .         :++=::                          \n"+
        "                                +=--:...                        \n");
        System.out.println("-- DRAX EL RIVAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Drax es rápido y conoce el terreno. ¡Cuidado!");

        while (Main.getJugador().vida > 0 && drax.vida > 0) {
            if (Main.getJugador().velocidad >= drax.velocidad) {
                Main.getJugador().atacar(drax);
                if (drax.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                drax.atacar(Main.getJugador());
            } else {
                drax.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(drax);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Drax te ha vencido. 'Dile a Voss que lo intente con alguien mejor.'");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Drax ha sido eliminado! La competencia de Voss desaparece.");
            Main.getJugador().dinero += 10000;
            Main.getJugador().experiencia += 1800;
            System.out.println("Dinero +10000$ | Experiencia +1800");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaContrabandistaHub();
        }
    }
}
