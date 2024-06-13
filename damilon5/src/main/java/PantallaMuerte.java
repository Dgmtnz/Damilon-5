
public class PantallaMuerte extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("                                                                \n"+
        "                                     .                          \n"+
        "                          &&   @@@@@   W&  :                    \n"+
        "                      &  MMMW@@@@@@@@@WMMM -&                   \n"+
        "                   & QQWW@@@@@@     @@@@@@WWQQ W                \n"+
        "                   QQWWW@@@@@@@     @@@@@@@WWWQQ                \n"+
        "                . QQQQW@@@@@@@@    .@@@@@@@@WQQQO               \n"+
        "                W.QQQQWWW@@@@@@   ..@@@@@@WW&QQQO &             \n"+
        "                W ::*QQQWWW@@@@@@@@@@@@@WWWQQQ*.: &             \n"+
        "                W *:  MQQQ@@@@@     @@@@@QQQM  =* &             \n"+
        "                W *- :W@@@@@@@@.   .@@@@@@@@W  .+ &   .         \n"+
        "                W   M&&O0    WMMOOoMWM    QQ&&M   &             \n"+
        "                 &  oo          &&&          o*  &.             \n"+
        "            @@    W Qo         W@@@W         oQ M               \n"+
        "             &    W Qo        @@  .@@        *Q M               \n"+
        "                 W MWWW     WW@     @QW     WWWW W  &           \n"+
        "                 & MQ@@@WWWQQoQ     QoQQWWW@@@MM W              \n"+
        "                  W o******O*&      .W*O*******.&               \n"+
        "                    W      *QOOWW.WWooQ*      &                 \n"+
        "                 @.    **  MQoW@@@@@WoQM  **      @             \n"+
        "                 @@ @  W*  *           +  *W                    \n"+
        "                   .@  &o  Q+W W& &W.&*M  OW   Q                \n"+
        "                W      &oOO   **W Moo   OOO&                    \n"+
        "                       &*M*MQQQ.   .QQQQ*Q*&                    \n"+
        "                        @ M MQQWWWW&QQM . &    @                \n"+
        "                     @  .  W &&     W&W @ .@   @@               \n"+
        "                     @@       @    .@.+        @@               \n"+
        "                              @    :@                           \n"+
        "          @@    @@   @    @@ @@@     @@  @  @ @@@@ @@@ @@@@     \n"+
        "        .@ @@@ @ .@@ @:@@Q@@ @@     @O @ @@ @ @@@  @@  @@@ @    \n"+
        "         @ .@@ @@@@@ @  @ @@.@ .    @0 @  @@  @@   @@@. @@@.    \n"+
        "          oO   0   O o    oO.OoO     oO   .0  ooOO O *O.O  0    \n");
        System.out.println("Has muerto");

        

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Volver a empezar la partida");

        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                Main.jugador = new Jugador();
                Juego.pantallaActual = new PantallaPuertoEspacial();

                break;
            
        
            default:
                System.out.println("Opción inválida");
                mostrarOpciones();
                break;
        }

    }

}
