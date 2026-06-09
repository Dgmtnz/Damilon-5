import java.util.Scanner;

public class PantallaTesoroForagido extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "           +* :    .:    -=*00000000o--   .--    . +*           \n"+
        "           o0+           :++oooooooo*+-   .       +0O           \n"+
        "           oo*Mo          ==*OOOOOO*:=          +Q0*+.          \n"+
        "           *++MWQo.         :oooooo-          *QMWO=+           \n"+
        "           ++ .*O00o.       =oOoooo=        *OQ0o= +*           \n"+
        "           =o+-   .*o*+= .*OooOQQOo*Oo: :+*o*-    +o*           \n"+
        "           -++00M0+=  ++  *O+**00**+oo: :+:  +oOOQ0*+           \n"+
        "           .. :.*OoOoo+- .*O++*OO*++oo: :+*oo0o+++  :           \n"+
        "            ++o+.+o++*+.  *o=--o0+::*o:  -+O+=+++** -           \n"+
        "              oo*oo*++:.  +o::-*O+.:**.  .+o**oo*o+ .           \n"+
        "        .   +=. :::+o*-  .*o= :oO:::oo.  =o+**: o+ -            \n"+
        "            ++OO00o**=.   +*:. ++ :.++    -+ooo0MO*.            \n"+
        "             .*+   .*+    *O-==+=:=.oo:  .+*+ . +*=             \n"+
        "               .oo**o.    +*  .**-. -+    :+o*O*   :            \n"+
        "            ++o0Q0++== =-:*0ooOOo*:=QM+   ++-:OQOO*+.           \n"+
        "           .- Oo=-oo+:=O0Oo00O0Q000QM0o00*.=+o=-*O+ -           \n"+
        "           :: ++*0o++*0O*QM00M0OO0OO0000*oo+=*OO=  =+           \n"+
        "           =*:oOO+.+++0WMooOooO00MWMoo*OOQQ0o-=oO0+=+           \n"+
        "           =+.O* *Oo*OOo00OO0Q00Q0QO+**OW00oOo+ =O=             \n"+
        "              -:+*0QOM0oooQ0M0+o+OQ00000QQo+OOO*:               \n"+
        "              ++*+ .=**0MMO*ooooO*-.OQ0Oo+ =+o- **.             \n"+
        "            ++*:... .*+oOo++*0QOOo++o0OOOo****.=++++            \n"+
        "                          -====++++=:                           \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                      ........::::::.....                       \n"+
        "                  ..::--==++++++++++++==-::.                    \n");
        System.out.println("-- TESORO DE LOS FORAJIDOS --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("¡Lo habéis conseguido! El banco espacial ha sido vaciado.");
        System.out.println("La banda de forajidos celebra el golpe más grande de sus carreras.");
        System.out.println("El jefe forajido te palmea la espalda. '¡Eres uno de los nuestros!'");
        System.out.println("Te dan tu parte: 75000$ en créditos y un cofre de joyas.");
        System.out.println("");
        System.out.println("Dinero +75000$ | Experiencia +3000");
        Main.getJugador().dinero += 75000;
        Main.getJugador().experiencia += 3000;

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("");
        System.out.println("Pero la policía galáctica ya tiene vuestra descripción. Hay que moverse.");
        System.out.println("¿Qué haces con tu nueva fortuna?");
        System.out.println("1. Volver al puerto espacial y desaparecer entre la multitud");
        System.out.println("2. Quedarte con la banda y seguir en el crimen");
        System.out.println("3. Donar parte del dinero a colonias pobres y redimirte");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Desapareces en el puerto con tu fortuna. Nadie hace preguntas.");
                System.out.println("Una nueva vida te espera con 75000$ en el bolsillo.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacialSin4();
                break;

            case 2:
                System.out.println("Te quedas con los forajidos. La siguiente operación es aún más grande.");
                System.out.println("La vida criminal tiene sus encantos... y sus consecuencias.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaBandaForagidos();
                break;

            case 3:
                System.out.println("Donas 20000$ a colonias en zonas de guerra. Eres un forajido con corazón.");
                System.out.println("Dinero -20000$ | Experiencia +2000 extra | Tu reputación mejora.");
                Main.getJugador().dinero -= 20000;
                Main.getJugador().experiencia += 2000;
                try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacialSin4();
                break;

            default:
                System.out.println("Opción inválida.");
                mostrarOpciones();
                break;
        }
    }
}
