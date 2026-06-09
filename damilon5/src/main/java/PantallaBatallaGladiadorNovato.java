public class PantallaBatallaGladiadorNovato extends Pantalla {

    Enemigo novato = new Enemigo(PantallaArenaGalactica.getCurrentNovato(), Main.getJugador().vidaMax / 3, Main.getJugador().nivel - 2, 2, 2);

    @Override
    public void mostrarSprite() {
        System.out.println("                          *0QMMMMMMMQ0*                         \n"+
        "                         +O0QQMMMMMQQ0o+                        \n"+
        "                        :*O00QQQQQQ00Oo*.                       \n"+
        "                        +ooO000000000Oo*+                       \n"+
        "                       -*ooOOOO000OOOoo*+.                      \n"+
        "                      .+**oooOOOOOOOooo*+=                      \n"+
        "                      -++**ooooooooooo**+=.                     \n"+
        "                     :=++*****O000O****+++:                    .\n"+
        "::=:-::...          .-++++****OOo*O****+++-:      .     .  :=...\n"+
        "-   :=+:=+=.-.     :=+++++**+O*Qo *o+**++++=-:::..:- .=--       \n"+
        "          .-       .:=+++++++oOQ+ Ooo+++++=:        .:          \n"+
        "          =+         .++--*0W0*O+ :OOo*-=+-         .+          \n"+
        "          ++          ==:.+000M0*=--   :-+:          +          \n"+
        ".:=*+++=: =+.=        =:: *o *QQ*=     .:=:          = =:    .  \n"+
        ".+.++ +o=. **+++-=--*=:+ *Mo :=0o    =+==-.-... .    :. - -     \n"+
        ":O+  -*    :.     +:++::=Qo:.-=*+   .+0o.-+. :                  \n"+
        "     -.         =..  +: +O-.--+*+    -O=  :    .                \n"+
        "                .+    : *+   -==      +=   :    .          -    \n"+
        "                        oo   :.      .o+  -...                  \n"+
        "                        **  .        +o=   .:                   \n"+
        "                        .   =: :  :   .                         \n"+
        "                        :  =++*   *::.                          \n"+
        "                        .  +=*=   +* :                          \n"+
        "                        . ++*o     o*+=                         \n"+
        "                       :  +.+:     -+ +                         \n"+
        "               .:=++****Oo  +0OO0OOO.  Oooo**++=:.              \n"+
        "       ..=+*oO00QQMMWWQM&W: M&W&WWW&0 +WWWWWWMMMQQ0Oo*+=:....   \n"+
        "  .:-+*oOQQMMWWWMWWWWWQW&M *&&&&&&&&W- W&WWW&WWWWWWWMMMQ0O*++=--\n"+
        "-=++*O0QMMMMWWMWWWWWWWWWW0 0&&&&&&&&&o Q&WW&WWWWWWWMMMMMMQ0O*++=\n"+
        "-==+oO0QQQQQMMMMMMMWWMM&Mo :0WWMMMWMO  OM&WWWWWMMMMMMMMMQ00o*+++\n"+
        ":-:=+ooOO00QQQQMMMMMWQ+QW+             0MQMMMMQQMMQQQQ00OOo*+++=\n"+
        ".:::--+**ooOO00QQQQMQ-                 :. *MMMMQQQ00OOo*++====::\n");
        System.out.println("-- " + PantallaArenaGalactica.getCurrentNovato().toUpperCase() + " --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Que empiece el combate!");

        while (Main.getJugador().vida > 0 && novato.vida > 0) {
            if (Main.getJugador().velocidad >= novato.velocidad) {
                Main.getJugador().atacar(novato);
                if (novato.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                novato.atacar(Main.getJugador());
            } else {
                novato.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(novato);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("¡" + PantallaArenaGalactica.getCurrentNovato() + " gana! La multitud silba. Eliminado en la primera ronda.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Victoria! La multitud enloquece. Primer triunfo en la Arena.");
            Main.getJugador().dinero += 5000;
            Main.getJugador().experiencia += 800;
            System.out.println("Dinero +5000$ | Experiencia +800");
            PantallaArenaGalactica.setNovatoDefeated();
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaArenaGalactica();
        }
    }
}
