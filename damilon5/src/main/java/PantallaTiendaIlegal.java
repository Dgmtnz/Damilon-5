import java.util.Scanner;

public class PantallaTiendaIlegal extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [TIENDA ILEGAL - ACCESO RESTRINGIDO]                        \n"+
        "                                                                \n"+
        "   Item A: Arma Modificada         Precio: 8000$               \n"+
        "   Item B: Botiquín de Combate x5  Precio: 3000$               \n"+
        "   Item C: Escudo Energético       Precio: 12000$              \n"+
        "   Item D: Munición Perforante x30 Precio: 2000$               \n"+
        "   Item E: Estimulante de Combate  Precio: 5000$               \n"+
        "                                                                \n");
        System.out.println("-- TIENDA ILEGAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("El vendedor lleva gafas oscuras y apenas levanta la vista.");
        System.out.println("'No preguntes de dónde viene. Solo paga y lárgate rápido.'");
        System.out.println("Tienes " + Main.getJugador().dinero + "$");
        System.out.println("");
        System.out.println("¿Qué compras?");
        System.out.println("1. Arma Modificada (Ataque +10) - 8000$");
        System.out.println("2. Botiquín de Combate x5 (Pociones +5) - 3000$");
        System.out.println("3. Escudo Energético (Defensa +8) - 12000$");
        System.out.println("4. Munición Perforante (Balas +30) - 2000$");
        System.out.println("5. Estimulante de Combate (Velocidad +5) - 5000$");
        System.out.println("6. Salir de la tienda");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                if (Main.getJugador().dinero >= 8000) {
                    Main.getJugador().dinero -= 8000;
                    Main.getJugador().arma += 10;
                    System.out.println("¡Arma mejorada! Ataque +" + Main.getJugador().arma);
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                break;
            case 2:
                if (Main.getJugador().dinero >= 3000) {
                    Main.getJugador().dinero -= 3000;
                    Main.getJugador().pociones += 5;
                    System.out.println("¡Botiquines adquiridos! Pociones: " + Main.getJugador().pociones);
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                break;
            case 3:
                if (Main.getJugador().dinero >= 12000) {
                    Main.getJugador().dinero -= 12000;
                    Main.getJugador().defensa += 8;
                    System.out.println("¡Escudo activado! Defensa: " + Main.getJugador().defensa);
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                break;
            case 4:
                if (Main.getJugador().dinero >= 2000) {
                    Main.getJugador().dinero -= 2000;
                    Main.getJugador().nBalas += 30;
                    System.out.println("¡Munición cargada! Balas: " + Main.getJugador().nBalas);
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                break;
            case 5:
                if (Main.getJugador().dinero >= 5000) {
                    Main.getJugador().dinero -= 5000;
                    Main.getJugador().velocidad += 5;
                    System.out.println("¡Estimulante tomado! Velocidad: " + Main.getJugador().velocidad);
                } else {
                    System.out.println("No tienes suficiente dinero.");
                }
                break;
            case 6:
                System.out.println("Sales de la tienda discretamente.");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = Juego.pantallaAnterior != null ? Juego.pantallaAnterior : new PantallaMercadoNegro();
                return;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        mostrarOpciones();
    }
}
