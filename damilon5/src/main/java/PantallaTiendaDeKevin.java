import java.util.Scanner;

public class PantallaTiendaDeKevin extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("  ==========================++==+=======================+===++  \n"+
        "o-=-*oooooooooooooooooooooo****Q0**oooooooooooooooo*ooooo**+==-:\n"+
        "+=@O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@MQ\n"+
        "  MMMMMMMMMMMMMMMMMMMMMMMM0&WW@@@@O&@0MMMMMMMMMMMMMMMMMMMMQMM  +\n"+
        " .  O*0                                   .*+            @ +   @\n"+
        " WMOO*Q             .         @@@@                   =   @ +Q0M@\n"+
        ".@M*O+0     o             O@@@@@@@@@@0    :              @ +QM+@\n"+
        " @WOo+0.@    :         +W@@@@@@@@@@@@@WQ                 @ +*QQ@\n"+
        " &0*o+0      -=        0OO0WMM&@@&WW0O*Q:::  O           @ =0oQ@\n"+
        "  @@o+0   .     *  :@@&WQ&&&@@&WO&@@&&WoMM@&          -@ & @@= @\n"+
        "    o+0  =     .  &@@@WWW&@@@@@@@@@@@&MW0@@@@     .    M & =   @\n"+
        "    o*Q           @@@MQW@@@@@W@@@&@@@@@WWo0@@:   . .     @ =WWM@\n"+
        ":WQMo+Q          .&         O& &&         QWW*           @ +0:Q@\n"+
        "-W0Qo*0     :         OoM&         @QWWW                 @ +o=M@\n"+
        " WW0o*Q         +@Q   QWQQ    -Q  ::MQWW  WWW.W@       @ @ =*:=@\n"+
        ".WW0o+0 @o      .@          -*:@W         WWW WO @       @ ==.-@\n"+
        ".oo+o*0         :M 0W 00QQ00 W&&&&+00Q000MMMW M    0     @ += :@\n"+
        "@&  o*0&=    @    Q@&+oOOO@@@-:oo-@@@oOOOo=@W    @       @ = :W@\n"+
        "o=W=o+0@+    @   :W@@@@@@@@@@@W*MW@@@@@@@@@@@Q:     *M  *@.==M @\n"+
        ".@@Wo+Q        QM:M&@@@@@WWWM     MQWW@@@@@@M =          & =M:O@\n"+
        "  @@o+0     .*&@M+:-OQ=Oo+Q-WW@@@@WM+QO0.Q00. M @M+.     & -@= @\n"+
        "  @@o+Q   0@W@@@*O*  oMWW@@@@@@@@@@@@@WWQ0o +-MW@@@&&    & +&- @\n"+
        "=QMWo*Q Q&@@@@@@MMQ   oMW@M@W&@@&@@@@@MWQ=  +0WQ@@M@@@o  Q W.-+@\n"+
        "0o  o+Q0@@@@@Q@@@QO0 o  .0OWWW@@MWWOWW0    ++oM-@QW@@@@W.Q.=  +@\n"+
        "    o*0@M@@@@WWM@@MM*O    *++MW@MQ -*   o o*O@@-QO@@@@QWQQ.=   @\n"+
        "    o*oQ@0@@@@QM@@Q0*OOOoo     Q     .Oo0+o*WMW:MQ@@W0Q@Q*.=   @\n"+
        "    o:Q0M@oO@M0QWW0=.000=-OO        OOM+O=O W0@.QOM@0&@OQQ     @\n"+
        "@-MMMMMMQMMMMMMQQQ Q MQ   Q  Q  QQ  M QM  MMMMMQQQMMQMMMMMMMMM:-\n"+
        "O=*** OOOOOOOOOOOO  OOQ  OOO O OOO  O \\  OOOOOO.O:0 O :0O **+=-\n"+
        "@+@@@@@@@@@@@@@@@@ @ @Q   @@@ @@@@  @  @Q @@@@@@@@@@@@@@@@@@@@@+\n"+
        "o +*+0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO+O=0o+ -\n"+
        "  -+                                                        +-  \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Bienvenido viajero a la tienda del KeivinAZ");
        System.out.println("Que deseas adquirir?");

        System.out.println("Opciones: ");
        System.out.println("1. windows11 para tu nave: 1000$");
        System.out.println("2. Botiquines espaciales: 300$");
        System.out.println("3. Pistola laser: 700$");
        System.out.println("4. Escopeta laser de asalto: 1500$");
        System.out.println("5. Rifle laser de francotirador: 3000$");
        System.out.println("6. Botas a propulsión: 4000$");
        System.out.println("7. Invertir en Bitcoins: 500$");
        System.out.println("8. Comprar balas para tu arma: 100$ por bala");
        System.out.println("9. Salir de la tienda");

        System.out.println("Elige una opción: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:

                if (Main.getJugador().dinero >= 1000) {
                    Main.getJugador().dinero -= 1000;
                    System.out.println("Te compras el windows11 para tu nave");
                    System.out.println("Le pones la ultima version del windows11 a tu nave");
                    System.out.println("va mucho peor y da pantallazos azules");
                
                } else {
                    System.out.println("No tienes suficiente dinero");
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
            case 2:
                System.out.println("Te compras un botiquin espacial");
                if (Main.getJugador().dinero >= 300) {
                    Main.getJugador().dinero -= 300;
                    Main.getJugador().pociones++;
                } else {
                    System.out.println("No tienes suficiente dinero");
                }
                    
                System.out.println("Ahora tienes " + Main.getJugador().pociones + " botiquines");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                break;
            case 3:
                if (Main.getJugador().dinero >= 700) {
                    Main.getJugador().dinero -= 700;
                    System.out.println("Te compras una pistola laser");
                    Main.getJugador().arma = 3;
                } else {
                    System.out.println("No tienes suficiente dinero");
                    
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
            case 4:
                
                if (Main.getJugador().dinero >= 1500) {
                    Main.getJugador().dinero -= 1500;
                    System.out.println("Te compras una escopeta laser de asalto");
                    Main.getJugador().arma = 6;
                }else{
                    System.out.println("No tienes suficiente dinero");
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
            case 5:
                if (Main.getJugador().dinero >= 3000) {
                    Main.getJugador().dinero -= 3000;
                    System.out.println("Te compras un rifle laser de francotirador");
                    Main.getJugador().arma = 10;
                }else{
                    System.out.println("No tienes suficiente dinero");
                    
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
            case 6:
                if (Main.getJugador().dinero >= 4000) {
                    Main.getJugador().dinero -= 4000;
                    System.out.println("Te compras unas botas a propulsión, ahora siempre atacaras primero en los combates");
                    Main.getJugador().velocidad += 1000;
                }else{
                    System.out.println("No tienes suficiente dinero");
                    
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
            case 7:
                if(Main.getJugador().dinero >= 500) {
                    Main.getJugador().dinero -= 500;
                    System.out.println("Has comprado BTC, a ver si hay suerte");
                    Main.getJugador().inversionBTC = true;
                }else{
                    System.out.println("No tienes suficiente dinero");
                    
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                break;

            case 8:

                if (Main.getJugador().dinero >= 100) {
                    System.out.println("¿Cuántas balas quieres comprar? (Máximo 10)");
                    int balas = scanner.nextInt();
                    if (balas <= 10) {
                        if(Main.getJugador().dinero >= 100 * balas ) {
                            Main.getJugador().nBalas += balas;
                        Main.getJugador().dinero -= 100 * balas;
                        System.out.println("Has comprado " + balas + " balas");
                        System.out.println("Ahora tienes " + Main.getJugador().nBalas + " balas");

                        }else{
                            System.out.println("No tienes suficiente dinero");
                        }
                    } else {
                        System.out.println("No puedes comprar más de 10 balas");
                    }
                } else {
                    System.out.println("No tienes suficiente dinero");
                    
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                break;
            case 9:
                System.out.println("Muchas gracias por visitar la tienda de KeivinAZ, vuelva pronto!");
                Juego.pantallaActual = Juego.pantallaAnterior;
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                break;
        
            default:
                break;
    
            }
    }


}


