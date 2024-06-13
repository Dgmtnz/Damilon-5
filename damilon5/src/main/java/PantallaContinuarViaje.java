import java.util.Scanner;

public class PantallaContinuarViaje extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("                    :    -       :       .                      \n"+
        "                   . :..    .   -     .  .                     -\n"+
        "   :              ... . .   .  ..   =     . :     -.            \n"+
        "            .    *...:.  -  =..=.:=- =:  .   -:-                \n"+
        "             ..: :  -  :  -      :=  :::=.:.:::= : .            \n"+
        "    =        .+ -  . +-  .  -:: . . .      -: - : . -:.         \n"+
        "    W  -    :            .-=- ...=.:=::.    - .    .=           \n"+
        "       .. =+: - ... .=-:.=:.::++=-+*-.=+.. -.==+--.*== =        \n"+
        "    .    ::  =-    -+-:*=+*+**OO*O**++=-*:..-. ..:=. .+ =  .    \n"+
        "     .=   .      -.-+*=oOoO0000Q0000OooO**-=+*= .: :+.  -  .    \n"+
        "       .=: :   =::::o0oQQQMMMMMWMMQQQM0Q0O**==+: =+.. ..     =  \n"+
        "   .: .  . .. ==.-=+o0MMMMMWW@&@W&WWMWMQM0O*+===:+ .=: *+   -   \n"+
        "  ...-.+=+:.+-=:+oOo0MM&&W@@Q*W*O&o@Q@WMMQM0Oo*==.. .: ...-     \n"+
        "      :+000O=oooo000MWWW&@WQ        .&&WMMMM00oo*=:: ...--:  := \n"+
        "  . ..-+*OQMQMMMQMMMMMW@W-+           :@&MMMQMMO*o:.=... =.:  ..\n"+
        "  : :-.=+o*oQMWWW&W&@@@@@-            .=@&@WWMQ0OOo***=-   : -  \n"+
        "    ..= =+*OOQMMM&&@@@@@M=            ::@@@W&WWWMQ0OO*=..  .::  \n"+
        "  ::  .+- =.=oo0QW&@@@@@&W@          .0&@@@@&WWMQMQ0****-:  =   \n"+
        " .    -   +--+*o00MM&&@@@@&0.       :*@@@@@WWMQ0oOOooOo+=- . .  \n"+
        "     . .....::++O00QW@&@@@@@@M&o*OO@@@@@@&WMQ00O*o=:.:-.  -.    \n"+
        "  *    *::- -.:-+ooO0QMMM@@@@@@@@@@@@@@&&MQ00O**+:.-: = + .    0\n"+
        "   .   += *.:..=--=*oO00MMW&@@@@@@&@WW&&MQOoO*+*:.-=. +  = = .  \n"+
        "     = :   .:- . ::=+**00QQQMMMWWWWMM0000Oo+++*-.: .+  +.. .  M \n"+
        "   -  . .*   .-.-...*=+o*OO00000000O0Oo*o++-:+.-+-:  ::  =      \n"+
        "     ..-   +=  ::. .===--+*o*oO0o*****+===:-:: :.  :.: . - .    \n"+
        "       .  :    :. ..==::..-*+-*o==*::::::    -.  . .   ++       \n"+
        "         ::  :. = .-.    ::.-.-::...=. .. . .=.   =. -+.  :     \n"+
        "                  -. :   .:::: -- + .-- .:  =  :::     =        \n"+
        "   +         ..:    . . * . =..:  :. :  =. -.= ..    -          \n"+
        "   .       .     -. . :  =..  +:   =: . :  =-  -.:              \n"+
        "                  :  .     ..: .+.-  -. =  . -                  \n"+
        "                         .   .          .                       \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Eliges continuar tu viaje, dejando atrás el planeta y sus habitantes. Aunque la experiencia fue única, sientes que tu destino está en las estrellas, explorando nuevos mundos y descubriendo los secretos del universo. Con la nave apuntando hacia el horizonte estelar, te preparas para la siguiente etapa de tu aventura. El espacio es vasto y lleno de maravillas y peligros, pero estás listo para enfrentar lo que venga. Mientras viajas, te encuentras con una señal de socorro proveniente de una nave cercana. Al acercarte, descubres que es una nave de investigación científica que ha quedado atrapada en el campo gravitatorio de un agujero negro cercano.");
        System.out.println(" Tienes dos opciones: ");
        System.out.println("1. Ayudar a la nave de investigación a escapar del agujero negro.");
        System.out.println("2. Continuar tu viaje sin ayudar a la nave de investigación.");
        System.out.println("3. Llamar al kevin y comprar suministros");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:

            Juego.pantallaActual = new PantallaAyudarANaveDeInvestigacion();
            Juego.pantallaSiguiente = new PantallaContinuarTuCamino();
                
                break;

            case 2:
                
            Juego.pantallaActual = new PantallaContinuarTuCamino();

                break;

            case 3:
                    Juego.pantallaAnterior = Juego.pantallaActual;
                    Juego.pantallaActual = new PantallaTiendaDeKevin();
                    Main.limpiarPantalla();
                break;
        
            default:
                break;
        }
        

    }

}
