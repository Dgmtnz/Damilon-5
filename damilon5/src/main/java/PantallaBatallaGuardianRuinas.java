public class PantallaBatallaGuardianRuinas extends Pantalla {

    Enemigo guardian = new Enemigo("Guardian Mecanico Antiguo", Main.getJugador().vidaMax, Main.getJugador().nivel, 3, 2);

    @Override
    public void mostrarSprite() {
        System.out.println("                                                                \n"+
        "                         .oO0QQQ0Oo.                           \n"+
        "                       oQ            Qo                        \n"+
        "                      Q  @@@      @@@  Q                       \n"+
        "                     Q   @@@      @@@   Q                      \n"+
        "                     Q                  Q                      \n"+
        "                      Q    @@@@@@@@    Q                       \n"+
        "                        Q            Q                         \n"+
        "                   oQQQQQQQQQQQQQQQQQQQQQo                    \n"+
        "                  Q                        Q                   \n"+
        "                 Q   Q               Q      Q                  \n"+
        "                 Q   Q               Q      Q                  \n"+
        "                 Q   Q               Q      Q                  \n"+
        "                  Q   QQQQQQQQQQQQQQQ      Q                   \n"+
        "                   QQQQQ             QQQQQQQ                   \n"+
        "                      Q               Q                        \n"+
        "                      Q               Q                        \n"+
        "                      Q               Q                        \n"+
        "                      QQQQQ     QQQQQQQ                        \n");
        System.out.println("GUARDIAN MECANICO - vida: " + guardian.vida);
    }

    @Override
    public void mostrarOpciones() {
        while (Main.getJugador().vida > 0 && guardian.vida > 0) {
            if (Main.getJugador().velocidad > guardian.velocidad) {
                Main.getJugador().atacar(guardian);
                if (guardian.vida <= 0) break;
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                guardian.atacar(Main.getJugador());
                try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            } else {
                guardian.atacar(Main.getJugador());
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
                Main.getJugador().atacar(guardian);
                try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            Main.limpiarPantalla();
            mostrarInformacion();
            mostrarSprite();
        }

        if (Main.getJugador().vida <= 0) {
            System.out.println("Has sido derrotado por el guardian.");
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = new PantallaMuerte();
        } else {
            System.out.println("¡Has destruido al guardian! El camino al artefacto está libre.");
            System.out.println("Experiencia +800 | Dinero +2000");
            Main.getJugador().experiencia += 800;
            Main.getJugador().dinero += 2000;
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
            Juego.pantallaActual = Juego.pantallaSiguiente;
        }
    }
}
