import java.util.Scanner;

public class PantallaContinuarTuCamino extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                *                               \n"+
        "                              @@Q&.0                            \n"+
        "                              &&&0O.                     0      \n"+
        "                              QW:+-+                    Q       \n"+
        "                             &@M-=O.*         . o   QW          \n"+
        "                             @-MMO**            W@*             \n"+
        "                &              M. ::          &*   QQ&          \n"+
        "                              &MM=+.                            \n"+
        "                   M@@== :.    QOo+    ..O.M:@@+                \n"+
        "               WO  =&Q@@ @    @0&0+*   .@O&&-=-.:0&             \n"+
        "         W@Q* :        @o:&@W0@*   = &M@*+=*       W0& @        \n"+
        "          -0@@@*          W*&Q@0QQ.--.* .         .@@Q.M        \n"+
        "       &O.   QWM0@Q        @Q+@W@&o= :o        Q+@+o..   O=     \n"+
        "      &-       W& o&@@     W0@@@WQ 0O- o*   Q&-Q-W-.      Q@    \n"+
        "     &-            M0&@@M@@&&+.:.-- *0@MMWO*= -.            @   \n"+
        "    @:   @W           @&@@Q:+  :--   .&0&O@@@&=             &W  \n"+
        "    @             .O@@@.Q: +&  QMM: .      QW @@@&           @  \n"+
        "    &           @&@@  . Q   : 0Q ==-          WM @@@Q        &  \n"+
        "    -        W@@Q .:          @O  .:             M=.*@Q-@    .  \n"+
        "    M&   @@@@+Q..            +@@*:-O                 0WoQ=- W.  \n"+
        "     M@ W&-  :Q               WQMo=                    QQ  o-   \n"+
        "       M W                    W.-           @@@           W     \n"+
        "       *M@                   @+QQ:  +    .@@@&QQ=       W:.     \n"+
        "         QM@                 Q WQ*. .     @MQQ+=-     0=.       \n"+
        "           .:Q&     &*                     .=*=    o-+          \n"+
        "               -+MQ               .            *+               \n"+
        "                   o :MQ&&@@          @@@+==  -                 \n"+
        "                            Q-0=   -=-                          \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Un día, mientras comercias en una estación espacial, escuchas una historia de un grupo de científicos que milagrosamente escaparon de la atracción de un agujero negro. Te das cuenta de que son los mismos que dejaste atrás y sientes un alivio inesperado al saber que sobrevivieron. Ahora, con la conciencia tranquila, estás listo para enfrentar nuevos retos. Aquí tienes algunas opciones para tu próxima aventura:");
    
        System.out.println("1. Explorar una nebulosa cercana");
        System.out.println("2. Participar en una carrera espacial");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                
            System.out.println("Has decidido explorar una nebulosa cercana.");
            Juego.pantallaActual = new PantallaBatallaAlienigena();
            Juego.pantallaSiguiente = new PantallaFin();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
                break;

            case 2:
                
                System.out.println("Has decidido participar en una carrera espacial.");
                Juego.pantallaActual = new PantallaCarreraEspacial();
                Juego.pantallaSiguiente = new PantallaInvestigarSeñal();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                break;
        
            default:
                break;
        }
    }

}
