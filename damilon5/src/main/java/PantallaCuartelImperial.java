import java.util.Scanner;

public class PantallaCuartelImperial extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                    :=  . :=++*****++-..  =:                    \n"+
        "                     =.   .:-======-:.   .-                     \n"+
        "                      -    ..::::::..    +                      \n"+
        "                           -=-=++====                         . \n"+
        "                         ..=+++++++++..                       . \n"+
        "   :     .                                            .         \n"+
        "  .:     :                                            .     .   \n"+
        "  .                                                   .     .   \n"+
        "         .                                            .         \n"+
        "         .                  .....:..                            \n"+
        "         :                         .                .           \n"+
        "         .                                                      \n"+
        "     .   .                                               .      \n"+
        ":.....   .                  ..:..-:                      . ....:\n"+
        "*+=***   -*++  --                              :: :+++   +**++**\n"+
        "         .     .                                .    .          \n"+
        "                        -+            =-.                     . \n"+
        "        . .  :-=+.+:++++++.    +*     =++++-+.== =- : .         \n"+
        "   =   :=  ++- -+.-+++-=.  ::=o..o+::   :====+=- +   +=.  :    .\n"+
        "    .+  =   . =..= = :    *** -.:= **+     . :-:= =:     : :+  .\n"+
        "     -.   + :   :.      +**o*-:   .****+     .  :   : -+    .   \n"+
        "      :      .   .     oOooooO    +*o**oo-          .           \n"+
        "   =  -.     .       +oOOOO00o    *OOoOooO*:              .:  + \n"+
        "        -           +oooooOOOO +o O00OO0OoOO+:          ..      \n"+
        "        ::    .   .oOooooooOO0 *O o00OOOOOooOo: .  :    +       \n"+
        "         +       *o*+**oooOOOO oO oOOo**oo*++*o*:  .   .+       \n"+
        "         :     :+**++****oooo* ++ +oooo*+++++++*+-      :       \n"+
        "        ::   -+***++**++*****+ := =+****+++===-+**+=    +       \n"+
        " .           .++  :-==++++++++=-=:+***+++==++==:.=+:            \n"+
        "            -++. .:-::++++++*++++++**++++===---:  :=-.          \n"+
        "            :.      ..:=++++*+++++++++++==-:..  .    .          \n"+
        "                     .====++*++==++++++=-:::                    \n");
        System.out.println("-- CUARTEL IMPERIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El cuartel imperial es enorme. Cientos de soldados entrenan en los patios.");
        System.out.println("El Comandante Varys te recibe con una mirada evaluadora.");
        System.out.println("'Soldado nuevo. Bien. Tienes dos misiones disponibles. Elige sabiamente.'");
        System.out.println("");
        System.out.println("¿Qué misión aceptas?");
        System.out.println("1. Misión de patrulla en la frontera rebelde (bajo riesgo, recompensa media)");
        System.out.println("2. Misión de espionaje encubierto (alto riesgo, alta recompensa)");
        System.out.println("3. Visitar la armería imperial (comprar mejoras)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Patrulla de frontera. Sal mañana al amanecer.' El comandante sella la orden.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMisionPatrullaFrontera();
                break;

            case 2:
                System.out.println("'Espionaje. Peligroso. Si te capturan, el Imperio lo negará todo.' Te entrega un decodificador.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMisionEspionaje();
                break;

            case 3:
                System.out.println("El armero imperial te ofrece mejoras con descuento para soldados.");
                System.out.println("Vida +20 | Dinero -2000$");
                if (Main.getJugador().dinero >= 2000) {
                    Main.getJugador().vidaMax += 20;
                    Main.getJugador().vida = Main.getJugador().vidaMax;
                    Main.getJugador().dinero -= 2000;
                    System.out.println("¡Mejora aplicada!");
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                mostrarOpciones();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
