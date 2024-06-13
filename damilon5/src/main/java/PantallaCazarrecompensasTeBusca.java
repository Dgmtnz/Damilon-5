import java.util.Scanner;

public class PantallaCazarrecompensasTeBusca extends Pantalla{

    

    @Override
    public void mostrarSprite() {

        System.out.println("                                                               \n"+
        "                      .                                         \n"+
        "              .   MM*                                           \n"+
        "            .*+Q+Q     .*o                                      \n"+
        "         M: +-= .WO-Qo        :@@@@@                            \n"+
        "     .O+.. ==Q+=             OM@@@@@@@                          \n"+
        "       =.Q+. =              :OM    @@@@               O-        \n"+
        "     +.                    OOQ W   . @@       :                 \n"+
        "                  Q        OO. o   . .@@                        \n"+
        "        .         M Q    :OQ   +      .@o                       \n"+
        "                        oo= OOo*   o&MQQ00.               .     \n"+
        "      .               OOOO.QQW+oM@@QQ&&QW@@&.          .        \n"+
        "                     +OMQM&WMoQM@@@MQQM@@@@@@                   \n"+
        "                    OQMQQ@MO    QQM@W@@@&@@@@@      .           \n"+
        "                   .MMM@@@Q =Oooo :QMM&M@@@@@@                  \n"+
        "                   OO@@@Q0  Q *+oooO..Q@@&WW@@@   o-            \n"+
        "                  OQ&@=    .o@&*- o0   0@@Q@QM@&                \n"+
        "                  OQO*0&@@  :*o0-0. :    W@M@@@W=               \n"+
        "                  QQ ++Oo Q&o  *.W  *.     @@@@@&               \n"+
        "                  OO      -O+ ++=:Q   O@*   =@@@M .     .       \n"+
        "                 OO        +o*:O ..=&. +  +oo.@@M      O&O      \n"+
        "        .    O   *O.              :+ *W-O o=0.O@&               \n"+
        "      .M@WQ     OO O   +++           .=*0&+oo+ O@               \n"+
        "               QM  QQ  ++O -           o**-W@  O@&              \n"+
        "            &      QQ   += oo+    . o=   ..++OO+@Q     :        \n"+
        "                - &MQ             :+Q@@o   ..o*-:@@:            \n"+
        "             &@@ Q&M+    o OQQ+   oo=OOoo   . -  =@             \n"+
        "             -  QQQ           .    oQQWWWo      .. M@           \n"+
        "          :    MM &       *O00+   +.     0      @o0@ =O:        \n"+
        "               @o   0     +++++    .M@@@@.     .& .@            \n"+
        "            .@@                    O+0MW0O    oM.  @            \n"+
        "          .                +++     +++++*+       &@             \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Sin embargo, con el éxito viene la atención no deseada. Pronto te enteras de que un cazarrecompensas conocido solo como El Rastreador ha sido contratado para capturarte. Ahora debes decidir tu próximo movimiento:");
        System.out.println("Opciones:");
        System.out.println("1. Enfrentar al cazarecompensas.");
        System.out.println("2. Escapar del cazarecompensas.");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Preparate para una batalla contra el cazarrecompensas!!");

                Juego.pantallaActual = new PantallaBatallaCazarrecompensas();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Juego.pantallaSiguiente = new PantallaFin();

                break;

            case 2:
                
                System.out.println("Intentas escapar del cazarrecompensas pero su habilidad no tiene igual, te persigue sin descanso");
                System.out.println("Tu nave se queda sin combustible en una pequeña base en un asteroide, no tienes opcion, te toca enfrentarte al cazarrecompensas");
                Juego.pantallaActual = new PantallaBatallaCazarrecompensasImposible();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Juego.pantallaSiguiente = new PantallaFin();

                break;
        
            default:
                break;
        }
    }

}
