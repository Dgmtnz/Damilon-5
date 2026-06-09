public class PantallaBatallaGladiadorExperto extends Pantalla {

    Enemigo experto = new Enemigo(PantallaArenaGalactica.getCurrentExperto(), Main.getJugador().vidaMax, Main.getJugador().nivel + 3, 6, 5);

    @Override
    public void mostrarSprite() {
        System.out.println("              ...:::::--=====+=++++++++=====--::...             \n"+
        "            ....:::::--=======+++++++++=====--:::....           \n"+
        "    oo:  .......:::::--========+++----=====---:::...            \n"+
        "    +0Q0*: .::::::::----=======:.+*ooo*+===--::::..     .       \n"+
        "      *0QQO*:.:--::::-----=====oQMMQ0Ooo*+---::::..             \n"+
        "     .  +OQMM0*=-===-------===*0MO*+. ..=-:-::::..              \n"+
        "      ....-*0WWM0*+=====---=-+O:+*: =+ =**+  ::...              \n"+
        "        .::::+OMWWM0*+--=====:*+     +**oOO*+: ....             \n"+
        "          .:-=-+*0MWWQOO+.-=-*O++-    :+o0MM0o+....             \n"+
        "           .::-===+*O00O+o+:*+-**   =O++--oo..o-...             \n"+
        "            ..::-==:+o   *o+*+ -+.      oo*=  .....       .-  . \n"+
        "              ..::---:=-  +*=Ooo0OooooOQQ00**= ....    .  :+    \n"+
        "   ..:.       ..:::::--=   .  .::.-++****oO+ :......   ..       \n"+
        "     :..      ...::::::.     =+=.           :.....      :       \n"+
        "      .        .....:::--:-=++=++          -+ ....      .       \n"+
        "   . ..         ...::::--========   =      +* :..               \n"+
        ".. . ...     ......::::-=======-  :=:       o+ .                \n"+
        "=.     .  .  .......::::::::.               .*+      .:      +- \n"+
        "+= ++   ... ..... .......:::                +**.     ..    =+   \n"+
        "   :o:  ++  .= . --..:--+++.                oO**+ .+  +   .-= ++\n"+
        ".=   =-: .. . :..-:..-+=                   =***+o: ..=- -==:=::.\n"+
        "=++ +**: . -o:  ++ ..          .-.          .-*O+*+  =:=O+  =   \n"+
        "+ .+=:.+     -=  :. -=     .=====     .    .      +o+ ==+  =++*+\n"+
        "++:    .=o+  ++-. .=+:      =-===-   .===. .=-     *+-=.  ++++++\n"+
        " =--.    o*-:.  *+.=:       :------ :----..=*++   .    ..:=+= :=\n"+
        " :=::-   :++*+**+*+.-=+    +++====--=====--**+==       +-**+: ++\n"+
        " .:+++++++==-+*++****o=    ***ooooOOOOOoooooooooo*=    *********\n"+
        "       =*****+*oooooo*     o0000O00000000OOOOOOoooO+  -.+oo**++=\n"+
        "        :oOOOooOoO+=+      .++=::.        .:=+++**oo: =+-+==    \n"+
        "         .+++++******+=. ..:-====-.                .. =o:       \n"+
        "           =+.  -++=+++++*****++===:......:=---=:...:=:         \n"+
        "             :=: -: - .=. ====-==--:=++=+++=======-:::          \n");
        System.out.println("-- " + PantallaArenaGalactica.getCurrentExperto().toUpperCase() + " --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println(PantallaArenaGalactica.getCurrentExperto() + " lleva años en la Arena. Sus movimientos son letales y calculados.");
        System.out.println("¡El combate más duro hasta ahora!");

        while (Main.getJugador().vida > 0 && experto.vida > 0) {
            if (Main.getJugador().velocidad >= experto.velocidad) {
                Main.getJugador().atacar(experto);
                if (experto.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                experto.atacar(Main.getJugador());
            } else {
                experto.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(experto);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println(PantallaArenaGalactica.getCurrentExperto() + " mantiene su récord invicto. Otra víctima más.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡" + PantallaArenaGalactica.getCurrentExperto().toUpperCase() + " HA CAÍDO! ¡Primera derrota en 50 combates!");
            System.out.println("La multitud está de pie. Tu nombre resuena en toda la Arena.");
            Main.getJugador().dinero += 15000;
            Main.getJugador().experiencia += 2000;
            System.out.println("Dinero +15000$ | Experiencia +2000");
            PantallaArenaGalactica.setExpertoDefeated();
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaArenaGalactica();
        }
    }
}
