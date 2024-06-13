import java.util.Random;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

public class PantallaCarreraEspacial extends Pantalla {

    private static final int WIDTH = 40;
    private static final int HEIGHT = 30;
    private static final char SHIP_ICON = '♅';
    private static final char METEORITE_ICON = '█';
    private static final char EMPTY_SPACE = ' ';
    private char[][] field = new char[HEIGHT][WIDTH];
    private int shipPosition = WIDTH / 2;
    private int linesDodged = 0;

    @Override
    public void mostrarSprite() {
    }

    @Override
    public void mostrarOpciones() {
        try {
            PantallaCarreraEspacial game = new PantallaCarreraEspacial();
            com.googlecode.lanterna.terminal.Terminal terminal = new DefaultTerminalFactory().createTerminal();

            terminal.enterPrivateMode();

            System.out.println("Mueve la nave con A y D para esquivar los meteoritos. ¡Buena suerte!");

            while (true) {
                com.googlecode.lanterna.input.KeyStroke keyStroke = terminal.pollInput();

                if (keyStroke != null) {

                    if (keyStroke.getCharacter() == 'a') {
                        game.moveShipLeft();
                    } else if (keyStroke.getCharacter() == 'd') {
                        game.moveShipRight();
                    }
                }

                game.advanceMeteorites();
                if (game.checkCollision()) {
                    System.out.println("¡Has perdido!");
                    System.out.println("Campeon te vas al lobby");
                Thread.sleep(8000); // Espera medio segundo
                Juego.pantallaActual = new PantallaMuerte();
                    break;
                }

                if (game.linesDodged++ == 100) {
                    System.out.println("¡Has ganado, felicidades!");
                    System.out.println("Te retiras como el rey de las carreras de naves");

                Thread.sleep(8000); // Espera medio segundo

                    Juego.pantallaActual = new PantallaFin();
                    break;
                }
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                game.renderField();
                Thread.sleep(500); // Espera medio segundo
                

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PantallaCarreraEspacial() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                field[i][j] = EMPTY_SPACE;
            }
        }
    }

    public void moveShipLeft() {
        if (shipPosition > 0) {
            shipPosition--;
        }
    }

    public void moveShipRight() {
        if (shipPosition < WIDTH - 1) {
            shipPosition++;
        }
    }

    public void generateMeteorites() {
        Random rand = new Random();
        for (int i = 0; i < WIDTH; i++) {
            if (rand.nextDouble() < 0.05) { // 10% chance to generate a meteorite
                field[0][i] = METEORITE_ICON;
            }
        }
    }

    public void advanceMeteorites() {
        for (int i = HEIGHT - 1; i > 0; i--) {
            System.arraycopy(field[i - 1], 0, field[i], 0, WIDTH);
        }
        for (int j = 0; j < WIDTH; j++) {
            field[0][j] = EMPTY_SPACE;
        }
        generateMeteorites();
    }

    public boolean checkCollision() {
        return field[HEIGHT - 1][shipPosition] == METEORITE_ICON;
    }

    public void renderField() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == HEIGHT - 1 && j == shipPosition) {
                    System.out.print(SHIP_ICON);
                } else {
                    System.out.print(field[i][j]);
                }
            }
            System.out.println();
        }
    }
}
