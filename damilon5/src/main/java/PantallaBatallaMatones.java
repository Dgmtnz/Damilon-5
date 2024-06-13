
public class PantallaBatallaMatones extends  Pantalla {

    Enemigo maton1 = new Enemigo("El perro fresco", Main.getJugador().vida/2, Main.getJugador().nivel/2, 2, 10);
    Enemigo maton2 = new Enemigo("Wapper sanchez", Main.getJugador().vida, Main.getJugador().nivel/3, 0, 5);
    

    @Override
    public void mostrarSprite() {

        

        System.out.println("              *       .     @       @                           \n"+
        "         -&                                                   . \n"+
        "       @:0.    .++++++.                                     @@&M\n"+
        "    :   0        OOOOO                      -           +:  0Q  \n"+
        "      &       o        o                            :     W &   \n"+
        "               +*O+=*0=   @          @                          \n"+
        "        @         **o=            @        ::&&&.               \n"+
        "                                          Q&&&&&&&     @@       \n"+
        "              OMW    @M                                         \n"+
        "          @@ @@.@    @ @@ @              .Q&QQ &&0.             \n"+
        " @   : @@@@Q+@@:@@  @Q @@:-@@@             &:WM= 0    @         \n"+
        "     MQM@@@QM@@ @   @W @@+M@@*@                =.Q       W      \n"+
        "     @& @@@QM@@ @   @W @@=M@@ @     @      @  - @@.WoO     @    \n"+
        "    o@& @@@& @@ @   @W @MM@@M QM  @     o W@   @@ M=+ @@00      \n"+
        "    M@  @@@@MM@ @   @M.@ @@@O o@    . @ -* @M @@ M=o:@@& @@M    \n"+
        "   W@M  WWM@@ M @   @M MM@@M+ -@    - M+o  & :@+O*+ :@@M@@@@    \n"+
        "   M@M  MMMM@MM @   @M  M@MM  -M    MM  OO=  O+OO+* +M@ M@@@M   \n"+
        "   M    MM MMM .@   MM MMMM     M   MQ     + +    = .M  M@@@M   \n"+
        "  MMW.  M  MMM .M   MM  MMM    MM  .MQ     + +       *  MM@@@   \n"+
        "  M@@   o MMWM  MM .M   MMM*   MM  QMQ     + .          W@@@@M  \n"+
        "  M@@   Q@MMM           .WW    M   MM +OOOO OO OOO OO     MM@M  \n"+
        "   @@ -M  M@              @M          o *++ *+  +  ++    Q@@@M  \n"+
        "   W@.Q@@@o   0@@=@ @MM            M   o+O+.o+ +++ O     @@@@O  \n"+
        "    o W@@@o 0MM@@=@ MMM0          MM                   OM@@@M   \n"+
        "       @@0 O0MMMM @ MMMM0         MM                   OM@@@M   \n"+
        "          =OMMMMW  .WWMM0=        MM               =- :M&@@@    \n"+
        "        .OMOMMM0     MMMWM       OWM    =QMW+ QWM@@@@@ W@@MQ    \n"+
        "*        MMWMW      .WMMWMo      QW&M  :MMMMM @@@@@@@@@..Q      \n"+
        "        OMM@M*MQ       M@Mo       M     MMM   O@@@@@@@M         \n"+
        "        OMM@MM        MM@MO      M&  O oMMW    M0MMM&MMM        \n"+
        "        OMM@Mo        MM@MO      M&.   oMMM0     QM@@MMM        \n"+
        "        MMM@MM        MM@MO      Q *   MMMMM*    *W@&MMM+       \n");

    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && (maton1.vida > 0) || (maton2.vida > 0)) {
            
            if(Main.getJugador().velocidad > maton1.velocidad || Main.getJugador().velocidad > maton2.velocidad){
                
                Main.getJugador().atacarA2(maton1, maton2);
                if (maton1.vida <= 0 && maton2.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (maton1.vida > 0) {
                maton1.atacar(Main.getJugador());
                }else{System.out.println(maton1.nombre + "Esta muerto");}

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (maton2.vida > 0) {
                maton2.atacar(Main.getJugador());
                }else{System.out.println(maton1.nombre + "Esta muerto");}
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
            }else{

                if (maton1.vida > 0) {
                    maton1.atacar(Main.getJugador());
                    }else{System.out.println(maton1.nombre + "Esta muerto");}

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos

                    if (maton2.vida > 0) {
                    maton2.atacar(Main.getJugador());
                    }else{System.out.println(maton2.nombre + " esta muerto");}

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos
                    

                    Main.limpiarPantalla();
                    mostrarInformacion();
                    mostrarSprite();


                    if(Main.getJugador().vida <= 0){
                        break;
                    }

                Main.getJugador().atacarA2(maton1, maton2);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

            }
            
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
        


        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Has muerto.");
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos

            Juego.pantallaActual = new PantallaMuerte();
            
        }else{
            System.out.println("Has vencido a los matones." + " Has ganado 300 puntos de experiencia y 4000 de dinero.");

            Main.getJugador().dinero += 4000;
            Main.getJugador().experiencia += 300;
        
        
        Juego.pantallaActual = Juego.pantallaSiguiente;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos

        maton1 = new Enemigo("El perro fresco", Main.getJugador().vida/2, Main.getJugador().nivel/2, 1, 10);
        maton2 = new Enemigo("Wapper sanchez", Main.getJugador().vida, Main.getJugador().nivel/3, 0, 5);
    
        
            
    }

    }
}
