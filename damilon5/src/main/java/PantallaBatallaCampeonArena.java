import java.util.Scanner;

public class PantallaBatallaCampeonArena extends Pantalla {

    Enemigo campeon = new Enemigo(PantallaArenaGalactica.getCurrentCampeon() + " - Campeon", Main.getJugador().vidaMax * 2, Main.getJugador().nivel * 3, 12, 9);

    @Override
    public void mostrarSprite() {
        System.out.println("                          -O0QQQMMQQ0O+                         \n"+
        "                          +oO00QQQQ0OO*                         \n"+
        "                          +oO0000000Oo*=                        \n"+
        "                        -o0O0OoooOOOOo*+                        \n"+
        "                     =:+ooOo**ooOOOooo*+:                       \n"+
        "                     o+   -**oooooooo**+-                       \n"+
        "                       :+=++**********++-                       \n"+
        "                       +-+-++*+*oo**+++=-.                      \n"+
        "                       o+o**+=-OMQO++++=-.                      \n"+
        "                      .+-O00MQooo*o=--:=-.                      \n"+
        "                       :*+.-*OQM0***++*...                      \n"+
        "                        ==  *MW&&WQQQQQ0+                       \n"+
        "                            +Q00QQ0000 .++                      \n"+
        "    ..                     -: =o0O**:=                          \n"+
        "                           +: :+00*  *.**o:                     \n"+
        "                             +O*o0+-*- -+WQ                ..   \n"+
        "                             +o+.*+:+.  +*M0                    \n"+
        "                           *O0+*++= =O=  .oM*                   \n"+
        "                          ooO*+-+:==+*0:  **o                   \n"+
        "                         +o*==  +*= = +o   -                    \n"+
        "                         Oo=   =**+.   O+                       \n"+
        "           .             +     -*o*:   .:                       \n"+
        "=   ==            .       ++::   = ..-=-           =        + . \n"+
        "-  :    :   :      *= -=+.oOo:   +  +O00-   O.     *        ==  \n"+
        "= . :+     *=+*: .o+   :..oOO+  ::-   **= :  O*  -o:*.    =. =+=\n"+
        "    .:+   o+oo-  o*++  - .oO*---++-:  oo.*::  oo  = +*:   .=    \n"+
        "   = :    oO=   =+++   : +o*-   .: +: *o . ++   =.              \n"+
        "         .+       +0O  *O *Q     oMQQ      =00*               : \n"+
        "                  =O*  +o=+o     =OOO       OO*                 \n"+
        "                                                         :+-    \n"+
        "                                                                \n"+
        "       .                                                        \n");
        System.out.println("-- " + PantallaArenaGalactica.getCurrentCampeon().toUpperCase() + " --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println(PantallaArenaGalactica.getCurrentCampeon() + " es una máquina de guerra. Sin piedad.");
        System.out.println("La Arena completa está en pie. Apuestas galácticas en juego.");
        System.out.println("¡Esta es la batalla que definirá tu leyenda!");

        while (Main.getJugador().vida > 0 && campeon.vida > 0) {
            if (Main.getJugador().velocidad >= campeon.velocidad) {
                Main.getJugador().atacar(campeon);
                if (campeon.vida <= 0) break;
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                campeon.atacar(Main.getJugador());
            } else {
                campeon.atacar(Main.getJugador());
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(campeon);
            }
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
            if (Main.getJugador().vida <= 0) break;
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println(PantallaArenaGalactica.getCurrentCampeon() + " defiende su título. Tú: su última víctima.");
            System.out.println("La Arena queda en silencio respetuoso.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡¡¡" + PantallaArenaGalactica.getCurrentCampeon().toUpperCase() + " HA CAÍDO!!! ¡¡¡NUEVO CAMPEÓN!!!");
            System.out.println("La Arena explota de gritos. Confeti galáctico llueve desde el techo.");
            System.out.println("Eres el nuevo Campeón de la Arena Galáctica.");
            Main.getJugador().dinero += 50000;
            Main.getJugador().experiencia += 5000;
            Main.getJugador().vidaMax += 20;
            Main.getJugador().vida = Main.getJugador().vidaMax;
            System.out.println("Dinero +50000$ | Experiencia +5000 | Vida max +20");
            PantallaArenaGalactica.setCampeonDefeated();

            try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }

            System.out.println("*** FINAL ALTERNATIVO: CAMPEON DE LA ARENA GALACTICA ***");
            System.out.println("");
            System.out.println("¿Qué haces con tu título?");
            System.out.println("1. Retirarte invicto y volver al puerto espacial");
            System.out.println("2. Defender el título en combates de exhibición (volver a la Arena)");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            if (opcion == 2) {
                System.out.println("El Campeón nunca descansa. La Arena es tu hogar.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaArenaGalactica();
            } else {
                System.out.println("Te retiras invicto. Una leyenda viva.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
            }
        }
    }
}
