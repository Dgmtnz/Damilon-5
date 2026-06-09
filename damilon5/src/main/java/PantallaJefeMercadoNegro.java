import java.util.Scanner;

public class PantallaJefeMercadoNegro extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                          :+0MWWWWWQO+:                         \n"+
        "                          :*0MMWWWMQO+.                         \n"+
        "                          -*0QMMMMQQO*.                         \n"+
        "                          =*O0QQQQ00O*:                         \n"+
        "                          +*O000000Oo*-                         \n"+
        "                         .+*oOOOOOOoo+=                         \n"+
        "                         :++**ooOoo**+-                         \n"+
        "                          =+oOo0M0*o*+:                         \n"+
        "                  o+  .-*OOQWo+oOo+0WQOo+:   **                 \n"+
        "                  o*+ -*0o oo       O*.OO*:.=o*                 \n"+
        "                    =   *OO+         *OO+   =                   \n"+
        "                         :*+         **                         \n"+
        "                       -*oo*         oOo*.                      \n"+
        "                       =:*=:         +** =                      \n"+
        "                    .=*=   +=       -++. -++:                   \n"+
        "                -:++      ++         -*      :- :.              \n"+
        "               +++.       :*    .    *+        +--              \n"+
        "                 :=+.        ..:::    -     ..=.                \n"+
        "                     :-:.     .=+-.      ::.                    \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                *+           *******           .+               \n"+
        "                :                               :               \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                       *.                :+                     \n"+
        "                     . .   :-===++==--.                         \n"+
        "              .         .++*********++++-                       \n"+
        "                      .                                         \n");
        System.out.println("-- SHADOW: EL JEFE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La figura con capucha habla sin levantar la vista.");
        System.out.println("'He oído hablar de ti. Eficiente. Sin preguntas innecesarias.'");
        System.out.println("'Tengo una propuesta que solo hago una vez.'");
        System.out.println("'Trabaja para mí en exclusiva. Pagaré más de lo que puedes imaginar.'");
        System.out.println("'O...' levanta la vista '...puedes rechazarme. Pero eso tiene consecuencias.'");
        System.out.println("");
        System.out.println("¿Qué decides?");
        System.out.println("1. Aceptar trabajar para Shadow en exclusiva");
        System.out.println("2. Rechazar la oferta");
        System.out.println("3. Intentar descubrir la identidad de Shadow");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Excelente decisión.' Shadow asiente. 'Comenzamos mañana.'");
                System.out.println("Te conviertes en el brazo ejecutor del Mercado Negro más poderoso.");
                System.out.println("Dinero +50000$ (anticipo) | Velocidad +10 | Experiencia +5000");
                Main.getJugador().dinero += 50000;
                Main.getJugador().velocidad += 10;
                Main.getJugador().experiencia += 5000;
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("*** FINAL: REY DE LAS SOMBRAS ***");
                System.out.println("Controlas el Mercado Negro más grande de la galaxia.");
                System.out.println("¿Quieres volver a jugar?");
                System.out.println("1. Si  2. No");
                int r1 = scanner.nextInt();
                if (r1 == 1) {
                    Main.jugador = new Jugador();
                    Juego.pantallaActual = new PantallaPuertoEspacial();
                } else {
                    System.out.println("¡Gracias por jugar!");
                    System.exit(0);
                }
                break;

            case 2:
                System.out.println("Shadow hace una señal. Guardias aparecen por todas las salidas.");
                System.out.println("'Rechazar no era una opción real.' ¡Combate contra los guardias de Shadow!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaPuertoEspacial();
                Juego.pantallaActual = new PantallaBatallaRivalContrabandista();
                break;

            case 3:
                System.out.println("Te inclinas hacia adelante. Shadow se aparta. Un flash...");
                System.out.println("Debajo de la capucha: es el Ministro de Comercio Imperial.");
                System.out.println("'Ahora sabes demasiado. Tienes dos opciones: unirte... o desaparecer.'");
                System.out.println("¡Combate por tu vida!");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaPuertoEspacial();
                Juego.pantallaActual = new PantallaBatallaRivalContrabandista();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
