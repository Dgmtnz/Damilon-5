public class PantallaBatallaSoldadosImperiales extends Pantalla {

    Enemigo soldado1 = new Enemigo("Soldado Imperial Alpha", Main.getJugador().vidaMax / 2, Main.getJugador().nivel + 1, 4, 4);
    Enemigo soldado2 = new Enemigo("Soldado Imperial Beta", Main.getJugador().vidaMax / 3, Main.getJugador().nivel, 3, 4);
    Enemigo soldado3 = new Enemigo("Soldado Imperial Gamma", Main.getJugador().vidaMax / 3, Main.getJugador().nivel, 3, 3);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "      -:         .     ..:=+*+.                                 \n"+
        "-:-: .:: .              .:+*ooo++-    ...                       \n"+
        "**oo***+=:                :=+**+*oOo**+=+ .                     \n"+
        "=+*oooOOOOOooo+-.    .:==... . .:+OOO00Oo+.==.-                 \n"+
        " .:-=+++**O0QQQQ00Ooo**oOo+.    .-+*OoO0QMQMMQ0-         -      \n"+
        "Oo*o0OO*:-:+++*OQ0MWWW&&&&Q*+    -* *oQO+OM&@@@Qo=   *+ -Q:     \n"+
        "MMMW&@@&0*=::: .*=*oQMW@@&&QOooo+:o+==O0*:*QWMQ0**oo+++  oo     \n"+
        "++*OMWWMQ*--=+=:++*+*oO0Q0o*=++OO*::**+*++=::+    =oo    ...    \n"+
        "-=-+*++    .  +=+. :+.+o+.. .+  *O+   +.*QQo   .+   *+     . Q= \n"+
        " ...      ::    +*++.-*O+   o     =**oO+o0O+   +       :++= oo  \n"+
        "                  +o+:+               **+o         -      : *   \n"+
        "               -                 +                 :       .    \n"+
        "               .:                .                              \n"+
        "                :                       : :                     \n"+
        "             :. *      .          :     .            .     +    \n"+
        "             :    =0:: -       :  .  --+* .                +*   \n"+
        "                  .o++               +o+O*                = +:  \n"+
        "                   :+=                +:*o                   -  \n"+
        "                     .                                          \n"+
        "                       :                  -                     \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                  .                             \n"+
        "                       :                                        \n"+
        "                                           :                    \n"+
        "                                                                \n");
        System.out.println("-- SOLDADOS IMPERIALES --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Soldados imperiales que creían en los rebeldes te atacan como traidor.");
        System.out.println("¡Tienes que abrirte paso por la fuerza!");

        while (Main.getJugador().vida > 0 && (soldado1.vida > 0 || soldado2.vida > 0 || soldado3.vida > 0)) {
            if (Main.getJugador().velocidad >= soldado1.velocidad) {
                Main.getJugador().atacarA3(soldado1, soldado2, soldado3);
                if (soldado1.vida <= 0 && soldado2.vida <= 0 && soldado3.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldado1.vida > 0) soldado1.atacar(Main.getJugador());
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldado2.vida > 0) soldado2.atacar(Main.getJugador());
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldado3.vida > 0) soldado3.atacar(Main.getJugador());
            } else {
                if (soldado1.vida > 0) soldado1.atacar(Main.getJugador());
                if (soldado2.vida > 0) soldado2.atacar(Main.getJugador());
                if (soldado3.vida > 0) soldado3.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA3(soldado1, soldado2, soldado3);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Los soldados imperiales te han vencido.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Has vencido a los soldados! El Imperio reconoce que actuaste con honor.");
            System.out.println("El Alto Mando te condecora por defender la verdad.");
            Main.getJugador().experiencia += 2500;
            Main.getJugador().dinero += 8000;
            System.out.println("Experiencia +2500 | Dinero +8000$");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaHeroeImperial();
        }
    }
}
