import java.util.Scanner;

public class PantallaHeroeImperial extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                        .....::::::....                         \n"+
        "                         .....    .....                         \n"+
        "                          . ..*oOo:.                            \n"+
        "                           -0o0QQ0o0+                           \n"+
        "                 =:  :oO =o*OOoQQooO*o+ Oo-  .=                 \n"+
        "                 oM+  +OO**++++00++++**O0*  +M*                 \n"+
        "                  =:.-  *+====:*o=:-==+*. ..-=                  \n"+
        "                     **+o*OQQO-:=-oQQOoo-+*                     \n"+
        "                     -.:-=+OQ0O*=O0QO++---.                     \n"+
        "                            .+o++o*:                            \n"+
        "                    o0+ -   =  =*+ -.  + -OO                    \n"+
        "                    *Oo-       *o   :   .oOo                    \n"+
        "                   :=o*      .++*+.     .*O=:                   \n"+
        "                    :+   =****oOOO+**o=   +=                    \n"+
        "                    -.:- .*. :OQQO*..*.  ..:                    \n"+
        "                    -:== :+   .==.  =*   ::-                    \n"+
        "                 .  .    ++=. .-=  -.**    . .                  \n"+
        "                 :  +   -Oo=+ +oo*=*+oo    +                    \n"+
        "               =* +0*    +- +ooooo*= :   ::oO+ :o               \n"+
        "               :* +o+**==+**OO0OOo*O**+:-+++** -*               \n"+
        "    ..  .     : .     -++++*ooOQQOOo+++++-.    . .              \n"+
        "+-: : : .=+:*-=  .:::..++*+*O0MMMQ0O*+*++: -:... :-+=:-  . =---=\n"+
        "  = ::= . =: - : --.=+ ..+**********+++=  =+-. .:  =  -  --- = +\n"+
        "- - = -:=  - =: ::= =+==.:+:--=--=-= =+ ..-:: -:: :  =   +. -. +\n"+
        "=   - -  =  +:-    :=   .=  *o*oo*oo  --   ..   -   .         . \n"+
        ":    -    .      =.    =:   oO0o*0OO:                  :     .  \n"+
        " .                         +O0Q- 00Oo                           \n"+
        "      :     .     +        oO*=  =*Oo+      .     .    -=     =:\n"+
        "     :=                  .+oo      *o*                          \n"+
        "      +:      +:         :oo=       oo+          .     =**      \n"+
        "                         +*o.       +*+                .        \n"+
        "                        =****       =**+                        \n");
        System.out.println("-- HEROE IMPERIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El Emperador en persona te recibe en el palacio imperial.");
        System.out.println("'General, has hecho lo que ningún otro soldado pudo lograr.'");
        System.out.println("'La galaxia es más segura gracias a ti. El Imperio nunca olvidará tu nombre.'");
        System.out.println("");
        System.out.println("Recibes el rango de General Supremo. Dinero, honor y poder ilimitados.");
        System.out.println("Dinero +50000$ | Experiencia +10000 | Vida máxima +30");
        Main.getJugador().dinero += 50000;
        Main.getJugador().experiencia += 10000;
        Main.getJugador().vidaMax += 30;
        Main.getJugador().vida = Main.getJugador().vidaMax;

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("*** FINAL: HEROE DEL IMPERIO GALACTICO ***");
        System.out.println("Tu leyenda perdurará por generaciones.");
        System.out.println("");
        System.out.println("¿Quieres volver a jugar?");
        System.out.println("1. Si");
        System.out.println("2. No, pero seguir explorando el puerto");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Main.jugador = new Jugador();
            Juego.pantallaActual = new PantallaPuertoEspacial();
        } else {
            Juego.pantallaActual = new PantallaPuertoEspacial();
        }
    }
}
