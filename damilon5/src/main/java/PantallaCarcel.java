
public class PantallaCarcel extends Pantalla{

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void mostrarSprite() {

        System.out.println("@               @             W             @               @ \n"+
        " -@              =@             Q            =@              .@ \n"+
        " .@              *@           .@@            =@              +@ \n"+
        " M@              &@         @@@@@:.@  @      @@              &@ \n"+
        "  @               @      @@  @W&      :=-    .@              .@ \n"+
        " +@              :@        -&                 @              :@ \n"+
        " M@              W@ .           @@@@@@@@     @@              &@ \n"+
        " :&               @       .  M@@@@@@@@@@     :@               @ \n"+
        " =@              +&     -:-@@@@@@@@@@@@@-    =@              =& \n"+
        " 0@              *@     @@@@@@@@@@@@.@@@@    *@              +@ \n"+
        " :@              &@ W  @               -@    W@              M& \n"+
        " &@.             @@ .: @@W    :@@o    O@@  o @@              @@ \n"+
        " .@              :&  @ @@@@@@@@@@@@@@@@@@ :  .@               & \n"+
        " :@              O@   0.*0 @@MM@@O-+@:0 :    +@              =@ \n"+
        " O@              0@    .@ :+@ .    @&.  @    Q@              Q& \n"+
        " o@              M&     Q@+         : @@     +@              M& \n"+
        " .@              -&     @   .                +@              -@ \n"+
        " O@              W@    M@    @M@@:@&& :&&.   &@              W@ \n"+
        " .@              -@   @@Q*            .@ @0  O@              =& \n"+
        " M@              W@@@@@@ @           ..M@@@@@@@              &@ \n"+
        " +@            @M.@@@@@@@               @@@@@:@@W            :@ \n"+
        " W@         @@@@0&@@@@@@@@             @@@@@@@@@@@@@*        &@ \n"+
        " .&      @@@@@@@0o@@@@@ @@@.         &@&@@@@@M@@@@@@@@@.     -@ \n"+
        "  @   @@@@@@@@@@oM@@@   @ @@@       @@@@   .@O@@@@@@@@@@@@@  +@ \n"+
        " M@ @@@@@@@@@@@@ &@ ..@&.    @     @@   &@@  @@@@@= @@@@@@@@ @@ \n"+
        " .& W@@@@@@W@@@ @-@@@@@@@@.   *   @W   @@@@@@*@@ @@&@@@@@@*@ :@ \n"+
        " Q& @@ @@@O@@@W@M&@@@@@@@@@@-.   M  &@@@@@@@@W@@@@@@@&@@ @ @ &@ \n"+
        "  @ @@  &@.@@@@@Q @@@@@@@@@@@@.-@  @@@@@@@@@@:@@@  :@  @&.@  .@ \n"+
        " :&  @ +.@:= +@@O0@@@@@@@@@@@@@@ :@@@@@@@@@@@O@@@@@: o . : W 0@ \n"+
        " O@  @    : o@@@O&@@@@@@@@@@@@@@@@@@@@@@@@@&@W@@@@@&@ .   W@ &@ \n"+
        "  @  :@     .@0@0:@@@@@@@@@@@@@  @@@@@@@@@ @@ @@@@W*=:     @  @ \n"+
        "  @           Q@=0&@@M@@@@@@@  @@.@@@&@@@+  @-@@@@=          +@ \n");

     }

    @Override
    public void mostrarOpciones() {
        System.out.println("ESTAS EN LA CARCEL POR TERRORISMO ESPACIAL");
        System.out.println("TE ESPERAN 10 AÑOS DE MOSCA FLITUVIANA");
        System.out.println("");
        System.out.println("Opciones:");
        System.out.println("1. Cumplir condena (10 años)");
        System.out.println("2. Planear una fuga");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Main.limpiarPantalla();
                System.out.println("Tu turno ha llegado, sales de la carcel, ahora eres mas viejo y debil");
                if (Main.getJugador().inversionBTC) {
                    System.out.println("Invertiste en BTC y te has hecho rico mientras estabas en prision, felicidades");
                    Main.getJugador().dinero = 1000000000;
                } else {
                    Main.getJugador().dinero = 500;
                }
                Main.getJugador().vidaMax -= 5;
                Main.getJugador().nivel -= 2;
                Main.getJugador().vida = Main.getJugador().vidaMax;
                Main.getJugador().arma = 0;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Juego.pantallaActual = new PantallaPuertoEspacialSin4();
                break;

            case 2:
                Main.limpiarPantalla();
                System.out.println("Empiezas a observar los turnos de guardia y planear tu escape...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Juego.pantallaActual = new PantallaPlanFuga();
                break;

            default:
                System.out.println("Opción inválida");
                mostrarOpciones();
                break;
        }
    }

}
