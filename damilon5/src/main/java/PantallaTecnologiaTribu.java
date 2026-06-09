import java.util.Random;
import java.util.Scanner;

public class PantallaTecnologiaTribu extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                              +0Q0+                             \n"+
        "   +                    +     Ooo*o:                            \n"+
        "   ++                   -*   +  +*                o             \n"+
        "    *                     + ==  +*                o             \n"+
        "    +                     .O0      .0.            *             \n"+
        "    +         :          *Q0++   . -o0O           *             \n"+
        "         :    .         :+=. *ooOo**:-+=          :   +:        \n"+
        "        :*0*  :              =oOQQ0o:             .  O0=        \n"+
        "          *O      :+    -+:  -O0Q0Oo- .      *-   .  o+         \n"+
        "        = -+      =O=  -=     *o0Ooo:   :    *:   .  -=+- -     \n"+
        "     :Oo:.=+:      :   +Q+  ::-=oo+*=  *0      .:   +===:OO.    \n"+
        "    :*+OO=+oo  -Oo--+= OM+  :    =.=+- +M* +*==**-  +*+o*=+-    \n"+
        "    :+  +o+o+  +:o*:++ *Q:        .     0o .:=+= *+ =**o-  +    \n"+
        "        -oo*+ +-  *+.   O+  -*.  +- -. :o* ..++. ++..oOo+  +o   \n"+
        "        ++ooO+   ++*:*+ +:-+o*+ .=.::+  +-*+:+++  - =oo**  +*   \n"+
        "       .  +*+*  -..:. +    +=++.  : .:    - . .-. : +++-=+ *:   \n"+
        "       +*:-+.+* -=:=o+.-    :++     +=:  + -==:+=+  -**+o+**    \n"+
        "      .+O+=++:o  =.+*O     =++:     +:     ===.-=   +**=O*=.    \n"+
        "       =+:**=      *+o     =o+       o=    :+*  . . +OO.o*      \n"+
        "       =+ o*         .      +-       o+          :: .oo +*      \n"+
        ":-::   .       :         .  :        ::   ..     +=  -   +.     \n"+
        "-:-+- :     :              .:        +=       .+++= ..   =+   .:\n"+
        " .++  -+                               .-.: :+**0*+.     =-  ::-\n"+
        "   -  .+=-  .  ++  ..:++-   ++++++++   .+++=++oQ&MQ+=  :::-  :  \n"+
        "      =  =  +**+++++++++--=.++++++++   +*++**OM&&&O*+::-  *+    \n"+
        "        :++==+*+-=-     +Oo            +*++*OOWM0QMO**+ =*o*++++\n"+
        "         :=:--:==-==++++-+*++******ooooooo:**.+O=.o*:   +*+--.++\n"+
        "              :  -+*+++**+++*=:=++***+*+ .  -: +: ==           .\n"+
        "                   :++-:*+:=:..:.=:= :-.:-:=+=+==.:.        :-. \n");
        System.out.println("-- TECNOLOGIA TRIBAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Decides compartir tu conocimiento tecnológico con la tribu.");
        System.out.println("Les muestras cómo funcionan los circuitos básicos, los paneles solares y las comunicaciones.");
        System.out.println("Al principio son escépticos, pero pronto la curiosidad puede más que el miedo.");
        System.out.println("");
        System.out.println("¿Cómo enfocas la enseñanza?");
        System.out.println("1. Enseñarles energía limpia y construcción");
        System.out.println("2. Enseñarles comunicaciones y computación");
        System.out.println("3. Enseñarles medicina y biotecnología");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        Random random = new Random();

        switch (opcion) {
            case 1:
            case 2:
            case 3:
                System.out.println("Pasas semanas con la tribu. Su progreso es asombroso.");
                System.out.println("Al partir, te hacen un regalo: cristales de energía raros de su planeta.");
                System.out.println("Dinero +8000$ | Experiencia +1200");

                if (random.nextInt(10) < 2) {
                    System.out.println("Sin embargo, una facción de la tribu no confía en tus enseñanzas y te ataca al partir.");
                    try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                    Juego.pantallaSiguiente = new PantallaContinuarViaje();
                    Juego.pantallaActual = new PantallaBatallaTribuRechaza();
                } else {
                    Main.getJugador().dinero += 8000;
                    Main.getJugador().experiencia += 1200;
                    System.out.println("Te despides con la certeza de haber cambiado el destino de una civilización.");
                    try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                    Juego.pantallaActual = new PantallaContinuarViaje();
                }
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
