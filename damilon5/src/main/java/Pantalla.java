
public abstract class Pantalla {

    public void mostrarInformacion() {
        System.out.print("Nivel: " + Main.getJugador().nivel);
        System.out.print( "                                           " + Main.getJugador().nBalas +" :Balas ");
        System.out.println();
        System.out.print("Vida: " + Main.getJugador().vida);
        System.out.print("                                      " + Main.getJugador().pociones +" :Botiquines");
        System.out.println();
        System.out.println("Dinero$: " + Main.getJugador().dinero + "$");
        System.out.println("-----------------------------------------------------------");
     }

    public abstract void mostrarSprite();

    public abstract void mostrarOpciones();


}
