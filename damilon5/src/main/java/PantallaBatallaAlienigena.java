
public class PantallaBatallaAlienigena extends Pantalla {

    Enemigo alienigena = new Enemigo("Alienigena raza desconocida", Main.getJugador().vidaMax, Main.getJugador().nivel, 3, 1);
    

    @Override
    public void mostrarSprite() {


        

        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                              WWWooWW.                          \n"+
        "                     o     WOOOOO .OOOO&      0                 \n"+
        "                  Wo      OOOo       OOOO&      o               \n"+
        "                Wo       OOOOO        OOOO&      *o.            \n"+
        "               OO       .OOOOO.      OOOOOO       -O&           \n"+
        "              OO        . QW& OOO=OOO W&& =        *OW          \n"+
        "             OOO       :o      OOOOO=&     W        OOW         \n"+
        "            WOOM       -.      &OOO        .        OO*         \n"+
        "            *OOW               QOOO*                OO*         \n"+
        "            *OOW        oO+QMM OOOOOO Q&M O         OO*         \n"+
        "            **OOM         - +OOOOOOOOOO..*         OOO*         \n"+
        "             *OOOW         OOOOOOOOOOOOOO         OOO**         \n"+
        "             +*oOOO     WO.OOO-OOO+OOO.OOW*OW:  0OOO*+          \n"+
        "              + WWOOOOOOO+0OOO OOO OOO OOOM*OOOOOOO&-           \n"+
        "             .OOOOOO***. WOOO* OOO OOOW OOOO  *:   OOO&         \n"+
        "            WOOo  +++* WOOOO** OOOo*OOO  +oOOOOW + M OOW        \n"+
        "            OO      WOOOOO**   oOOO OOOW     *OOO&   OO&        \n"+
        "            OO M  &OOOO        *OOO *OOO     MM=oOOQ OOM        \n"+
        "            *OO  WOO MM      MQOOO*  *OOO         OO O*         \n"+
        "             +OO OO=0    .W  +oOOO  Q oOO&  o    QOO            \n"+
        "                 +OOMQ   o  WOOO*    M.OOO OO O+O.O*            \n"+
        "                  *OOOOOO* OO**        OOO:*  = =O              \n"+
        "                      ==   *  *O      WOO   *                   \n"+
        "                              *OOO&&WOOO                        \n"+
        "                                 +*+-                           \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && alienigena.vida > 0) {
            
            if(Main.getJugador().velocidad > alienigena.velocidad){
                
                Main.getJugador().atacar(alienigena);
                if (alienigena.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos


                alienigena.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
            }else{

                alienigena.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                Main.limpiarPantalla();
                    mostrarInformacion();
                    mostrarSprite();


                Main.getJugador().atacar(alienigena);

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
            System.out.println("Has vencido a DIOS.");
            System.out.println("Le robaste todo su botín. Dinero + 2500");
            System.out.println("Felicidades crack");
            Main.getJugador().dinero += 2500;
            Main.getJugador().experiencia += 2500;
        
        
        Juego.pantallaActual = Juego.pantallaSiguiente;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        alienigena = new Enemigo("Alienigena espacial la venganza", Main.getJugador().vidaMax, Main.getJugador().nivel, 2, 50);
        
        
            
    }

    }

}
