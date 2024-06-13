
public class PantallaBatallaHanPilladoALaBanda2 extends Pantalla {

    Enemigo policia1 = new Enemigo("El Luis(Ex miembro del ISIS)", Main.getJugador().vida/2,Main.getJugador().nivel/5,3,1);
    Enemigo policia2 = new Enemigo("Enrique segurata sicario con escopeta", Main.getJugador().vida/3,Main.getJugador().nivel/3,1,1);
    Enemigo policia3 = new Enemigo("Yahya policia chetado", Main.getJugador().vida/2,Main.getJugador().nivel/4,3,1);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "&                                                               \n"+
        "Q                                                               \n"+
        "+0                          QOo@OO@*                            \n"+
        " +Q      QQ@@@&                   *@             @@@@@          \n"+
        "  Q@      .Q  .*@             +Qo O           Qo- :.*.          \n"+
        "   Q@   **+o* :&            Q@@@@@@            .   *QQ@:        \n"+
        "   *QQ    Q0@@W@              M@@               M@@@Q&          \n"+
        "   Q Q@    W@.0@           @ M@O0+ @            @0Q@@           \n"+
        "0@MQM+Q   o @@W@@@      ooo .  0  O oo@      @@@@@@ @@          \n"+
        "   @0 Q oQ* @==@W&:@   O+ oooooo o@@o o@   =+@M@::@Mo@=W@       \n"+
        "    o:0M*Q+M@@@@W@+@@  oo oooooo:ooooo*o  M@@@M@@@@@ @@@@       \n"+
        "    Q  Q Q WW&W&oW@@@W+-     ooo= o   OO  @@@W +MW@@  W W       \n"+
        "     . * Q W@@@@MQ@@ *000W  +ooo-oo*   o  WW@@o00  o  @=0@      \n"+
        "        QQ MM@WQ  @@@  QQ@@@@  o +   oo*@  &0W@@@@@@OWMM@ @     \n"+
        "     oo     MQQoO @@@  00.@@@-+-O@   @@W@      oo0Mo 0  QQQ@    \n"+
        "     =M   &    +O @@@   Oo     + Q+0@@@     0Oo      W    &&QW+@\n"+
        "     =Q   OOQQ0  oO     W0o=o       @@W@    OOo ***0M  Q:o      \n"+
        "            0QQ0M@@@    W oo*       .M*O.@     -00M0   Q        \n"+
        "       **   *QQQ      M O oo*    =oo  @   0:-@*+QQ0  0QQ@       \n"+
        "       *     *OQQ     o  oo*O     ooo @      o=QQQ0   QQ@       \n"+
        "       *   * **QQ0       ooo*     *oo @      *QQQ  +  QQ@       \n"+
        "       *   *  **QQ       *oo**    *oo@       *QQo     OQ@       \n"+
        "       *   *  **QQ@      *oo     * oo@      o0QQo      0@       \n"+
        "       *  +     QQQ@     *ooo       oo@    ooQ0*       O@       \n"+
        "          +     *QQQ    oo**       **o&    *oQOo       0@       \n"+
        "          :     **QQ    oo**       **o&    OQ*         oQ       \n"+
        "          -     **oQ:   oo**       **oo   o**O      :  =+       \n"+
        "                 **Q@  o**         .**o@  *o0o      .           \n"+
        "   Qo*           00 @  **  *       : ***  .oo          **oo@@   \n"+
        "                *00o  W&W-           =WO@  OOO                  \n"+
        "                     ****             o**o                      \n"+
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
            
        }else{
            System.out.println("Has vencido a la policia." + " Has ganado 1000 puntos de experiencia y 5500 de dinero.");
            System.out.println("Cuando vuelves por desgracia toda tu banda ha muerto en el combate.");
            System.out.println("Vuelves a ser un foragido solitario, al menos te esperan nuevas aventuras");
            Main.getJugador().dinero += 5500;
            Main.getJugador().experiencia += 1000;
        
        Juego.pantallaActual = new PantallaNuevoHogarSin4();

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos

        policia1 = new Enemigo("El Luis(Ex miembro del ISIS)", Main.getJugador().vida/2,Main.getJugador().nivel/5,3,1);
        policia2 = new Enemigo("Enrique segurata sicario con escopeta", Main.getJugador().vida/3,Main.getJugador().nivel/3,1,1);
        policia3 = new Enemigo("Yahya policia chetado", Main.getJugador().vida/2,Main.getJugador().nivel/4,3,1);

        
            
    }

    }

}

