public class PantallaBatallaTribuRechaza extends Pantalla {

    Enemigo guerrero1 = new Enemigo("Guerrero Tribuario", Main.getJugador().vida / 3, Main.getJugador().nivel / 4, 2, 2);
    Enemigo guerrero2 = new Enemigo("Cazador Nativo", Main.getJugador().vida / 4, Main.getJugador().nivel / 5, 1, 3);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                           .                                    \n"+
        "                        + .:                                    \n"+
        "     -                  00*=  .                                 \n"+
        "     :+                 ***: :==                                \n"+
        "      0o                  : -=:*Oo=                        *.   \n"+
        "      QO                ::: +*0QWMo        ..              :    \n"+
        "       ++                   :+0&W00M.      .-=++          =     \n"+
        "        o       -*-           0M0oOQ+      -+oMQ+        =+     \n"+
        "               .*00*    =.:  +ooooOo=       :oMMQ0       .      \n"+
        "                +oO*    + ++oo= OOO+-+       =o0QQ      =:      \n"+
        "          *+ .   OO    =  0Mo**. -. -*o    .+ +0Qo.    -o=      \n"+
        "           +OOo. ==  ++  :*+  :     *0*:  +**+:*+:+*+. =.       \n"+
        "          .*o. :+ : +*:  +          += *: *O+       *o*         \n"+
        "          .     :--++  :           *=   +.-o0: .-               \n"+
        "               .:- +-       +.     +     :-+o*  =               \n"+
        "               : :-=:   -: :-     :+      o+  *o+      ++*.     \n"+
        "              =:    -    .  ..     =+     --  ..++     =+=      \n"+
        "             *Oo.    *=    *O+      +o*.  +     +**:            \n"+
        "           :*Oo*=-. - -:  +o+:     +**oO*:      +**o+           \n"+
        "            oo*  =:    - :+       = :+*OO*        .=+:          \n"+
        "            .    =::     = -   ==++    :-+=    .                \n"+
        "          .              =:       .                             \n"+
        "                       .                   .                    \n"+
        "                                                                \n"+
        "                                    -.               .          \n"+
        "         +                                            ==.       \n"+
        "        --                                 .                    \n"+
        "                   .+*                     +*-                  \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("-- GUERREROS TRIBALES --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Una facción de la tribu que rechaza el conocimiento foráneo te ataca al partir.");
        System.out.println("¡Combate!");

        while (Main.getJugador().vida > 0 && (guerrero1.vida > 0 || guerrero2.vida > 0)) {
            if (Main.getJugador().velocidad >= guerrero1.velocidad) {
                Main.getJugador().atacarA2(guerrero1, guerrero2);
                if (guerrero1.vida <= 0 && guerrero2.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guerrero1.vida > 0) guerrero1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guerrero2.vida > 0) guerrero2.atacar(Main.getJugador());
            } else {
                if (guerrero1.vida > 0) guerrero1.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guerrero2.vida > 0) guerrero2.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(guerrero1, guerrero2);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Has caído ante los guerreros tribales.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("Has repelido el ataque. Los guerreros huyen.");
            Main.getJugador().dinero += 8000;
            Main.getJugador().experiencia += 1200;
            System.out.println("Dinero +8000$ | Experiencia +1200");
            try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaContinuarViaje();
        }
    }
}
