import java.util.Scanner;

public class PantallaObservadorTribu extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                        .:.                                     \n"+
        "                      .:::==:-+=                                \n"+
        "                      ..  -++++-                                \n"+
        "                     ..:==+***o+.                               \n"+
        "                         -*oOo0MQO+                             \n"+
        "                        +oooO0W&&Q*.                            \n"+
        "  .           .    =+ .***OOQM&&&WWo+*    :*    +:     ++     =.\n"+
        " =o       +: - :  -oo  ==oO0W&&&&@WoOO*   .O*   O= =*           \n"+
        "  :      +o =  =  +O*  =-oOo0&W*0@&O*O+ -  +O. =**  o+          \n"+
        "         ++    *:. :    +*oOMWQ+OMWMOo=--     oO*+  ++          \n"+
        "             -*  .*-   +*00o0+ :: O0*o0O    .oo**++  +          \n"+
        "                 +o-  -o oOo0+   ++oooO+*+  +O*-                \n"+
        "                 +=      +Ooo+    :*oo*      =*=::    ..   .    \n"+
        "                 .:     ++=++     -+===:      : .:              \n"+
        "                        .          .  ..                        \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("-- RITUAL TRIBAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Decides no interferir con la tribu, simplemente observar y aprender.");
        System.out.println("Instalas sensores camuflados y estudias su cultura desde la distancia.");
        System.out.println("Sus rituales, su lenguaje, su relación con el planeta... todo es fascinante.");
        System.out.println("");
        System.out.println("Tras semanas de observación silenciosa, ¿qué haces con los datos recopilados?");
        System.out.println("1. Publicar un diario de observación científica");
        System.out.println("2. Quedarte los datos para uso personal");
        System.out.println("3. Compartir los datos con la tribu y presentarte");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Tu diario se convierte en el mayor estudio etnográfico de la galaxia.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaDiarioObservacion();
                break;

            case 2:
                System.out.println("Guardas los datos. Quizá algún día sean útiles...");
                System.out.println("Experiencia +600 | La tribu permanece en paz, sin saber que fuiste observado.");
                Main.getJugador().experiencia += 600;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaContinuarViaje();
                break;

            case 3:
                System.out.println("La tribu al principio se asusta, pero ve que llevas tiempo estudiándoles con respeto.");
                System.out.println("Te integran como observador honorario. Te enseñan sus secretos a cambio de los tuyos.");
                System.out.println("Experiencia +1000 | Dinero +5000 (intercambio de bienes)");
                Main.getJugador().experiencia += 1000;
                Main.getJugador().dinero += 5000;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaContinuarViaje();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
