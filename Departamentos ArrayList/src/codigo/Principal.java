package codigo;
/**
 * @author Juan Carlos Ruiz Garcia
 * @date 21/03/2022
 * @version 1
 * @description Aplicacion de Departamento y Empleados haciendo uso de ArrayList
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static ArrayList <Departamento> departamentos = new ArrayList<Departamento>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try{
            //cargaAutomatica();
            cargaAutomaticaConAgregacion();
            //mostrarDepartamentos();
            //insertarEmpleadoInteractivo();
            //insertarDepartamentoVacioInteractivo();
            mostrarDepartamentos();
            //borrarEmpleadoInteractivo();
            //borrarDepartamentoInteractivo();
            //mostrarDepartamentos();
            modificarEmpleadoInteractivo();
            mostrarDepartamentos();
        }
        catch (NumberFormatException nfe){
            System.out.println("Eso no es un numero.");
        }
        catch(DateTimeParseException dtpe){
            System.out.println("Fecha introducida no valida.");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void menuDepartamentos(){

    }

    public static void modificarDepartamentoInteractivo(){

    }

    public static void modificarDepartamentoOperativo(){

    }

    public static void modificarNumeroDepartamento(int departamento, int nuevo_dept_no){

    }

    public static void modificarNumeroDepartamenteInteractivo(int departamento){

    }

    public static void modificarNombreDepartamento(int departamento, String nombre){

    }

    public static void modificarNombreDepartamenteInteractivo(int departamento){

    }

    public static void modificarLocalizacionDepartamento(int departamento, String localizacion){

    }

    public static void modificarLocalizacionDepartamenteInteractivo(int departamento){

    }

    public static void menuEmpleados(){

    }

    public static void cargaAutomaticaConComposicion(){
        departamentos.add(new Departamento(6,"Ventas","Caceres"));
        departamentos.add(new Departamento(17,"Innovacion","Madrid"));
    }

    public static void cargaAutomaticaConAgregacion(){

        //creacion array list empleados del departamento de ventas
        ArrayList <Empleado> empleadosVentas = new ArrayList<Empleado>();
        empleadosVentas.add(new Director(20,"Sanchez", LocalDate.of(2020,10,1),2600,null,500));
        empleadosVentas.add(new Analista(9,"Perez", LocalDate.of(2017,9,7),1600,null));

        //creacion del departamento de ventas en el array list
        departamentos.add(new Departamento(6,"Ventas","Caceres",empleadosVentas));

        empleadosVentas.get(0).setDepartamentoEmpleado((Departamento) departamentos.get(0));
        empleadosVentas.get(1).setDepartamentoEmpleado((Departamento) departamentos.get(0));

        //creacion array list empleados del departamento de innovacion
        ArrayList <Empleado> empleadosInnovacion = new ArrayList<Empleado>();
        empleadosInnovacion.add(new Director(19,"Gallardo", LocalDate.of(2010,1,1),3800,null,1000));
        empleadosInnovacion.add(new Analista(38,"Galan", LocalDate.of(2012,12,20),2000,null));

        //creacion del departamento de innovacion en el array list
        departamentos.add(new Departamento(17,"Innovacion","Madrid",empleadosInnovacion));

        empleadosInnovacion.get(0).setDepartamentoEmpleado(departamentos.get(1));
        empleadosInnovacion.get(1).setDepartamentoEmpleado(departamentos.get(1));

    }

    public static void mostrarDepartamentosEmpleados(){

    }

    public static boolean departamentosLLeno(){
        return false;
    }

    public static boolean departamentosVacio(){
        return false;
    }

    public static int borrarDepartamentoOperativo(int numero){
        int posDeptBorrar = existeDepartamento(numero);
        if(posDeptBorrar == -1){
            return -1;
        }
        else{
            departamentos.remove(posDeptBorrar);
            return posDeptBorrar;
        }
    }

    public static void borrarDepartamentoInteractivo() throws IOException{
        System.out.println("Introduza que departamento quiere eliminar:");
        int deptBorrar = Integer.parseInt(br.readLine());
        if(borrarDepartamentoOperativo(deptBorrar) == -1){
            System.out.println("No existe el departamento elegido.");
        }
        else{
            System.out.println("El departamaneto ha sido elimidado correctamente.");
        }
    }

    public static boolean empleadosVacio(Departamento d){
        return false;
    }

    public static boolean empleadosLLeno(Departamento d){
        return false;
    }

    public static void mostrarEmpleados(Departamento d){

    }

    public static void insertarDepartamentoVacioInteractivo() throws IOException{
        System.out.println("Introduza el numero de departamento a insertar:");
        int numDept = Integer.parseInt(br.readLine());
        if (existeDepartamento(numDept) != -1){
            System.out.println("Ya existe un departamento con ese mismo numero.");
        }
        else{
            System.out.println("Introduza el nombre del departamento:");
            String nomDept = br.readLine();
            System.out.println("Introduza la localizacion del departamento:");
            String locDept = br.readLine();
            insertarDepartamentoVacioOperativo(numDept,nomDept,locDept);
            System.out.println("El departamento se ha insertado correctamente.");
        }
    }

    public static void insertarDepartamentoVacioOperativo(int dept_no,String dnombre,String localizacion){
        ArrayList<Empleado> emp = new ArrayList<Empleado>();
        departamentos.add(new Departamento(dept_no,dnombre,localizacion,emp));
    }

    //metodo para insertar empleado de forma interactiva
    public static void insertarEmpleadoInteractivo() throws IOException{
        System.out.println("Seleccione en que departamento quiere insertar un empleado:");
        int deptInsertar = Integer.parseInt(br.readLine());
        int posDeptInsertar = existeDepartamento(deptInsertar);//convierte el numero de departamento en la posicion del departamento
        if (posDeptInsertar == -1){//comprueba si existe el departamento elegido
            System.out.println("El departamento elegido no existe.");
        }
        else{
            Empleado emp;
            System.out.println("Indique el numero del empleado:");
            int numEmp = Integer.parseInt(br.readLine());//numero de empleado
            if(existeEmpleados(departamentos.get(posDeptInsertar),numEmp) != -1){//comprueba si ya existe ese empleado
                System.out.println("Ese empleado ya existe en el departamento.");
            }
            else{
                System.out.println("Que quiere intertar:\n1 - Un analista.\n2 - Un director.");
                int tipoEmpleado = Integer.parseInt(br.readLine());//tipo de empleado
                System.out.println("Indique el apellido del empelado:");
                String apellidoEmp = br.readLine();
                System.out.println("Indique la fecha de alta del empleado:\nFormato aaaa-mm-dd");
                LocalDate fechaAltaEmp = LocalDate.parse(br.readLine());
                System.out.println("Indique el salario del empleado:");
                double salarioEmp = Double.parseDouble(br.readLine());
                if (tipoEmpleado == 1){//si es analista llama a su constructor
                    emp = new Analista(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos.get(posDeptInsertar));
                }
                else{//si es un director pide la comision y llama a su constructor
                    System.out.println("Indique la comision del director:");
                    double comisionDir = Double.parseDouble(br.readLine());
                    emp = new Director(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos.get(posDeptInsertar),comisionDir);
                }
                insertarEmpleadoOperativo(emp,departamentos.get(posDeptInsertar));
            }
        }
    }

    public static void insertarEmpleadoOperativo(Empleado emp, Departamento dept){
        dept.getEmpleados().add(emp);
    }

    public static int existeDepartamento(int num){
        boolean encontrado = false;
        int contador = 0;
        do{
            if (departamentos.size() != 0 && departamentos.get(contador).getDept_no() == num) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while(!encontrado && contador < departamentos.size());
        if (encontrado) return contador;
        else return -1;
    }

    public static int existeEmpleados(Departamento d, int num) {
        boolean encontrado = false;
        int contador = 0;
        int dptoBuscar = existeDepartamento(d.getDept_no());
        do {
            if (departamentos.get(contador).getEmpleados().size() != 0 && departamentos.get(dptoBuscar).getEmpleados().get(contador).getNumeroEmpleado() == num ) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while (!encontrado && contador < departamentos.get(dptoBuscar).getEmpleados().size());
        if (encontrado) {
            return contador;
        } else return -1;
    }



    /**
     * borra un empleado en toda la compania
     * for each que recorre todos los departamentos, en su interior
     * otro for each que recorre todos los empleados de ese departamento
     * si encuentra un departamento con el numero de empleado indicado, lo eliminara
     */
    public static void borrarEmpleadoInteractivo() throws IOException{
        System.out.println("Indique el numero de empleado que quiere borrar:");
        int empBorrar = Integer.parseInt(br.readLine());
        borrarEmpleadoOperativo(empBorrar);
    }

    public static void borrarEmpleadoOperativo(int numeroEmpleado){
        for (Departamento departamento: departamentos) {
                departamento.getEmpleados().removeIf(i -> i.getNumeroEmpleado() == numeroEmpleado);
                /*
                for(int i = 0; i < departamento.getEmpleados().size();i++){
                    if (departamento.getEmpleados().get(i).getNumeroEmpleado() == numeroEmpleado){
                        departamento.getEmpleados().remove(i);
                    }
                }
                */
        }
    }

    /**
     * recibe, numero empelado, dato a cambia, nuevo dato
     * salida, no existe, errores de entrada de datos y si se ha borrado
     */
    public static void modificarEmpleadoInteractivo() throws IOException{
        System.out.println("Introduce el numero de empleado a modificar:");
        int numEmp = Integer.parseInt(br.readLine());
        int[] datos = {-1,-1,-1};//pos 0 para posicion departamento, pos 1 para posicion empleado y pos 2 para modificacion a realizar
        for(int i = 0; i < departamentos.size(); i++){//bucle para coger los datos del departamento y el empleado
            if(existeEmpleados(departamentos.get(i),numEmp) != -1){
                datos[0] = i;
                datos[1] = existeEmpleados(departamentos.get(i),numEmp);
            }
        }
        if(datos[1] == -1){
            System.out.println("El empleado buscado no existe.");
        }
        else{//si existe
            System.out.println("¿Que dato quiere modificar?");
            System.out.println("1 - Para numero del empleado.");
            System.out.println("2 - Para apellido del empleado.");
            System.out.println("3 - Para fecha de alta del empleado.");
            System.out.println("4 - Para salario del empleado.");
            if(departamentos.get(datos[0]).getEmpleados().get(datos[1]) instanceof Director){
                System.out.println("5 - Para comision del director.");
            }
            datos[2] = Integer.parseInt(br.readLine());
            modificarEmpleadoOperativo(datos);
        }
    }

    public static void modificarEmpleadoOperativo(int[] datos) throws IOException{
        switch (datos[2]){
            case 1:
                modificarNumeroEmpleadoInteractivo(datos);
                break;
            case 2:
                modificarApellidoEmpleadoInteractivo(datos);
                break;
            case 3:
                modificarFechaAltaEmpleadoInteractivo(datos);
                break;
            case 4:
                modificarSalarioEmpleadoInteractivo(datos);
                break;
            case 5:
                if(departamentos.get(datos[0]).getEmpleados().get(datos[1]) instanceof Director){
                    modificarComisionDirectorInteractivo(datos);
                }
                break;
            default:
                System.out.println("Eso no es una opcion valida.");
                break;
        }
    }

    public static void modificarNumeroEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca el nuevo numero del empleado:");
        int numeroEmpleado = Integer.parseInt(br.readLine());
        departamentos.get(datos[0]).getEmpleados().get(datos[1]).setNumeroEmpleado(numeroEmpleado);
    }

    public static void modificarApellidoEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca el nuevo apellido del empleado:");
        String apellidoEmpleado = br.readLine();
        departamentos.get(datos[0]).getEmpleados().get(datos[1]).setApellido(apellidoEmpleado);
    }

    public static void modificarFechaAltaEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca la nueva fecha de alta del empleado.\n(Formato aaaa-mm-dd)");
        LocalDate fechaAltaEmpleado = LocalDate.parse(br.readLine());
        departamentos.get(datos[0]).getEmpleados().get(datos[1]).setFechaAlta(fechaAltaEmpleado);
    }

    public static void modificarSalarioEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduza el nuevo salario del empleado.");
        double salarioEmpleado = Double.parseDouble(br.readLine());
        departamentos.get(datos[0]).getEmpleados().get(datos[1]).setSalario(salarioEmpleado);
    }

    public static void modificarComisionDirectorInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca la nueva comision del director:");
        double comisionDirector = Double.parseDouble(br.readLine());
        ((Director)departamentos.get(datos[0]).getEmpleados().get(datos[1])).setComision(comisionDirector);
    }

    public static void cargaAutomatica(){
        departamentos.add(new Departamento(20,"Ventas","Don benito"));
        departamentos.add(new Departamento(10,"Compras","Merida"));
        departamentos.add(new Departamento(7,"Innovacion","Madrid"));
    }

    public static void cargaInteractiva() throws IOException {//pueda cargar mas de 1
        boolean salirCarga = true;
        do {
            System.out.println("Para introducir un nuevo departamento:");
            System.out.println("Introduzca el numero del departamento:");
            int numero = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el nombre del departamento:");
            String nombre = br.readLine();
            System.out.println("Introduzca la ubicacion del departamento:");
            String localizacion = br.readLine();
            departamentos.add(new Departamento(numero,nombre,localizacion));
            System.out.println("¿Quiere introducir otro departamento?");
            System.out.println("1 - Si.\n2 - No.");
            int decisionRepetir = Integer.parseInt(br.readLine());
            if(decisionRepetir == 1){
                salirCarga = false;
            }
            else salirCarga = true;
        }
        while(!salirCarga);
    }

    public static void mostrarDepartamentos(){
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
            for (Empleado empleado:departamento.getEmpleados()){
                System.out.println("\t" + empleado.toString());
            }
            System.out.println();
        }
    }

}
