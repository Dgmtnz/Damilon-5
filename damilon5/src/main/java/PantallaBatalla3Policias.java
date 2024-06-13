
public class PantallaBatalla3Policias extends Pantalla {

    Enemigo policia1 = new Enemigo("Crealdro el policia con escudo", Main.getJugador().vida/3,Main.getJugador().nivel/5,3,1);
    Enemigo policia2 = new Enemigo("Zapata policia a doble porra", Main.getJugador().vida/3,Main.getJugador().nivel/3,1,1);
    Enemigo policia3 = new Enemigo("Alejandro.es con escudo", Main.getJugador().vida/3,Main.getJugador().nivel/5,3,1);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                             W@@@@@@W                           \n"+
        "                           WW@@@@@@@@WW                         \n"+
        "          ..@@@@@Q.       @@.0W       @M         @@@@@          \n"+
        "         :W@@WWWW&o0      &@          @M      00&WWW&@@WQ       \n"+
        "         W0@Q      M       @         +@       M +@0    0M       \n"+
        "         W         M      &  W*+=+**W@ @      M +      0M       \n"+
        "                 &*     @o00W        WO0 @     o@      oO       \n"+
        "        &o .MWWW :+Qo @@@W QW@@@@@@@@WW W@@@  M+  WWWM  *W      \n"+
        "  @@WWWWWW@oM@@WM.    &&@+ M O@@@M@@O W  @&& 0  -MM@@@ O@WWWWW@@\n"+
        " WW@oWMoooW@oWWM .@ MWW-** M&&WWWWWW&&W .o:WW..& WWoWWO@WoooooM@\n"+
        " WWMoWMoooW@oQ .0Q+ Q   WW: .            W   W *Q@. MQO@WoooooMW\n"+
        " W&MoWMoooW@o @o*o  @00     +  W00W o+   . 00   **QO  O@WoooooMW\n"+
        " W&MoWMooWW@o**. WW*@@@W QM&&+-WO0WW && M W&@@@MW ++*WO@WWooooM&\n"+
        " WW        @o -W   *@@O* Q+Q0*. WW O Q0 o oO@@@   W=  O@       o\n"+
        " WWW*WWM.W @o=       oo     WWW *+ WWW     *o        +O@  WQ M o\n"+
        " W@@@@@@@@@@O   WWQ O00Q+ 0@M &&MM&& o@0 +Q00Q:0WWo   0@@@@@@@@@\n"+
        " W&MoWMoooW@o OWWWQ  *0*+ @@@0*    *o@@@0++Q** 0WWWO  o@WoooooM&\n"+
        " W&MoWMoooW@o     WW*    .@@@@W*  *W@@@@@    *WW*     O@WoooooMW\n"+
        " WWMoWMoooW@o  0WWWW     @@@&&W    W&&@@@     WWWWQ   O@WoooooMW\n"+
        " WW@oWMoooW@o   WWWWM   @+:+OWW    WW0.*:@   MWWW    *O@WoooooM@\n"+
        "  &@WWWWWW@*    * QQQW  @O@&* o      *0@M@  WoQQ .     0@WWWWW@@\n"+
        "         .  O     000 Q @=o++        ++o0& 0 +00       .        \n"+
        "      & +*       *: . o @@ooWW+     WWoo@@ o +  o       *+ @    \n"+
        "      &@WWQ*      *WWWoM@@@WoW      WoW@@@W*WWW       *QWW@@    \n"+
        "      &@&W**      **WWo&@@@@O        0W@@@@*WW0o      o*WW@@    \n"+
        "      W@@WQ        MWW M@WWWW        WWWW@@ WWW        0W@@&    \n"+
        "     @@0             00W@@@WQ        0W@@@@00             0@@   \n"+
        "   WQQQ0              @@&@W            W@&&@ o            OQQQW \n"+
        "                    0&WWWW0            OWWWW&.                  \n"+
        "                     QQQ0Q              0000Q                   \n"+
        "                                                                \n");
    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && ((policia1.vida > 0) || (policia2.vida > 0) || (policia3.vida > 0))) {
            
            if(Main.getJugador().velocidad > policia1.velocidad && Main.getJugador().velocidad > policia2.velocidad && Main.getJugador().velocidad > policia3.velocidad){
                
                Main.getJugador().atacarA3(policia1, policia2, policia3);
                if (policia1.vida <= 0 && policia2.vida <= 0 && policia3.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (policia1.vida > 0) {
                policia1.atacar(Main.getJugador());
                }else{System.out.println(policia1.nombre + "Esta muerto");}

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (policia2.vida > 0) {
                policia2.atacar(Main.getJugador());
                }else{System.out.println(policia2.nombre + "Esta muerto");}
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (policia3.vida > 0) {
                    policia3.atacar(Main.getJugador());
                    }else{System.out.println(policia3.nombre + "Esta muerto");}
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos
                
            }else{

                if (policia1.vida > 0) {
                    policia1.atacar(Main.getJugador());
                    }else{System.out.println(policia1.nombre + "Esta muerto");}

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos

                    if (policia2.vida > 0) {
                    policia2.atacar(Main.getJugador());
                    }else{System.out.println(policia2.nombre + " esta muerto");}

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos

                    if (policia3.vida > 0) {
                        policia3.atacar(Main.getJugador());
                        }else{System.out.println(policia3.nombre + " esta muerto");}
    
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

                Main.getJugador().atacarA3(policia1, policia2, policia3);

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
            Main.getJugador().vida = Main.getJugador().vidaMax;
            
        }else{
            System.out.println("Has vencido a la policia." + " Has ganado 400 puntos de experiencia y 2500 de dinero.");

            Main.getJugador().dinero += 2500;
            Main.getJugador().experiencia += 400;
        
        Juego.pantallaActual = Juego.pantallaSiguiente;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos

        policia1 = new Enemigo("Crealdro el policia con escudo", Main.getJugador().vida/3,Main.getJugador().nivel/5,3,1);
        policia2 = new Enemigo("Zapata policia a doble porra", Main.getJugador().vida/3,Main.getJugador().nivel/3,1,1);
        policia3 = new Enemigo("Alejandro.es con escudo", Main.getJugador().vida/3,Main.getJugador().nivel/5,3,1);
    
        
            
    }

    }

}
