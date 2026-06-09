import java.util.Scanner;

public class PantallaReabastecerYSeguir extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "      [NAVE]                                                    \n"+
        "    /========\\                                                  \n"+
        "   /  O    O  \\         REABASTECIENDO...                       \n"+
        "  /    ====    \\        [ ============ ] 100%                   \n"+
        " /      ||      \\                                               \n"+
        "========================    COMBUSTIBLE LLENO                   \n"+
        "  |    ||||    |            BOTIQUINES CARGADOS                 \n"+
        "  |____________|                                                \n"+
        "                                                                \n");
        System.out.println("-- REABASTECIMIENTO EN PLANETA LEJANO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La tribu, aunque reservada, no se opone a que uses los recursos naturales del planeta.");
        System.out.println("Encuentras un manantial de agua pura, frutas desconocidas con propiedades curativas,");
        System.out.println("y minerales que sirven como combustible para tu nave.");
        System.out.println("");
        System.out.println("¿Qué recursos priorizas recolectar?");
        System.out.println("1. Minerales de combustible (rango de viaje extendido)");
        System.out.println("2. Plantas medicinales (botiquines adicionales)");
        System.out.println("3. Cristales raros (valor de venta alto)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cargas la nave con mineral de hidrógeno comprimido del planeta.");
                System.out.println("Tu rango de vuelo se duplica. Podrás llegar a sistemas estelares más lejanos.");
                System.out.println("Velocidad +15 | Experiencia +400");
                Main.getJugador().velocidad += 15;
                Main.getJugador().experiencia += 400;
                break;

            case 2:
                System.out.println("Recolectas plantas con propiedades regenerativas extraordinarias.");
                System.out.println("Pociones +3 | Vida restaurada completamente | Experiencia +400");
                Main.getJugador().pociones += 3;
                Main.getJugador().vida = Main.getJugador().vidaMax;
                Main.getJugador().experiencia += 400;
                break;

            case 3:
                System.out.println("Encuentras cristales de alta pureza que venderás en el mercado espacial.");
                System.out.println("Dinero +12000$ | Experiencia +400");
                Main.getJugador().dinero += 12000;
                Main.getJugador().experiencia += 400;
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                return;
        }

        try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("Con los recursos cargados, ¿cuál es tu próximo destino?");
        System.out.println("1. Volver al puerto espacial");
        System.out.println("2. Explorar el planeta un poco más antes de partir");

        int dest = scanner.nextInt();
        if (dest == 2) {
            System.out.println("Decides dar una vuelta más. Encuentras ruinas antiguas al fondo del valle...");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaRuinasAntiguas();
        } else {
            System.out.println("Partes con la nave llena. Es hora de nuevas aventuras.");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaContinuarViaje();
        }
    }
}
