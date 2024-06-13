import java.util.Scanner;

public class PantallaDespedidaDeLaTribu extends Pantalla{

    @Override
    public void mostrarSprite() {

        System.out.println("Aqui tiene que haber un sprite de despedida de la tribu");
    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Después de un tiempo gobernando con justicia y sabiduría, los Zogarthianos prosperan bajo tu liderazgo. Los monumentos que construyeron en tu honor son testimonio de una era dorada de paz y progreso. Sin embargo, sientes que tu verdadera llamada es la exploración y decides que es hora de partir en busca de nuevas aventuras. noche, durante una ceremonia de despedida, los Zogarthianos te presentan un regalo: un mapa estelar antiguo que muestra rutas hacia mundos desconocidos y maravillas sin descubrir. Con gratitud, aceptas el mapa y prometes llevar su legado contigo.");
        System.out.println("Dinero +5000");
        Main.getJugador().dinero += 5000;
        Main.getJugador().experiencia += 1000;

        System.out.println("Opciones:");
        System.out.println("1. Despegar y  continuar tu aventura");
        System.out.println("2. Permanecer en Zogartha y gobernar como rey para siempre");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                Main.limpiarPantalla();
                System.out.println("Despegaste y continuaste tu aventura.");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Juego.pantallaActual = new PantallaContinuarViaje();

                break;
        
            case 2:
                
                System.out.println("¿Que mas quieres? FIN.");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
                Juego.pantallaActual = new PantallaFin();
                break;
        
            default:
                break;
        }

    }

    

}
