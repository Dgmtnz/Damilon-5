import java.util.Scanner;

public class PantallaArtefactoAntiguo extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                           .oOOOo.                             \n"+
        "                         .OOOOOOOOO.                           \n"+
        "                        .OOOOOOOOOOO.                          \n"+
        "                        OOOOO   OOOOO                          \n"+
        "                        OOOOO   OOOOO                          \n"+
        "                        .OOOOOOOOOOO.                          \n"+
        "                     ....OOOOOOOOO....                         \n"+
        "                  .OOOOOOOOOOOOOOOOOOOOO.                      \n"+
        "                .OOOOOOOOO.OOOOO.OOOOOOOOO.                    \n"+
        "               .OOOOOOOOO.OOOOOOO.OOOOOOOOO.                   \n"+
        "               .OOOOOOOOO.OOOOOOO.OOOOOOOOO.                   \n"+
        "               .OOOOOOOOOOOOOOOOOOOOOOOOOOOO.                  \n"+
        "                .OOOOOOOOOOOOOOOOOOOOOOOOOO.                   \n"+
        "                  ..OOOOOOOOOOOOOOOOOOOO..                     \n"+
        "                      ..................                        \n");
        System.out.println("-- ARTEFACTO DE ORIGEN DESCONOCIDO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El artefacto es una esfera perfecta que emite una luz pulsante y suave.");
        System.out.println("Al acercarte, notas que en su superficie aparecen símbolos que parecen responder a tu presencia.");
        System.out.println("Sientes que contiene una tecnología increíblemente avanzada, posiblemente capaz de abrir portales.");
        System.out.println("");
        System.out.println("Opciones:");
        System.out.println("1. Descifrar el artefacto e intentar activarlo");
        System.out.println("2. Vender el artefacto al mejor postor");
        System.out.println("3. Destruirlo para evitar que caiga en malas manos");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Pasas horas estudiando los símbolos. De repente... CLICK. El artefacto se abre.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPortalIntergalactico();
                break;

            case 2:
                System.out.println("Llevas el artefacto al mayor mercado de antigüedades espaciales.");
                System.out.println("Un coleccionista misterioso paga una fortuna sin hacer preguntas.");
                System.out.println("Dinero +100000$");
                Main.getJugador().dinero += 100000;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("Lo destruyes. Una onda de energía te empuja hacia atrás.");
                System.out.println("Sentiste que hiciste lo correcto. Fama +++ en comunidad científica.");
                System.out.println("Experiencia +1500");
                Main.getJugador().experiencia += 1500;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
