import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PantallaArenaGalactica extends Pantalla {

    // Static state: persists across PantallaArenaGalactica instances within the same JVM session
    private static final Random rng = new Random();

    private static long novatoRespawnAt = 0;
    private static long expertoRespawnAt = 0;
    private static long campeonRespawnAt = 0;

    private static String currentNovato = "Zark el Novato";
    private static String currentExperto = "Korrath el Veterano";
    private static String currentCampeon = "Maximus Omega";

    private static final String[] NOVATO_NAMES = {
        "Grork el Torpe", "Yix sin Cicatrices", "Munk el Verde",
        "Thax el Primerizo", "Brul el Miedoso", "Zeth el Olvidado",
        "Vor el Inexperto", "Nak el Cobarde"
    };
    private static final String[] EXPERTO_NAMES = {
        "Vrax el Carnicero", "Sorn Sangre-Fría", "Drek el Implacable",
        "Ullax el Veterano", "Krix el Brutal", "Tharr el Despiadado",
        "Gorak el Temible", "Morg el Invicto"
    };
    private static final String[] CAMPEON_NAMES = {
        "Drakkar el Supremo", "Vex el Inmortal", "Krull el Destructor",
        "Mortex el Eterno", "Zagan el Temido", "Xar el Absoluto"
    };

    public static boolean isNovatoAvailable() { return System.currentTimeMillis() >= novatoRespawnAt; }
    public static boolean isExpertoAvailable() { return System.currentTimeMillis() >= expertoRespawnAt; }
    public static boolean isCampeonAvailable() { return System.currentTimeMillis() >= campeonRespawnAt; }

    public static String getCurrentNovato() { return currentNovato; }
    public static String getCurrentExperto() { return currentExperto; }
    public static String getCurrentCampeon() { return currentCampeon; }

    public static void setNovatoDefeated() {
        long delay = 3 * 60_000L + (long)(rng.nextDouble() * 5 * 60_000L);
        novatoRespawnAt = System.currentTimeMillis() + delay;
        currentNovato = NOVATO_NAMES[rng.nextInt(NOVATO_NAMES.length)];
    }

    public static void setExpertoDefeated() {
        long delay = 5 * 60_000L + (long)(rng.nextDouble() * 7 * 60_000L);
        expertoRespawnAt = System.currentTimeMillis() + delay;
        currentExperto = EXPERTO_NAMES[rng.nextInt(EXPERTO_NAMES.length)];
    }

    public static void setCampeonDefeated() {
        long delay = 8 * 60_000L + (long)(rng.nextDouble() * 7 * 60_000L);
        campeonRespawnAt = System.currentTimeMillis() + delay;
        currentCampeon = CAMPEON_NAMES[rng.nextInt(CAMPEON_NAMES.length)];
    }

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
        "   :.                                                      ..   \n"+
        " *O: .:::...                                           .:::.+O. \n"+
        "  :+:   +0+ .:::+*...     ..          :      ..*+::. +0+   +*=  \n"+
        "    ++   -o*     *+       o0 .     . o0..     **    *O=  :++    \n"+
        "     :=    **.    =+       0=        0+      +=   =o*   :=      \n"+
        "      :-.   =*=    ==      oO       OO      +:  .+*-   .        \n"+
        "-..=.. :---. +o+-.  -=     +O*     oO+    :+. :+*o- -:-  . +-. .\n"+
        "-  +      .   --==   ..    :**-   +o*.   .:  -++-.         +=- *\n"+
        "            : .::+++-:==-=:+oo*+=+oo+--==+==++=-    :           \n"+
        "       ===-=+-++*+*oo**Oooo*OOoo*oOOooooOoooo**+=*+-=:--:    .  \n"+
        " .. =-++-++**ooo*+o*+-+*=++-=+**oo*+=++=+++oo*+*OO+oo***+=-=+.::\n"+
        " :: +*+oO*ooO++o: :==++++++**oO000O***+++==-:. :++O0OoOo+++=-:.-\n"+
        "=..-=--+**Oo*   -+oO00OooooOOOOOOOOOOOoooooo*++-::++O0**++++ +=.\n"+
        "- .-+:+:+Oo+  . .-+++++****oooooooooooo***+++++-. .:*0O**++*= + \n"+
        "    ... :++++=: .:-==-=++++++++++=++++=::-=====:.-=++** :+      \n"+
        "           . -: +-:.  .:..:.      . ..  ...:-:.-==+-=  .        \n"+
        "            :   ...: -=:.=: .. ..  - .::.:::- .         .       \n"+
        "             .                oOoO-                             \n"+
        "                              :===                              \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");
        System.out.println("-- ARENA GALACTICA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("La Arena Galáctica de Damilon: el espectáculo más popular de la galaxia.");
        System.out.println("Gladiadores de toda la galaxia compiten por gloria y créditos.");
        System.out.println("El presentador te ve. '¡Nuevo competidor! ¡Las apuestas están abiertas!'");
        System.out.println("");
        System.out.println("¿En qué categoría compites?");

        List<String> acciones = new ArrayList<>();

        if (isNovatoAvailable()) {
            System.out.println((acciones.size() + 1) + ". Liga Novata - " + getCurrentNovato() + " (recompensa: 5000$)");
            acciones.add("novato");
        } else {
            long secs = (novatoRespawnAt - System.currentTimeMillis()) / 1000;
            System.out.println("   [Liga Novata: nuevo retador en " + secs / 60 + "m " + secs % 60 + "s]");
        }

        if (isExpertoAvailable()) {
            System.out.println((acciones.size() + 1) + ". Liga Experta - " + getCurrentExperto() + " (recompensa: 15000$)");
            acciones.add("experto");
        } else {
            long secs = (expertoRespawnAt - System.currentTimeMillis()) / 1000;
            System.out.println("   [Liga Experta: nuevo retador en " + secs / 60 + "m " + secs % 60 + "s]");
        }

        if (isCampeonAvailable()) {
            System.out.println((acciones.size() + 1) + ". Batalla por el Campeonato - " + getCurrentCampeon() + " (recompensa: 50000$)");
            acciones.add("campeon");
        } else {
            long secs = (campeonRespawnAt - System.currentTimeMillis()) / 1000;
            System.out.println("   [Campeonato: nuevo campeón en " + secs / 60 + "m " + secs % 60 + "s]");
        }

        System.out.println((acciones.size() + 1) + ". Salir de la Arena");
        acciones.add("salir");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        try {
            opcion = scanner.nextInt();
        } catch (Exception e) {
            mostrarOpciones();
            return;
        }

        if (opcion < 1 || opcion > acciones.size()) {
            System.out.println("Opción inválida.");
            mostrarOpciones();
            return;
        }

        switch (acciones.get(opcion - 1)) {
            case "novato":
                System.out.println("¡" + getCurrentNovato() + " entra a la arena! ¡La multitud enloquece!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaArenaGalactica();
                Juego.pantallaActual = new PantallaBatallaGladiadorNovato();
                break;

            case "experto":
                System.out.println("¡" + getCurrentExperto() + " acepta el desafío! ¡Esto será épico!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaSiguiente = new PantallaArenaGalactica();
                Juego.pantallaActual = new PantallaBatallaGladiadorExperto();
                break;

            case "campeon":
                System.out.println("¡" + getCurrentCampeon() + " acepta el reto! ¡El campeón defiende su título!");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaBatallaCampeonArena();
                break;

            case "salir":
                System.out.println("Sales de la arena. La multitud abuchea un poco.");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;
        }
    }
}
