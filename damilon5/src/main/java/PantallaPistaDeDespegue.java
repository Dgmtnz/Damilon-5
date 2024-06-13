import java.util.Random;
import java.util.Scanner;

public class PantallaPistaDeDespegue extends Pantalla {


    @Override
    public void mostrarSprite() {
        System.out.println("\n"+
        "\n"+
        "                                                                \n"+
        "                                                                \n"+
        "         @           @@@        .      :    .            .      \n"+
        "    :@@    :       @@@&            :                &           \n"+
        "  M                @@@.                  +      -               \n"+
        "                   @@@@               :              -          \n"+
        "                   @@@@@@@. :@             :@0 :M      .        \n"+
        "                     &@@@@@@:      :      =+ @o*.:00...         \n"+
        "     =@*    .                      @    ::@@@0@      :@         \n"+
        "  .                                   @&     : . =M             \n"+
        "                                                                \n"+
        " .. :  .  . :.   =: :--: . . . ::.: .=.::.- : .--.. -           \n"+
        " =:.-o-....+O+=+*....o. o.-*.::.*=Q..:+o:.=::+:0+..+0.0::*o     \n"+
        "  oW-=QooW=-+O:Q:-O-+QO0-0Q+M+*.O:-+o-0=&::M-+M-M:oMQ*:&=O-     \n"+
        " :WO:WW=OWW=QW*.&W.-WM*:WWQ-0WM*M&M+*WW*+WW:.WQ:=&M-.WWQ:.W     \n"+
        " :WWWW-WWWWW *WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW.    \n"+
        " :     W: -:   .                : ..  ...   .   ..    .   .     \n"+
        " -@@@  M@@.& @@@@@@@&@@&M     .    @@@@@@&@@@@@+.  .&@@@@&@     \n"+
        " -o&&@.W&0WW +&&&&&M:@                :oW&W@0..=@@@@@-&&@*Q     \n"+
        " -& . :-WWM*:QW.&-*          .@           @W&Wo- Q&&M.+&&&M     \n"+
        " -  M+*MQ0&&**@*             &@             :@QMW&:- O W=O0     \n"+
        " :.  ..  -=&*                @@                :@     ::-:      \n"+
        "    :*M:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  =:.&-     \n"+
        "  o& @M    o@@@@@   -@@@@@        &@@@@*   @@@@@@    +@+        \n"+
        "  @Q     @@@@@@    @@@@@@    @@   .@@@@@@    @@@@@@.    .@o     \n"+
        "       @@@@@@    :@@@@@@@    @@=    @@@@@@     @@@@@@&          \n"+
        "    @@@@@@@@    :@@@@@@@     @@@    @@@@@@@@     @@@@@@@:       \n"+
        "  @@@@@@@@     @@@@@@@@     @@@@     @@@@@@@@     @@@@@@@@@     \n"+
        "  O&-@W@      W+M0-@:@W     @=@-      @-@+Wo:@      *@.&:@=     \n"+
        "                                                                \n"+
        "                                                                \n");
    }

    
    @Override
    public void mostrarOpciones() {
        System.out.println("Has elegido la opción 4: buscar pasajeros para tu viaje espacial: Tras publicar tu anuncio, varios interesados se ponen en contacto contigo. Entre ellos, eliges al científico que ofrece el doble de la tarifa normal a cambio de tu discreción, y a la familia que busca un nuevo comienzo en otro planeta.");
        System.out.println("El científico, un hombre de mediana edad con una mirada intensa, sube a bordo con varios maletines sellados. Insiste en que deben ser almacenados en una cabina segura y que no se les debe molestar durante el viaje. La familia, compuesta por una pareja y sus dos hijos pequeños, trae consigo todo lo que tienen en unas pocas maletas. Se muestran agradecidos y emocionados por la oportunidad de empezar de nuevo. Con tus pasajeros a bordo, te preparas para despegar. Pero justo antes de partir, recibes una comunicación urgente de la autoridad portuaria. Te informan de que el científico está bajo vigilancia por actividades sospechosas y te piden que colabores con ellos.");
        System.out.println("Opciones:");
        System.out.println("1. Ayudar a la autoridad");
        System.out.println("2. Ignorar la advertencia");

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                Main.limpiarPantalla();
                System.out.println("Has decidido ayudar a la autoridad");
                System.out.println("                                                                \n"+
                "                                                                \n"+
                "                            .      .                            \n"+
                "                               @@                               \n"+
                "                          @@@.@@@@ &@@                          \n"+
                "                              @@@@                              \n"+
                "                     @@@ @@ @                                   \n"+
                "                       &0             .M&M                      \n"+
                "                       @              &@@@&                     \n"+
                "                        &               W                       \n"+
                "     *        @@      OW@    *Q-*W       @      @@              \n"+
                "     *@       .@@     @ 0@    @@@       :@     @@ .             \n"+
                "     o@        Q  *@@@    @@.*           .@@@+  Q               \n"+
                "      @     o0M&@@W        @ @@@&@W          W@@&&Q             \n"+
                "    . W    Q&@@@@WQ       W@ 0&@W@@@W   &&&  Q@@@@@W .          \n"+
                "      @   W@W &@@@W       W@  QQQQ: .&.@.    W@@@@ & &@  W&     \n"+
                "      @ WWW   W@@@W       @.W &WM@0oWM .     W@@@@ .W@@@@@      \n"+
                "      @       .&&&@M         W@@@W@0WQW     o@&&&&              \n"+
                "       @     .@Q Q@@         W@@@@WQWQ      &@@ 0MW             \n"+
                "       @     @@W M@@*        W@@WWWQQ       @@W.&@@             \n"+
                "       @    W@@   &@@       W@@W@ WW W     .@@   M@@            \n"+
                "            @W      @@      &@W @ WW W     M@@    W@@           \n"+
                "          +@@     =W@&     &Q&&0 WW& W    W@W    .W@            \n"+
                "         W@@      @@       Q@@.QQW@@     @W       @@            \n"+
                "         @@      M@       @W W 0WWQQ    @         @             \n"+
                "        @@       M@@    @WQQ  &WW  Q@  @@        .&@@           \n"+
                "                                                                \n"+
                "                         @@   @@@ @@:  M@@                      \n"+
                "                         @    @   @@ @ M @                      \n"+
                "                                                                \n"+
                "                                                                \n"+
                "                                                                \n");
                System.out.println("Recibes una pequeña recompensa por tu colaboración y puedes continuar tu viaje.");
                System.out.println("Dinero + 5000$");
                Main.getJugador().dinero+=5000;
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
                System.out.println("Has decidido ignorar la advertencia");
                System.out.println("                                                                \n"+
                "                          .                           @    .    \n"+
                "                  :  .                                          \n"+
                "                                            @.      .@          \n"+
                "                 W                                              \n"+
                "         @=.             .     @@                       @@MWW=  \n"+
                "        OQM@@@@                @ @.                  .@@MMMM*   \n"+
                "          * Q@@@:@     Q           @=    @&          @&O+****   \n"+
                "     M     . .QW@@@ @@         O     o@    @:       .@MM***+    \n"+
                "     M          o Q@+.:@@               @    :       :MM+       \n"+
                "                 * O.Q@@ @@   Qo    @           .        **     \n"+
                "      .            Q=0.OM@@@@             .@@@.                 \n"+
                "                       .  0Q@@@@WW .        M0W@&               \n"+
                "            :            oQ.=o@@@@  0&@@@@@@@@   Q&       @@@=: \n"+
                "               @           .OQ M&@@@QQQQQQ0000  0Q@@@@@@@@&Q0   \n"+
                "    &@&                      @ 0:QO@@@0@  M@MQQOQQ0@@MQQQ       \n"+
                "                      O@@=   @QQ  = :MW@   @Q0.QQ QQQQ          \n"+
                "               @      .@&Q&@.W&@@& .Q.0..:=O QQo@-       O      \n"+
                "               @ @       &  QMQ   WQ .Q 0.*     O.:@@@Q-  & W   \n"+
                "               @ @             @@@QQQ =   0 .:* O O@@@@@ .  W @ \n"+
                "          &  . @ @          @@@@QQ*.oW    :  -*@@@W: &@@@@W:. . \n"+
                "              .@ &         @@WQQ       .0@@@&Q @@@@@    .@@@@-  \n"+
                "  -       WQ  .. -.       MQ         .   @@@@@:Q +@@@@+ . W:@@@Q\n"+
                "        =+***++M=*oo*o           @        :W&@@@  .M@@@@&  . O@@\n"+
                " oW&W&*WQMWQMMQWWMMWW&WWQMMQQ               Q @@@o: & +@@@W  & :\n"+
                "                             @@Q@@@@@@@@@@@@@@@-@@@@O  -=@@@@.  \n"+
                "   ..  .. .    .     :     . 0:&@@@@@@&@&&@@&@@ &W@@@@=    @@@@+\n"+
                "            .               O    ... .  ..    .:  .WQ@@@:  @ =@@\n"+
                " O@     .   *  .:O oM W    -ooWM0 0@@M@@W@        +oM& @@@*:  -:\n"+
                "   OO0o0o*o -@@OOO OOOO0OO.o.o.   0    @o0M.Q Q@ *@@@@@Mo@@@@Q  \n"+
                "     o= ooO  WMMWMQWMWMMMOOOOo  . o**oMQ+*     +.-OMMMM ..&@@@@@\n"+
                "OOOOOOO00OOOOOOOOoOO00OOOOOOOoOOOOOOOOOOOOOOOOOOOOOOOOOOOoO00MW@\n");
                
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Main.limpiarPantalla();

                Random random = new Random();
                if ((random.nextInt(1, 11))> 1) {

                    System.out.println("Unos foragidos interceptan tu viaje y te toca deshacerte de ellos.");
                    
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos
                    
                    Juego.pantallaActual =  new PantallaBatallaForagido();
                    Juego.pantallaSiguiente = new PantallaTrampaPolicia();
                    
                }else{
                Juego.pantallaActual = new PantallaTrampaPolicia();
                }
                break;
            

            default:
                System.out.println("Opción inválida");
                break;
        }
        

    }
    
}
