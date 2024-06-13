public class Enemigo {
    
    public String nombre;
    public int vida;
    public int ataque;
    public int defensa;
    public int velocidad;
    
    public Enemigo(String nombre, int vida, int ataque, int defensa, int velocidad) {
        
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void atacar(Jugador jugador) {
        int damage = this.ataque - jugador.defensa;
        if (damage < 0) {
            damage = 0;
        }
        jugador.vida -= damage;
        System.out.println(this.nombre + " atacó y le causó " + damage + " de daño.");
    }

    

}
