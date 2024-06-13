
public class PantallaBatallaZogarthianos extends  Pantalla {

    Enemigo dinosaurio1 = new Enemigo("Zhorgariano", Main.getJugador().vida/2, Main.getJugador().nivel/3, 0, 0);
    Enemigo dinosaurio2 = new Enemigo("BichoDinoSaurioGenerico", Main.getJugador().vida, Main.getJugador().nivel/4, 0, 0);
    

    @Override
    public void mostrarSprite() {

        

        System.out.println("              *       .     @       @                           \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                 WWW ++QW              &+       \n"+
        "            @@@              WQ0:Oo++*O  W             o        \n"+
        "         &OQ*:0*Oo Q@              O&&& -+            W         \n"+
        "         QO0oOOM0MM+QQ            000O o:o            oQ        \n"+
        "        MOO M@QM000QM               000 o             oW        \n"+
        "        0o@Q                       &&0+++              OW       \n"+
        "        0O@0                      Q@@**       .W       OW       \n"+
        "         @@Qo                     0@@**=   &0O         +W       \n"+
        "         @@@OO o&M.               MWW@oo=*WW*          oM       \n"+
        "         @@M*MM0MQMM&@&@          MW@0 oO*:oQMoo&o    Moo       \n"+
        "        Qo0@WOMQM QMQMOOMWW      & @@@&OOo  -o  o*o*O+ooW       \n"+
        "          WWWW OM -OOOO@M.M@@     * @0MQ OO  =  &ooOo +Q        \n"+
        "        .M -W:M 0OO   0@MQO OO@QM.Q- oMO.WO   +oMoOo W          \n"+
        "   oM  oo    @MOO MQ  MQ0MO oOOQ  - 0 =Q O0Q0  *ooO+            \n"+
        "   .W      oMO   MW 0OMMOo MW00+QQQQ0 M   QM Q Oo*+             \n"+
        "    00    &QO@ -    QO@OO    oO..   MoW*     0 +o+              \n"+
        "              Oo*    = OMMM    W&      ++*     *  *OO           \n"+
        "              ** -     *o- Q           ++ .         -o          \n"+
        "                * -         M                         o         \n"+
        "                *++       OOQ            + +        .+o         \n"+
        "              +O.++       O+M           o.=+        **o         \n"+
        "         oo:W+-+       .M=MQOQ   .=*-+O. -=     -:+.O-o         \n"+
        "   0O:0 0. M0 *:     &0&M @Q0@W .Q &O&O +      &00 @M Q@   O-   \n"+
        "             :---  ===++--=- =- :  +* = ===+  +.+*==--          \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && ((dinosaurio1.vida > 0) || (dinosaurio2.vida > 0))) {
            
            if(Main.getJugador().velocidad > dinosaurio1.velocidad || Main.getJugador().velocidad > dinosaurio2.velocidad){
                
                Main.getJugador().atacarA2(dinosaurio1, dinosaurio2);
                if (dinosaurio1.vida <= 0 && dinosaurio2.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (dinosaurio1.vida > 0) {
                dinosaurio1.atacar(Main.getJugador());
                }else{System.out.println(dinosaurio1.nombre + "Esta muerto");}

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                if (dinosaurio2.vida > 0) {
                dinosaurio2.atacar(Main.getJugador());
                }else{System.out.println(dinosaurio2.nombre + "Esta muerto");}
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
            }else{

                if (dinosaurio1.vida > 0) {
                    dinosaurio1.atacar(Main.getJugador());
                    }else{System.out.println(dinosaurio1.nombre + "Esta muerto");}

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Pausa de 7 segundos

                    if (dinosaurio2.vida > 0) {
                    dinosaurio2.atacar(Main.getJugador());
                    }else{System.out.println(dinosaurio2.nombre + " esta muerto");}

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

                Main.getJugador().atacarA2(dinosaurio1, dinosaurio2);

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
            System.out.println("Has vencido a los Zhorgarianos." + " Has ganado 300 puntos de experiencia y 4000 de dinero.");

            Main.getJugador().dinero += 4000;
            Main.getJugador().experiencia += 300;
        
        
        Juego.pantallaActual = Juego.pantallaSiguiente;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos

        dinosaurio1 = new Enemigo("Zhorgariano", Main.getJugador().vida/2, Main.getJugador().nivel/3, 0, 0);
        dinosaurio2 = new Enemigo("BichoDinoSaurioGenerico", Main.getJugador().vida, Main.getJugador().nivel/4, 0, 0);
    
    }

    }
}
