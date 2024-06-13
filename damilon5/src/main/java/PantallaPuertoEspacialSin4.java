import java.util.Scanner;

public class PantallaPuertoEspacialSin4 extends Pantalla {


    @Override
    public void mostrarSprite() {

        System.out.println(" \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                    M           \n"+
        "                              O                     &           \n"+
        "                                             :   .&&&&W.        \n"+
        "                                                 &&&&&&@        \n"+
        "                                                 @@&&&@&        \n"+
        "                                                 .+M@@.         \n"+
        "       .   .M                                       &           \n"+
        "                     Q& o&             QW+ &o       &           \n"+
        "                     Q& *&             Q0o @Q       &           \n"+
        "                     QW oW    &        0M* @Q   :               \n"+
        "                     Q& OW      .      0M* @M                   \n"+
        "                     Q& *W     =W      QQ* @Q                   \n"+
        "                     :: ::     =@:     -0+ Mo                   \n"+
        "                     -  -      .&&-     Q   .                   \n"+
        "             .M &&& &&M@&W*@&&&0&:&+-M@&@Q&@@ 0@ M              \n"+
        "     .0      .    *& 0 .o :0.+0QMOO.::: Q  0..--                \n"+
        "             .          :.      QW      0  O                    \n"+
        "                     QQ oQ  -&&-@@     QM+ &M                   \n"+
        "                     QQ.+Q    .o@W     QM* @M                   \n"+
        "          .          QQ.*Q    :.@      QW* @0                   \n"+
        "                    .=- :=             :O= 0O                   \n"+
        "                     QQ.oM             QM* &0                   \n"+
        "                                                                \n"+
        "                     W                                          \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                           W                    \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("Puerto espacial");

    }

    @Override
    public void mostrarOpciones() {
                
                System.out.println(" Te encuentras en la base Damilon5, con tu nave cargada y lista para despegar.");
                System.out.println("Opciones:");

                System.out.println("1. Explorar el mercado negro de Damilon ");
                System.out.println("2. Comerciar en la estacion");
                System.out.println("3. Partir hacia un planeta cercano");
            
                int opcion = 0;
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                    Juego.pantallaAnterior = Juego.pantallaActual;
                    Juego.pantallaActual = new PantallaMercadoNegro();
                    Main.limpiarPantalla();
                    break;
                case 2:
                    Juego.pantallaAnterior = Juego.pantallaActual;
                    Juego.pantallaActual = new PantallaTiendaDeKevin();
                    Main.limpiarPantalla();
    
                    break;
                case 3:
    
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
                    
                    default:
                        System.out.println("Opción no válida");
                        break;
                
        
        }
       

    }

}
