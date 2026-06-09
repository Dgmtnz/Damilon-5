public class PantallaBatallaEspiaDescubierto extends Pantalla {

    Enemigo soldadoImperial = new Enemigo("Soldado Imperial", Main.getJugador().vidaMax / 2, Main.getJugador().nivel + 3, 5, 4);
    Enemigo guerreroRebelde = new Enemigo("Guerrero Rebelde", Main.getJugador().vidaMax / 2, Main.getJugador().nivel + 2, 4, 5);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                        o+     *0+      o+                      \n"+
        "                       +QO   :+*0o*=  :*QO     +:               \n"+
        "                .*    .  =.  *O +0O+ +*+oO0*  *Qo               \n"+
        "          +o       :   =::.:  *O*0o  =+ O0*  **OOo  -+          \n"+
        "          *Qo  =*+. -+o+o**MO-+0&0*.*MoO0o.  -*OOO  00+         \n"+
        "        ****+. .:*o+ *QQo+*00:ooOQO O0o**0Q+ oQO:   +*-         \n"+
        "     -o*:*o0o  -+*MM0+ *- + . *+ *o.- *+oQOoOQO=-  =+= +0*      \n"+
        "      OQ  +O*  -O*+o*=.       +   *  -+: **:oOoQo  .+: *0o      \n"+
        "    +*-++.  =* oMQOo+                 .. =+=o0MMo  . +*oQ*      \n"+
        "     o+*O+o-:O  +*ooo+:.              :--:.-++*O0= :  +o0*      \n"+
        "        =0o  +--+0WQO+.              .::::+o0QQO*.  .+ =0o=     \n"+
        "       .*0+ - ...=+==+*o+:: ... ...:..-+*o**o0QO+:: .  O0*      \n"+
        "       *O++0.      +0WMo+==*+-:++-==+*-+*0MQ*.     .*o =0O-     \n"+
        "        o*.+o0+  +***o+=+*MM*++o0*++oWQ*==**+++:. +0o+:OO+      \n"+
        "       :o:   O0 +o*  .+:-OQo++*QWO+++O0O==+:   :  OO   -+       \n"+
        "            +o*.o*   *OOoo .==+OQO+=-. *Ooo+   o0 o0*   *       \n"+
        "            -*O*0* =   oO- -:.+++*+ .:.=o*   *:+O0o-            \n"+
        "              =:      :o*0+ :+*   o+: +Qo+   :    ++            \n"+
        "             +*         :o+ =+    **+ ++         :O*            \n"+
        "              .o+                    .          *O+             \n"+
        "                +       :....         ..-       :               \n"+
        "                           .:      .    :                       \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                      .                         \n"+
        "                                                                \n");
        System.out.println("-- ESPIA DESCUBIERTO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Te han descubierto! Soldados de ambos bandos te cercan. ¡Combate por tu vida!");

        while (Main.getJugador().vida > 0 && (soldadoImperial.vida > 0 || guerreroRebelde.vida > 0)) {
            if (Main.getJugador().velocidad >= soldadoImperial.velocidad) {
                Main.getJugador().atacarA2(soldadoImperial, guerreroRebelde);
                if (soldadoImperial.vida <= 0 && guerreroRebelde.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                if (soldadoImperial.vida > 0) soldadoImperial.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guerreroRebelde.vida > 0) guerreroRebelde.atacar(Main.getJugador());
            } else {
                if (soldadoImperial.vida > 0) soldadoImperial.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                if (guerreroRebelde.vida > 0) guerreroRebelde.atacar(Main.getJugador());
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacarA2(soldadoImperial, guerreroRebelde);
            }
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("El doble juego terminó mal para ti.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Increíble! Has vencido a ambos bandos. Eres una leyenda en toda la galaxia.");
            System.out.println("Ahora cada bando te teme. Puedes ir donde quieras sin que te molesten.");
            Main.getJugador().experiencia += 3000;
            Main.getJugador().dinero += 10000;
            System.out.println("Experiencia +3000 | Dinero +10000$");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente != null ? Juego.pantallaSiguiente : new PantallaPuertoEspacial();
        }
    }
}
