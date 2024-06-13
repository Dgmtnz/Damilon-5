import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    static Jugador jugador;
    
    

    public void mostrarMenu() {
        System.out.println("Bienvenido a Terminal Cosmos");
        System.out.println("1. Nueva Partida");
        System.out.println("2. Cargar Partida Guardada");
        System.out.println("Elige una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Iniciar nueva partida
                iniciarNuevaPartida();
                break;
            case 2:
                // Cargar partida guardada
                cargarPartidaGuardada();
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige 1 o 2.");
                mostrarMenu();
                break;
        }
    }

    public void crearJugador(){
        this.jugador = new Jugador();
    }
    public static Jugador getJugador(){
        return Main.jugador;
    }

    public void iniciarNuevaPartida() {
        // Lógica para iniciar una nueva partida
        System.out.println("Iniciando nueva partida...");
        IntroduccionJuego.mostrarIntroduccion();

        Juego.pantallaActual = new PantallaPuertoEspacial();
        crearJugador();
        while (true) {
            Juego.jugar();
        }
    }

    private void cargarPartidaGuardada() {
        // Lógica para cargar una partida guardada
        System.out.println("Cargando partida guardada...");
    }

    public static void main(String[] args) {
        Main menu = new Main();

        menu.mostrarMenu();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 148; i++) {
            System.out.println();
        }
    }
}
