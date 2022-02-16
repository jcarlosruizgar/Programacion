/**
 * @author Juan Carlos Ruiz Garcia
 * @version 1
 * @date 15/02/2022
 * @description programa gestion de departamentos
 */
package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    private final static int TAMANO = 5;//constante con el tamano del array
    private static Departamento[] listadoDepartamentos = new Departamento[TAMANO];
    private static int posOcupadas = 0;//contador de posiciones ocupadas del array
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int opcionMenu;//opcion tomada en el menu principal
    private static boolean salir = false;//variable bandera ejecucion del programa
    private static int decSubmenu;//opcion tomada en el submenu modificaciones
    private static int posSub;//posicion del array tomada en el submenu
    private static int posicionInserciones;//posicion donde se va a hacer la proxima insercion

    public static void main(String[] args) {

        System.out.println("Aplicacion de gestion de departamentos version 1.0");
        try{
            do{//bucle do while con la ejecucion del programa
                calcularInsercion();
                System.out.println("Seleccione la operacion a realizar:\nMenu:");
                System.out.println("1 - Mostrar departamento.");
                System.out.println("2 - Insertar un departamento.");
                System.out.println("3 - Borrar un departamento.");
                System.out.println("4 - Modificar atributo de un departamento.");
                System.out.println("5 - Salir.");
                opcionMenu = Integer.parseInt(br.readLine());
                switch(opcionMenu){
                    case 1:
                        opcionMenu1();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5://opcion salir
                        salir=true;
                        System.out.println("Saliendo del programa.");
                        break;
                }


            }
            while(!salir);//salida de la ejecucion del programa
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //metodo para calcular la posicion a insertar
    static void calcularInsercion(){
        boolean noEncontrado = false;
        int i = 0;
        do{
            if(listadoDepartamentos[i] == null){
                posicionInserciones = i;
                noEncontrado = true;
            }
            else i++;
        }
        while(!noEncontrado && i<TAMANO);
        if(!noEncontrado) posicionInserciones = -1;
    }

    //metodo para convertir el numero de departemento en la posicion del array
    public static int localizarDepartamento(int numero) {
        int posLoc = -1;
        for (int i = 0; i < listadoDepartamentos.length; i++) {
            if (listadoDepartamentos[i]!=null && listadoDepartamentos[i].getDept_no() == numero) {
                posLoc = i;
                i = listadoDepartamentos.length;
            }
        }
        return posLoc;
    }

    //metodo para mostrar un departamento
    static void mostrarDepartamento(int numero){
        if (localizarDepartamento(numero) == -1) System.out.println("Ese departamento no existe");
        else {
            System.out.println(listadoDepartamentos[localizarDepartamento(numero)]);
        }
    }

    static void opcionMenu1() throws IOException,NumberFormatException {
        System.out.println("Introduzca el numero de departamento que quiere mostrar:");
        int dptoMostrar = Integer.parseInt(br.readLine());
        if(dptoMostrar == -1) System.out.println("Ese departamento no existe.");
        else{
            mostrarDepartamento(dptoMostrar);
        }
    }


}
