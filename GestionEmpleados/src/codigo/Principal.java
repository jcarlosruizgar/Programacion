/*
 * @author Juan Carlos Ruiz Garcia
 * @date 19/12/21
 */

package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Principal {

    private static final int TAM = 10;//tamaño del array de empleados
    private static Empleado[] arrayEmpleados = new Empleado[TAM];//define el array de empleados de 10 posiciones
    private static int posicionInserciones = 0;//posicion del array en la que se hara la proxima insercion, -1 si lleno
    private static int numeroElementos = 0;//cantidad de empleados en el array
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean salir = false;//variable bandera salir del programa
        int repetirPrograma;//variable para modificar la variable bandera
        System.out.println("Aplicación de gestión de empleados versión 1.0");

            do{
                try {
                switch(menu()){
                    case 1:
                        cargaInteractiva();
                        break;
                    case 2:
                        mostrarEmpleados();
                        break;
                    case 3:
                        menuModificaciones();
                        break;
                    case 4:
                        borrarEmpleado(menuBorrado());
                        break;
                    case 5:
                        cargaAutomatica();
                        break;
                    case 0:
                        salir = true;
                        break;
                }
                if(!salir){
                    do{
                        System.out.println("¿Quiere realizar otra función?");
                        System.out.println("1 - Si.");
                        System.out.println("0 - No.");
                        repetirPrograma = Integer.parseInt(br.readLine());
                        if(repetirPrograma == 0) salir = true;
                    }
                    while(repetirPrograma < 0 || repetirPrograma > 1);
                }
                }catch (DateTimeParseException dtpe){
                    System.out.println("Error en la introduccion de la fecha.");
                }
                catch (NullPointerException npe){
                    System.out.println("No existe datos en esa posicion.");
                }
                catch (ArrayIndexOutOfBoundsException aioobe){
                    System.out.println("No existe es posicion.");
                }
                catch(NumberFormatException nfe){
                    System.out.println("Eso no es un numero.");
                }
                catch(IOException ioe){
                    System.out.println("Fallo en la introduccion de datos.");
                }
                catch (Exception e) {
                    System.out.println("Eso no es un valor valido.");
                }
            }
            while(!salir);

    }

    //muestra un listado con los empleados
    static void mostrarEmpleados() {
        int i;
        int j = 0;
        for (i = 0; i < TAM; i++) {
            if (arrayEmpleados[i] != null) {
                System.out.println(arrayEmpleados[i]);
                j++;
            }
        }
        System.out.println("Tenemos en total: " + j + " empleados.");
    }

    //carga de forma automatica 10 empleados en el array
    static void cargaAutomatica() {
        arrayEmpleados[0] = new Empleado(3, "Gómez", "Programadora", LocalDate.of(2018, 10, 02), 3001, 533, 1);
        arrayEmpleados[1] = new Empleado(5, "Pérez", "Analista", LocalDate.of(2017, 07, 03), 14502, 202, 2);
        arrayEmpleados[2] = new Empleado(9, "García", "Cerero", LocalDate.of(2014, 06, 02), 303, 575, 3);
        arrayEmpleados[3] = new Empleado(1, "Bolaños", "Tester", LocalDate.of(2015, 07, 07), 4504, 1120, 4);
        arrayEmpleados[4] = new Empleado(2, "Hereje", "Vago", LocalDate.of(2016, 11, 02), 3005, 550, 5);
        arrayEmpleados[5] = new Empleado(12, "Ruiz", "Hacker", LocalDate.of(2014, 02, 03), 506, 1000, 6);
        arrayEmpleados[6] = new Empleado(21, "Flores", "Programador", LocalDate.of(2015, 01, 02), 3407, 510, 7);
        arrayEmpleados[7] = new Empleado(7, "Terrón", "Java developer", LocalDate.of(2016, 05, 03), 4508, 1050, 8);
        arrayEmpleados[8] = new Empleado(19, "Tena", "Bbdd", LocalDate.of(2010, 12, 02), 1039, 500, 9);
        arrayEmpleados[9] = new Empleado(20, "Godoy", "Bigdata", LocalDate.of(2016, 07, 03), 510, 1000, 10);
        posicionInserciones = -1;
        numeroElementos = 10;
    }

    //carga interactiva de un empleado en el array
    static void cargaInteractiva() throws IOException, NumberFormatException, DateTimeParseException {
        if(posicionInserciones == -1) System.out.println("No pueden insertarse más empleados, borre o modifique uno existente.");
        else{
            System.out.println("Introduza el número de empleado:");
            int numeroEmpleado = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el apellido del empleado:");
            String apellido = br.readLine();
            System.out.println("Introduzca el puesto de trabajo del empleado:");
            String oficio = br.readLine();
            System.out.println("Introduzca la fecha de alta del empleado (formato aaaa-mm-dd):");
            LocalDate fechaAlta = LocalDate.parse(br.readLine());
            System.out.println("Introduzca el salario del empleado:");
            int salario = Integer.parseInt(br.readLine());
            System.out.println("Introduzca la comisión del empleado:");
            int comision = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el departamento en el que trabaja el empleado:");
            int numeroDepartamento = Integer.parseInt(br.readLine());
            arrayEmpleados[posicionInserciones] = new Empleado(numeroEmpleado, apellido, oficio, fechaAlta, salario, comision, numeroDepartamento);
            calcularInsercion();
            numeroElementos++;
        }
    }

    //devuelve el empleado con el mayor salario
    static int mayorSalario() throws NullPointerException {
        double max = 0;
        int posicionMax = 0;
        for (int i = 0; i < TAM; i++) {
            if (arrayEmpleados[i].getSalario() > max) {
                max = arrayEmpleados[i].getSalario();
                posicionMax = i;
            }
        }
        return posicionMax;
    }

    //devuelve el empleado con la mayor antiguedad
    static int mayorAntiguedad() throws NullPointerException {
        LocalDate añoMenor = LocalDate.of(9999, 12, 31);
        int fechaMenor = 0;
        for (int i = 0; i < TAM; i++) {
            if (arrayEmpleados[i].getFechaAlta().compareTo(añoMenor) < 0) {
                añoMenor = arrayEmpleados[i].getFechaAlta();
                fechaMenor = i;
            }
        }
        return fechaMenor;
    }

    //metodo para mostrar por pantalla el apellido de los empleados que cobren mas de 1000€
    static void salarioMas1000() {
        for (int i = 0; i < TAM; i++) {
            if (arrayEmpleados[i].getSalario() > 1000) {
                System.out.println(arrayEmpleados[i].getApellido());
            }
        }
    }

    //modifica el numero de empleado
    static int modificarNumeroEmpleado(int posicion, int nuevoValor) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setNumeroEmpleado(nuevoValor);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica el apellido del empleado
    static int modificarApellido(int posicion, String apellido) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setApellido(apellido);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica el oficio del empleado
    static int modificarOficio(int posicion, String oficio) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setOficio(oficio);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica la fecha de alta del empleado
    static int modificarFechaAlta(int posicion, String fechaAlta) {
        boolean modificado = false;
        try {
            LocalDate fechaA = LocalDate.parse(fechaAlta);
            arrayEmpleados[posicion].setFechaAlta(fechaA);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        } catch (DateTimeParseException dtpe) {
            System.out.println("Fecha en formato no valido. " + dtpe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica el salario del empleado
    static int modificarSalario(int posicion, double salario) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setSalario(salario);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica la comision del empleado
    static int modificarComision(int posicion, double comision) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setComision(comision);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;
    }

    //modifica el numero de departamento del empleado
    static int modificarNumeroDepartamento(int posicion, int numeroDepartamento) {
        boolean modificado = false;
        try {
            arrayEmpleados[posicion].setNumeroDepartamento(numeroDepartamento);
            modificado = true;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        if (modificado) return 1;
        else return 0;

    }

    //borra al empleado
    static void borrarEmpleado(int numeroEmpleado) {
        int posicion = existeEmpleado(numeroEmpleado);
        if (posicion == -1) {
            System.out.println("No existe el empleado nº " + numeroEmpleado + ".");
        }
        else{
            try {
                arrayEmpleados[posicion] = null;
                System.out.println("El empleado nº " + numeroEmpleado + ", ha sido borrado correctamente.");
                calcularInsercion();
                numeroElementos--;
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Ese nº de empleado no existe. " + aioobe);
            }
        }
    }

    //comprueba si existe el empleado
    static int existeEmpleado(int numeroEmpleado) {
        boolean encontrado = false;
        int i = 0;
        do {
            if (arrayEmpleados[i] != null && arrayEmpleados[i].getNumeroEmpleado() == numeroEmpleado) {
                encontrado = true;
            } else i++;
        }
        while (!encontrado && i < TAM);
        if (encontrado) return i;
        else return -1;
    }

    //menu principal
    static int menu() throws IOException {
        int funcionMenu;
        do {
            System.out.println("Puede realizar las siguientes funciones:");
            System.out.println("1 - Insertar nuevos empleados.");
            System.out.println("2 - Mostrar empleados registrados.");
            System.out.println("3 - Modificar datos de los empleados.");
            System.out.println("4 - Borrar empleado.");
            System.out.println("5 - Carga automática.");
            System.out.println("0 - Salir del programa.");
            System.out.println("Introduzca la función a realizar:");
            funcionMenu = Integer.parseInt(br.readLine());
            if (funcionMenu < 0 || funcionMenu > 5) System.out.println("Eso no es una opción valida.");//mensaje si la opcion elegida es erronea
        }
        while (funcionMenu < 0 || funcionMenu > 5);//control error operacion erronea
        return funcionMenu;
    }

    //menu para modificar datos de un empledo
    static void menuModificaciones() throws IOException {
        boolean salirMenuModificaciones = false;
        int salirPrincipal;
        int salirEmpleado;
        int numeroEmpleado;
        int posicionEmpleado;
        int funcionMenu;
        do{
            System.out.println("Seleccione que empleado desea modificar:");
            mostrarEmpleados();
            System.out.println("Introduzca el número del empleado a modificar:");
            numeroEmpleado = Integer.parseInt(br.readLine());
            posicionEmpleado = existeEmpleado(numeroEmpleado);
            if (posicionEmpleado == -1) System.out.println("Empleado no encontrado");
            else {
                do{
                    System.out.println("Puede realizar las siguientes funciones:");
                    System.out.println("1 - Modificar el número de empleado.");
                    System.out.println("2 - Modificar el apellido.");
                    System.out.println("3 - Modificar el oficio.");
                    System.out.println("4 - Modificar la fecha de alta.");
                    System.out.println("5 - Modificar el salario.");
                    System.out.println("6 - Modificar la comisión.");
                    System.out.println("7 - Modificar el número de departamento.");
                    System.out.println("0 - Elegir otro empleado.");
                    System.out.println("Introduzca la función a realizar:");
                    funcionMenu = Integer.parseInt(br.readLine());
                    switch (funcionMenu) {
                        case 1:
                            System.out.println("Introduzca el nuevo número de empleado:");
                            modificarNumeroEmpleado(posicionEmpleado, Integer.parseInt(br.readLine()));
                            break;
                        case 2:
                            System.out.println("Introduzca el nuevo apellido:");
                            modificarApellido(posicionEmpleado, br.readLine());
                            break;
                        case 3:
                            System.out.println("Introduzca el nuevo oficio:");
                            modificarOficio(posicionEmpleado, br.readLine());
                            break;
                        case 4:
                            System.out.println("Introduzca la nueva fecha de alta (formato aaaa-mm-dd):");
                            modificarFechaAlta(posicionEmpleado, br.readLine());
                            break;
                        case 5:
                            System.out.println("Introduzca el nuevo salario:");
                            modificarSalario(posicionEmpleado, Double.parseDouble(br.readLine()));
                            break;
                        case 6:
                            System.out.println("Introduzca la nueva comisión:");
                            modificarComision(posicionEmpleado, Double.parseDouble(br.readLine()));
                            break;
                        case 7:
                            System.out.println("Introduzca el nuevo número de departamento:");
                            modificarNumeroDepartamento(posicionEmpleado, Integer.parseInt(br.readLine()));
                            break;
                        case 0:
                            menuModificaciones();
                            break;
                    }
                    if(funcionMenu <0 || funcionMenu > 7) System.out.println("Esa no es una función valida.\nPruebe de nuevo.");
                    do{
                        System.out.println("¿Quiere modificar otro dato de este empleado?");
                        System.out.println("1 - Si.");
                        System.out.println("0 - No.");
                        salirEmpleado = Integer.parseInt(br.readLine());
                        if(salirEmpleado < 0 || salirEmpleado > 1) System.out.println("Eso no es una opción valida.");
                        if(salirEmpleado == 1) funcionMenu = 8;
                    }
                    while(salirEmpleado < 0 || salirEmpleado > 1);
                }
                while(funcionMenu < 0 || funcionMenu > 7);
            }
            do{
                System.out.println("Introduzca:");
                System.out.println("1 - Para elegir otro empleado.");
                System.out.println("0 - Para volver al menu principal.");
                salirPrincipal = Integer.parseInt(br.readLine());
                if(salirPrincipal < 0 || salirPrincipal > 1) System.out.println("Eso no es una opción valida.");
                if(salirPrincipal == 0) salirMenuModificaciones = true;
            }
            while(salirPrincipal < 0 || salirPrincipal > 1);
        }
        while(!salirMenuModificaciones);
    }

    //menu para borrar empleados
    static int menuBorrado() throws IOException{
        int numeroEmpleado;
        System.out.println("Seleccione que empleado desea borrar:");
        mostrarEmpleados();
        System.out.println("Introduzca el número del empleado a borrar:");
        return numeroEmpleado = Integer.parseInt(br.readLine());
    }

    //metodo para calcular la posicion a insertar
    static void calcularInsercion(){
        boolean noEncontrado = false;
        int i = 0;
        do{
            if(arrayEmpleados[i] == null){
                posicionInserciones = i;
                noEncontrado = true;
            }
            else i++;
        }
        while(!noEncontrado && i<TAM);
        if(!noEncontrado) posicionInserciones = -1;
    }
}