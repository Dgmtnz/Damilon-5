public class Juego {

    public static Pantalla pantallaActual;
    public static Pantalla pantallaAnterior;
    public static Pantalla pantallaSiguiente;
    
    public static void setPantallaActual(InterfazPantalla pantallaActual) {
        pantallaActual = pantallaActual;
    }
    
    public static Pantalla getPantallaActual() {
        return pantallaActual;
    }

    public static void subirNivel(){

        if (Main.getJugador().experiencia >= Main.getJugador().nivelUp) {
            System.out.println("\nSubiste de nivel!");
            Main.getJugador().nivel++;
            Main.getJugador().experiencia = Main.getJugador().experiencia-Main.getJugador().nivelUp;
            Main.getJugador().nivelUp = Main.getJugador().nivelUp * 2;
            Main.getJugador().vidaMax = Main.getJugador().nivel *2;
            Main.getJugador().vida = Main.getJugador().vidaMax;
            Main.getJugador().velocidad += 1;
            
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            
        }

    }


    public static void jugar(){
        subirNivel();
        Main.limpiarPantalla();
        pantallaActual.mostrarInformacion();
        pantallaActual.mostrarSprite();
        pantallaActual.mostrarOpciones();


    }

    
}
