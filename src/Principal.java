
import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Facultad de Ingeniería
 * Departamento de Ciencia de la Computación.
 * CC2016 - Algoritmos y estructuras de datos
 * Sección: 20
 *
 * Hoja de trabajo 1
 *
 * Entorno: El ejercicio tiene como objetivo, lograr que el usuario
 * interactue con la simulación de una radio.
 *
 *Estudiantes: Diego Alexander Hernández Silvestre | Carné: 21270
 *             Kristopher Javier Alvarado López | Carné: 21188
 * @version 1.0
 * @author Diego Alexander Hernández Silvestre
 * @author Kristopher Javier Alvarado López
 */
public class Principal {
    /**
     * Método que permite visualizar e interactuar con el usuario.
     * @param args Parámetro necesario para establecer comunicación con el usuario y el programa.
     */
    public static void main(String[] args){
        Controlador c = new Controlador();
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        boolean regresar;
        int seleccion;
        int numBoton;

        System.out.println("BIENVENIDO");
        while (!salir){
            regresar = false;
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Seleccione lo que desee realizar :D");
            System.out.println("[1]. Encender la radio.");
            System.out.println("[2]. Apagar la radio");
            System.out.println("[3]. Salir del sistema");
            seleccion = s.nextInt();
            if (!c.comprobarEncendida() && seleccion == 2){
                System.out.println("¡La radio se encuentra apagada!");
            } else if (!c.comprobarEncendida() && seleccion == 1){
                System.out.println("Iniciando sistema.....");
                System.out.println("¡Radio encendida!");
                c.encenderApagar();
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
            } else if (c.comprobarEncendida() && seleccion ==2) {
                System.out.println("Apagando el sistema.....");
                System.out.println("¡Radio apagada!");
                c.encenderApagar();
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
            } else if (c.comprobarEncendida() && seleccion == 1) {
                System.out.println("¡La radio se encuentra encendida!");
            }
            if (seleccion==3){
                salir = true;
                System.out.println("*********************************************");
                System.out.println("¡Gracias por utilizar la radio UVG!");
                System.out.println("Saliendo del sistema...");
                System.out.println("*********************************************");
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
            }
            if (seleccion==1 && c.comprobarEncendida()){
                while(!regresar){
                System.out.println("¿Que desea realizar?");
                System.out.println("[1]. Cambiar estación");
                System.out.println("[2]. Avanzar en el dial de la Emisora");
                System.out.println("[3]. Retroceder en el dial de la Emisora");
                System.out.println("[4]. Guardar una emisora");
                System.out.println("[5]. Seleccionar la emisora");
                System.out.println("[6]. Regresar ");
                seleccion = s.nextInt();
                switch(seleccion){
                    case 1:
                        System.out.println("*********************************************");
                        System.out.println(c.cambiarSenal(c.getTipoSenal()));
                        System.out.println("¡Gran eleccion!");
                        System.out.println("*********************************************");
                        System.out.println("");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("*********************************************");
                        System.out.println("Bssppp");
                        System.out.println("Cambiando de señal...");
                        c.subirEmisora();
                        System.out.println("Su señal ahora es: "+ c.getEmisoraActual());
                        System.out.println("*********************************************");
                        System.out.println("");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("*********************************************");
                        System.out.println("Bsppppp");
                        System.out.println("Cambiando de señal...");
                        c.bajarEmisora();
                        System.out.println("Su señal ahora es: "+ c.getEmisoraActual());
                        System.out.println("*********************************************");
                        System.out.println("");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("*********************************************");
                        System.out.println("La emisora actual: "+c.getEmisoraActual() + " se guardará");
                        System.out.println("¿Que número de botón desea guardarla?");
                        System.out.println("[1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11], [12]");
                        numBoton = s.nextInt();
                        if(numBoton>12||numBoton<1){
                            System.out.println("¡Ese botón no existe!");
                        }else{
                            System.out.println(c.guardarEmisoraActual(numBoton));
                            System.out.println("*********************************************");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                        }
                        break;
                    case 5:
                        System.out.println("*********************************************");
                        System.out.println("¿Que número de botón desea seleccionar?");
                        System.out.println("[1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11], [12]");
                        numBoton = s.nextInt();
                        System.out.println(c.seleccionarEmisoraGuardada(numBoton));
                        System.out.println("*********************************************");
                        System.out.println("");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        break;
                    case 6:
                        regresar = true;
                        System.out.println("Regresando...");
                        break;
                    default:
                        System.out.println("Ha digitado una accion incorrecta!");
                    }
                }
            }
        }
    }
}

