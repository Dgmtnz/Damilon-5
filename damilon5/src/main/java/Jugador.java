import java.util.Random;
import java.util.Scanner;

public class Jugador {
    public int dinero;
    public int nivel;
    public int vida;
    public int vidaMax;
    public int arma;
    public int pociones;
    public int nBalas;
    public int velocidad;
    public int experiencia;
    public int nivelUp;
    public int defensa;
    public boolean elAtacarAntes;
    public InterfazPantalla pantallaGuardada;
    public boolean inversionBTC;

    public Jugador(){
        this.nivel = 5;
        this.vidaMax = this.nivel * 2;
        this.vida = this.nivel * 2;
        this.nivelUp = 100;
        this.dinero = 1000;
        this.arma = 0;
        this.pociones = 0;
        this.nBalas = 0;
        this.velocidad = 5;
        this.experiencia = 0;
        this.elAtacarAntes = false;
        this.inversionBTC = false;
        this.defensa = 0;
    }

    public void atacar(Enemigo otro) {

        System.out.println("Pulsa 1 para atacar a puños!");
        System.out.println("Pulsa 2 para atacar con tu arma");
        System.out.println("Pulsa 3 para usar una poción");
        
        Random random = new Random();
        Scanner scanner  = new Scanner(System.in);
        int eleccion = scanner.nextInt();

        if (eleccion == 1) {
            int damage = random.nextInt(0,this.nivel) - otro.defensa;
        if (damage < 0) {
            damage = 0;
        }
        otro.vida -= damage;
        System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);
        
        } else if (eleccion == 2 && nBalas > 0 && arma > 0) {
            int damage = random.nextInt(0,this.nivel) - otro.defensa + this.arma;
            this.nBalas--;
        if (damage < 0) {
            damage = 0;
        }
        otro.vida -= damage;
        System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);
        

        } else if (eleccion == 3) {
            if (this.pociones > 0) {
                this.vida += 10;
                this.pociones--;
                System.out.println("Te has curado 10 puntos de vida");
            } else {
                System.out.println("No tienes pociones");
            }

        } else {
            System.out.println("Elige una opción válida");
        }

        
    }

    public void atacarA2(Enemigo otro , Enemigo otro2){

        System.out.println("Pulsa 1 para atacar a puños!");
        System.out.println("Pulsa 2 para atacar con tu arma");
        System.out.println("Pulsa 3 para usar una poción");
        
        Random random = new Random();
        Scanner scanner  = new Scanner(System.in);
        int eleccion = scanner.nextInt();

        if (eleccion == 1) {

                if (otro.vida > 0) {
                    System.out.println("Pulsa 1 para atacar a " + otro.nombre);
                }
                if (otro2.vida > 0) {
                    System.out.println("Pulsa 2 para atacar a " + otro2.nombre);
                }
                int eleccion2 = scanner.nextInt();
                if (eleccion2 == 1) {
                    int damage = random.nextInt(0,this.nivel) - otro.defensa;
                    if (damage < 0) {
                        damage = 0;
                    }
                    otro2.vida -= damage;
                    System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);

                } else if (eleccion2 == 2) {
                    int damage = random.nextInt(0,this.nivel) - otro2.defensa;
                    if (damage < 0) {
                        damage = 0;
                    }
                    otro2.vida -= damage;
                    System.out.println("Le has quitado " + damage + " puntos de vida a " + otro2.nombre);
                }
        } else if (eleccion == 2 && nBalas > 0 && arma > 0) {

            if (otro.vida > 0) {
                System.out.println("Pulsa 1 para atacar a " + otro.nombre);
            }
            if (otro2.vida > 0) {
                System.out.println("Pulsa 2 para atacar a " + otro2.nombre);
            }
            int eleccion2conArma = scanner.nextInt();

            if (eleccion2conArma == 1) {

            int damage = random.nextInt(0,this.nivel) - otro.defensa + this.arma;
            this.nBalas--;
            if (damage < 0) {
                damage = 0;
            }
            otro.vida -= damage;
            System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);

            }if (eleccion2conArma == 2) {

                int damage = random.nextInt(0,this.nivel) - otro2.defensa + this.arma;
                this.nBalas--;
                if (damage < 0) {
                    damage = 0;
                }
                otro2.vida -= damage;
                System.out.println("Le has quitado " + damage + " puntos de vida a " + otro2.nombre);
    
                
            }


        } else if (eleccion == 3) {
            if (this.pociones > 0) {
                this.vida += 10;
                this.pociones--;
                System.out.println("Te has curado 10 puntos de vida");
            } else {
                System.out.println("No tienes pociones");
            }

        } else {
            System.out.println("Elige una opción válida, pierdes tu turno =D ");
        }
        
        


    }

    public void atacarA3(Enemigo otro, Enemigo otro2, Enemigo otro3) {



        System.out.println("Pulsa 1 para atacar a puños!");
        System.out.println("Pulsa 2 para atacar con tu arma");
        System.out.println("Pulsa 3 para usar una poción");
        
        Random random = new Random();
        Scanner scanner  = new Scanner(System.in);
        int eleccion = scanner.nextInt();

        if (eleccion == 1) {

            if (otro.vida > 0) {
                System.out.println("Pulsa 1 para atacar a " + otro.nombre);
            }
            if (otro2.vida > 0) {
                System.out.println("Pulsa 2 para atacar a " + otro2.nombre);
            }
            if (otro3.vida > 0) {
                System.out.println("Pulsa 3 para atacar a " + otro3.nombre);
            }
                int eleccion2 = scanner.nextInt();
                if (eleccion2 == 1) {
                    int damage = random.nextInt(0,this.nivel) - otro.defensa;
                    if (damage < 0) {
                        damage = 0;
                    }
                    otro2.vida -= damage;
                    System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);

                } else if (eleccion2 == 2) {
                    int damage = random.nextInt(0,this.nivel) - otro2.defensa;
                    if (damage < 0) {
                        damage = 0;
                    }
                    otro2.vida -= damage;
                    System.out.println("Le has quitado " + damage + " puntos de vida a " + otro2.nombre);
                
                } else if (eleccion2 == 3) {
                    int damage = random.nextInt(0,this.nivel) - otro3.defensa;
                    if (damage < 0) {
                        damage = 0;
                    }
                    otro3.vida -= damage;
                    System.out.println("Le has quitado " + damage + " puntos de vida a " + otro3.nombre);
                }




        } else if (eleccion == 2 && nBalas > 0 && arma > 0) {

            if (otro.vida > 0) {
                System.out.println("Pulsa 1 para atacar a " + otro.nombre);
            }
            if (otro2.vida > 0) {
                System.out.println("Pulsa 2 para atacar a " + otro2.nombre);
            }
            if (otro3.vida > 0) {
                System.out.println("Pulsa 3 para atacar a " + otro3.nombre);
            }    
            int eleccion2conArma = scanner.nextInt();

            if (eleccion2conArma == 1) {

            int damage = random.nextInt(0,this.nivel) - otro.defensa + this.arma;
            this.nBalas--;
            if (damage < 0) {
                damage = 0;
            }
            otro.vida -= damage;
            System.out.println("Le has quitado " + damage + " puntos de vida a " + otro.nombre);

            }if (eleccion2conArma == 2) {

                int damage = random.nextInt(0,this.nivel) - otro2.defensa + this.arma;
                this.nBalas--;
                if (damage < 0) {
                    damage = 0;
                }
                otro2.vida -= damage;
                System.out.println("Le has quitado " + damage + " puntos de vida a " + otro2.nombre);
    
                
            }if (eleccion2conArma == 3) {

                int damage = random.nextInt(0,this.nivel) - otro3.defensa + this.arma;
                this.nBalas--;
                if (damage < 0) {
                    damage = 0;
                }
                otro3.vida -= damage;
                System.out.println("Le has quitado " + damage + " puntos de vida a " + otro3.nombre);
    
                
            }


        } else if (eleccion == 3) {
            if (this.pociones > 0) {
                this.vida += 10;
                this.pociones--;
                System.out.println("Te has curado 10 puntos de vida");
            } else {
                System.out.println("No tienes pociones");
            }

        } else {
            System.out.println("Elige una opción válida, pierdes tu turno =D ");
        }
        
        
    }


}

