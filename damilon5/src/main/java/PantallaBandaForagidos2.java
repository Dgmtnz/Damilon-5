import java.util.Scanner;

public class PantallaBandaForagidos2 extends Pantalla{

    

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "  .              @                                  .           \n"+
        " O       @       . Q&&@@@@@@@@@@@@@@@@@@@@&+Q                   \n"+
        "        .   @@@@@@@- @@   NEW  MEMBER    .  @.O@@@@..           \n"+
        "  .      W@@: =:* -@@@@@@.  WELCOME   0@@@@@@&@ @  -@@M   :     \n"+
        "   :     Q@@@@@@-= @@@=@@:@@@@@@@@@o@   :    @=W Q@@@@Q.0@o   . \n"+
        "        .o@@@@*W@@@@@@&&                &&@@@@@@@:@@@@M         \n"+
        "   &@@@@MM@@&o   -                                *@@@.O@@@@@   \n"+
        "  @ :W@@Q.   :      .        @       :   ..      &o  .M@@@. @   \n"+
        "   @@@@WW@0W&    .    .   O= .               .     WWW@W&@@@O   \n"+
        "      :                  -         &      *              .      \n"+
        "                    .         @Q +&.                     M   :  \n"+
        "      Q@@@@     .W@@@@       &=    -   .  &@@@W    :@@@@O       \n"+
        "     -W  0.    .M=&@-@  @    .+           .  .QW        W       \n"+
        "      Q0@@@@  .&Q:W. .            O::.    @@@.WM   -@@@WQ     = \n"+
        "    M&    Q&  .Oo0=@WOQ      *0W@ oQ OO  -- .-@@Q.@@@MWM.&M     \n"+
        "   MM@ @@@@@.  .MW=o0O.     0oOQ0O*O 0:  @@@&@@W  .@@@@@.=-     \n"+
        "   &@ M@WO.:&   QO:WW&&M.:=0=.O&QO0O 0=. QM@@W    MW&M@Q- @@    \n"+
        "   @@ M@&*Q :    O::0 Q.      OM@W0o Oo.       . @M&WM@@Q @@M   \n"+
        " . =@Q   o  .  . O-QQQ M  &     &*0o:M         . @W- M:.M @.    \n"+
        ".  .M& @ @ @W .Q QQ==QQ:&    Q00 00+.   .M.0@@ O *.@-@&@M M     \n"+
        " :     .@@@@.  O+0Q  QQ   -  +0: =W-QO. .@M @@*=   @@M@@M -     \n"+
        "     W-@0M@o   0.++ oQQ   @+ OOo* 0O.O*  @@*.@MM   @@M.@M .     \n"+
        "     .M@ M@@   Q:Q  =OQ      00o    o    @M0 @@=   @@W @@W    & \n"+
        "     +WW:=@    o0Q   QQ      0OO*  00* -  &OM @*:  .@+ -@     @ \n"+
        "     M@@MM@     O0  OO0      Q0-+  O0-:   @M  *@.   @MM.@MQ     \n"+
        "      @  M&    O+   .O.      .o.    :.=   @M   &M   .&. @M      \n"+
        ".0+=Q.&Q M@0QQQ 0QQQOoOO0QQQQ:- QQQQMo.QM @MQQ0@0 QQ@&+Q 0Q=-0++\n"+
        "Q0O  Q@    . Q. QQ   QQQQQ000+  MQQQQo QQQQo     oO.    @@  00QQ\n"+
        "  .   . . .:.   :.  . 0.     *==-=0:. : .M.   .      . . ..     \n"+
        "                                                                \n");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La mision ha sido todo un exito y te has ganado la confianza de la banda, ya eres todo un miembro de los Masones Foragidos.");
        System.out.println("¿Que quieres hacer ahora?");
        System.out.println("1. Realizar otra mision");
        System.out.println("2. Abandonar la banda");
        System.out.println("3. Expandir la banda");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                
                System.out.println("Has decidido realizar otra mision");
                System.out.println("Esta vez se trata de atracar un barco mercante de la Armada Imperial");
                System.out.println("Ten cuidado y no te metas en problemas...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Juego.pantallaAnterior = Juego.pantallaActual;
                Juego.pantallaActual = new PantallaMinijuegoRobarBanco();
                break;

            case 2:
                
                System.out.println("Has decidido abandonar la banda");
                System.out.println("Despues de un atraco exitososo has saciado tu sed de dinero y has decidido retirarte de la vida de pirata");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Juego.pantallaActual = new PantallaPuertoEspacialSin4();


                break;

            case 3:
                
                System.out.println("Has decidido expandir la banda");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Juego.pantallaActual = new PantallaCazarrecompensasTeBusca();

                break;
        
            default:
                break;
        }

    }
    
}
