import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PantallaAyudarANaveDeInvestigacion extends Pantalla{

    private final int ALTO = 20;
    private final int ANCHO = 40;
    private char[][] laberinto;
    private boolean[][] visitado;
    private int jugadorX = 1;
    private int jugadorY = 1;
    private Random random = new Random();
    boolean juegoActivo;

    @Override
    public void mostrarSprite() {


    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Cuando llegas a la nave de los investigadores esta todo a oscuras, pero escuchas gritos de auxilio a lo lejos, la nave es gigante y enigmatica como un laberinto. Ve a rescatar a los investigadores.");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos

        new PantallaAyudarANaveDeInvestigacion().iniciar();

        System.out.println("Cientifico: Muchas gracias por rescatarnos, estavamos estudiando la materia oscura y nos acermacmos demasiado al ahujero negro.");
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        
        System.out.println("Sacanos de aqui y te daremos nuestro ultimo invento, EltimeWarpper, con el te moveras mas rapido que nadie y siempre atacaras primero");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        Juego.pantallaActual = new PantallaContinuarTuCamino();

        Main.limpiarPantalla();
        System.out.println("Ayudas a los cientificos y los dejas en la estacion espacial mas cercana. Como prometieron te recompensan");
        System.out.println("Velocidad + 100000");
        System.out.println("Continua tu viaje");
        Main.getJugador().velocidad = 100000;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos


    }

    public PantallaAyudarANaveDeInvestigacion() {
        laberinto = new char[ALTO][ANCHO];
        visitado = new boolean[ALTO][ANCHO];
        for (char[] fila : laberinto) {
            Arrays.fill(fila, '█');
        }
        for (boolean[] fila : visitado) {
            Arrays.fill(fila, false);
        }
        generarLaberinto(1, 1);
        laberinto[jugadorY][jugadorX] = '@';
        laberinto[ALTO - 3][ANCHO - 3] = '*'; // Salida del laberinto
    }

    private void generarLaberinto(int x, int y) {
        visitado[y][x] = true;
        List<Integer> direcciones = Arrays.asList(1, 2, 3, 4);
        Collections.shuffle(direcciones, random);

        for (int direccion : direcciones) {
            int dx = 0, dy = 0;
            switch (direccion) {
                case 1: dy = -2; break; // Arriba
                case 2: dy = 2; break;  // Abajo
                case 3: dx = -2; break; // Izquierda
                case 4: dx = 2; break;  // Derecha
            }
            int nuevoX = x + dx;
            int nuevoY = y + dy;

            if (esValido(nuevoX, nuevoY)) {
                laberinto[nuevoY][x + dx / 2] = ' ';
                laberinto[y + dy / 2][nuevoX] = ' ';
                generarLaberinto(nuevoX, nuevoY);
            }
        }
    }

    private boolean esValido(int x, int y) {
        if (x < 1 || y < 1 || x >= ANCHO - 1 || y >= ALTO - 1) {
            return false;
        }
        return !visitado[y][x];
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        juegoActivo = true;

        while (juegoActivo) {
            imprimirLaberinto();
            System.out.print("Mueve tu jugador (w/a/s/d): ");
            String movimiento = scanner.nextLine();

            switch (movimiento) {
                case "w": moverJugador(-1, 0); break;
                case "s": moverJugador(1, 0); break;
                case "a": moverJugador(0, -1); break;
                case "d": moverJugador(0, 1); break;
            }

            Main.limpiarPantalla();

        }
        scanner.close();
    }

    private void imprimirLaberinto() {
        for (int y = 0; y < laberinto.length; y++) {
            for (int x = 0; x < laberinto[y].length; x++) {
                System.out.print(laberinto[y][x]);
            }
            System.out.println();
        }
    }

    private void moverJugador(int deltaY, int deltaX) {
        int nuevoX = jugadorX + deltaX;
        int nuevoY = jugadorY + deltaY;

        if (nuevoX >= 0 && nuevoX < ANCHO && nuevoY >= 0 && nuevoY < ALTO) {

            if (laberinto[nuevoY][nuevoX] == '*') {
                System.out.println("¡Felicidades! Has encontrado la salida del laberinto.");
                juegoActivo = false;
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Pausa de 7 segundos
            }
            if (laberinto[nuevoY][nuevoX] == ' ') {
                laberinto[jugadorY][jugadorX] = ' ';
                jugadorX = nuevoX;
                jugadorY = nuevoY;
                laberinto[jugadorY][jugadorX] = '@';
            }

        }
    }



}
