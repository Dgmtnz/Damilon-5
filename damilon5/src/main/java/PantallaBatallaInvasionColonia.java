public class PantallaBatallaInvasionColonia extends Pantalla {

    Enemigo comandanteInvasor = new Enemigo("Comandante Invasor", Main.getJugador().vidaMax, Main.getJugador().nivel * 2, 7, 6);
    Enemigo soldadoInvasor = new Enemigo("Soldado Invasor", Main.getJugador().vidaMax / 2, Main.getJugador().nivel + 1, 4, 5);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                *                               \n"+
        "                                                                \n"+
        "                               :+                               \n"+
        "                               -+                               \n"+
        "                               .-                               \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "        -.. -                                                   \n"+
        "          :=+*+                                =++=.            \n"+
        "                                                                \n"+
        "                   +.                                           \n"+
        "                                            :                   \n"+
        "     .:+:                   .. ....                  :++.=:     \n"+
        "        .                 : :-:::-=:.                           \n"+
        "                      .  .   :::==--:. .                        \n"+
        "       :         .::--==-.   :=++++=-  :..:.                    \n"+
        " .-.   -.==:  ++=:-=+++**+   +******+  -++++==-::   .   *     ..\n"+
        "::      *+   :oO+o0o*oo+ +    .oOOoo+::=+**++oO+.=  :++*+  :  ..\n"+
        ":. =oOo+::  ..  -*o+++*+   =+ :*o**= :=+oOO0QO++==:  :**++ =+++*\n"+
        "    +=+:  ++++o*+=     .=-***+-+*+*+. +**oooOo+     .:  =: -++**\n"+
        "           :=+o*+-        - :*++++O*=+=++: -+=+:   *o*=-  -     \n"+
        " :-=      ..=+-+            =++++oM0=           -++++           \n"+
        " ==   .  .:+=+**     -        **ooOo*+.        =o**++:.:::      \n"+
        "   +. :-=---   :+              +*=  +*++= :   .++*+:++--.       \n"+
        "   .=***+.                   +-      :+++=+*** -=+:       .:    \n"+
        "     +:   -.                  =++= :  +Oo =o*+             ::   \n"+
        "                    .  .:.  .--==+= =+   .-...                  \n"+
        "                   :.:=++=:====--=- . .   .                .    \n");
        System.out.println("-- INVASION --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los invasores aterrizan. El comandante lidera el asalto personal.");
        System.out.println("¡Proteges lo que construiste con tus propias manos!");

        while (Main.getJugador().vida > 0 && (comandanteInvasor.vida > 0 || soldadoInvasor.vida > 0)) {
            if (Main.getJugador().velocidad >= comandanteInvasor.velocidad) {
                Main.getJugador().atacarA2(comandanteInvasor, soldadoInvasor);
                if (comandanteInvasor.vida <= 0 && soldadoInvasor.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (comandanteInvasor.vida > 0) comandanteInvasor.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldadoInvasor.vida > 0) soldadoInvasor.atacar(Main.getJugador());
            } else {
                if (comandanteInvasor.vida > 0) comandanteInvasor.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldadoInvasor.vida > 0) soldadoInvasor.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(comandanteInvasor, soldadoInvasor);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Has caído. La colonia cae con su gobernador.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaCaidaColonia();
        } else {
            System.out.println("¡La invasión ha sido repelida! Los invasores huyen.");
            System.out.println("Los colonos te llaman héroe. Tu leyenda crece.");
            Main.getJugador().experiencia += 3000;
            Main.getJugador().dinero += 15000;
            System.out.println("Experiencia +3000 | Dinero +15000$ (botín de guerra)");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaColoniaProspera();
        }
    }
}
