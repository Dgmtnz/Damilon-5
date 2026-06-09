import java.util.Scanner;

public class PantallaElegirPlanetaColonia extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   PLANETA A: KERATH-IV       PLANETA B: ZERON-2               \n"+
        "   Temperatura: Templada      Temperatura: Extrema             \n"+
        "   Recursos: Abundantes       Recursos: Ricos en minerales      \n"+
        "   Riesgo: Medio              Riesgo: Alto                     \n"+
        "                                                                \n"+
        "   PLANETA C: LUMINA          (planeta de luz y cristales)      \n"+
        "   Temperatura: Perfecta      Recursos: Únicos                 \n"+
        "   Riesgo: Desconocido                                          \n"+
        "                                                                \n");
        System.out.println("-- ELEGIR PLANETA PARA LA COLONIA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Los exploradores de la Oficina de Territorios te presentan tres opciones:");
        System.out.println("");
        System.out.println("¿En qué planeta fundas tu colonia?");
        System.out.println("1. Kerath-IV (equilibrado, recomendado para principiantes)");
        System.out.println("2. Zeron-2 (recursos minerales, entorno hostil)");
        System.out.println("3. Lumina (misterioso, potencial ilimitado)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Kerath-IV: temperaturas templadas, suelo fértil, sin depredadores conocidos.");
                System.out.println("Una elección sólida para una colonia estable.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaConstruccionColonia();
                break;

            case 2:
                System.out.println("Zeron-2: minerales raros por doquier, pero tormentas de ácido ocasionales.");
                System.out.println("Alto riesgo, alta recompensa.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaConstruccionColonia();
                break;

            case 3:
                System.out.println("Lumina: los cristales del planeta emiten luz propia. Es... inquietantemente bello.");
                System.out.println("Nadie sabe por qué ninguna civilización anterior sobrevivió aquí.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaConstruccionColonia();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
