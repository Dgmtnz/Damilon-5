import java.util.Scanner;

public class PantallaAscensoImperial extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                     -: .:+*ooOOOooo*+:.. -                     \n"+
        "                     := ..+***o0Qo**++.   -                     \n"+
        "                      + :=+****O0***++-: --                     \n"+
        "                      + .=+++**QMo++++=. +:                     \n"+
        "                      *.=+****OWM0****++ +.                     \n"+
        "                      *:+O0QMWWWQMWMQ0O*.*                      \n"+
        "                      *:--+ooOQQQQOoo*:-.*                      \n"+
        "                      o-:+-.oQ0oooOO=.-+ o                      \n"+
        "                      *- ==+00o**oo0* +  *                      \n"+
        "                      *- :=oo+=::=+*o+: :*                      \n"+
        "   *                 .*+- =+  ::::. ++ : *.                  =  \n"+
        "   .      *         .: +o::=+:::=.:++:+=+*.:          -         \n"+
        "          *            *o*****o0QO*****+o*            +         \n"+
        "         =:  .o      :*o   .  =OOo       +=       *   -:        \n"+
        "    :  +..   **     :++:    *o**o**o+     + +     o+   . .  +   \n"+
        "   -=   .+-+*+         *o  .QQO=*=MMO    *.       -=+*++    +=: \n"+
        "   =+     o* *+=       :0*.*+o0WWQo:.=  oo       +o+ o+     .   \n"+
        "    .     ++  oO          =O+OQM0Q0o*O:+o        o+  +          \n"+
        "           : . -        +: . ****+oo = ::        +   .          \n"+
        "                                                 ...            \n"+
        "            +.                      -  .         . -+           \n"+
        "        +   oo                      o  :  =        O+   +       \n"+
        " =     -+   +                             +*       =+   =:     -\n"+
        " .                                                  .           \n"+
        "                                                                \n"+
        "                        ....:.     :                 .          \n"+
        "                             =     .                 .          \n"+
        "         .    ..:::   =++++***  . +*++++++.    :.               \n"+
        "         -+.=**O00Q:  :MWWWWWW .o OWWWMMMM*   O0Oo++..+:        \n"+
        "  ++*.   .+oQQMMWWW*   OQMWMMo .*  0WWWWQO=   MWMMQQ0o=    =**: \n"+
        "    .  :++*O00OOOOo   :*+0Q0Oo+*o+oOQQQMOo+   *oOoOOo*=+:   .   \n"+
        "     :++***++.       .*O0000QQQQQ0QQQ000Q0o+:       :++*+-:     \n");
        System.out.println("-- ASCENSO IMPERIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El Comandante Varys te felicita con un apretón de mano firme.");
        System.out.println("'Tu actuación en la frontera ha impresionado al Alto Mando. Asciendes a Sargento.'");
        System.out.println("Recibes insignias nuevas, aumento de sueldo y acceso a misiones clasificadas.");
        System.out.println("Dinero +8000$ | Experiencia +2000 | Vida máxima +15");
        Main.getJugador().dinero += 8000;
        Main.getJugador().experiencia += 2000;
        Main.getJugador().vidaMax += 15;
        Main.getJugador().vida = Main.getJugador().vidaMax;

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("El Alto Mando tiene una misión especial para un oficial de tu calibre.");
        System.out.println("1. Aceptar la misión suicida (máxima gloria, máximo riesgo)");
        System.out.println("2. Pedir tiempo para reflexionar y volver al cuartel");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Bien. Tu valor es lo que necesitamos. Despega mañana al amanecer.'");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMisionSuicidaImperial();
                break;

            case 2:
                System.out.println("Vuelves al cuartel. El Imperio puede esperar un día más.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCuartelImperial();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
