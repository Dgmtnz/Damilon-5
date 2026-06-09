import java.util.Scanner;

public class PantallaCopilotoKevin extends Pantalla {

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                                                                \n"+
        "                   =         ....                               \n"+
        "                         .+*oO000000ooo*+-                      \n"+
        "                       +00QMM&&&&&&WO0QOOOOo+:                  \n"+
        "                    -oQWWQQQQQQQ000OOooOOOO0Q0O+                \n"+
        "                  -OM&@WQ0Oo+=-:.   +Ooo**oOOQMMO+              \n"+
        "                =OOM&MQ0*:          oWMo   *OOQQMQO:            \n"+
        "               .00o000*M+          -M&Mo=  .0OO00OOO+           \n"+
        "              -o*+*00OOWQ          oWQo**- -o0Oooo-+O=.         \n"+
        "              Oooo0Q0* oQQO*       -oo**++*o*Oo+00  *0-         \n"+
        "             +ooo0QQQ*   OQWWMQOOOO000o*OOQ0o*= ++ ++O*-        \n"+
        "             QQ00QQMQO    :o0QWWOO0M0**0OOOo+-:  +oO*+O=        \n"+
        "            -MMQMQo*QMO-      :=. OOo0MOO0O*+... =*-=o0+.       \n"+
        "            *MMWWQO0MMMQo+==-...::+o0O*+00o==.:   =+=O0+:       \n"+
        "            +0WM****MQQMMMMQQQQQQ+oQ0OO0O+=: .   .+=: o*: .     \n"+
        "            -oM0*oooMMWM0Q000MO*0000QQ0o+=++     =+-  O*.    :  \n"+
        "   .        =++++++oMWQ*O00000QMQ0Oo*=-=-.      :++  +O+ :.. .  \n"+
        "            .*++++*oM0-*OoOOoO0Q0OOo*-  .       ++-  O*+.-      \n"+
        "             +o+===*OQOO+:+++oo*++=:.:       : .=-  *o+=+ oO***+\n"+
        "          ..  **+-=- +o=+ .  :              .  =-  *o*+++ OQ:   \n"+
        "           .-.-**++++**+*. =+                 ++. +o+::-: o0:   \n"+
        "     :=+*.     .+**+=+*+*+- :         ...:: :*o*+oO*+***o+o0.   \n"+
        "      +o***oooOooO0000Q0o+.++     .-   +=:= +0QQQ000000OOOOO*+  \n"+
        "      .+*ooooOOOOO0000QOoO+        =   =-:: +Ooo00OOoo*++**+++=.\n"+
        "                       +o*.        =  :::.. :OOoO*              \n"+
        ".                      ++.         =       =ooooO*              \n"+
        "                  ..   +OOOo*+           .**+oooo*              \n"+
        "                       *0Q00000OOooo*******oOoooo*              \n");
        System.out.println("-- KEVIN: COPILOTO COMERCIANTE --");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Kevin cierra su tienda, empaqueta 20 cajas de 'suministros' y sube a bordo.");
        System.out.println("'¡Una aventura! ¡Por fin! ¿Sabes cuántos años llevo soñando con esto?'");
        System.out.println("'¡Y resulta que el espacio es ENORME! ¿Lo sabías? ¡ENORME!'");
        System.out.println("");
        System.out.println("Bonus de Kevin aplicado: Pociones +3 | Dinero +2000$ (stock de la tienda)");
        Main.getJugador().pociones += 3;
        Main.getJugador().dinero += 2000;

        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Al tercer día, Kevin tiene una idea:");
        System.out.println("'¡Podemos montar una tienda VOLANTE! ¡Vendemos en todos los planetas!'");
        System.out.println("'¡El comercio interestelar! ¡Ya lo tengo todo calculado!'");
        System.out.println("");
        System.out.println("¿Qué haces?");
        System.out.println("1. Apoyar el plan de Kevin (comercio espacial)");
        System.out.println("2. Decirle que siga de copiloto sin abrir tienda");
        System.out.println("3. Volver al puerto espacial");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("En 3 meses, la 'Tienda Espacial de Kevin' es la más famosa del sector.");
                System.out.println("Kevin es rico. Tú eres rico. El comercio espacial nunca fue tan divertido.");
                System.out.println("Dinero +30000$ | Experiencia +2000 | Pociones ilimitadas (Kevin las dona)");
                Main.getJugador().dinero += 30000;
                Main.getJugador().experiencia += 2000;
                Main.getJugador().pociones += 10;
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("*** FINAL ALTERNATIVO: EL COMERCIANTE ESPACIAL ***");
                System.out.println("¡Con Kevin como socio, habéis conquistado el comercio galáctico!");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 2:
                System.out.println("Kevin acepta a regañadientes. Pero sigue siendo el mejor copiloto que puedas desear.");
                System.out.println("Y tiene siempre galletas a bordo. Siempre.");
                try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
                Juego.pantallaActual = new PantallaPuertoEspacial();
                break;

            case 3:
                System.out.println("Kevin: '¡Volvemos! ¡Bien! ¡La tienda me echaba de menos!'");
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
