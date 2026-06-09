import java.util.Scanner;

public class PantallaMejorCRGalaxia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                              .=                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                 .:::         +:                \n"+
        "                         .:.:-=++++===.                         \n"+
        "                    :+++++++**+=-+**++++++==-:=.                \n"+
        "               .-++**oooOo*oOO    o0OOOOOoOOo**+++- .           \n"+
        "           -.+**ooOOo*ooOO00QQ=   0MMQQQ000O0OOOOo**+-          \n"+
        "          =oooooooooooO0QQMMo=    :oMWMMQQ00OO0OO0Ooo*+-:       \n"+
        "    +=   -*0Oo*oooooO0QMMWQ          0WWMMQQQ0o*oOoOO*++=-      \n"+
        "  :      =*o0OOo**oOQQQMW&o          +&WMMM000Oo+=-*oo+++:   -  \n"+
        "   .  :===*=*O00o*oOO0QQWM            QWMQ000Ooo*==+oo+++.      \n"+
        "    :..+**+-.=+OOOOOOO0QQ* .O      *: +QQ000Oooo***o*+-.=: ..   \n"+
        "     -..:-==-=- :=+o**ooo  +        +  OOOo*ooOoo+++:+:  --+    \n"+
        "      +   .-+*+:=:.-++**o  o:       O: oo***o**+- .=+-   -+     \n"+
        "      :+     +++=.:+++++*+          -: **+***+= :=..     +      \n"+
        "  :    +*    .=::===++++++.          ++++=++:           :       \n"+
        "        :=           .=:.-     .+    -:...         +*  .        \n"+
        "          :               ..   ::    .                          \n"+
        "           .                                                    \n"+
        "                               ---    .                         \n"+
        "                       ..-:  .oooo+  :+=::                      \n"+
        "                  ..:=+++++  +oooo*  =*++*++==-:..              \n"+
        "                   .-=-++*.  ******    ++++++=::...             \n"+
        "                   ....-==   +****+   =+=-::::                  \n"+
        "                   . ....     +**=    ...   .:                  \n"+
        "                               :.       :.                      \n");
        System.out.println("-- MEJOR CR DE LA GALAXIA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La directora Mira te recibe de pie, algo que nunca ha hecho por nadie.");
        System.out.println("'Lo que has logrado es... sin precedentes. El Señor Nexus. Increíble.'");
        System.out.println("El Gremio Galáctico de Cazarrecompensas te nombra Maestro Gremial.");
        System.out.println("Tu nombre vivirá en la leyenda mientras la galaxia exista.");
        System.out.println("");
        System.out.println("Dinero +50000$ adicionales (premio del Gremio) | Velocidad +20");
        Main.getJugador().dinero += 50000;
        Main.getJugador().velocidad += 20;

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("*** FINAL: EL MEJOR CAZARRECOMPENSAS DE LA GALAXIA ***");
        System.out.println("");
        System.out.println("¿Quieres volver a jugar?");
        System.out.println("1. Si");
        System.out.println("2. No, pero seguir explorando");

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
