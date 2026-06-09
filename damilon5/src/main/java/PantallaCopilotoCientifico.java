import java.util.Scanner;

public class PantallaCopilotoCientifico extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "     ::                                                       :=\n"+
        "     +00Oo*-                                                 :++\n"+
        "     +O0000Q0*++:                                               \n"+
        "     =*00o*+oOo*****+=.                                         \n"+
        "     +*00O+-+*++==++******++:                                   \n"+
        "     +*00*+=+:+O+=++++++*OO0000O-           =                   \n"+
        "     +oOo=-++==+Ooo*o**oooo0Q0oO+          o0*.                 \n"+
        "     ++**+++*+=+oOooooO0*+*00o**-         +QO*+             .+**\n"+
        "     +OOO*+=*ooOoo0O00O*o+*QQ0oo-         *0Oo+=           +ooo+\n"+
        "     +***+++*+o0O0QMWQOoO*+OOOoo-        *OQ0+.. +--       +oo* \n"+
        "     +oooo**++*Ooo0MWQQ00Ooooooo=         OQ0O+..=-          o+.\n"+
        "     +0QQ0***+*ooo0O0QOooo*oOo*o=         *M0O*++=:           =-\n"+
        "     +O00O*+*++*OQ0oOO0o**o00O00=         :+..=oO0*           ::\n"+
        "     +***o**o*++O0OOOO00**oQ0OQO+              .OO- .**+       .\n"+
        "     *QMQOOOOo+OO*ooo*+oo00Q0OQ0+             :+==+OQ0O*: .   --\n"+
        ":    *QW0oQO*o*o*oooooooOQ0QQ00O+             .O00QQ0o+     ..: \n"+
        "o=   *QWQOQ0O00OOOooooo**+=-.                 00MM0Oo*..  .     \n"+
        "     o00OOooo*++=-.                  .       +O0MOoO*+*- .:     \n"+
        "     :=:                               *+*  .Qo+oo0: .    :     \n"+
        "                              =++*o+=.:  **+OMM0oOo++=    :     \n"+
        "                        :....: .--+++++  OOOQM0ooO=oOo-   .     \n"+
        "                     .:-=+*oo*+-   :-=-. ==+0QOoO0O0*    .:     \n"+
        "                .:===-:.-=-+*=++++o***=      oOO0oo*            \n"+
        " .-  =+**+.  :-=:.   .:-.       =*o+..**+    000o*o*            \n"+
        "      =:   :--=+             -.      *o00**0OoOOO**=            \n"+
        "           ..:===+======-=+**+-      ==***oO-=*+-+-:.           \n"+
        "           ++:: ***oooOOOo*+.                 +   :             \n"+
        "           +*+**+*oooooo*:             :  .         .::         \n");
        System.out.println("-- LYRA: COPILOTO CIENTIFICA --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Con Lyra a bordo, cada viaje se convierte en una expedición científica.");
        System.out.println("Sus análisis detectan rutas y anomalías que nadie más ve.");
        System.out.println("");
        System.out.println("Bonus de Lyra aplicado: Velocidad +8 | Experiencia extra en toda aventura");
        Main.getJugador().velocidad += 8;
        Main.getJugador().experiencia += 1000;

        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Lyra señala en el mapa: 'Esta nebulosa tiene lecturas inusuales.'");
        System.out.println("'Podría ser un sistema sin catalogar. Una primera visita significaría...'");
        System.out.println("'...que lo nombraríamos nosotros. ¿Lo exploramos?'");
        System.out.println("");
        System.out.println("¿Qué decides?");
        System.out.println("1. Explorar la nebulosa con Lyra");
        System.out.println("2. Seguir la ruta original");
        System.out.println("3. Volver al puerto espacial");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("En el corazón de la nebulosa: un planeta recubierto de cristales luminiscentes.");
                System.out.println("'¡Un sistema vivo no catalogado! ¡Esto es un descubrimiento histórico!'");
                System.out.println("La Academia Científica Galáctica os da una recompensa enorme.");
                Main.getJugador().dinero += 40000;
                Main.getJugador().experiencia += 4000;
                System.out.println("Dinero +40000$ | Experiencia +4000");
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 2:
                System.out.println("Lyra suspira pero acepta. 'Quizás la próxima vez.' Siguen adelante.");
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("Lyra: 'Entendido. Estaré lista para la próxima aventura, capitán.'");
                try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
