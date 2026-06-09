import java.util.Scanner;

public class PantallaContrabandistaHub extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   === RETO VOSS - CONTRABANDISTA INDEPENDIENTE ===              \n"+
        "                                                                \n"+
        "   'Si quieres ganar dinero de verdad, trabaja conmigo.         \n"+
        "    El Imperio cierra los ojos si pagas bien. El resto          \n"+
        "    es solo habilidad.'                                          \n"+
        "                                                                \n"+
        "   Misiones disponibles: 3                                       \n"+
        "                                                                \n");
        System.out.println("-- CONTRABANDISTA RETO VOSS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Reto Voss, el contrabandista más experimentado del sector, te ofrece trabajo.");
        System.out.println("'Tengo tres trabajos. Elige el que prefieras. Pago al contado.'");
        System.out.println("");
        System.out.println("¿Qué misión aceptas?");
        System.out.println("1. Pasar mercancía por la aduana imperial (alto riesgo)");
        System.out.println("2. Eliminar a un rival contrabandista (10000$ de recompensa)");
        System.out.println("3. Reunirte con el jefe del Mercado Negro");
        System.out.println("4. Volver al Mercado Negro");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'La aduana tiene un turno a las 3 de la madrugada con menos guardias.'");
                System.out.println("Recibes un cargamento misterioso sellado. 'No lo abras.'");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMisionPasarAduana();
                break;

            case 2:
                System.out.println("'El rival se llama Drax. Tiene su base en el asteroide TK-9. Ten cuidado.'");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaContrabandistaHub();
                Juego.pantallaActual = new PantallaMisionRivalContrabandista();
                break;

            case 3:
                System.out.println("'El jefe. Hmm. Eso es un nivel diferente. ¿Estás seguro?'");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaJefeMercadoNegro();
                break;

            case 4:
                System.out.println("Vuelves al mercado.");
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaMercadoNegro();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
