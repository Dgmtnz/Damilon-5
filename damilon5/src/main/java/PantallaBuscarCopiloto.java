import java.util.Scanner;

public class PantallaBuscarCopiloto extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "   [TABLÓN DE ANUNCIOS - PISTA DE DESPEGUE]                    \n"+
        "                                                                \n"+
        "   SE BUSCA COPILOTO                                            \n"+
        "   - Experiencia en vuelo espacial                              \n"+
        "   - Capacidad de combate en emergencias                        \n"+
        "   - Disposición a trabajar por comisión                        \n"+
        "                                                                \n"+
        "   3 CANDIDATOS DISPONIBLES HOY                                 \n"+
        "                                                                \n");
        System.out.println("-- BUSCAR COPILOTO --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Fijas el anuncio en el tablón. En dos horas, tres candidatos se presentan.");
        System.out.println("");
        System.out.println("Candidato 1: Rex Orion — ex-piloto militar, 15 años de experiencia");
        System.out.println("Candidato 2: Dra. Lyra Nexon — científica, piloto secundaria, especialista en navegación");
        System.out.println("Candidato 3: Kevin — el tendero. 'Llevo tiempo queriendo salir de la tienda.'");
        System.out.println("");
        System.out.println("¿A quién eliges como copiloto?");
        System.out.println("1. Rex Orion (militar, ventaja en combate)");
        System.out.println("2. Dra. Lyra Nexon (científica, ventaja en exploración)");
        System.out.println("3. Kevin (comodín, impredecible pero fiel)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Rex asiente. 'Bien. No hablo mucho, pero defiendo bien la nave.'");
                System.out.println("Apretón de manos seco. Un profesional de verdad.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCopilotoMilitar();
                break;

            case 2:
                System.out.println("Lyra sonríe. 'Excelente. Tenía ganas de salir del laboratorio.'");
                System.out.println("'¿Sabías que el sector Delta tiene tres nebulosas sin cartografiar?'");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCopilotoCientifico();
                break;

            case 3:
                System.out.println("Kevin cierra la tienda con un cartel: 'Vuelvo cuando vuelva'.");
                System.out.println("'¡Cuándo mejor! ¡Las aventuras son para los valientes!'");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCopilotoKevin();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
