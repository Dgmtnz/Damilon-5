import java.util.Random;
import java.util.Scanner;

public class PantallaMinijuegoRobarBanco extends Pantalla {
    
    private String codigoSecreto = "";
    private int numero;
    private int nuevoNum;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                              .   .    ..    .     .            \n"+
        "       ...          . ..           .           .                \n"+
        "       .W@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@W       \n"+
        "        W@@00000Q00000000000QQQ000000000000000000000+@@@Q       \n"+
        "        W@@Q &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&Q=@@@Q       \n"+
        "        &@@0.M.@@@@@@@@@@@MM@ :..            . .0@.   @@M       \n"+
        "        &@@Q &.@@@@@@@@@@@MM@ .* @@@@@@@@@@@@.o.Q@ @@WW@Q       \n"+
        "        &@@Q.& @@@@@@@@@@@MM@ .o W          & o Q@ @@WW@Q       \n"+
        "        W@@0 &W@@@@@@@@@@@MM@  o.W    "+ nuevoNum +"     & o Q@ @@WW@Q           \n"+
        "        &@@0.Q+@@@@@@@@@@@MM@ .o.W          &.o.Q@W*:*W@M       \n"+
        "        &@@Q.&Q@@@Q@@ @=M@MM@ .* .@@@@@@@@@@. o Q@@o=M&@Q       \n"+
        "        &@@Q &Q@@Q0O  -OM@MM@  **************** Q@@Q*@@@Q       \n"+
        "        &@@M &@     ..     M@   o@++&++@*:M0.*o Q@@M*@@@Q       \n"+
        "        &@@M &Q@@QQ .. QQ@&Q@ . o 112233449 ..* Q@@M*@@@Q       \n"+
        "        &@@Q &QM@@      @WQQ@   o 556677889 . o.Q@@M*@@@Q       \n"+
        "        W@@Q &Q@@  QQQQ  @MM@   o MM MW M0.M  o.Q@@Q*@@@Q       \n"+
        "        &@@Q &Q@@@QQ@@@QM@MM@   o @@.@@.@M @0.o Q@ .  @@M       \n"+
        "        W@@0  .@@@@@@@@@@@MM@   o @@ @@.@@ @@.o.Q@ @@WW@Q       \n"+
        "        &@@Q W.@@@@@@@@@@@MM@ . o      . ... .o Q@ @@WW@Q       \n"+
        "        &@@0.&.@@@@@@@@@@@MM@ ..o =+.MM MM == o.Q@.@@WW@Q       \n"+
        "        W@@0 0 @@@@@@@@@@@MM@  oooooooooooooooo.Q@Q+-*W@M       \n"+
        "        W@@Q &.WMMMMMMMMMM00@ M&&&&&&&&&&&&&&&&&&&M*-M&@Q       \n"+
        "@@@@@@@ W@@Q.    .::::.. .       .-+++++++++++==.  .=@@@Q.@@@@@@\n"+
        "MMMMMMM W@@@@@@@@@@@@@@@@@&Q*O@@@@@@@@@@@@@@@@@@@@@@@@@@Q MMMMMM\n"+
        "oo*ooooo QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ.*ooo*oo\n"+
        "QQQQWWWWWo0MMM+                                   *MMMQ+WWWWMQ0O\n"+
        "WWWWWWWO=OM@&W*    o**+  ***++.  +**++ : *+**+ .  0&@@Q*OOWWWWWW\n"+
        "WWWWWWWWW*+++++++++==+=+=++==========+++++++++=+++++++++0M0o000O\n"+
        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"+
        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    @Override
    public void mostrarOpciones() {
        final int LIMITE_SECUENCIA = 10; // Límite de la secuencia
        boolean haFallado = false;
        
        // Generar el primer número y agregarlo al código secreto
        codigoSecreto += random.nextInt(10);

        System.out.println("Primer numero de la secuencia: " + codigoSecreto);

        while (!haFallado && codigoSecreto.length() < LIMITE_SECUENCIA) {
            System.out.println("Introduce la secuencia mas el obtenido en la caja fuerte: ");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equals(codigoSecreto)) {
                System.out.println("¡Correcto!");
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos

                // Agregar un nuevo número al código secreto si no se ha alcanzado el límite
                if (codigoSecreto.length() < LIMITE_SECUENCIA) {
                    nuevoNum = random.nextInt(10);
                    codigoSecreto += nuevoNum;
                }
                

                Main.limpiarPantalla();
                mostrarInformacion();
                mostrarSprite();

            } else {
                haFallado = true;
                System.out.println("Has perdido. La secuencia correcta era: " + codigoSecreto);
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
                Main.limpiarPantalla();
                
                System.out.println("La alarma ha saltado, todas las puertas estan cerradas y tambien llaman a la policía");
                System.out.println("Estais jodidos, preparate para luchar por tu vida");
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                
                Juego.pantallaActual = new PantallaBatallaHanPilladoALaBanda();
                break;
            }
        }

        if (!haFallado) {
            System.out.println("¡Has ganado! Completaste la secuencia de " + LIMITE_SECUENCIA + " números.");
            System.out.println("Os habeis llevado un buen botin, Dinero +30000");
            Main.getJugador().dinero += 30000;
            Juego.pantallaActual = Juego.pantallaSiguiente;
            
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
        }
    }

}
