package codigo;
/**
 * @author Juan Carlos Ruiz Garcia
 * @version 1
 * @date 22/02/2022
 * @description programa gestion de departamentos y de empleados
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Principal {

    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int TAMANO = 5;//constante que determina el tamano del array de departamentos
    private static Departamento[] departamentos = new Departamento[TAMANO];
    private static int numeroDepartamentos = 0;//variable de control con el numero de departamentos ocupados
    private static int posicionInserciones = 0;//variable donde se hara la proxima insercion

    public static void main(String[] args) {
        //cargaAutomaticaComposicion();
        cargaAutomaticaAgregacion();
        System.out.println("Programa de gestion de departamentos y empleados, versión 1.0");
        do {
            try {
                System.out.println("Introduzca:\n1 - Para gestionar los departamentos.\n2 - Para gestionar los empleados.\n0 - Para salir.");
                switch (Integer.parseInt(br.readLine())) {
                    case 1:
                        menuDepartamentos();
                        break;
                    case 2:
                        menuEmpleados();
                        break;
                    case 0:
                        salir = true;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (!salir);
    }

    public static void menuDepartamentos() throws IOException {
        System.out.println("Menu de gestion de departamentos.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Mostrar un departamento.");
        System.out.println("2 - Insertar un departamento.");
        System.out.println("3 - Borrar un departamento.");
        System.out.println("4 - Modificar un departamento.");
        System.out.println("0 - Volver al menu anterior.");
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                mostrarDepartamentos();
                break;
            case 2:
                mostrarDepartamentos();
                insertarDepartamentoSinEmpleadosInteractivo();
                break;
            case 3:
                mostrarDepartamentos();
                borrarDepartamentoInteractivo();
                break;
            case 4:
                mostrarDepartamentos();
                modificarDepartamentoInteractivo();
                break;
            case 0:
                break;
        }
    }

    public static void modificarDepartamentoInteractivo() throws IOException {
        int[] datos = new int[2];
        if (departamentosVacios()) {
            System.out.println("No hay ningun departamento registrado.");
        } else {
            System.out.println("Introduzca el numero de departamento del que quiere realizar una modificacion:");
            datos[0] = existeDepartamento(Integer.parseInt(br.readLine()));
            if (datos[0] == -1) {
                System.out.println("Ese departamento no existe.");
            } else {
                System.out.println("¿Que dato quiere modificar?");
                System.out.println("1 - Para numero.\n2 - Para nombre.\n3 - Para localizacion.");
                datos[1] = Integer.parseInt(br.readLine());
                modificarDepartamento(datos);
            }
        }
    }

    public static void modificarDepartamento(int[] datos) throws IOException {
        switch (datos[1]) {
            case 1:
                modificarNumeroDepartamenteInteractivo(datos[0]);
                break;
            case 2:
                modificarNombreDepartamenteInteractivo(datos[0]);
                break;
            case 3:
                modificarLocalizacionDepartamenteInteractivo(datos[0]);
                break;
        }
    }

    public static void modificarNumeroDepartamento(int departamento, int nuevo_dept_no) {
        departamentos[departamento].setDept_no(nuevo_dept_no);
    }

    public static void modificarNumeroDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca el nuevo numero de departamento");
        try {
            modificarNumeroDepartamento(departamento, Integer.parseInt(br.readLine()));
        } catch (NumberFormatException nfe) {
            System.out.println("Ese no es un numero de departamento valido.");
        }
    }

    public static void modificarNombreDepartamento(int departamento, String nombre) {
        departamentos[departamento].setDnombre(nombre);
    }

    public static void modificarNombreDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca el nuevo nombre del departamento");
        modificarNombreDepartamento(departamento, br.readLine());
    }

    public static void modificarLocalizacionDepartamento(int departamento, String localizacion) {
        departamentos[departamento].setLocalizacion(localizacion);
    }

    public static void modificarLocalizacionDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca la nueva localizacion del departamento");
        modificarLocalizacionDepartamento(departamento, br.readLine());
    }

    public static void menuEmpleados() throws IOException {
        System.out.println("Menu de gestion de empleados.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Insertar un empleado.");
        System.out.println("2 - Mostrar empleados.");
        System.out.println("3 - Modificar un empleado.");
        System.out.println("4 - Borrar un empleado.");
        System.out.println("5 - Carga automatica.");
        System.out.println("0 - Volver al menu anterior.");
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                mostrarDepartamentosEmpleados();
                insertarEmpleadoInteractivo();
                break;
            case 2:
                mostrarDepartamentosEmpleados();
                break;
            case 3:
                mostrarDepartamentosEmpleados();
                modificarEmpleado();
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
        }
    }

    public static void modificarEmpleado() throws IOException {
        System.out.println("Introduzca el numero de empleado del que quiere realizar una modificacion:");
        int opcionModificacionEmpleado = Integer.parseInt(br.readLine());
        System.out.println("¿Que dato quiere modificar?");
        System.out.println("1 - Para numero de empleado.");
        System.out.println("2 - Para apellido.");
        System.out.println("3 - Para oficio.");
        System.out.println("4 - Para fecha de alta.");
        System.out.println("5 - Para salario.");
        System.out.println("6 - Para comision.");
        System.out.println("7 - Para departamento.");
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }

    public static void cargaAutomaticaComposicion() {
        departamentos[0] = new Departamento(7, "Ventas", "Madrid");//creo el primer departamento por composicion
        departamentos[1] = new Departamento(2, "Logistica", "Barcelona");//creo el segundo departamento por composicion
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public static void cargaAutomaticaAgregacion() {
        int tamanoEmpleados = 5;//tamano de los array de empleados

        //creacion del array de empleados de ventas y 2 empleados
        Empleado[] empleadosVentas = new Empleado[tamanoEmpleados];
        empleadosVentas[0] = new Analista(20, "Luis", LocalDate.of(1980, 4, 10), 2600, null);
        empleadosVentas[1] = new Director(10, "Maria", LocalDate.of(1980, 4, 10), 3000, null, 600);

        //creacion del array de empleados de logistica y 2 empleados
        Empleado[] empleadosLogistica = new Empleado[tamanoEmpleados];
        empleadosLogistica[0] = new Analista(29, "Luisa", LocalDate.of(1989, 6, 15), 1900, null);
        empleadosLogistica[1] = new Director(3, "Mario", LocalDate.of(2012, 10, 2), 2700, null, 200);

        //creacion del primer departamento de ventas
        departamentos[0] = new Departamento(7, "Ventas", "Madrid", empleadosVentas);

        //creacion del segundo departamento de logistica
        departamentos[1] = new Departamento(2, "Logistica", "Barcelona", empleadosLogistica);

        //asignacion del departamento a los empleados del primer departamento, ventas
        departamentos[0].getEmpleados()[0].setDepartamentoEmpleado(departamentos[0]);
        departamentos[0].getEmpleados()[1].setDepartamentoEmpleado(departamentos[0]);

        //asignacion del departamento a los empleados del segundo departamento, logistica
        departamentos[1].getEmpleados()[0].setDepartamentoEmpleado(departamentos[1]);
        departamentos[1].getEmpleados()[1].setDepartamentoEmpleado(departamentos[1]);
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public static void mostrarDepartamentos() {
        if (departamentosVacios()) {//si no hay datos, no muestra departamentos
            System.out.println("No hay ningun departamento que mostrar.");
        } else {//si los hay, muestra los departamentos
            for (int i = 0; i < TAMANO; i++) {
                if (departamentos[i] != null) System.out.println(departamentos[i]);
            }
        }
    }

    public static void mostrarDepartamentosEmpleados() {
        if (departamentosVacios()) {//si no hay datos, no muestra nada
            System.out.println("No hay ningun dato que mostrar.");
        } else {//si los hay, ejecuta el metodo
            for (int i = 0; i < TAMANO; i++) {//bucle que recorre los departamentos
                if (departamentos[i] != null) {
                    System.out.println("\nEl departamento de " + departamentos[i].getDnombre() +
                            " con numero de departamento " + departamentos[i].getDept_no() +
                            " esta ubicado en " + departamentos[i].getLocalizacion());
                    for (int j = 0; j < departamentos[i].getEmpleados().length; j++) {//bucle que recorre los empleados
                        if (departamentos[i] != null && departamentos[i].getEmpleados()[j] != null) {
                            System.out.println("\tEl empleado " + departamentos[i].getEmpleados()[j].getApellido() +
                                    " con numero de empleado " + departamentos[i].getEmpleados()[j].getNumeroEmpleado() +
                                    " se dio de alta el dia " + departamentos[i].getEmpleados()[j].getFechaAlta() +
                                    " percibe un salario de " + departamentos[i].getEmpleados()[j].getSalario());
                        }
                    }
                }
            }
            System.out.println("\nHay " + numeroDepartamentos + " departamentos registrados en el sistema.");
            if (numeroDepartamentos == TAMANO) {
                System.out.println("\nLa estructura esta llena.");
            } else {
                System.out.println("\nEl proximo departamento se insertara en la posicion " + (posicionInserciones + 1) + ".");
            }
        }
    }

    //departamentos llenos
    public static boolean departamentosLlenos() {
        return numeroDepartamentos == TAMANO;
    }

    //departamentos vacios
    public static boolean departamentosVacios() {
        return numeroDepartamentos == 0;
    }

    //metodo para insertar un departamento sin empleados, retorna -1 si no se ha podido insertar o la posicion en la que se ha insertado y recibe por argumentos los 3 atributos de los departamentos
    public static void insertarDepartamentoSinEmpleadosInteractivo() throws IOException {
        if (departamentosLlenos()) {
            System.out.println("No se pueden insertar mas departamentos.");
        } else {
            try {
                System.out.println("Introduzca el numero de departamento:");
                int nDpto = Integer.parseInt(br.readLine());
                System.out.println("Introduzca el nombre del departamento:");
                String nomDpto = br.readLine();
                System.out.println("Introduzca donde se ubica el departamento:");
                String locDpto = br.readLine();
                insertarDepartamentoSinEmpleados(nDpto, nomDpto, locDpto);
            } catch (NumberFormatException nfe) {
                System.out.println("Lo que ha introducido como numero de departamento, no es un numero.");
            }
        }
    }

    public static void insertarDepartamentoSinEmpleados(int nDpto, String nomDpto, String locDpto) {
        departamentos[buscarHueco()] = new Departamento(nDpto, nomDpto, locDpto);
        numeroDepartamentos++;
    }

    //modificarlo a que retorne un int, -1 si no encontrado o numero encontrado
    public static int buscarHueco() {
        boolean noEncontrado = false;
        int i = 0;
        do {
            if (departamentos[i] == null) {
                noEncontrado = true;
            } else i++;
        }
        while (!noEncontrado && i < TAMANO);
        if (noEncontrado) return i;
        else return -1;
    }

    //existe departamento, devuelve -1 si no existe o devuelve la posicion del array donde se encuentra dicho departamento
    public static int existeDepartamento(int numero) {
        boolean encontrado = false;
        int contador = 0;
        do {
            if (departamentos[contador] != null && departamentos[contador].getDept_no() == numero) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while (!encontrado && contador < TAMANO);
        if (encontrado) return contador;
        else return -1;
    }

    //borrar departamento recibe el numero de departamento a borrar, devuelve 1 si se ha borrado correctamente y 0 en caso contrario
    public static int borrarDepartamento(int numero) {
        int borrado = 1;//retorno de 1 si ha borrado correctamente
        if (departamentosVacios()) {
            borrado = 0;//no hay departamentos a borrar
        } else {
            if (existeDepartamento(numero) == -1) {
                borrado = -1;//no existe el departamento elegido
            } else if (existeDepartamento(numero) == -2) {
                borrado = -2;//no hay ningun departamento registrado
            } else {
                departamentos[existeDepartamento(numero)] = null;
                posicionInserciones = numero;
                numeroDepartamentos--;
            }
        }
        return borrado;
    }

    //interactura con el usuario para borrar un departamento.
    public static void borrarDepartamentoInteractivo() throws IOException {
        if (departamentosVacios()) {
            System.out.println("No hay ningun departamento registrado.");
        } else {
            System.out.println("Introduzca el numero de departamento que quiere borrar:");
            int departamentoBorrar = Integer.parseInt(br.readLine());
            switch (borrarDepartamento(departamentoBorrar)) {
                /**
                 * case 0:
                 *                     System.out.println("No hay ningun departamento registrado en el sistema.");
                 *                     break;
                 */
                case 1:
                    System.out.println("El departamento ha sido eliminado del sistema.");
                    break;
                case -1:
                    System.out.println("El departamento elegido no existe.");
                    break;
            }
        }
    }

    //devuelve -1 si no existe empleado, o la posicion del empleado buscado en un departamento
    public static int existeEmpleado(int num_dpto, int num_empl) {
        boolean encontrado = false;
        int contador = 0;
        int dptoBuscar = existeDepartamento(num_dpto);
        do {
            if (departamentos[dptoBuscar].getEmpleados()[contador] != null && departamentos[dptoBuscar].getEmpleados()[contador].getNumeroEmpleado() == num_empl) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while (!encontrado && contador < departamentos[dptoBuscar].getTAMANO());
        if (encontrado) return contador;
        else return -1;
    }

    public static boolean empleadosVacios(Departamento dept) {
        return dept.getNumeroEmpleados() == 0;
    }

    public static boolean empleadosLlenos(Departamento dept) {
        return dept.getNumeroEmpleados() == dept.getTAMANO();
    }

    public static void mostrarEmpleados(Departamento dept) {
        if (empleadosVacios(dept)) {
            System.out.println("No existen empleados registrados en el departamento " + dept.getDnombre());
        } else {
            for (int i = 0; i < dept.getEmpleados().length; i++) {//bucle que recorre los empleados
                if (dept.getEmpleados()[i] != null) {
                    System.out.println("\tEl empleado " + dept.getEmpleados()[i].getApellido() +
                            " con numero de empleado " + dept.getEmpleados()[i].getNumeroEmpleado() +
                            " se dio de alta el dia " + dept.getEmpleados()[i].getFechaAlta() +
                            " percibe un salario de " + dept.getEmpleados()[i].getSalario());
                }
            }
            System.out.println("Hay " + dept.getNumeroEmpleados() + " empleados en el departamento " + dept.getDnombre());
            if (dept.getNumeroEmpleados() == dept.getTAMANO()) {
                System.out.println("La estructura esta llena.");
            } else {
                System.out.println("El proximo empleado se insertara en la posicion " + (dept.getPosicionInserciones() + 1) + ".");
            }
        }
    }

    //metodo para insertar un empleado en un departamento, recibe un empleado y un departamento, 1 ok, 0 ya existe, -1 esta lleno
    public static int insertarEmpleado(Empleado emp, Departamento dept) {
        dept.insertarEmpleado(emp);
        return 1;
    }

    //metodo interactivo para insertar un empleado en un departamento
    public static void insertarEmpleadoInteractivo() throws IOException{
        System.out.println("Seleccione en que departamento quiere insertar un empleado.");
        int deptInsertar = Integer.parseInt(br.readLine());//lee el numero de departamento
        int posDeptInsertar = existeDepartamento(deptInsertar);//convierte el numero de departamento en la posicion del departamento
        if (posDeptInsertar == -1){//comrpueba que exista el departamento elegido
            System.out.println("El departamento elegido no existe.");
        }
        else{
            if (empleadosLlenos(departamentos[posDeptInsertar])){//comprueba que no este lleno el array de empleados del departamento
                System.out.println("No caben mas empleados en este departamento.");
            }
            else{
                Empleado emp;//objeto empleado
                System.out.println("Que quiere insertar:\n1 - Un analista.\n2 - Un Director.");
                int tipoEmpleado = Integer.parseInt(br.readLine());//tipo empleado
                System.out.println("Indique el numero del empleado:");
                int numEmp = Integer.parseInt(br.readLine());//numero de empleado
                if (existeEmpleado(departamentos[posDeptInsertar].getDept_no(), numEmp) != -1){//comprueba si ya existe ese empleado
                    System.out.println("Ese empleado ya existe en el departamento.");
                }
                else{
                    System.out.println("Indique el apellido del empleado:");
                    String apellidoEmp = br.readLine();//apellido de empleado
                    System.out.println("Indique la fecha de alta del empleado:\nFormato aaaa-mm-dd");
                    LocalDate fechaAltaEmp = LocalDate.parse(br.readLine());//fecha de alta de empleado
                    System.out.println("Indique el salario del empleado:");
                    double salarioEmp = Integer.parseInt(br.readLine());//salario de empleado
                    if(tipoEmpleado == 1){//si es analista, llama a su constructor
                        emp = new Analista(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos[posDeptInsertar]);
                    }
                    else{//si es director pide la comision y llama a su constructor
                        System.out.println("Indique la comision del empleado:");
                        double comisionEmp = Integer.parseInt(br.readLine());//comision de director
                        emp = new Director(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos[posDeptInsertar],comisionEmp);
                    }
                    if(insertarEmpleado(emp,departamentos[posDeptInsertar]) == 1){//llama a insertar empleado con el empleado y el departamento, si es 1 se ha insertado correctamente
                        System.out.println("Operacion realizada correctamente.");
                    }
                }
            }
        }
    }

}


