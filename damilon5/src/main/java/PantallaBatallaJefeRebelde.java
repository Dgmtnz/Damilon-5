public class PantallaBatallaJefeRebelde extends Pantalla {

    Enemigo jefeRebelde = new Enemigo("Almirante Rebelde Drax", Main.getJugador().vidaMax, Main.getJugador().nivel * 2, 8, 6);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                              =OQQO-                            \n"+
        "                      .      ++*O+*O                            \n"+
        "                     *O*+*o+*+:=*:*o+                           \n"+
        "                    ..*OQO*Oo =*=.*o*+                          \n"+
        "                    +o0MMMO+00O*   -:O* *+                      \n"+
        "                   ++o* =*+ oQMM0O00OO0*:O+                     \n"+
        ":  .              +.:*+       =oO0OOoOoo  o*                    \n"+
        "*o*.                   =    -      :- *Q:  0-                   \n"+
        " .:   .          +=  := .:  -=      :+ o .+-.          .        \n"+
        "     ..        .+ooo:    o.          *=   O+           .        \n"+
        "     ::        ++ oW0             .:=++.   .*.         ..       \n"+
        "     :.         o oWO      - :  =.:++++-+  *0*         ..       \n"+
        "    .:.         o=oQo    .          .+. +:  oQo.       ..       \n"+
        "    .:.         +. O=-   -  +*     .+:  :    OO*       ::       \n"+
        ". .::-          :* o=   :  +O0+        :o.   +.o+      .:       \n"+
        "*=..--           .     -: :**+-=        +*     ++       :   +OOO\n"+
        "o-+..:                :=  +*+ *= .    .  *-             . :+*OOo\n"+
        "+++*=.                 .O: . :+ . :.  .  +o              =**+:+=\n"+
        "oo***+. .:             +* += .. .. :   .  +=           .=***++++\n"+
        "++**-==.     ..::      *o.*++ ....  .      0=         .=+:..:   \n"+
        "     +*= .-::=-..    :oo=   . ....  =    : -.         +*+       \n"+
        ":::.:.+*- -++=.      o*  .  -:.::: :*      :     .:: =*--       \n"+
        "::: .. +*++*+=  --...+       :::::.:   .   .    .=. .*+ .       \n"+
        "---:==++*oo*+=-++=+-+=      ::::::...      : :. .++ *=          \n"+
        "-==++++***ooo*+**++=+      ..........      +=++++- :-           \n"+
        "====+**+++**oooo**+o+ *+:..=--------=.     *****+=:.:       ....\n"+
        "    :*=:++**oooooo+=  +.==+*******+++.     ++**+++==-:::.+o+-:-:\n"+
        "        .*********+:ooO*  +*****ooo**      +oo+o****o*+.        \n"+
        "          :+-=---:=+.**++ .         .          +++++++:         \n"+
        "            :=-:::-     - . .:.==+++=:   .:==+-===+=.           \n");
        System.out.println("-- ALMIRANTE DRAX --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El Almirante Drax es el guerrero más peligroso que has enfrentado.");
        System.out.println("¡Esta batalla decidirá el destino de la guerra!");

        while (Main.getJugador().vida > 0 && jefeRebelde.vida > 0) {
            if (Main.getJugador().velocidad >= jefeRebelde.velocidad) {
                Main.getJugador().atacar(jefeRebelde);
                if (jefeRebelde.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                jefeRebelde.atacar(Main.getJugador());
            } else {
                jefeRebelde.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(jefeRebelde);
            }
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("El Almirante Drax ha resultado ser demasiado para ti.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡El Almirante Drax ha caído! La guerra ha terminado.");
            System.out.println("Tu nombre será recordado en los anales del Imperio para siempre.");
            Main.getJugador().experiencia += 5000;
            Main.getJugador().dinero += 20000;
            System.out.println("Experiencia +5000 | Dinero +20000$");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaHeroeImperial();
        }
    }
}
