
public class PantallaBatallaCazarrecompensas extends Pantalla {

    Enemigo cazarrecompensas = new Enemigo("El Cazador", 25, Main.getJugador().nivel, 5, 1000);


    @Override
    public void mostrarSprite() {

        System.out.println("                                                               \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                     .@                         \n"+
        "            .@WWW@       @    .@@..         .-     W:           \n"+
        "          .WWOWWWWWW.  -    .@@@@&@@       W@@@.                \n"+
        "           oOooWOWQo       :@..W0&.&@                           \n"+
        "           oooooooo  Q&.   .&:0= 0= W                           \n"+
        "              ooo.        .M &.   Q+...        @                \n"+
        "         .           :  ..:00:.. :.00O...            .          \n"+
        "          @            .000ooOOooo.::0@@@:        ..W:.         \n"+
        "                  -.  .Q0000000MMM@@@MM&&W          W.          \n"+
        "           .      .O  Q0o00ooM@QQ@@WW.:.:.   @:                 \n"+
        "                      o*..  :OO@@WOM-  +oo                      \n"+
        "           :O.    . 0-MM.   =:@:. :=   .-M=..       @           \n"+
        "         .WW@W    .o..@W=  :  M+++=.WW .WW@.O                   \n"+
        "                      @W*.=OMMo   =.o0.==W@ :.  :.              \n"+
        "                 .*   @W   ===.-0+OWQ.. 0W@ -o..                \n"+
        "         ..        .@.&=o .-+: ===.. :M==Q@  oo00.   &@         \n"+
        "         W@.     ..+@& o  OMMo+  .*oMo  OO  ..oo00oM---         \n"+
        "       .M     .=---Q&-Q  .@@OO    OW0@ .   .o.  ooO0O00.*       \n"+
        "            -=====@&+o.   ..W      OW.      :...  :+*-:o0O      \n"+
        "           . ====&@&++. .:O*:        OO     .*o.==..    .*.     \n"+
        "          :++..+Q&&+0o   M0M         OMQM    *ooO+=++           \n"+
        "         ++++++@@&++0  .OWWO         WW&@    .oooO0+++          \n"+
        "         +++++@&W+++.  -@WQ.         MMWW  .+..oo.+++++.        \n"+
        "       .+++++@&+++++++  @WO          OOW@  .++++++++++++        \n"+
        "       .+++o+++*o+O*+++    o+      ++.   .oo+oO+**+o++++        \n"+
        "      +*O+OOOOOOOOOOOo@&O0            .O@@OOOOOOOOOOOOO++*      \n"+
        "          *******OOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*******          \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && cazarrecompensas.vida > 0) {
            
            if(Main.getJugador().velocidad > cazarrecompensas.velocidad){
                
                Main.getJugador().atacar(cazarrecompensas);
                if (cazarrecompensas.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos


                cazarrecompensas.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
            }else{

                cazarrecompensas.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                Main.limpiarPantalla();
                    mostrarInformacion();
                    mostrarSprite();


                Main.getJugador().atacar(cazarrecompensas);

                try {
                    Thread.sleep(7000);
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
            Juego.pantallaActual = new PantallaMuerte();
            
        }else{
            System.out.println("Has vencido a el cazador.");
            System.out.println("Le robaste todo su botín. Dinero + 50000");
            System.out.println("Felicidades crack");
            Main.getJugador().dinero += 50000;
            Main.getJugador().experiencia += 6500;
        
        
        Juego.pantallaActual = Juego.pantallaSiguiente;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        cazarrecompensas = new Enemigo("Cazarrecompensas espacial la venganza", Main.getJugador().vidaMax, Main.getJugador().nivel, 2, 50);
        
        
            
    }

    }

}
