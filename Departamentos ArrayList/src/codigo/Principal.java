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
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static ArrayList departamentos = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        cargaAutomatica();
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

    public void menuDepartamentos(){

    }

    public void modificarDepartamentoInteractivo(){

    }

    public void modificarDepartamento(){

    }

    public void modificarNumeroDepartamento(int departamento, int nuevo_dept_no){

    }

    public void modificarNumeroDepartamenteInteractivo(int departamento){

    }

    public void modificarNombreDepartamento(int departamento, String nombre){

    }

    public void modificarNombreDepartamenteInteractivo(int departamento){

    }

    public void modificarLocalizacionDepartamento(int departamento, String localizacion){

    }

    public void modificarLocalizacionDepartamenteInteractivo(int departamento){

    }

    public void menuEmpleados(){

    }

    public void cargaAutomaticaConComposicion(){

    }

    public void cargaAutomaticaConAgregacion(){

    }

    public void mostrarDepartamentosEmpleados(){

    }

    public boolean departamentosLLeno(){
        return false;
    }

    public boolean departamentosVacio(){
        return false;
    }

    public int borrarDepartamento(int numero){
        return 0;
    }

    public void borrarDepartamentoInteractivo(){

    }

    public boolean empleadosVacio(Departamento d){
        return false;
    }

    public boolean empleadosLLeno(Departamento d){
        return false;
    }

    public void mostrarEmpleados(Departamento d){

    }

    public int insertarEmpleado(Empleado emp, Departamento dept){
        return 0;
    }

    public void insertarEmpleadoInteractivo(){

    }

    public int borrarEmpleado(int numeroEmpleado, Departamento dept){
        return 0;
    }

    public void borrarEmpleadoInteractivo(){

    }

    public void modificarEmpleadoInteractivo(){

    }

    public void modificarEmpleado(){

    }

    public void modificarNumeroEmpleadoInteractivo(){

    }

    public void modificarApellidoEmpleadoInteractivo(){

    }

    public void modificarFechaAltaEmpleadoInteractivo(){

    }

    public void modificarSalarioEmpleadoInteractivo(){

    }

    public void modificarComisionDirectorInteractivo(){

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
