package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Juan Carlos
 * @date 17/03/2022
 * @version 1
 * @description menu interactivo, añadir, borrar, modificar numeros
 */
public class MenuArrayList {

    private static boolean salir = false;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<Integer> numeros = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("Aplicacion operaciones Array List:");
        do{
            try{
                System.out.println("Introduzca:");
                System.out.println("1 - Para mostrar los numeros almacenados.");
                System.out.println("2 - Para añadir un numero.");
                System.out.println("3 - Para borrar un numero.");
                System.out.println("4 - Para modificar un numero.");
                System.out.println("0 - Para salir.");
                int seleccionMenu = Integer.parseInt(br.readLine());
                switch (seleccionMenu){
                    case 1:
                        mostrarNumeros();
                        break;
                    case 2:
                        anadirNumero();
                        break;
                    case 3:
                        borrarNumero();
                        break;
                    case 4:
                        modificarNumero();
                        break;
                    case 0:
                        salir = true;
                        break;
                }
            }
            catch (NumberFormatException nfe){
                System.out.println("Eso no es un numero.");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }while (!salir);
    }

    public static void mostrarNumeros(){
        System.out.println("Los numeros almacenados son:");
        for(Integer numero:numeros){
            System.out.println("\t" + numero);
        }
    }

    public static void anadirNumero() throws IOException {
        System.out.println("Introduzca el numero que quiere añadir:");
        numeros.add(Integer.parseInt(br.readLine()));
    }

    public static void borrarNumero() throws IOException {
        System.out.println("Introduzca el numero que quiere borrar:");
        numeros.remove(Integer.parseInt(br.readLine()));
    }

    public static void modificarNumero() throws IOException {
        System.out.println("introduzca el numero que quiere modificar:");
        int numeroBuscado = numeros.lastIndexOf(Integer.parseInt(br.readLine()));
        if (numeroBuscado == -1){
            System.out.println("El numero buscado no existe.");
        }
        else{
            System.out.println("Introduzca el nuevo numero:");
            numeros.set(numeroBuscado,Integer.parseInt(br.readLine()));
        }
    }

}
