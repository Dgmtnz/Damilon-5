
public class PantallaBatallaForagido extends Pantalla {

    
    
        Enemigo foragido = new Enemigo("Pirata espacial", Main.getJugador().vidaMax/2, Main.getJugador().nivel/2, 0, 1);
    

    @Override
    public void mostrarSprite() {

        System.out.println("                            ............                        \n"+
        "                        ...:--=&M&&*=-::: ... .                 \n"+
        "                       ..::=&O==+o0MQMW*&&--::....              \n"+
        "                     ...:-=@WM=-=+++oMQQMMWWWo-::...            \n"+
        "                    ..::-=o@&Q*-:=oOo0OoMMWWW&&o&-::..          \n"+
        "                   ..::-+o@&WM=:::-+++QOM0MWQQWWW&+&-:-. .      \n"+
        "                 ..::-=+O@&MQ0*::.:::-:=oO0MOMMMWWWWW*&=::. :   \n"+
        "            .   ..::-=+&@&WMQ+=-.:: ..::--:+oOo*O0WMWWW&&o&-::..\n"+
        "              ...::-=*@@&W0o==::.         ..:::+=O*Q00MMMWWW&0&:\n"+
        "              ..:-=+@@&&Wo=------.               .:-++O+00M0MWWW\n"+
        "             ..:-=O@@&W0*=-=W&&W0:         :00:o    ...:.+=:oOQO\n"+
        "            ..:-oW@&&MO+=--+W&&MQ+W        QMM&-MQ-     ...:::-+\n"+
        "            .:*&&&WMQ+==--0+*00@&+*.      +oO QW+ +O:      . -&O\n"+
        "             . MMWQO==--:-&Q--+&&=**O0  :+:*0.QW- o+* =     WQ .\n"+
        "                 O====---=@Mo=*&@***+-. ooO* O.:=   o++    Wo  W\n"+
        "                    +----++Q&OWo:..*OQ:OO0-. . QMQ*  :   &*-&&&M\n"+
        "                       ===&M&&&WQ=OQMMMWWWMMQQO: OO+.o..M*  MWO=\n"+
        "                    W.-:MM&@WWQo-:..++o00QQMMWWO=+ .: &O +MM0===\n"+
        "               .*+0:=.:-:M&&W000QMOo*+=+=o000MQo0+Q=--:::&Q*::0*\n"+
        "           .. &0:*O=-=-&&@&&QW&&&&&MM0M00*OOQMQo-::.:: QMO:.:o  \n"+
        "        ..:-&M:**=---+-o&&&&&&&&WWQ&MQMM0QO+O-.:..::. W0:O+o+ :=\n"+
        "        .:&QMWQ+=+o::-WQQ&&&&&&&QWMWQW0QWQ0oM-- .:. W&=+=+* :=  \n"+
        "        ....:O0QQ+=OO-:O&&&&&WMWM&0O0QQo0+@+.: :. + -Q:=.  -::::\n"+
        "       :......:*OMO:*:---&&&&&WQO0Q0MOo-+.....: + O--M O- 0= :&M\n"+
        "      .......:=:.QQ*::-.0*&WMWMM0=*++QO-:::.   .M-*&Q . :*0::WWW\n"+
        "   :....:.:::::-:+*O:-=:.:0o-WW000=*+W :..      *&M***-*Oo+Q=0Q0\n"+
        "  .....:::-:-=*@@&*O==:::..--WM+:-M0&          -W=  ++-+*o:+0o*.\n"+
        "  ....:::--=*&&&o+Q0MO*...  .0M=-::& .. .. -+0Q+--  - : oo*== .-\n"+
        "....:::--+&&&WWMo+*QQQWW=&Q+o::. *:::.....0:.o00Q: =: .::-:   *+\n"+
        "..::::-=&&&&o*+*o0&QQ0=o*:   *-      ..::=0WW- W-*       *: : .=\n"+
        ".:::--oW&+==+W&&&@&-o+.WO::.   -*=o.:::=&&O+O-=+ - *O      :: ::\n"+
        ".::-=WW==W++&&&&W0Q0=--    :0oQ:...-=QWQO&+0 ..    ::-          \n");

    }

    @Override
    public void mostrarOpciones() {

        while (Main.getJugador().vida > 0 && foragido.vida > 0) {
            
            if(Main.getJugador().velocidad > foragido.velocidad){
                
                Main.getJugador().atacar(foragido);
                if (foragido.vida <= 0) {
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos


                foragido.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
            }else{

                foragido.atacar(Main.getJugador());
                
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                Main.getJugador().atacar(foragido);

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
            Juego.pantallaActual = new PantallaPuertoEspacial();
            
        }else{
            System.out.println("Has vencido al foragido.");
            System.out.println("Le robaste todo su botín. Dinero + 1000");
            Main.getJugador().dinero += 1000;
            Main.getJugador().experiencia += 101;
        
        
        Juego.pantallaActual = Juego.pantallaSiguiente;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        foragido = new Enemigo("Pirata espacial la venganza", Main.getJugador().vidaMax/2, Main.getJugador().nivel/2, 2, 4);
        
        
            
    }

    }

}
