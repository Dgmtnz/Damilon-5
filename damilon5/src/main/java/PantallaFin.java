import java.util.Scanner;

public class PantallaFin extends Pantalla {

    @Override
    public void mostrarSprite() {}

    @Override
    public void mostrarOpciones() {

        System.out.println("FELICIDADES, HAS GANADO!!!");
        System.out.println("COMPLETASTE UN FINAL, AUN TE QUEDA MUCHO POR DESCUBRIR EN EL JUEGO!");
        System.out.println("¿Quieres volver a jugar?");
        System.out.println("1. si");
        System.out.println("2. no");
        Scanner scanner = new Scanner(System.in);
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            Juego.pantallaActual = new PantallaPuertoEspacial();
        } else {
            System.out.println("Gracias por jugar!");
            System.exit(0);
        }

    }

}
