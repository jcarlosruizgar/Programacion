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
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static ArrayList <Departamento> departamentos = new ArrayList<Departamento>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        //cargaAutomatica();
        cargaAutomaticaConAgregacion();
        /*
        try{
            cargaInteractiva();
        }
        catch (IOException ioe){
            System.out.println("Error con la introduccion de datos.");
        }
        */
        mostrarDepartamentos();
        //System.out.println(departamentos.contains(departamentos.get(0)));
    }

    public static void menuDepartamentos(){

    }

    public static void modificarDepartamentoInteractivo(){

    }

    public static void modificarDepartamento(){

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
        empleadosVentas.add(new Analista(7,"Perez", LocalDate.of(2017,9,7),1600,null));

        //creacion del departamento de ventas en el array list
        departamentos.add(new Departamento(6,"Ventas","Caceres",empleadosVentas));

        empleadosVentas.get(0).setDepartamentoEmpleado((Departamento) departamentos.get(0));
        empleadosVentas.get(1).setDepartamentoEmpleado((Departamento) departamentos.get(0));

        //creacion array list empleados del departamento de innovacion
        ArrayList <Empleado> empleadosInnovacion = new ArrayList<Empleado>();
        empleadosInnovacion.add(new Director(9,"Gallardo", LocalDate.of(2010,1,1),3800,null,1000));
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

    public static int borrarDepartamento(int numero){
        return 0;
    }

    public static void borrarDepartamentoInteractivo(){

    }

    public static boolean empleadosVacio(Departamento d){
        return false;
    }

    public static boolean empleadosLLeno(Departamento d){
        return false;
    }

    public static void mostrarEmpleados(Departamento d){

    }

    public static int insertarEmpleado(Empleado emp, Departamento dept){
        return 0;
    }

    public static void insertarEmpleadoInteractivo(){

    }

    public static int borrarEmpleado(int numeroEmpleado, Departamento dept){
        return 0;
    }

    public static void borrarEmpleadoInteractivo(){

    }

    public static void modificarEmpleadoInteractivo(){

    }

    public static void modificarEmpleado(){

    }

    public static void modificarNumeroEmpleadoInteractivo(){

    }

    public static void modificarApellidoEmpleadoInteractivo(){

    }

    public static void modificarFechaAltaEmpleadoInteractivo(){

    }

    public static void modificarSalarioEmpleadoInteractivo(){

    }

    public static void modificarComisionDirectorInteractivo(){

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
        Iterator it = departamentos.iterator();
        while (it.hasNext()){
            String s = it.next().toString();
            System.out.println(s);
        }
    }

}
