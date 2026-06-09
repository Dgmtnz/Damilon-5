public class PantallaBatallaRebelde extends Pantalla {

    Enemigo rebelde1 = new Enemigo("Soldado Rebelde", Main.getJugador().vidaMax / 2, Main.getJugador().nivel, 3, 4);
    Enemigo rebelde2 = new Enemigo("Francotirador Rebelde", Main.getJugador().vidaMax / 3, Main.getJugador().nivel + 2, 2, 5);

    @Override
    public void mostrarSprite() {
        System.out.println("            .        .   ++ :+o-OO.o*..=*:  .                   \n"+
        "           :.       .  .:o++*OOO00oo**+=o+                      \n"+
        "         ..    .=+o=--+*o**ooOOOooo*++++++++=-.                 \n"+
        "        ::        +::++==   . .:oo=::.:. :..-=++.               \n"+
        "       ::       .. . .--++:=++**OOo*++-**+-:  .-:               \n"+
        "     .=.       .:-+=-=+=**=+++Oo0Oo*+++*++++--==                \n"+
        "    -=          .:+===+++**+++**QO++++**++=++=-:                \n"+
        " .:+-             .::==++*Oo+*ooQOo**o0o+++==-:....           . \n"+
        "..:  ...:::......::::--=++*O0oO0WQOoOOo+++-::::::......:-+=-=:.-\n"+
        "000o*++++++=--::::----=+++*o0QQQWQQQ0o*++++**=--:::::--=+O0OO00Q\n"+
        "*oO0QMMWMM0*+=======*0QO***oOMW&&WWMOo****O0QO+:=---=+*oQ&&&WM0O\n"+
        "::.-+oQW&&Mo*++++++ .+*+++oooOQQQ00Ooo**+=   ::=++++++**QMWMO**+\n"+
        ".::+++*ooo*+.  ++.+*+++  oO****ooo*****OO   **++=***  .++*****+-\n"+
        ".::=*++++++++=:..:=     .o0O****oo**+o0O+:   .== :=: =++++++==:.\n"+
        ".:::==--=====++.  +*-  .+O0oo +oOo*-++o0o+ :**:  *. =====---:.::\n"+
        " -:...:::--===+++- *00O*00o  =**o**+  oOOoO00+   ++*=--:::::.   \n"+
        " :. ....::--==++=..= +*==:   =-**o*.:  .  ++  =+.  :-::::..     \n"+
        "=.......::--==++++**:       .++**o*+.         :++++++=::..    .=\n"+
        "*-  :..:::::-=++++***+       .=o**o+.        -+++++++==:    :*Oo\n"+
        "++oo .::--+*+++++*+ -         +oooo-         :+=++++=--..  =*oo*\n"+
        "-=:00:.:::+*+++++-          +++*OO++:+-         .=+=++-.  =*+   \n"+
        "=-+-O0**-+===++++  :    -      *Oo= .*=  .       =+=++-:=+*=    \n"+
        ". ++ **--+:==+++     -*ooo+    +Oo+ --  +o**+.     =+===***+++++\n"+
        ":-.=:+*oo+****o=   -ooOooOO+   *00O=++ +OOooOOo*    +****+++:+++\n"+
        "::-=+++***oooooo   =OOO0000Q*  .+0*:*..000OOooOo    ooooooo**oo*\n"+
        "+**o******ooooO*   *000QQQQQQ0- :=   =00000OOOOo    OOOoo*ooo**o\n"+
        "************ooOo   o00000OO0000+=   *QQQ0000OOOO    *ooo**ooo***\n"+
        "+++++=++**oooOO*   oOOOOOO00000=   *000OOOO00000=  +Oooo******+*\n"+
        "=====++++**o*:      .    .-=++:   +oOOOOOOoooOOO    -**o***+++++\n"+
        "...:+**++++=             .=+**+*:+oo*+-.       .       +***+++**\n"+
        ".:---:..      ..::-===+++*ooOo:=--:.                   :-=++++++\n"+
        "..      --==-===++++**o***o***+++*Oo**+++=:....:.  . :.        .\n");
        System.out.println("-- COMBATE REBELDE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Combate! Los rebeldes atacan sin piedad.");

        while (Main.getJugador().vida > 0 && (rebelde1.vida > 0 || rebelde2.vida > 0)) {
            if (Main.getJugador().velocidad >= rebelde1.velocidad) {
                Main.getJugador().atacarA2(rebelde1, rebelde2);
                if (rebelde1.vida <= 0 && rebelde2.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (rebelde1.vida > 0) rebelde1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (rebelde2.vida > 0) rebelde2.atacar(Main.getJugador());
            } else {
                if (rebelde1.vida > 0) rebelde1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (rebelde2.vida > 0) rebelde2.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(rebelde1, rebelde2);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Los rebeldes te han vencido.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Victoria! Los rebeldes han sido neutralizados.");
            System.out.println("El Imperio reconoce tu valor en combate.");
            Main.getJugador().experiencia += 1500;
            Main.getJugador().dinero += 5000;
            System.out.println("Experiencia +1500 | Dinero +5000$");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaCuartelImperial();
        }
    }
}
