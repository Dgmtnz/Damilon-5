public class IntroduccionJuego {

    public static void mostrarIntroduccion(){
        String[] imagenesAscii = {

            "\n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                          :..  ..:.:::::::=                     \n"+
            "                          &0QQQQQQQQQQQQQQQ                     \n"+
            "                   =      QQQ+*          QQ                     \n"+
            "                    0QQ00Q+  WW@@@@@@OOO ++QQ&OO                \n"+
            "                    QQQ+++   @@@@@@oOO++   QQ&OO                \n"+
            "                =+0QQQQ+==Q  @@@OOOOO+++ 0Q++&OO                \n"+
            "               &&&QQ+++ &&Q  OOO++++++++ 0Q++&oO                \n"+
            "               &&&QQQ++ &&QQQ           Q++++&oo                \n"+
            "           = &&0  +*+++   +    000000+  +++QQQ**                \n"+
            "           = &&Q        &&&0QQQ 000      ++QQQ+*                \n"+
            "            +   =+++ ++QQQQ  QQ+     QQQQo   +++                \n"+
            "            +             Q=+QQ   &0Q   QQQ++                   \n"+
            "                  oOOQOQ:  ++  =   &&&QQ+                       \n"+
            "                  OOO@@@oO   +++  &&&0+++                       \n"+
            "               OOO@@@@@@oo        &&&+  :                       \n"+
            "            ooo@@@@@@@@OOO     +   ++                           \n"+
            "            OOO@@@@@OOOO        ++                              \n"+
            "          OOM*oWOOooO             +                             \n"+
            "        oOOoooooOO++                                            \n"+
            "        ++===MM+                                                \n"+
            "          MM                                                    \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n",


            
            "                                                                \n"+
            "                                                                \n"+
            "                                                                \n"+
            "         QM@             @&&&&WWWWW&@&@@&                       \n"+
            "         *QQWOQ      &&&&&W&&&&WWWWW&&&&@&@&&W         .+*00    \n"+
            "     :   o**M    &O&QMWMQWWWWWMMMMM@WW&@@&&&&&@&@      ==.:     \n"+
            "               &0Ooo0WWQMQQMQQMM&WW&@&&&&&&&&&&M@@@o            \n"+
            "             &==+M0QQQOQQQQQQWMMMMM@&WWWWW&W&M@@@Q&MM           \n"+
            "           0+++*+ooQQQQQQQQQ@MM&&QMMMMMMM*+++&@@@&MQQQW         \n"+
            "          o ===oooQQQ&WQQM@W&&Q0+ =* *  &@@@&Q0Q0oQ0QM0M        \n"+
            "         =    *MO0@&&@@Qo0Q000   ++.@@&Q&*QQ++*o00OQ00M00@      \n"+
            "        O  +**=oMO* ..: :W ..@@  .WQMooo=:o0QMQMQOO00oMoWQ      \n"+
            "       O*****Qooo   &WQWW +W:o:o+*+*+::= *00W0=**=O&M*0QoQW     \n"+
            "       +***o 0    o*   = W  = =. =oo:o+*0o0*O*=*o&WoO*=0QO0     \n"+
            "       +   +     +0   o: = O=o   *OO+== OO++o**O0=.+ooOO Q*&    \n"+
            "      =+  +         .:=+ =oO0oOo= =**= =**Q0QW&0=O0O 0*=oOo0    \n"+
            "      *            . :.:: + +* +o =+***oWW&WM.o*o*+o:**==+QM    \n"+
            "                 =:  *=::= : o= *0oOMW&W0O.   +* *o++= WM&0:    \n"+
            "           :..  :.. ..:= =**o*Q0MWQOO0O0O+:*: :: ::QoQW&0WQW    \n"+
            "        :.         ::=oo*oMQ00oo*=Oo=: ...= + =QQM&M&QQ00+=     \n"+
            " 0               ..+oo*oQ:=..+ ..    .: :: M00MMMO=* 0QoO**     \n"+
            "            . +:oQ++       . .       := o0MO*+*O**oQ+*oOo+      \n"+
            "         +*++++.  :        .  .::o0O00O*:O:==ooO0== =: Oo       \n"+
            "      M    *   :   *    o  .=OO==   .:.:.:+O0QOoo :=O*+=        \n"+
            "            *      .  .*o::. .:.  ...= =oO=o *.:0+ . .          \n"+
            "                       *         . :.  .  O++=O+o       QMW&    \n"+
            "                 =                 .   == *= = : :     :=OQMM   \n"+
            "                                  ..: : =:     +          =o0   \n"+
            "                      =+.: .. ::  .. :.. =++             ==     \n"+
            "                             *ooooo*o*                          \n"+
            "                                                                \n",
            
            
            "+            =@            o     :@@O   .            \n"+
            "           -      .@@@0@@                    @            @0*Q  \n"+
            "     :@@@@@      .@0Q.  M            :*           @.       W    \n"+
            "     QM*o *       @   :+         .WMW                :  +       \n"+
            "     :  .W                  .@@0&O@               .@.@:     :o  \n"+
            "                            @@OO-.@Q  .     @@Q@@@@@  &         \n"+
            "  &      *@@0    Q               :        @@@OOO0o @         =  \n"+
            "                    .:@                  @@@*OO.  =*0    .@&M-  \n"+
            "                  .&Q&                   @@Q*    .=&      o     \n"+
            "     Q@Q   @@@@Oo@@0                     :&** . ..M             \n"+
            "          @@@OO+  Q:+                        0MQ                \n"+
            "          @@O  *  @    .           :+             .           @0\n"+
            "            o:. +*         :      M  =         ::         @Mo   \n"+
            "                         :&                @@@M@M         :+-   \n"+
            ":                 ::@@@@@- :     .        @M0O @              . \n"+
            "                 =O@0Oo W W    Q=         -o. o     .@+         \n"+
            "  @              @&OO.= 0                                       \n"+
            "       &          0:=  *                                        \n"+
            "    @&@ :    @                   OW       :            -       W\n"+
            "  @@&OM  . &            M      W0     @          +           @@ \n"+
            " :@oO o  O     *                    :     .            @@@o0+@  \n"+
            "  -:o.M -: : =*  :  :. -:-*  .. -o= .W   .-o=    : :-=@@**-  :o \n"+
            "=..+-*&W@+=..Q*O :--: =oO*-=+ .:Qo..-:+=. 0- . =+*O.* @Qo    M::\n"+
            "&QQ&@O. WWO0QMQMW@W&QM-@00O@OMMQ00&&&@00W&WWM+&&&MM0Q@@0= .oWMQO\n"+
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"+
            "&0WW@@W&@&W@WM&WWWW&@@&@&&W&WW@W  @@&0@@@@@WWWW@@W@WWW@W0:WWWM@W\n"+
            "WM-:@*QM0M-=0QMo=&O:@W@MQQ+o0@@WQ @&Q--WQ=*MMMQ@@oo  :=O0Q@@@o0&\n"+
            "&Q0Q@o&@&@- Oo-  Oo0@MO: O0*::Q00-M=O+OoOM* ::&&0.    0+0OOOo. &\n"+
            "@MOQ=.+=*.  :OO.  o@=O.   0:   +  :   @@0Oo 0Q@@&&0o:.@0O.*: 0M*\n"+
            ".     &MO-  @@M@WOOOoo*o*+oo0O@0oOo  0 .:   &*Qo     W =..: .@*M\n"+
            "Oo .+  : *@0Oo+ +  @OO=*-O+*:O:.    @@0*. .o. . . .  -@O*O&&Q0o+\n"+
            "@@.M  O00OM .@@@*..  o0OMQoo    Q00+:M-   &  QO@QO.  O:= ...    \n",
            
            
            "           ...:      .. :  *  W:  =   - *     =.=    o :      : \n"+
            "         .   -: . 0 +   -. .o: O:o-M  ..:    .   :  .  O   o&&  \n"+
            "  ..      ..   =  = M O   &0: &* MoM+0* :  O +  o O @ o -Q0*@@ .\n"+
            "  .    :-     O.  * :@*-&+@W@@@@@@@@@MM*+=.0  Q  .M .W@@@Q==@o  \n"+
            "        . +-o -o +-*0@O@@@@@&&@&@&@&@Q@@@@Wo : O:&W&+O0o@-=*= * \n"+
            "        * .  : OQo-MQ@@&M*M0O0W0W&@&@@@@@@@@oOMo@: Q-=M0WQ -: . \n"+
            "        o  M +:+0@@@@W*oo+*MO0o*oO&MQQQW0&@@@@Q@W&@=@*@+* :  .  \n"+
            "  .      - + -O*@@M-O: .-:-::  =-0=*0MO0MW@O@@@ .@@= Q  ::. =: .\n"+
            " .:   *:   -Q 0M&+               . =-  +OM*WW0&@oQ.&&=  @+ . -  \n"+
            " :   o  = .*+-00O            @ @@ @    +:*-:0:oMM=o&O*:.  .     \n"+
            "  -   O   &-Mo0-.                        @@Q&&o@=@    *. -   =  \n"+
            "    @@@&@@@0 W.@@   @@@  @@@@@ @@@@  .@&@@&@@@ @@@0 @@-@@@@@0 . \n"+
            " =- @@o  &@@ +@&@@  &@@@@@@@@@ @@@@  @@      @@@@@@ @@@@@@@ :* .\n"+
            "=   @@  0 @@ @@ .@@ &@ @@ @@@@ @@@@  @@      @@&@ @@@@:-=  @@   \n"+
            "    @@@@@@@&O@@@@@@ &@  @ @@@@ @@@@0O0@@@@@@@@ @@=O@@@:@@@@@&   \n"+
            " .  :  . =W. - =                         -*      *  .- = :=   = \n"+
            " :   +  W.=*&* @        .&&&O&                  +-+ oW .. o  -  \n"+
            "     -  - &--&@   =  =&&&+=                    W&=.&= .=.: :. : \n"+
            "  =M.   &O  00QM W*Q:@-@                     W0oO&  *- :O.:   : \n"+
            " .:0  M&@&  .MOMW&WW 0                 0   @@@ O*-.  .   @      \n"+
            " O: @M@W@&M&M@ Q& .W*W@&@Q         O . .&M@& -+ ..M   - =@.    .\n"+
            "  &=-& OM&0-@M*+ *: 0Q -@+*@@W@@@&W&O@@+*W0= +=+0   +=- :       \n"+
            "*0@0@@=@  -.  .:=  *   *+  o 0=0M&:W 0-M-.Q 0  :O     . :  +  : \n"+
            "=  .  -   :     o- .+ &+* o* & +*  Q+ :. =0= :  O   &  -.:      \n"+
            "  =            - :  &&0&0:  - M- +Q ---   +   : *  +     -@     \n"+
            "  .        .   .    M - + : .: +O.0  *   .*     - .    . :-    =\n"+
            "             -     . .==- o :. 0 :=   .      : ..   -           \n"+
            "       .@     .:-       .         =  - :  :.   - .    :         \n"+
            "   W                      .. --.  .- - .& :. .:          .      \n"
        };

        String[] textosIntroductorios = {
            
            "Te encuentras al mando de la nave espacial 'Odisea', perdida en los confines del universo.",
            "Un planeta desconocido aparece en el horizonte, ¿será habitable o un peligro para la tripulación?",
            "Un campo de asteroides bloquea tu camino, necesitarás habilidad y precisión para navegar a través de él.",
            "         Bienvenido a DAMILON-5, disfruta de tu aventura"
        };

        for (int i = 0; i < imagenesAscii.length; i++) {
            System.out.println(imagenesAscii[i]);
            System.out.println(textosIntroductorios[i]);
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa de 7 segundos
            limpiarPantalla();
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 148; i++) {
            System.out.println();
        }
    }
}
