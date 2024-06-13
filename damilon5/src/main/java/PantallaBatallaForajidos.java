
public class PantallaBatallaForajidos extends Pantalla {

    Enemigo policia1 = new Enemigo("Criptobal el malote cervecero", Main.getJugador().vida/3,Main.getJugador().nivel/5,3,1);
    Enemigo policia2 = new Enemigo("Antonio el malote", Main.getJugador().vida/2,Main.getJugador().nivel/3,1,1);
    Enemigo policia3 = new Enemigo("El Juan el malote", Main.getJugador().vida/4,Main.getJugador().nivel/5,3,1);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                               @ @                              \n"+
        "      .o=o @                  @ = W                  @OO        \n"+
        "    @&.    -@@              &M                    @@@=:*.+ @@   \n"+
        "      @W   0                   MW MQ                            \n"+
        "      .@& -.                  *+:                     @         \n"+
        "     . Q+= :-@             @@OOM+   Q@             QQ@&& Q  @   \n"+
        "   0.0oW0o- *o.Q@         QQ:*Q0Oo  = o&        @&@O0  &-o 0 o& \n"+
        "  O -+ Q    Mo* *        OOO0+WM  M *   @      .M:0MQ-M0 + OQ o0\n"+
        " .  **o  =: **   @      @o .**&==M& o  -*       0 Q&O+*M Q M.  Q\n"+
        " &o ** * .&M*=  OQ     Q    0 &o0Q&  -   W     &O*o*oOo .      M\n"+
        "     =o0o   +     W    @ O :   &QWW  *   +    @MO oQ*+ :.QO0   O\n"+
        "0-  @ oO& MO+W  =*W    M.o * QMM *o      M    @0O    -oo 0  +   \n"+
        "o     QQMM Q &=  0:   ..     oo *  o      @   QM0  *  :     O  W\n"+
        "O-&  oW&-&OQ     *+    O*+  *M-  Q    *  O    0o   *   .+   .   \n"+
        " M=*   -  - -o* MM     @&MW0     0oo   &@@W    &M  0    .     MW\n"+
        "0W&  +     0 =.M MM    W.0OoOOO   oO   M W    @&.   +*Q    0  M \n"+
        "@O +M0W    ooo.         o Q O0O   0Qo0         M  =MM0    o0Q *.\n"+
        "@   Qo+      .*         O 0o0Q     OO0  0         MO -o   =+0 0.\n"+
        "Q   O0        O        &*  Q o*    0OQ   M    @   MO*.     :*  o\n"+
        "0   Q0=                &     o     o0--  +.   @  0OOOo    o*    \n"+
        "     .         O       @    -*       0Q          Q00           .\n"+
        "    Q       +o 0*      M   +O*                   W**      o     \n"+
        "    =+ .       *=      0  M o-     **O.          Q  O    oo0o*  \n"+
        "    -=-      o  :     @   &+          0         @OQ       oo o  \n"+
        "    ooO         *         oO       . oO=        WM :          @ \n"+
        "    O=        .0=         W           +                         \n"+
        "   0           O0:        o. +         W       .=          .  0 \n"+
        "   Q            OQ      +=             +*o     Q=            o00\n"+
        "                                                                \n"+
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
