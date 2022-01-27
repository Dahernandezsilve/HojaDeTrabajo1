///PRUEBA CONEXIÓN
// DIEGO HERNÁNDEZ 21270 | JAVIER ALVARADO 21188 .


import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Controlador c = new Controlador();
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int seleccion;
        System.out.println("""
        RRRRRRRRRRRRRRRRR                  AAA               DDDDDDDDDDDDD        IIIIIIIIII     OOOOOOOOO          UUUUUUUU     UUUUUUUUVVVVVVVV           VVVVVVVV        GGGGGGGGGGGGG
        R::::::::::::::::R                A:::A              D::::::::::::DDD     I::::::::I   OO:::::::::OO        U::::::U     U::::::UV::::::V           V::::::V     GGG::::::::::::G
        R::::::RRRRRR:::::R              A:::::A             D:::::::::::::::DD   I::::::::I OO:::::::::::::OO      U::::::U     U::::::UV::::::V           V::::::V   GG:::::::::::::::G
        R:::::R     R:::::R             A:::::::A            DDD:::::DDDDD:::::D  II::::::IIO:::::::OOO:::::::O     UU:::::U     U:::::UUV::::::V           V::::::V  G:::::GGGGGGGG::::G
        R::::R     R:::::R             A:::::::::A             D:::::D    D:::::D   I::::I  O::::::O   O::::::O      U:::::U     U:::::U  V:::::V           V:::::V  G:::::G       GGGGGG
        R::::R     R:::::R            A:::::A:::::A            D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U   V:::::V         V:::::V  G:::::G
        R::::RRRRRR:::::R            A:::::A A:::::A           D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U    V:::::V       V:::::V   G:::::G
        R:::::::::::::RR            A:::::A   A:::::A          D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U     V:::::V     V:::::V    G:::::G    GGGGGGGGGG
        R::::RRRRRR:::::R          A:::::A     A:::::A         D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U      V:::::V   V:::::V     G:::::G    G::::::::G
        R::::R     R:::::R        A:::::AAAAAAAAA:::::A        D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U       V:::::V V:::::V      G:::::G    GGGGG::::G
        R::::R     R:::::R       A:::::::::::::::::::::A       D:::::D     D:::::D  I::::I  O:::::O     O:::::O      U:::::D     D:::::U        V:::::V:::::V       G:::::G        G::::G
        R::::R     R:::::R      A:::::AAAAAAAAAAAAA:::::A      D:::::D    D:::::D   I::::I  O::::::O   O::::::O      U::::::U   U::::::U         V:::::::::V         G:::::G       G::::G
        R:::::R     R:::::R    A:::::A             A:::::A   DDD:::::DDDDD:::::D  II::::::IIO:::::::OOO:::::::O      U:::::::UUU:::::::U          V:::::::V           G:::::GGGGGGGG::::G
        R::::::R     R:::::R  A:::::A               A:::::A  D:::::::::::::::DD   I::::::::I OO:::::::::::::OO        UU:::::::::::::UU            V:::::V             GG:::::::::::::::G
        R::::::R     R:::::R A:::::A                 A:::::A D::::::::::::DDD     I::::::::I   OO:::::::::OO            UU:::::::::UU               V:::V                GGG::::::GGG:::G
        RRRRRRRR     RRRRRRRAAAAAAA                   AAAAAAADDDDDDDDDDDDD        IIIIIIIIII     OOOOOOOOO                UUUUUUUUU                  VVV                    GGGGGG   GGGG""");

        while (!salir){
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Seleccione lo que desee realizar :D");
            System.out.println("[1]. Encender la radio.");
            System.out.println("[2]. Apagar la radio");
            seleccion = s.nextInt();
            if (!c.comprobarEncendida() && seleccion == 2){
                System.out.println("La radio se encuentra apagada!");
            } else if (!c.comprobarEncendida() && seleccion == 1){
                System.out.println("Iniciando sistema.....");
                System.out.println(".....");
                System.out.println(".....");
                System.out.println(".....");
                System.out.println(".....");
                System.out.println("¡Radio encendida!");
                c.encenderApagar();
            }
            while (c.comprobarEncendida()){
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("¿Que desea escuchar en este momento?");
                System.out.println("[1]. Radio AM");
                System.out.println("[2]. Radio FM");
                seleccion = s.nextInt();
                System.out.println(c.cambiarSenal(c.getTipoSenal()));
                System.out.println("Gran eleccion!");
                if (seleccion==1){
                    System.out.println("¿Que desea realizar?");
                    System.out.println("[1]. Radio AM");
                    System.out.println("[2]. Salir");
                    seleccion = s.nextInt();
                    if (seleccion ==2){
                        salir = true;
                    }
                }

            }


        }

    }
}
