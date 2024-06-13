import java.util.Scanner;

public class PantallaFugitivo extends Pantalla {


    @Override
    public void mostrarSprite() {

        System.out.println("               .@                          .                    \n"+
        "               MWo                       @@@00                  \n"+
        "              .-*W         ..@@@@.       @@000                  \n"+
        "               .OM@       0&O@@@@&@.     -00                    \n"+
        "               ..O*0      Q  .O0  .@    .   :@:                 \n"+
        "             0&=.Qo@      Q      . .                            \n"+
        "              0==+ *o    .W.M.  -0-W=Q                          \n"+
        "               .=-oM@  .O.OO=MMMQM+Q.Qo00@.                     \n"+
        "             :O-=+    ..QO.      -:O+@&@=O=                     \n"+
        "              O 00.   M. &M@O&+:: =.*0@@&WQ                     \n"+
        "              *00.& .:.=QO    ..OW=.+:QOQO:                     \n"+
        "               .00-*@.. M*MW@@ OOO . Oo*.QO-                    \n"+
        "                 .0O*   O*MWWM*Q-.M*   o...Q:                   \n"+
        "                   +. ...*Q+&Wo:=O.*   WW&0..Q                  \n"+
        "             ..      .OQM+QWW0QMM.MQ  oQMWO  o o.               \n"+
        "                  .:  0QQ 000 oQ0 QQ  M@@o:   :.-               \n"+
        "         .      .-  -:  ooO&oQ. . . . :&&Q     .O.              \n"+
        "                O. @M+ : . 00Q-*o*.:@@@&M     ..oQ:             \n"+
        "             .O    @M+O0+QO   .oQQO   QQQ  .=  O  Q.            \n"+
        "             0.    .M+....    .**&&o-     ...O.: .              \n"+
        "            o. O    0=..O...    **oooo*    O.O.                 \n"+
        "         Q.. ..+..-   ..         Q MO@.  :.oo-oQ.               \n"+
        "            :0   :   .-W=.Q      Q.-+&0  .OO0Oo0Q.              \n"+
        "         .Q0.  .O: .  0QQ0.       Q@WOo   .QOQQ                 \n"+
        "              ..O oo  .QQ.          ** :.  OQQQQ...             \n"+
        "                OO    .******     *--O**+     QQQ..0o           \n"+
        "              .OQ:                  ****0      QQ.              \n"+
        "             .oQ       .  ++.        ++*o*   O  .QQ.            \n"+
        "                        :            ooQ0+       .Q             \n"+
        "                      .o              *+o*                      \n"+
        "                  &W&Q               . Q@@@O                    \n"+
        "                 OOOo+                OOOOOO-                   \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Con la nave en piloto automático, te adentras en el espacio desconocido, buscando nuevos horizontes y aventuras. Aunque la vida de fugitivo es arriesgada y solitaria, también está llena de libertad y posibilidades. Con el tiempo, te conviertes en una leyenda entre los mercaderes y forajidos espaciales, conocido por tu astucia y tu habilidad para evadir a las autoridades. Aunque siempre estás mirando sobre tu hombro, encuentras una especie de paz en la inmensidad del cosmos.");

        System.out.println("Opciones:");
        System.out.println("1. Buscar un nuevo hogar en el espacio");
        System.out.println("2. Buscar la redencion");
        System.out.println("3. Unirse a una banda de foragidos");

        System.out.println("Elige una opción:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            Main.limpiarPantalla();
            System.out.println("Has decidido buscar un nuevo hogar en el espacio");
            System.out.println("Navegando en busca de un nuevo planeta");

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Main.limpiarPantalla();

            Juego.pantallaActual = new PantallaNuevoHogarSin4();
            
                break;
            
            case 2:

            Main.limpiarPantalla();
            System.out.println("Has decidido buscar la redencion, pero no hay redencion para ti.");
            System.out.println("Has huido de la policia 2 veces, fuiste declarado terrorista intergalactico y ahora te esperan 10 años de mosca en prision");
            System.out.println("");

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Main.limpiarPantalla();

            Juego.pantallaActual = new PantallaCarcel();

                break;

            case 3:

            Main.limpiarPantalla();
            System.out.println("Has decidido unirte a una banda de foragidos");
            System.out.println("                                                               \n"+
            "                         .. :.. :.                             \n"+
            "                    + + QMQQQQQQQQOO .                          \n"+
            "                  ..: OQQQQQQQQQQQQQo  :                        \n"+
            "                =++ -*   oQQQQQQQQQQQ o  ==                     \n"+
            "                :  :o0000 0Q000O000000==:                       \n"+
            "                . =o0QQ000  00000000000*o*                      \n"+
            "                +o OO0  0MM   0000000OOO o =      @00O          \n"+
            "    . -@Q.      +    .Q :O&-  OOOOOOOO  Oo.o  .&WQ-:.@.         \n"+
            "   Q M@ :=.    .**oo..0 * .@   oooooo  @@@QQW@    @W0W .        \n"+
            "   MM*@ @M    +**ooo . :QQ .  oooooooo-@*&   Q     QO0:         \n"+
            "   :0Mo.QQ    .*-o O*WO      ooooooooo O& . O=  &@QQ-:O.0 @.    \n"+
            " +MMO Q..+Q  =++oOQM--M oo:&  ooooooo    0:M:  @ @.&&Q - @@@0   \n"+
            "OOOMQOOO+oM=&.-oo.Q00:QM+O MW  ooooo .OM&W:O.M@ * 0 M.oM* W@&   \n"+
            " -OMMMMM&-  &W *o  Q0O0*W-o W oo     QW.o+MQ oMM. M=-  M0  MWM  \n"+
            ".QWO   0O=   &.**o  OQQ@@   W oo @@@  .QQ MQ .QM:  Q W0     =&  \n"+
            "QMo0&@@&W .0*O -=o   .OOMOMMM @WM.@@@@oWM0Qo+ O0& +o0 -=   M&W  \n"+
            "O +O-OQ.WMQ : .  .         *O.:W&.  O QMM0M:.  0Q...: +Oo  WM   \n"+
            "    Q *0o.  0M . -     0W  .+oooo-* o=    MQM .Q0 :0  : &.MO    \n"+
            "  * o  @ &.. M  .    MOO:Q@QW+* +-==: M@@**   O0*  0OMO+ - 0.   \n"+
            "  -o+ M*:-o. M QW  O ..W.= QQ*        O00o0+..@@ *   O0O.Q:     \n"+
            "*O0&.O   OO  M  ::+M@.o.   0QM    .. O0  .oQQ .M:     OQ* o     \n"+
            "+OO  :    .QO    WWMQQQQ oQQ.o      .000  QQQ.o0.     :MQ Q     \n"+
            "o .0QQ   0QQo    M*W0QQO -0QQ        *OQ  o0Q0.0       OQ0.M    \n"+
            "O oQQ0  .OQ0o      :QQQ  OQQQ         .0O  0QQO         OQO.@   \n"+
            "M oQQ    O0 o      .QQ     QQ          0Q.  OOQO   .    0++  +  \n"+
            "M...     .:  M     :O0   .QMQ           Q*   .*Q     -    .. Q  \n"+
            "M. :M   o0Q00    Q OQ0   *QQQ          Q0MMOQ0 QM0       Q0O  W \n"+
            "  Q     .:MO0    Q O00   :0QQ            .    .Q  :      0MO    \n"+
            " =MO0   o.QM     Q.OQ0    OQQ           .Q  Q M0: . O     *O    \n"+
            "   o  QQ .0M   .Q  Q0 QQ     QMQQQQQ Q     . OQ.Q    .Q   O:    \n"+
            " o0Q        0MWQQQ :MQ      oOM0QQ.QQ0+@0  .Q-M           Q0    \n"+
            "                   OM&           Q.         .WQQ        .       \n");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Main.limpiarPantalla();

            Juego.pantallaActual = new PantallaBandaForagidos();

        
            default:
                break;
        }
    }

}
