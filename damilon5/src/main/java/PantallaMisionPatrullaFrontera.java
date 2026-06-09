import java.util.Scanner;

public class PantallaMisionPatrullaFrontera extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                :-:.   .:::. :                                  \n"+
        "          -:   .=.          .::...                              \n"+
        "        :::.        .::.      :--==:.    --...:..               \n"+
        "      .. .           .::--+===++-=+++*+=-==:                    \n"+
        "....  :         :=. .==.-=++******+===:-:  -.                   \n"+
        ".:-=+++++-:     :=+++************oooOo+ :+-                     \n"+
        "     -+++**o***o= .+++****oooOOOooooOo* -o0OOo*++.              \n"+
        "         :=+*ooOooOO0QMMoOOO00QQQ00Oooo+==o00Oo+*00o+           \n"+
        "         +***o*.=0O0QMMWWWMMMQOOOQQQMMOoo+.=*+-:  :+=+          \n"+
        "               . :+0MMMQoO0Oo:   :o0Qo*oo++=   ..               \n"+
        "     *oOO000QQQQMMMWMWWWMMWM0000ooo0MMM0*+=--   .....           \n"+
        "      =++++++++++***o*+==*oo**O*+OMMWWW&&Qo+       -            \n"+
        "                  ::**++.   :-   :*oO0QMQQMWQ*     .            \n"+
        "       .          :+o*+*o*o00Q0Oo*.   ==  =o0M0=.     :-.       \n"+
        "        .        .:+*oooooooOoOooo+++--.     :OO+=.    +        \n"+
        "               .-=.-+=+*.+o*++: :==++*+=-:.::-.:::.    .        \n"+
        "             .-           .=+..==::-=--:.-=::-.                 \n"+
        "                             .:.  .  .........                  \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("-- PATRULLA FRONTERIZA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Patrullas la frontera con dos soldados imperiales de escolta.");
        System.out.println("De repente, sensores detectan una nave rebelde cruzando sin autorización.");
        System.out.println("¡Se activan las defensas! Los rebeldes abren fuego.");
        System.out.println("");
        System.out.println("¿Cómo respondes?");
        System.out.println("1. Combatir a los rebeldes directamente");
        System.out.println("2. Llamar refuerzos y esperar");
        System.out.println("3. Intentar negociar con los rebeldes");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¡Al ataque! Los rebeldes no esperaban resistencia tan rápida.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaAscensoImperial();
                Juego.pantallaActual = new PantallaBatallaRebelde();
                break;

            case 2:
                System.out.println("Los refuerzos tardan 20 minutos. Para entonces los rebeldes escaparon.");
                System.out.println("El comandante no está contento. Sin recompensa esta vez.");
                System.out.println("Experiencia +300");
                Main.getJugador().experiencia += 300;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCuartelImperial();
                break;

            case 3:
                System.out.println("Los rebeldes escuchan. Un teniente rebelde dice: '¿Soldado Imperial negociando?'");
                System.out.println("'Quizás tengas más en común con nosotros que con el Imperio...'");
                System.out.println("Esta conversación te abre los ojos. ¿O es una trampa?");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaDecisionDobleAgente();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
