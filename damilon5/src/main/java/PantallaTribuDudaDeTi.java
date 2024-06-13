import java.util.Scanner;

public class PantallaTribuDudaDeTi extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Logras vencer a los Zhorgarianos, pero los miermbros de la tribu han visto sangrar a Dios, algunos ya no te ven como una deidad.");
        System.out.println("Opciones:");
        System.out.println("1. Continúas gobernando pacíficamente.");
        System.out.println("2.Empiezas a exigir más, aumentando su carga de trabajo.");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                
            Juego.pantallaActual = new PantallaDespedidaDeLaTribu();
                

                break;

            case 2:
            Main.limpiarPantalla();
            System.out.println("Tu exigencia de burpees se convierte en una obsesión. Los Lladorianos, exhaustos y descontentos, comienzan a cuestionar tu liderazgo. Un día, durante un combate ceremonial, un grupo de rebeldes se levanta contra ti.");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            Juego.pantallaSiguiente = new PantallaContinuarViaje();
            Juego.pantallaActual = new PantallaBatallaTribuSeRevela();
                break;
        
            default:
                break;
        }

    }

}
