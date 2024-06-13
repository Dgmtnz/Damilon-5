import java.util.Scanner;

public class PantallaTrampaPolicia extends Pantalla{

    @Override
    public void mostrarSprite() {

        System.out.println("\n"+
        "                                    .-@@@@@W                    \n"+
        "                                :Q@@@@@@@@@@@@@@:               \n"+
        "                               @@@@@@@@@@@@@@@@@@oQ             \n"+
        "                              @@@@@@:=+Q@@@@@@@@@-&@            \n"+
        "               :0@@@@@-      @@@@@M     :@@@@@M&==@ :           \n"+
        "            .@@@@@@@@@@@&@:  @.@.:+M@@@@@@@@@@@  @W .           \n"+
        "          :@@@@@@@@@@@@@M@M @0= W@         -@+  - @@&Qo         \n"+
        "          @@@@@o   O@@@@@@W.@W0.@@         -@=  -W@o&&W         \n"+
        "          M@ .*0MWWWWO.. @@*-@W @@         =@+  Q @  +          \n"+
        "              @        @- .0@@& @@         :@++@&@:+@           \n"+
        "        .W    @        @= 00 @&:@0QQ0          .M @@@           \n"+
        "          -   @        @0*& +    @@@00OoO0o*+== =@O@            \n"+
        "          @*            :@ :@  +@M@@W0MWWW0=*+&&Q:              \n"+
        "           & :@O***OQO+=:: 0W   oo@@&&&WWMMQ*    :              \n"+
        "           @=&@@ =+-:Qo:@         *@&          -M@@M            \n"+
        "             W@@=        .:         .        M@@@. =@W          \n"+
        "             :M         +@ =@       @     &@@@@+M   =@..        \n"+
        "             .@@.   .@@@@.- :& @@. o@@  @@@@@M@     . @.-@@@    \n"+
        "        :+Q  @@@&   @@@@M&.=O-.  @ :     @@@   :@ : . @@@@@@: 0Q\n"+
        "    =@.-@M: :@=      =@@:. @@.@O&  @    oO=      W@0..Q&&@@@@@@@\n"+
        ".&-@@@@M-.  M @@    @@ *&&.QW@+o  @   -@@: SPACE     MWW&@@*:. Q\n"+
        "&@&@@O@Oo. @@@@   .@@@=  &@&@-@  .    @@  POLICE  &&@@@&o: @@@@ \n"+
        "* @0 .+ :  @@@&    @@@@ .+*@ @       @@           . .    -:-::- \n"+
        "@@.=.-  @ @@@@     @@=.:@&& &o      @  M  .+ .O @&@:@ 0    .    \n"+
        "    M @ - @@@     @@@ M- :@*M . ..  O&    .@@     .:.        .  \n"+
        " . &@@  - @@@@@@@O@@..            :@ . ..  .    .  ..    ....   \n"+
        " WQ@@o    @@+     @+& .&@o@ @     O.+ =0@o0oo*o+@+  &   -@@@    \n"+
        ".*@..  . . @      @M  -&  @ @    : @ o &@@  .@ :    @   WMMM    \n"+
        " =&&  MOQ  0     :   o+ @.:0      . * +Q&Q  :@   0o .    .      \n"+
        "  O   :. .         .  : .o-              .M @     -      .      \n"+
        "  ..  .                  :                              .       \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("La lealtad es importante para ti, y estás dispuesto a asumir los riesgos que conlleva");
        System.out.println("El viaje transcurre sin incidentes, y el científico se muestra agradecido por tu discreción, entregándote un bono adicional al llegar a destino. La familia, por su parte, te agradece profundamente, dejándote con una sensación de satisfacción por haber hecho lo correcto. Sin embargo, al regresar a Damilon5, descubres que hay una orden de arresto en tu contra por complicidad en actividades sospechosas. Ahora debes decidir tu próximo movimiento:");
    
        System.out.println("Opciones:");

        System.out.println("1. Entregarte y enfrentar las consecuancias");
        System.out.println("2. Huir y vivir como un fugitivo");

        System.out.println("Elige una opción:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            Main.limpiarPantalla();
            System.out.println("Has decidido entregarte a la autoridad");
            System.out.println("                                                               \n"+
            "                                                                \n"+
            "                         O  @WQ**@@*OM@  o                      \n"+
            "                    M oW=@@W*+W&@@@M&+*0@@@ 0 M                 \n"+
            "               @     @@M+*****@Mo@o@@+****+oQ@    @             \n"+
            "             M @ @@@:@*******+M@O0O@W-*******W@@@@ @ 0          \n"+
            "           @@     =@@+++*****+ QMWW@ ******+=+W@O     @         \n"+
            "           @-@@   @M       .                   *@@ @@@*@        \n"+
            "         @ 0  o   &+     W  +++=    ++++ WW    +W  oo  Q @      \n"+
            "         @  @@     o+ WQ O                @ W :*     @@  @      \n"+
            "       @ @@           @.    Q@@     @@@    @@           @@ Q    \n"+
            "      @@  @            @  *W     WW    =    @          @  @@    \n"+
            "       @@@            @&  @o@ -&@@@W@ *O@& W&     :     @@@O    \n"+
            "     @@W WO     @     @@M @@@@@@@@@@@@@@@W0W@    @@  .  &M @@   \n"+
            "       @@      @@@W    .@M@@@@@@Q@W&@@@@@&&@    @@@@      @&    \n"+
            "     @@@ @@    @  W       W@@@@@@@@@@@@@@W     .@  @    @@ @@   \n"+
            "       @@                  M@@@@@WM@@@@@               * @@     \n"+
            "       @@ @O                QWW@@@@@@W @              O@  @Q    \n"+
            "         @       @@@      -*W0+ WWWM *W@Q             O @@      \n"+
            "         @@@@@   Q@@@     @@WWW*****WWW+@            @:@@       \n"+
            "            @@    @@@ @@@ ***=o@@@@@@:***@:@@&      :@          \n"+
            "                 @@@@o   +******+WW+***o* +   @@@               \n"+
            "            @@@*@@@@@@@@@O-=***      *** **o+o++. *@&@@         \n"+
            "         @@o*++.@@WWWWWMMO*++-      +=  **o*********=+O&@@      \n"+
            "         @o*oo*@@@@@@@@@@@*=o++++  +*+******@@@@@@o****.Q@.     \n"+
            "        @=*+  @@@@@WWWWQQW*****+    +******@&W0&WW ***:+**@Q    \n"+
            "       @@++@ @@@@@@W@@WMMW*****+    +******@@O@@O@ *** + @@@    \n"+
            "       @M=@* MM@@@@@@@@@@******=    +******+ @oo@-*** ++ @W@    \n"+
            "     @@@ -@**o W@WWWWWo-     **      **            :* +*+.OW@   \n"+
            "     @0* @.o :     +WWWMWWW@o**      **o*@o@**@@o@@*  ++++oO+@  \n"+
            "     * MM * oo    o**o*****oo**      *oo*@*M*@@@o@@*  + oo***@  \n"+
            "   .**@Q*o+  +     oo  oooO  **      **o  oooO:-ooOo   ***o+oo@ \n");
               
            System.out.println("Solo recibes una pequeña sancion por tu colaboración y puedes continuar tu viaje.");
            Main.getJugador().dinero-=450;
            System.out.println("sin embargo ya nadie confia en ti y te quedas sin pasajeros");
               

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Main.limpiarPantalla();

            Juego.pantallaActual = new PantallaPuertoEspacialSin4();
            
                
                break;
            case 2:

            Main.limpiarPantalla();
            System.out.println("Has decidido huir de la autoridad, pero antes de subir a la nave te acorralan los agentes y tienes que luchar.");
            System.out.println("                                                               \n"+
            "                                                                \n"+
            "                           @@@@   @@@.                          \n"+
            "                        @@@@@@*Q&..@@@@@                        \n"+
            "                       00Q00WW* M:WWWM000W                      \n"+
            "                        00 .oo     oo  00                       \n"+
            "                             OM@    .                           \n"+
            "                         M:.Q0+:o *QQ. W                        \n"+
            "                          & @@@W@W@@@                           \n"+
            "                            M@+= :O@0                           \n"+
            "               .@W            WWM&W                             \n"+
            "               0.. @        QO    =00                           \n"+
            "                O .QOQ     M@W00O00W@M                          \n"+
            "                 o  o .M@@@Q@@@@Q@@@@Q@@@0 &                    \n"+
            "                @@.@  @@@@@@M@.  . @M@@@@@@@@@@                 \n"+
            "              .QMMO.M0&M@@@@@M@M W@Q@@@ .@@@@@@@W               \n"+
            "              @oQQQ00MWM@@@@@@@   @@@@ @:O.@@@@@0@              \n"+
            "             Q@=*MMO00::*@&&=&W   @@@@.M M @M@M@MM*             \n"+
            "           .M@M@:QQ=*:MM&    ==O00*Q@@@@@@@@M@M@@QO             \n"+
            "           M@@@&000Q  @@M@MMMM.     oO @@@@M M@@M@@@            \n"+
            "         .@@&MMM00M  -M@M@@@@QM WQ     W*MWM MM@@@@MM           \n"+
            "          @OOO0000  O0M@@@@@@@M   .. Q@@@W :  00OMM@@&          \n"+
            "          +000OO    o00&@@@@@@M   OoMWWWWW@@@@@@@@@@W.@         \n"+
            "                    .M@@M@@@@@W   M        +MWW@@@MM&M          \n"+
            "                     0W&@@@@@@&   @@@   M*+.  -MMQMQ0Q          \n"+
            "                     =O0W@W@@@M   @@MW  @OOW                    \n"+
            "                 Wo.*  OMMW@@@M   @@@M MO0O W-W                 \n"+
            "                  o-     0MQ0MM  :QMQQOQ  . * W                 \n"+
            "                  O    o * *  WQQQQ  *:     *OO                 \n"+
            "                   o   o * *  M   0  *.   .  O                  \n"+
            "                                                                \n"+
            "                                                                \n");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Main.limpiarPantalla();
            Juego.pantallaActual = new PantallaBatalla3Policias();
            Juego.pantallaSiguiente = new PantallaFugitivo();

                break;
        
            default:
                break;
        }
    }

}
