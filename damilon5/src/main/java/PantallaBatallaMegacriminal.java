public class PantallaBatallaMegacriminal extends Pantalla {

    Enemigo nexus = new Enemigo("Señor Nexus", Main.getJugador().vidaMax * 2, Main.getJugador().nivel * 3, 10, 8);

    @Override
    public void mostrarSprite() {
        System.out.println("        .        :=+o0000000QQ00000QQQQQQQ0O*=:        .        \n"+
        "      :+=         ....:---==-:==+==------:.....        =+:      \n"+
        "    .:++:            ...::::=*OMWW0*=.::...            .++..    \n"+
        "    :-::..          .:-=++++=++O00o++-===-:.           .::::    \n"+
        "0O+    .         .:--++++++**      =oo+++++-::.          .   +oO\n"+
        ":*O0O+          .-=:..:::--= :*+  *++=-:::..:=-:.         +oOO*-\n"+
        "   .*o        .:::  .::--===.      --:=-:::: .:::.        o*.   \n"+
        "             ...  .:-:-==++-+      .===+==---. .:::.            \n"+
        "+:          ..   ::.::::+*OO+        *OO*=..:::. ...          :+\n"+
        "**=       :-   .:..:=+OO.+*O+        o0O*:oo+::::   -:       +**\n"+
        "   .      -+*..=:.-:=oMM*=:=00++  o*00**+*WMo-..=.:++=          \n"+
        "++..      -=O= =::: :+= .= +O00OooOQQ0+.=:-++ .+=.+o=-        **\n"+
        "++-:      -=O=.=:-+   ++    :+++**+**=.       =o::+o=-        o+\n"+
        "++::      -=o-.=::: +O0*+                +*Qo  :=.+o=-        *+\n"+
        "+= .      :=O=.=-.++=O+ :+*++++**o*O*    +*0O-o+:.+o-:        +*\n"+
        "-: :      :=O=.=:.=. .===oQ00Oooo*+=- +*o+::: ++:.+o-:        .-\n"+
        "..::      :-+.:=:::   .-             *oOO+:=-: .-::+::     :*= :\n"+
        "****+:    =*+-.++::-=                        :+==.=**-    :=*+*O\n"+
        "OOOO*++-   =*o+.-+-:::...                    :+-:+o*=  .=*OOO***\n"+
        "o+ +-*0Oo+=.:+**=:=:::-==               :-=--=:=**+:.=+**OOO*oOo\n"+
        "000o*oo*+=: +**++-.:...                    :. -+++*+ .-=+oO0o*+-\n"+
        "OOo*+:       :*+....:=-         .::     .  :....++:        :++*o\n"+
        ":.             :..-----                    :=:..:            ..:\n"+
        "       .       :.:=++++=                   ++-..:               \n"+
        "       :      .-:-===++                    -==:::       .       \n"+
        "       .:. .:..+++**-=:                   :+**+++- .. .:.       \n"+
        "       .::.-:+Oooooo-                       +ooooOo-.:.::       \n"+
        "      :-....o0o+=-:=            .+           =-==+O0* ...:.     \n"+
        "     .::-.+00+-===++            +*           +++==-*00+ :. .    \n"+
        "      ::.oQo++++++*+           *ooo          ++++++++OQo..:     \n"+
        "     ::+00+-+===+***++        +oooo*         +++==+==-+00*.:.   \n"+
        "    -:oQo.-:::::+++**+        ******=        ++++-==::-.oQO:-:  \n");
        System.out.println("-- SENOR NEXUS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El Señor Nexus es lo más peligroso que has enfrentado en tu vida.");
        System.out.println("¡Esta batalla definirá tu leyenda!");

        while (Main.getJugador().vida > 0 && nexus.vida > 0) {
            if (Main.getJugador().velocidad >= nexus.velocidad) {
                Main.getJugador().atacar(nexus);
                if (nexus.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                nexus.atacar(Main.getJugador());
            } else {
                nexus.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(nexus);
            }
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Nexus es el número 13. Eres su víctima número 13.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡NEXUS HA CAÍDO! El mayor criminal de la galaxia finalmente capturado.");
            System.out.println("Toda la galaxia retransmite la noticia. Tu nombre es pronunciado con asombro.");
            Main.getJugador().dinero += 100000;
            Main.getJugador().experiencia += 8000;
            System.out.println("Dinero +100000$ | Experiencia +8000");
            try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaMejorCRGalaxia();
        }
    }
}
