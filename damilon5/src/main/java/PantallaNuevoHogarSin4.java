import java.util.Scanner;

public class PantallaNuevoHogarSin4 extends Pantalla {

    
    @Override
    public void mostrarSprite() {

        System.out.println("=M  0.     :  ..        -    0  - :    -.  o   @.  @@   Q  .   \n"+
        " o    .            o   &   O   .       @         . @   =        \n"+
        " o       . =                    &&         W                    \n"+
        "     @         +     .                         QQ@@@@&          \n"+
        "          @@          .     M                 QQQ@M@@@@@        \n"+
        " @             @    @                        .0o@Q@@@@@@=      :\n"+
        "            .  &              &.             .MQQ@@Q@@@@= &     \n"+
        "  M   *@@&@@              @   &       .      . 0M0Q@@Q@         \n"+
        "    . QM*@@@@@    .  Q                           @@0@     :o @  \n"+
        "     Q: 0*Q@@@          @@@@@@@@M@@@@@@&     Q                  \n"+
        "      0M 00&@      :@@:QQQ@@Q@QM@@@@@@@@@@@                     \n"+
        "       oO0    -  ..-QQ00Q&@@@QQQ&@@W@@@&@@@@@@         0     .  \n"+
        " &              *Q= Q: QQQMQ&QQWQQ@W@&@@@@@@@@@@                \n"+
        "  Q.@         Q.... M:.Q.QQQQ@@Q0@@Q@Q@Q@@@@@@@W@       @       \n"+
        " .     @     =QQQ * M: M =QWQQQ@@@Q@@@@Q@@Q@Q@@@Q@@     .    @  \n"+
        "            Q.Q. Q: M: M..QQQQQQQ&0Q@@@&@0@Q@@W@@@@@   =     . Q\n"+
        "       M   Q00 -.M: M..M. Q0QQQQQQQQ&QQ&@Q&QQQ@QQ@@@@       o   \n"+
        "     =     Q.    M: M. M  Q..QQ&QQ0QQ0--Q-Q-Q@@Q@@Q@@      =@= 0\n"+
        " M         QQ =  Q  M. M. M. Q:+Q0Q     Q Q0:-o+Q@Q@@   .       \n"+
        "       @   Q Q.:+ : M: Q. M..Q     :@@@@@@@@   :&@Q@@       :   \n"+
        "   Q       QO-:.   .Q..Q. Q .-    M    @@@@@@@.   0@@     o   -:\n"+
        "           Q.Q0  Q  Q-.Q.        .  :  @      @    &@           \n"+
        " .@@   @    QQ :0o  Q  +*              @@@ @ @@    .@     -:@  Q\n"+
        "            @Q *     : Q-           @@@MQ:@&@@@@@@@@            \n"+
        "       O      + 0  .             . .::.   @Q &M-@W@    .        \n"+
        "              QQQ..             0..+00:.oO0.QQQQQ@     =        \n"+
        "           @    MQ-.Q      .  *    + 0=Q. Q000Q@@               \n"+
        " M   @     Q   *  @M. =              : - Q:QQQ+     @@          \n"+
        "   O         =       0-0:-    :. .    :.0Q@:                 :  \n"+
        " &           :          QQQ+o   o .:o0Q@         .    QO      - \n"+
        "       @   .  .  @  =                   -   QQ: @           @.  \n"+
        "     Q                        O         Q  0     ..&.           \n");
     }

    

    @Override
    public void mostrarOpciones() {

        System.out.println("Has llegado a un planeta pacifico.");
        System.out.println("Aqui nadie te conoce y pasas desapercibido entre una civilizacion menos avanzada");
        System.out.println("sin embargo ya nadie confia en ti y no tienes clientes ni pasajeros");
       
        
       
        System.out.println(" Te encuentras el planeta Pacificongo");
        System.out.println("Opciones:");


        System.out.println("1. Partir hacia un planeta cercano");
        System.out.println("2. Crear una familia, sentar la cabeza y ser una persona normal mas.");
    
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        switch (opcion) {

            case 1:

            System.out.println("Has elegido la opción 3: Partir hacia un planeta lejano.");
            Main.limpiarPantalla();
            System.out.println("Con la nave en piloto automatico, vagas sin rumbo por el espacio, sin saber a dónde vas.");
            System.out.println("Sin previo aviso eres asaltado por una banda de piratas espaciales que te atacan sin piedad");
            Juego.pantallaSiguiente = new PantallaPlanetaLejano();
            Juego.pantallaActual = new PantallaBatallaForagido();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            
                break;
            case 2:

            Main.limpiarPantalla();
            System.out.println("                         ..          @                          \n"+
            "            .     *  @@@@     @                 o            @  \n"+
            "          *.@@@@@ & @O                   :&                     \n"+
            "         .  +&@@@                  Q@                  Q&@@@@   \n"+
            "    .*@ @@:&@  0@           .M@                          0@@@o  \n"+
            "  W :@                .                                 .  &Q   \n"+
            "                               *.@. @         .                 \n"+
            "                                .  o*0           @    .         \n"+
            "    @&              . .       .   @ &.    :                     \n"+
            "                  &&W  W=      Q@@@@@=              @.       .  \n"+
            "     .@&+W+@          @@&M      W@:@*         @W  @:&o=         \n"+
            "   .@@.          @ =@@@@@     @ o  @@&@      .@O :o&&&@Qo       \n"+
            "                    0@:@  @@@ @ 0. =@0& @@@   @ 0@@    @@++:    \n"+
            "                    0@     .  @M@@M@M@@.WM@@@ 0@@0@@@@&@.@@@=   \n"+
            "        :      &@+@@ @.M W  MM&M@@M@M@+M M@@- @@@Q@@@@   O@@   :\n"+
            "Q.   .        :O@@M@@@@ @@   M&M@@M@M@    M@@ @WM*@W@&   M&@  M \n"+
            ".o@.Mo@       @@@  @@@@@@@@   @M&@M@M@     W@@MMWM+WMWWMWMWW.@. \n"+
            " M  Q..:M.   @@M  @             @@M@M@     @@@.     .. @     @W \n"+
            "  @@M@=.M:  0@@   oo Q@WW    . O&@*M @   =W@@  .    o0 @ MQ -@W \n"+
            "@:-:&@@@@@@W  @@o @@.M@@@.@. 0      .&  0@@@* : Qo:@@@. MQ.0M.*M\n"+
            "  @-+    .  .M .M@@-@@@@*M&@o   +:@@:   @&@  .:@.* M&@& .       \n"+
            "@ O0o =  :&    M.  &       @*-M       @@@    @@=@@       .&@@@. \n"+
            " . .      O@M@@0 W&@&M     @+    W    &  @    . :   . @       Q \n"+
            "    W     @@@M @ @M        .Q         @@ @@ @@@o@@@@ @@@ o0-. :@\n"+
            "&.@   OW .@@@&:+-@-         M         @@@ @@ @M@ @:@*@@@@=&+:o .\n"+
            "..=o@ .=o @@@@@ :@    O    .M    .@   M@@@   .@@@@.o@@@@=       \n"+
            "@@@@@@@@@@@@Q@@@@M   @O    @M    @@    W@@@@. @@.: :@@@o@@@@@@@@\n"+
            "@@@@@@@@@@@@W@@@@M   @@   @@Q    @@@   @@@@@@    .&@@@@o@@@@@@@@\n"+
            "Q.        @@ &  M  .  .     Q      =   .@   0   W@@  @@         \n"+
            "  M o  WMM@@ 0.@    QMW   o 0     MQ   :@ *&0     @  @@ QMQ  M  \n"+
            "               @  .=  W     O          :M   0     .@            \n"+
            "                                                                \n");
            System.out.println("Encuentras una buena moza en planeta pacificongo, ahora solo te espera vivir apaciblemente y formar una familia ");
            System.out.println("FINAL DEL JUEGO, GRACIAS POR JUGAR");
            Juego.pantallaActual = new PantallaPuertoEspacial();

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos

                break;
            
            
            default:
                System.out.println("Opción no válida");
                break;
        

}


    }

}
