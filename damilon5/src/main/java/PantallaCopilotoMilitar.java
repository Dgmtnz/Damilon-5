import java.util.Scanner;

public class PantallaCopilotoMilitar extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println(" .-==  :+=   : :+=++++++:  .                                    \n"+
        "-=-.     ++=  =-  ++++++-                                       \n"+
        ":       :..O*= .   -:..   ....:...:::::.........                \n"+
        "      .. :*oO+   ..                                          .+o\n"+
        "     .. =*oO*  .:.                                .=:     .:o00O\n"+
        ".   : .+*oo- .::                   +=--           +o*:   o*==...\n"+
        "   :.=*oo*  ::                     OM0*==:        Oo+ - +o:-   -\n"+
        " :.:+*oo: :-:                      MW0o:==       ooOO*.         \n"+
        ":-=**o+ .::                        QOoO*+: .--  +O0Qo           \n"+
        "-+***. ::.                         o.*MO+::-=: :O0Q0:  =:    ++.\n"+
        "***+  ..                           +0o0*++. .  *OQQO.  o*      +\n"+
        "*+   ..                             Q0o--=::     00o   oo.      \n"+
        ":   .:.                             :+=o*=+.     =*o+   :  == **\n"+
        "O*+=..:                             +*-*0O+.++**+: =*   =Oo.    \n"+
        "      .=: . .  ..:::-====++++++++++Oo-.  ++*ooo*+.      00+    =\n"+
        "       *M-.++*ooooooooooooo******oQo   -oOo*O*+:        oo.     \n"+
        "-:      0o  =   =+.:=.......:  **0O .+OOo*:*o++          -      \n"+
        ".-       +  +*+ .*..++:===+++oOOO0 +00O. -o*+++=                \n"+
        "  -:    .*    :-+= ..-:=**-+*o*:o**Q0o:-+*o+ +:               *O\n"+
        "  .. .:o*+     .              - .oo*: :+*Oo+*o                *o\n"+
        "            +oOQ*==:           *OO-  +*O0o*+*-                  \n"+
        "            :+oO==+**O*  .+++. ooooO*+Ooo**+.                   \n"+
        "              -+-===+*=   +*o  *o*+O=.+ -*+                     \n"+
        "                           . ..:::-= .=  .                      \n"+
        "                                      -                         \n"+
        " .-                  ..::  - .                                  \n"+
        " oO                       : -+++ .                              \n"+
        "               .               :. :                             \n"+
        "                                         :                     :\n"+
        "                                                              +o\n"+
        "                                                             *o*\n"+
        "                                                            *o*+\n");
        System.out.println("-- REX: COPILOTO MILITAR --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Con Rex a bordo, tu nave es más eficiente y tu combate más letal.");
        System.out.println("Rex trae consigo disciplina, silencio y una habilidad táctica extraordinaria.");
        System.out.println("");
        System.out.println("Bonus de Rex aplicado: Defensa +5");
        Main.getJugador().defensa += 5;

        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Rex te habla solo cuando es necesario. Esta noche, rompe el silencio:");
        System.out.println("'He oído que el Imperio tiene una flota de reconocimiento cerca.'");
        System.out.println("'Podríamos... evitarla. O investigar qué buscan.'");
        System.out.println("");
        System.out.println("¿Qué decides?");
        System.out.println("1. Investigar la flota imperial con Rex");
        System.out.println("2. Evitarla y seguir vuestro camino");
        System.out.println("3. Volver al puerto espacial");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La flota busca desertores imperiales. Rex palidece. 'Me buscan a mí.'");
                System.out.println("Rex tiene un pasado. La lealtad se pondrá a prueba.");
                System.out.println("Defiendes a Rex frente a la patrulla imperial. ¡La batalla os une para siempre!");
                Main.getJugador().experiencia += 2000;
                Main.getJugador().dinero += 5000;
                System.out.println("Experiencia +2000 | Dinero +5000 (recompensa por información)");
                try { Thread.sleep(6000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 2:
                System.out.println("Ponéis rumbo al sector neutro. Rex asiente: 'Decisión inteligente.'");
                System.out.println("Vuestro viaje como equipo comienza tranquilo. Por ahora.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("Rex: 'Como quieras. Yo sigo aquí cuando me necesites.'");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
