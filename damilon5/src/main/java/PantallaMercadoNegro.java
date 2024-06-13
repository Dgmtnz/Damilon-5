import java.util.Random;
import java.util.Scanner;

public class PantallaMercadoNegro extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("                                                                \n"+
        "                   @@@@@@@@@@@@                          @      \n"+
        "                @@M@MMMMMM@MW@@@@@@                             \n"+
        "              W@MMQ   :00MMMMM@@@@@@@                           \n"+
        "           .@M     0+QM +   MWMM@@@@@@@                         \n"+
        "           @:  OQo:o O& @..Wo QMM@@@@@@@                        \n"+
        "                OWMQ0M&   o* M M&@@@@@@@@                       \n"+
        "                       o  @ M+o MM@@@@@@@                       \n"+
        "=                     :=Q +  0 0M@MM@@W&M             @         \n"+
        "*@           &&&&W&      W0 o+*O0 @@MM&Q@                       \n"+
        " -@@        00@@  *o   O0 +  @&.@@  @@M                         \n"+
        "   &Q      0 O+@@        :o  : QO +@QW@                         \n"+
        "   Q0W@     0 @Q @@      :oQO @@Q:0++QM                @        \n"+
        "      M*  O:   .M*@@   &:.=QO    .00@@         @@@Q@-o          \n"+
        "0@    = *     @W M Q@:O  o :        *@         :@@@W W*         \n"+
        ":-oW&   @&QMQ@& @= MM@&0= *         Q@@       M.@@&o&@&         \n"+
        "     o=@&@OM@O@W  = QW@.o:  :.   .  @@0@     @  @O* @o=         \n"+
        "      M0@O@@Q&OO  Q  OQQ@  W&. &   @oMO@@    * :@O..            \n"+
        "@          @@ O   Mo M@:O:@@@@@@Q&0 M        +o .   o           \n"+
        "o*0QO @@+M o:     : @&. o0    W  oOO   .     M0QMM              \n"+
        "      OQ .     O.M  &W       +@ :   @   -   @M-o                \n"+
        "     O@ =@       - 0@o   @Q@@@     - :o O  Wo*o                 \n"+
        "   &*&--&      O0 *+@Q@W@M&0Q&0  +   :O *@0M*+                  \n"+
        "  OWQ000         @@@@MM0  Q WQ @        *+QO     @@MMo=W&QQ Q   \n"+
        " 0&@@@@MW@@@@M0+0QMO:*  Q=&+  Q Moo    0 :*       O@&&=*@-@0    \n"+
        "@QQ oQ=MQQQQQ0O0       -0M    = @                 @*WQ*oOO@0    \n"+
        "&MM   0MQ@@@.@@    O0o     .   @W            :                  \n"+
        "*    O    .    :-:-      .+.       .         M0@0 @M0@=O00@+QQ@+\n"+
        "   ooo   ooO  :=@:= .    :MMO .QMQ= OMQ-     @@O*:@+0o=:*@Q*o&0=\n"+
        "Q* QQO0  QQ0  =QQQW 0&&OQQ@Q&@Q@Q@OQM@Q0@Q@Q0:ooO 0=QO*oO+O*+:M=\n"+
        "O- oOO*  oO*.= Q:QQ ::M +.0O Oo0:*-Q-0o+0O-Q:                   \n"+
        "                 ..     O                  .=    Q          .   \n");

     }

    @Override
    public void mostrarOpciones() {


        System.out.println("Ante todo no nos hemos visto, ¿Que necesitas?");
        System.out.println("1. Comprar");
        System.out.println("9. Salir");
        System.out.println("Elige una opción: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        Random random = new Random();
        

        switch (opcion) {
            
            case 9:
                System.out.println("Anda vete por ahi facking pobre, no vuelvas sin mas perras!!");
                
                if (random.nextInt(1,11)>1) {

                    System.out.println("A unos tipos sospechosos no les ha gustado tu apariencia");
                    System.out.println("Van a darte una paliza");

                    Juego.pantallaSiguiente = Juego.pantallaAnterior;
                    Juego.pantallaActual = new PantallaBatallaMatones();

                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos
                    
                }else{
                Juego.pantallaActual = Juego.pantallaAnterior;
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                }
            break;
    
        default:
        System.out.println("Opción no válida, mamón");
            mostrarOpciones();
            break;
        }

    }

}
