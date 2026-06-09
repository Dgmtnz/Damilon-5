import java.util.Scanner;

public class PantallaReclutamientoImperial extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                  .+                                            \n"+
        "                  o-           =*+                              \n"+
        "                      +       oMWQO                             \n"+
        "                   --+0.     o0oOOQ*                            \n"+
        "                    ++oQo00o:o00OQQO                            \n"+
        "                    :+-+o0O000O+ +o:= +        =:               \n"+
        "              .Oo   :+:  o= .M&WMM0QQoOQO     +oO+              \n"+
        "  =   -Oo    =:*+: .+*o=.    o0QMM000Q+0&0+  :*+**    -oO:      \n"+
        " :**- ==:=:**-. *Oo+:  =:**0o+* =*OOOW*.0**00oo*: ..- ++*-  .o+ \n"+
        ". :+===+O+ .:+o*+*+oO000O**QM::. .*MOO+*Q*+*-*QMOo*+=ooO+:::++: \n"+
        " =. +-=*O=     .    .++++  :*= :-=+oO.:  o*       :+ :=o*==:-*+:\n"+
        "    +.   :     .      .   .*-=:-:**oO+o-+WW:      *  -    -    .\n"+
        "=*.  : :++    +o     +++. *O+ +*: oMQ *+*OWQ...- -+=.=*..:=  + -\n"+
        ".*     :*.    oo      .= +O= .-   oQo=  =+OQ*     +=  +=  =  ++ \n"+
        ":      .::    ++      . : *+*O:  +*  oQ .+*+o =    :  =+   :  - \n"+
        "   =     .              =:o0o-+-     =Wo    :.:     +.      =   \n"+
        "   -      ..     +       *MO  o+   -= OQ            :-      .   \n"+
        "          +:     -       +M= *+    :*=-O    +=       =          \n"+
        "                :.       oQOo+      *o=0O  =.                   \n"+
        "                         0*+*+       +++O                       \n"+
        "     -...             - oO:++.:. . ++++*=     :.                \n"+
        "  -  -...    :::   ::.:.O+:++ -:   --*+++     :=             :  \n"+
        "          =         ::.+*.=:.::::...  *++ :+. ::.:   =       .. \n"+
        "         ..    -=      +* =-::::-=:-= ++o=-*:         =.        \n"+
        "          .    :.     -0oO+:-:-::=---++.oo =:        .:.    ....\n"+
        " .        .  .:-=..:-:+oO0*-----:---:+=:OQ*+:.....   :.       ..\n"+
        "              ...    -oMQ-              *O0O*                   \n"+
        "                     +*Oo               :=-++                   \n"+
        "                       o*-           ...*o++.                   \n");
        System.out.println("-- RECLUTAMIENTO IMPERIAL --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Un oficial imperial con armadura dorada se acerca a ti en el puerto.");
        System.out.println("'Hemos oído hablar de tus habilidades, piloto. El Imperio tiene una oferta para ti.'");
        System.out.println("'Únete a nosotros. Pagas, rango, poder. El Imperio protege a los suyos.'");
        System.out.println("");
        System.out.println("¿Qué decides?");
        System.out.println("1. Aceptar el reclutamiento imperial");
        System.out.println("2. Rechazar y marcharte");
        System.out.println("3. Pedir más información antes de decidir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("'Excelente decisión. Bienvenido al Imperio Galáctico, soldado.'");
                System.out.println("Recibes 3000$ de bono de alistamiento y tu primer uniforme imperial.");
                Main.getJugador().dinero += 3000;
                Main.getJugador().experiencia += 200;
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaCuartelImperial();
                break;

            case 2:
                System.out.println("'Una pena. Quizás reconsideres en el futuro.' El oficial se retira con frialdad.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("El oficial explica: el Imperio controla el 60% de la galaxia conocida.");
                System.out.println("Salario mensual, armamento de élite, ascensos por méritos en combate.");
                System.out.println("'Claro que también habrá riesgos. Las guerras no se ganan sin sangre.'");
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                mostrarOpciones();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
