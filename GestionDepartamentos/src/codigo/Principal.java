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
        do {//bucle do while con la ejecucion del programa
            try {
                do {
                    System.out.println("Seleccione la operacion a realizar:\nMenu:");
                    System.out.println("1 - Mostrar departamento.");
                    System.out.println("2 - Insertar un departamento.");
                    System.out.println("3 - Borrar un departamento.");
                    System.out.println("4 - Modificar atributo de un departamento.");
                    System.out.println("5 - Salir.");
                    try {
                        opcionMenu = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Eso no es un numero.");
                    }
                }
                while (opcionMenu < 1 || opcionMenu > 5);
                switch (opcionMenu) {
                    case 1:
                        opcionMenu1();
                        break;
                    case 2:
                        insertarDepartamento();
                        break;
                    case 3:
                        opcionMenu3();
                        break;
                    case 4:
                        submenu();
                        break;
                    case 5://opcion salir
                        salir = true;
                        System.out.println("Cerrando el programa.");
                        break;
                }
                if (!salir) listarDepartamentos();
            } catch (IOException ioe) {
                System.out.println("Entrada de datos erronea.");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("No existe ese departamento.");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        while (!salir);//salida de la ejecucion del programa
    }

    //metodo para calcular la posicion a insertar
    public static void calcularInsercion() {
        boolean noEncontrado = false;
        int i = 0;
        do {
            if (listadoDepartamentos[i] == null) {
                posicionInserciones = i;
                noEncontrado = true;
            } else i++;
        }
        while (!noEncontrado && i < TAMANO);
        if (!noEncontrado) posicionInserciones = -1;
    }

    //metodo para convertir el numero de departemento en la posicion del array
    public static int localizarDepartamento(int numero) {
        int posLoc = -1;
        for (int i = 0; i < listadoDepartamentos.length; i++) {
            if (listadoDepartamentos[i] != null && listadoDepartamentos[i].getDept_no() == numero) {
                posLoc = i;
                i = listadoDepartamentos.length;
            }
        }
        return posLoc;
    }

    //metodo para mostrar un departamento
    public static void mostrarDepartamento(int numero) {
        if (localizarDepartamento(numero) == -1) System.out.println("Ese departamento no existe");
        else {
            System.out.println(listadoDepartamentos[localizarDepartamento(numero)]);
        }
    }

    //metodo con la primera opcion del menu modularizada
    public static void opcionMenu1() throws IOException {
        try {
            System.out.println("Introduzca el numero de departamento que quiere mostrar:");
            int dptoMostrar = Integer.parseInt(br.readLine());
            if (dptoMostrar == -1) System.out.println("Ese departamento no existe.");
            else {
                mostrarDepartamento(dptoMostrar);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
        }
    }

    //metodo con la tercera opcion del menu modularizada
    public static void opcionMenu3() throws IOException {
        listarDepartamentos();
        try {
            System.out.println("Introduzca el numero de departamento que quiere borrar:");
            borrarDepartamento(Integer.parseInt(br.readLine()));
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
        }
    }

    //metodo para insertar un departamento en el array
    public static void insertarDepartamento() throws IOException {
        listarDepartamentos();
        calcularInsercion();
        if (posOcupadas < 5) {
            try {
                System.out.println("Introduzca el numero de departamento:");
                int nDpto = Integer.parseInt(br.readLine());
                System.out.println("Introduzca el nombre del departamento:");
                String nomDpto = br.readLine();
                System.out.println("Introduzca donde se ubica el departamento:");
                String locDpto = br.readLine();
                listadoDepartamentos[posicionInserciones] = new Departamento(nDpto, nomDpto, locDpto);
                posOcupadas++;
            } catch (NumberFormatException nfe) {
                System.out.println("Eso no es un numero.");
            }
        } else {
            System.out.println("No se pueden introducir mas departamentos.");
        }
    }

    //metodo para borrar un departamento
    public static void borrarDepartamento(int numero) {
        if (localizarDepartamento(numero) == -1) System.out.println("No existe ese departamento.");
        else {
            listadoDepartamentos[localizarDepartamento(numero)] = null;
            posOcupadas--;
        }
    }

    //metodo con el submenu de modificaciones
    public static void submenu() throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException {
        listarDepartamentos();
        System.out.println("Introduzca el numero de departamento del que quiere realizar una modificacion:");
        try {
            posSub = localizarDepartamento(Integer.parseInt(br.readLine()));
            if (posSub == -1) System.out.println("No existe ese departamento.");
            else {
                do {
                    try {
                        System.out.println("¿Que atributo quiere modificar?");
                        System.out.println("1 - Para numero.\n2 - Para nombre.\n3 - Para localizacion.");
                        decSubmenu = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Eso no es un numero.");
                    }
                }
                while (decSubmenu < 1 || decSubmenu > 3);
                switch (decSubmenu) {
                    case 1:
                        System.out.println("Introduzca el nuevo numero de departamento:");
                        listadoDepartamentos[posSub].setDept_no(Integer.parseInt(br.readLine()));
                        break;
                    case 2:
                        System.out.println("Introduzca el nuevo nombre de departamento:");
                        listadoDepartamentos[posSub].setDnombre(br.readLine());
                        break;
                    case 3:
                        System.out.println("Introduzca la nueva localizacion del departamento:");
                        listadoDepartamentos[posSub].setLocalizacion(br.readLine());
                        break;
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
        }

    }

    //metodo para mostrar todos los departamentos
    public static void listarDepartamentos() {
        System.out.println("\nDepartamentos registrados.");
        int j = 0;
        for (int i = 0; i < TAMANO; i++) {
            if (listadoDepartamentos[i] != null) {
                System.out.println(listadoDepartamentos[i]);
                j++;
            }
        }
        System.out.println("Se han mostrado " + j + " de " + TAMANO + " posibles.\n");
    }

}
