# Damilon 5

Damilon 5 es un juego RPG espacial de "elige tu aventura" desarrollado en Java. Combina elementos de juegos de rol, toma de decisiones y narrativa interactiva en un universo de ciencia ficción.

## Características

- Narrativa interactiva estilo "elige tu aventura"
- Interfaz basada en texto con representaciones ASCII de escenas y personajes
- Sistema de combate por turnos
- Tienda para comprar y vender objetos
- Progresión del personaje con sistema de niveles y experiencia
- Múltiples locaciones para explorar, incluyendo un puerto espacial y tiendas
- Decisiones que afectan el desarrollo de la historia

## Sprites del juego

### Nave espacial 'Odisea'

```ascii
                          :..  ..:.:::::::=                     
                          &0QQQQQQQQQQQQQQQ                     
                   =      QQQ+*          QQ                     
                    0QQ00Q+  WW@@@@@@OOO ++QQ&OO                
                    QQQ+++   @@@@@@oOO++   QQ&OO                
                =+0QQQQ+==Q  @@@OOOOO+++ 0Q++&OO                
               &&&QQ+++ &&Q  OOO++++++++ 0Q++&oO                
               &&&QQQ++ &&QQQ           Q++++&oo                
           = &&0  +*+++   +    000000+  +++QQQ**                
           = &&Q        &&&0QQQ 000      ++QQQ+*                
            +   =+++ ++QQQQ  QQ+     QQQQo   +++                
            +             Q=+QQ   &0Q   QQQ++                   
                  oOOQOQ:  ++  =   &&&QQ+                       
                  OOO@@@oO   +++  &&&0+++                       
               OOO@@@@@@oo        &&&+  :                       
            ooo@@@@@@@@OOO     +   ++                           
            OOO@@@@@OOOO        ++                              
          OOM*oWOOooO             +                             
        oOOoooooOO++                                            
        ++===MM+                                                
          MM

### Líder de la Secta
  '     @    @                                               
     O        0                                             
        @@@@  =                                             
       @@@&@  +                                             
      @@@  @ @                                              
     @@@@@0                                                 
    @@@@@@@@O                                               
     @@@M@@@@                                               
   @ @@   W@W@@                                             
   @ @@  & M@@M@@ @@&                                       
     @@ .@ 0@@M@O                                           
    @@@  @.@@@MQ+            O@@@@                          
     @&  @@ @@ O    @@@@      @ W+                          
     o@  @:@@@ @    @ W@         @@@@      @@@              
         @&@@@ @       @@@        @ @@    @@+@M@@@          
      &0@:@@ @          @ @       @@M@@      @ @@@@@@       
   W.@& @@@& @&        @@ @      @@@ MM&        @@ @@@@     
      =@@@ @&@@       @@&0@W W@@@@M  @@@@        @@ @@-@    
     Q @@& &&@    @@@@    -M :@@@@@ @&@o    @@o*WW    @@    
    &.@@@ @W @    @@W @@&@@.&  @ &@ &-@     O  *M    M &    
   oW@&@M @        @.@@ @  W   0@   &@           @ W &      
   @  @@ @ @        o-   @  @@@@Q@  W @ @@@@@@  o W@  @@@@@@
MM@@W @@W@M&@  W@@     @W.   &*    @@W   + W    o.       M@

### El Cazador
   ¡     .@WWW@       @    .@@..         .-     W:           
      .WWOWWWWWW.  -    .@@@@&@@       W@@@.                
       oOooWOWQo       :@..W0&.&@                           
       oooooooo  Q&.   .&:0= 0= W                           
          ooo.        .M &.   Q+...        @                
     .           :  ..:00:.. :.00O...            .          
      @            .000ooOOooo.::0@@@:        ..W:.         
              -.  .Q0000000MMM@@@MM&&W          W.          
       .      .O  Q0o00ooM@QQ@@WW.:.:.   @:                 
                  o*..  :OO@@WOM-  +oo                      
       :O.    . 0-MM.   =:@:. :=   .-M=..       @           
     .WW@W    .o..@W=  :  M+++=.WW .WW@.O                   
                  @W*.=OMMo   =.o0.==W@ :.  :.              
             .*   @W   ===.-0+OWQ.. 0W@ -o..                
     ..        .@.&=o .-+: ===.. :M==Q@  oo00.   &@         
     W@.     ..+@& o  OMMo+  .*oMo  OO  ..oo00oM---         
   .M     .=---Q&-Q  .@@OO    OW0@ .   .o.  ooO0O00.*       
        -=====@&+o.   ..W      OW.      :...  :+*-:o0O      
       . ====&@&++. .:O*:        OO     .*o.==..    .*.     
      :++..+Q&&+0o   M0M         OMQM    *ooO+=++           
     ++++++@@&++0  .OWWO         WW&@    .oooO0+++          
     +++++@&W+++.  -@WQ.         MMWW  .+..oo.+++++.        
   .+++++@&+++++++  @WO          OOW@  .++++++++++++        
   .+++o+++*o+O*+++    o+      ++.   .oo+oO+**+o++++        
  +*O+OOOOOOOOOOOo@&O0            .O@@OOOOOOOOOOOOO++*      
      *******OOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*******
```
## Cómo jugar

1. Ejecuta el archivo `Main.java` para iniciar el juego
2. Elige entre iniciar una nueva partida o cargar una partida guardada
3. Lee la narrativa y toma decisiones que afectarán tu aventura
4. Participa en combates, compra en tiendas y explora el universo de Damilon 5

## Estructura del proyecto

- `Main.java`: Punto de entrada del juego, maneja el menú principal
- `Juego.java`: Controla el flujo principal del juego y la lógica de las pantallas
- `Pantalla.java`: Clase base para todas las pantallas del juego
- `PantallaTiendaDeKevin.java`: Ejemplo de una tienda en el juego
- `PantallaBatallaMatones.java`: Ejemplo de un encuentro de combate
- `conversorAscii.java`: Utilidad para convertir imágenes a representaciones ASCII

## Mecánicas principales

- **Sistema de combate por turnos**: Enfrenta a enemigos en batallas estratégicas.
- **Tiendas**: Compra objetos, armas y mejoras para tu personaje.
- **Toma de decisiones**: Tus elecciones afectan el desarrollo de la historia.
- **Progresión del personaje**: Mejora tus habilidades y estadísticas a medida que avanzas.

## Requisitos del sistema

- Java Runtime Environment (JRE) 8 o superior

## Instalación

1. Clona este repositorio o descarga los archivos del juego
2. Compila los archivos Java usando tu IDE preferido o desde la línea de comandos
3. Ejecuta la clase `Main` para iniciar el juego

## Contribución

Las contribuciones son bienvenidas. Por favor, abre un issue para discutir cambios mayores antes de hacer un pull request.

## Licencia

Este proyecto está licenciado bajo la GNU General Public License v3.0 

## Autor

@Dgmtnz
