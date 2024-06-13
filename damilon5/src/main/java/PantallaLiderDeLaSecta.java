
public class PantallaLiderDeLaSecta extends Pantalla {

    @Override
    public void mostrarSprite() {

        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "           @    @                                               \n"+
        "         O        0                                             \n"+
        "            @@@@  =                                             \n"+
        "           @@@&@  +                                             \n"+
        "          @@@  @ @                                              \n"+
        "         @@@@@0                                                 \n"+
        "        @@@@@@@@O                                               \n"+
        "         @@@M@@@@                                               \n"+
        "       @ @@   W@W@@                                             \n"+
        "       @ @@  & M@@M@@ @@&                                       \n"+
        "         @@ .@ 0@@M@O                                           \n"+
        "        @@@  @.@@@MQ+            O@@@@                          \n"+
        "         @&  @@ @@ O    @@@@      @ W+                          \n"+
        "         o@  @:@@@ @    @ W@         @@@@      @@@              \n"+
        "             @&@@@ @       @@@        @ @@    @@+@M@@@          \n"+
        "          &0@:@@ @          @ @       @@M@@      @ @@@@@@       \n"+
        "       W.@& @@@& @&        @@ @      @@@ MM&        @@ @@@@     \n"+
        "          =@@@ @&@@       @@&0@W W@@@@M  @@@@        @@ @@-@    \n"+
        "         Q @@& &&@    @@@@    -M :@@@@@ @&@o    @@o*WW    @@    \n"+
        "        &.@@@ @W @    @@W @@&@@.&  @ &@ &-@     O  *M    M &    \n"+
        "       oW@&@M @        @.@@ @  W   0@   &@           @ W &      \n"+
        "       @  @@ @ @        o-   @  @@@@Q@  W @ @@@@@@  o W@  @@@@@@\n"+
        "MM@@W @@W@M&@  W@@     @W.   &*    @@W   + W    o.       M@     \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n");

    }

    @Override
    public void mostrarOpciones() {

        System.out.println("Con tus mentiras has ascendido a ser un líder y protector, pero vivirías con el temor de ser descubierto. Con el tiempo, podrías ayudar a la tribu a prosperar, pero siempre a la sombra de la mentira.");
        System.out.println(" Usando tu conocimiento de la ciencia y la tecnología, realizas “milagros” que consolidan tu posición. Ordenas a los recien nombrados \"LLadistas de la Secta\" hacer burpees cada mañana como parte de un ritual sagrado para mantener su “salud divina”.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        System.out.println("De repente la tribu huye en panico de un zhorgariano que ha aparecido en el poblado, hora de hacer uno de tus milagros");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Pausa de 7 segundos
        Juego.pantallaSiguiente = new PantallaTribuDudaDeTi();
        Juego.pantallaActual = new PantallaBatallaZogarthianos();
    }

}
