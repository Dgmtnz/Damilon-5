import java.util.Scanner;

public class PantallaPlanetaLejano extends Pantalla {

    @Override
    public void mostrarSprite() { 

        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                     @                          \n"+
        "                *    @*   Q    @W0     @                        \n"+
        "                               WMQ        @@                    \n"+
        "             :           &                     @@WWWM .@        \n"+
        "            M                                  WWMQQ@Q          \n"+
        "              .@QQQo                    .    @ @@MQQ0    +      \n"+
        "              @QQQO+o     . @@@@@@@&W.                  .       \n"+
        "               O***o   .0MMMMMMMMMMMMMMMM.           :- @       \n"+
        "          -          .MM&&@@@@@@@@@@@@&WMMQ     @               \n"+
        "      &             =@@@@MMMMMMMMMMMMMMMM@MQQ      :W=          \n"+
        "            @QQo    @@@@@@@@@@@@@@@@@@@@@@QQ00     .MQ          \n"+
        "            oo**   @@@@MMMMMMMMMMMMMMMMMM@QQQQ0           &     \n"+
        "        M          @@@@@@@@@@@@@@@@@@@@@&QQQQQ0                 \n"+
        "      .            MM@@@@@@@@@@@@@@@@@@@QQQQ0**    @&0          \n"+
        "          WWW       MMMMMMMMMMMMMMMMMMQoo***oo    +0QOO         \n"+
        "         @WWWWQ     &@@@@@@@@@@@@@@@@Q0QQQQQQ                   \n"+
        "        :WWWWoQ      MMMMMMMMMMMMQQQoooooooo    &               \n"+
        "     .    ++-   .      +ooooMMQQQQQQQo*ooo        @     @       \n"+
        "                          0000o*o**0000Q             .          \n"+
        "                    @@                     &@QQQQ*              \n"+
        "          MM  W@W        Q                @QQQQQQ+o.            \n"+
        "                      @QM                 MQQQQQ0**o M          \n"+
        "                  - :MQQ*      @@M    @@   QQQQo++o   @         \n"+
        "                :     oo      @@@0O         .ooo                \n"+
        "                   0           o*o                              \n"+
        "                                    *                           \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Con las reservas de comida y agua a pocos dias de agotarse, tu ordenador de abordo encuentra un planeta habitable cercano a ti.");
        System.out.println("Con las coordenadas del planeta recién descubierto ingresadas en tu nave, te preparas para el viaje. El espacio entre las estrellas es tranquilo y te da tiempo para reflexionar sobre lo que podrías encontrar. Al llegar, te sorprende la belleza del planeta, con sus vastos océanos y tierras exuberantes. Pronto, te encuentras con los habitantes del planeta, una tribu de seres amistosos pero cautelosos. Al ver tu nave y tu tecnología, te tratan con reverencia, creyendo que eres una especie de deidad. Tienes varias opciones sobre cómo proceder:");


        System.out.println("Opciones:");

        System.out.println("1. Aprovechar su creencia");
        System.out.println("2. Enseñarles tecnologia");
        System.out.println("3. Observar y aprender");
        System.out.println("4. Reabastecerte y continuar tu viaje");

        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());

        switch (key) {
            case 1:
                Juego.pantallaActual = new PantallaLiderDeLaSecta();
                break;

            case 2:
                Juego.pantallaActual = new PantallaContinuarViaje();
                break;

            case 3:
                Juego.pantallaActual = new PantallaContinuarViaje();
                break;

            case 4:
                Juego.pantallaActual = new PantallaContinuarViaje();
                break;

            default:
                System.out.println("Opción inválida. Intenta de nuevo.");
                mostrarOpciones();
                break;
        }

    }

}
