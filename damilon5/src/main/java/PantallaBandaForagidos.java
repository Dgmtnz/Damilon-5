import java.util.Scanner;

public class PantallaBandaForagidos extends Pantalla{

    
    @Override
    public void mostrarSprite() {

        System.out.println("                                                               \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                      .                                         \n"+
        "                       oo00       00-0QQoo00                    \n"+
        "                    Q0.*.oo.0Q   Q00*-:.*+0Q                    \n"+
        "          :0:o.       0 -Q000     0000000Q         0OoQ         \n"+
        "       Q0.Moooo:      Q:-O.                     .ooooo. o       \n"+
        "          :0O..00 oO 0O0QQ0..     @  *o=  O.@@  0O*00o:         \n"+
        "        .oQWMQ    OOO00 QQ.Oo     @o   @OoOW@@    :WWOOM        \n"+
        "     @@O0W+ Q :  .oO =o0*oo0*    MM oo@OooO0@@M      -@oO+@     \n"+
        "    M@@@Oo*0Wo&  Oo  .o0o-oO    M&M OOoOO=  -o@   o@M.oO@@@@    \n"+
        "    @@@WO=O.oo&  *00 *OOo.oO o  .@@@ oOOOOO-@MM . oO+OoOQM@@    \n"+
        "   .@@M  oooooM   .O00 O&o o WW   -&M+Woo*@@W  :@:oO.ooo 0@@@   \n"+
        "   MW@   OoOOo@@      &W&@=* O*.  o=0:.Q=&M    QQ oO.ooW .Q@W   \n"+
        "    W&&.*oOo:o=@.   +    **O@:W   + ..o    oo.M&- o*Qoo  WM:    \n"+
        "     .W@o  -.0..&:&@.O*.  oo      .OO.  OOO*@+: * O &0.&WM      \n"+
        "       0WM-O.+.=    oQ@  oo     M  OoO. OOo@ Q  . .ooo:-M  .    \n"+
        "     W0:  : oo.     ooo  oO   .    -OO  =O&O=   Q.Q=-.oo:o+     \n"+
        "     OM oo  MO+    *oo   o          oOO  oOO     :Q0O ooo o     \n"+
        "     0.ooO  oo     *oO   .     .&&  oO    oO      oo   oo o     \n"+
        "      =oo  .o      oo 0    oM-- Q= +Wo  00Oo.      +*  *oo      \n"+
        "      oo    O o.   o-  :MoMW&OO-0--QMO MM oOO    . o    oo      \n"+
        "      oo 0   .     =o*  .ooW:W+&W*0W=MMM. oo  .    :o 0:oO.     \n"+
        "   .  o=    oO0QQQQ ooQQ.o *oo  ..MMMQ-W... 0QQ*=.oo    *o  .   \n"+
        "  .   oO   *Q:=0Q:Q0WMQQ *ooo. .0.MMMQM*  Q0:WQMM= oOQQ Oo   .  \n"+
        "   M.+ 00OQQ 0= M:  ==Q:& O  : .Q.oo    =.0=+WWMQ QQQ-0oo:.QQ   \n"+
        "        M0QQ.=.:o:QQ:O.o Q*.:  .  WO&M0.Q QoQ.*O 0QQQQ:QQ       \n"+
        "         *.0=QQM+QQ0M:*QQQQ:000QQ00Q0QQQMQ. O:QQ-M0             \n"+
        "               O +@Q *= == .-MQQ0:QQ:Q.QQQWQ0:Q0                \n"+
        "              &.   .M   o0-QQQQ   @ . 0   .                     \n"+
        "                              &                                 \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Decides unirte a una banda de forajidos, buscando camaradería y un sentido de pertenencia en este vasto y a menudo solitario universo. Pronto te encuentras con Los Masones de Orion, un grupo conocido por su código de honor y sus audaces incursiones.");

        System.out.println("Como nuevo miembro, te asignan tu primera misión: ayudar a robar un cargamento de cristales de energía de un convoy fuertemente custodiado. La operación es peligrosa, pero los cristales son valiosos y podrían asegurar tu lugar en la banda.");

        System.out.println("¿Aceptas la misión?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Aceptas la misión y te preparas para la acción");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                System.out.println("El convoy se detiene en un motel espacial para pasar la noche y es el momento de actuar");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                Juego.pantallaSiguiente = new PantallaBandaForagidos2();
                Juego.pantallaActual = new PantallaMinijuegoRobarCristales();
                
                break;

            case 2:
                
                Juego.pantallaActual = new PantallaBatallaForajidos();
                System.out.println("Los forajidos no han visto tu compromiso con la banda y deciden atacarte");
                
                break;
        
            default:
                break;
        }
    }

}
