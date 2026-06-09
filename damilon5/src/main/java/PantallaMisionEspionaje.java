import java.util.Scanner;

public class PantallaMisionEspionaje extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "    .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .      \n"+
        "                                                                \n"+
        "          [?]  IDENTIDAD ENCUBIERTA: 'NEXAR-7'                  \n"+
        "                                                                \n"+
        "    .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .      \n"+
        "                                                                \n"+
        "    OBJETIVO: Infiltrar base rebelde y obtener códigos de armas  \n"+
        "                                                                \n"+
        "    .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .      \n");
        System.out.println("-- MISION DE ESPIONAJE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Te infiltras en la base rebelde con identidad falsa: eres 'Nexar-7', mercenario.");
        System.out.println("Pasas tres días ganándote su confianza. Pero cuanto más los conoces...");
        System.out.println("...más te das cuenta de que no son los monstruos que el Imperio describe.");
        System.out.println("");
        System.out.println("Encuentras los códigos de armas. ¿Qué haces?");
        System.out.println("1. Transmitir los códigos al Imperio (cumplir la misión)");
        System.out.println("2. Destruir los códigos y huir (ni Imperio ni rebeldes ganan)");
        System.out.println("3. Unirte a los rebeldes (traicionar al Imperio)");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Transmites los códigos. El Imperio lanza un ataque devastador esa misma noche.");
                System.out.println("Cumpliste la misión. El Imperio te premia generosamente.");
                System.out.println("Dinero +15000$ | Experiencia +2500");
                Main.getJugador().dinero += 15000;
                Main.getJugador().experiencia += 2500;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaAscensoImperial();
                break;

            case 2:
                System.out.println("Destruyes los códigos. Ambos bandos quedan sin ventaja. Escapes silenciosamente.");
                System.out.println("El Imperio no está satisfecho. No hay recompensa, pero tu consciencia está limpia.");
                System.out.println("Experiencia +1000");
                Main.getJugador().experiencia += 1000;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("Te presentas ante el líder rebelde y le confiesas todo.");
                System.out.println("'Un espía que cambia de bando... ¿cómo saber si podemos fiarnos de ti?'");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaDecisionDobleAgente();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
