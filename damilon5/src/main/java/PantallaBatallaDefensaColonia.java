public class PantallaBatallaDefensaColonia extends Pantalla {

    Enemigo merodeador1 = new Enemigo("Merodeador Alfa", Main.getJugador().vidaMax / 2, Main.getJugador().nivel, 3, 3);
    Enemigo merodeador2 = new Enemigo("Merodeador Beta", Main.getJugador().vidaMax / 3, Main.getJugador().nivel - 1, 2, 4);

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
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                :+-                                             \n"+
        "                *+:                         +:+.                \n"+
        "       :        +=   .                     ++.                  \n"+
        "       =:o.   :   +-.+-     .:          =.=o*         -=+o+     \n"+
        "        :+  .       ::  ::  ==+  =  --  =::-:  -     .          \n"+
        "                 .  -   .+ +oo   *ooo   +*+=-.                  \n"+
        "                  +++   :**oO     +**   -+++++==                \n"+
        "                    .    ==+-      ++                           \n"+
        "                         .                                      \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("-- RAIDERS ESPACIALES --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los merodeadores atacan la colonia. Debes defenderla.");
        System.out.println("¡Los colonos te miran. No puedes fallar!");

        while (Main.getJugador().vida > 0 && (merodeador1.vida > 0 || merodeador2.vida > 0)) {
            if (Main.getJugador().velocidad >= merodeador1.velocidad) {
                Main.getJugador().atacarA2(merodeador1, merodeador2);
                if (merodeador1.vida <= 0 && merodeador2.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (merodeador1.vida > 0) merodeador1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (merodeador2.vida > 0) merodeador2.atacar(Main.getJugador());
            } else {
                if (merodeador1.vida > 0) merodeador1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (merodeador2.vida > 0) merodeador2.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(merodeador1, merodeador2);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Has caído. La colonia sin líder queda indefensa.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Merodeadores repelidos! Los colonos te ovacionan.");
            Main.getJugador().experiencia += 1200;
            Main.getJugador().dinero += 3000;
            System.out.println("Experiencia +1200 | Dinero +3000$ (bienes recuperados)");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaColoniaEstablecida();
        }
    }
}
