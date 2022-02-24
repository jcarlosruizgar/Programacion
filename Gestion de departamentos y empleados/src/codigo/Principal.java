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
    private static final int TAMANO = 2;//constante que determina el tamano del array de departamentos
    private static Departamento[] departamentos = new Departamento[TAMANO];
    private static int numeroDepartamentos = 0;//variable de control con el numero de departamentos ocupados
    private static int posicionInserciones = 0;//variable donde se hara la proxima insercion

    public static void main(String[] args) {
        cargaAutomaticaComposicion();
        //cargaAutomaticaAgregacion();
        //System.out.println(departamentos[0]);
        //System.out.println(departamentos[0].getEmpleados()[0]);
        do{
            try{
                System.out.println("Programa de gestion de departamentos y empleados, versión 1.0");
                System.out.println("Introduzca:\n1 - Para gestionar los departamentos.\n2 - Para gestionar los empleados.\n0 - Para salir.");
                switch(Integer.parseInt(br.readLine())){
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
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        while(!salir);
    }

    public static void menuDepartamentos() throws IOException {
        System.out.println("Menu de gestion de departamentos.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Mostrar un departamento.");
        System.out.println("2 - Insertar un departamento.");
        System.out.println("3 - Borrar un departamento.");
        System.out.println("4 - Modificar un departamento.");
        System.out.println("0 - Volver al menu anterior.");
        switch(Integer.parseInt(br.readLine())){
            case 1:
                mostrarDepartamentosEmpleados();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                modificarDepartamento();
                break;
            case 0:
                break;
        }
    }

    public static void modificarDepartamento() throws IOException{
        System.out.println("Introduzca el numero de departamento del que quiere realizar una modificacion:");
        int opcionModificacionDepartamento = Integer.parseInt(br.readLine());
        System.out.println("¿Que dato quiere modificar?");
        System.out.println("1 - Para numero.\n2 - Para nombre.\n3 - Para localizacion.");
        switch(Integer.parseInt(br.readLine())){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public static void menuEmpleados() throws IOException{
        System.out.println("Menu de gestion de empleados.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Insertar un empleado.");
        System.out.println("2 - Mostrar empleados.");
        System.out.println("3 - Modificar un empleado.");
        System.out.println("4 - Borrar un empleado.");
        System.out.println("5 - Carga automatica.");
        System.out.println("0 - Volver al menu anterior.");
        switch(Integer.parseInt(br.readLine())){
            case 1:
                break;
            case 2:
                break;
            case 3:
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

    public static void modificarEmpleado() throws IOException{
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
        switch(Integer.parseInt(br.readLine())){
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

    public static void cargaAutomaticaComposicion(){
        departamentos[0] = new Departamento(7,"Ventas","Madrid");//creo el primer departamento por composicion
        departamentos[1] = new Departamento(2,"Logistica","Barcelona");//creo el segundo departamento por composicion
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public static void cargaAutomaticaAgregacion(){
        int tamanoEmpleados = 5;//tamano de los array de empleados

        //creacion del array de empleados de ventas y 2 empleados
        Empleado[] empleadosVentas = new Empleado[tamanoEmpleados];
        empleadosVentas[0] = new Analista(20,"Luis",LocalDate.of(1980,4,10),2600,null);
        empleadosVentas[1] = new Director(10,"Maria",LocalDate.of(1980,4,10),3000,null,600);

        //creacion del array de empleados de logistica y 2 empleados
        Empleado[] empleadosLogistica = new Empleado[tamanoEmpleados];
        empleadosLogistica[0] = new Analista(29,"Luisa",LocalDate.of(1989,6,15),1900,null);
        empleadosLogistica[1] = new Director(3,"Mario",LocalDate.of(2012,10,2),2700,null,200);

        //creacion del primer departamento de ventas
        departamentos[0] = new Departamento(7,"Ventas","Madrid",empleadosVentas);

        //creacion del segundo departamento de logistica
        departamentos[1] = new Departamento(2,"Logistica","Barcelona",empleadosLogistica);

        //asignacion del departamento a los empleados del primer departamento, ventas
        departamentos[0].getEmpleados()[0].setDepartamentoEmpleado(departamentos[0]);
        departamentos[0].getEmpleados()[1].setDepartamentoEmpleado(departamentos[0]);

        //asignacion del departamento a los empleados del segundo departamento, logistica
        departamentos[1].getEmpleados()[0].setDepartamentoEmpleado(departamentos[1]);
        departamentos[1].getEmpleados()[1].setDepartamentoEmpleado(departamentos[1]);
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public static void mostrarDepartamentos(){
        for (int i = 0; i < TAMANO; i++) {
            if(departamentos[i]!=null) System.out.println(departamentos[i]);
        }
    }

    public static void mostrarDepartamentosEmpleados(){
        for (int i = 0; i < TAMANO; i++) {
            if(departamentos[i]!=null){
                System.out.println("El departamento de " + departamentos[i].getDnombre() +
                        " con numero de departamento " + departamentos[i].getDept_no() +
                        " esta ubicado en " + departamentos[i].getLocalizacion());
                //System.out.println(departamentos[i]);
                for (int j = 0; j < departamentos[i].getEmpleados().length; j++) {
                    if(departamentos[i]!=null && departamentos[i].getEmpleados()[j]!=null){
                        System.out.println("\t"+departamentos[i].getEmpleados()[j]);
                    }
                }
            }
            }
        System.out.println("Hay "+ numeroDepartamentos + " departamentos");
        if(numeroDepartamentos == TAMANO){
            System.out.println("La estructura esta llena.");
        }
        else{
            System.out.println("El proximo departamentos se insertara en la posicion " + (posicionInserciones+1));
        }
        }
    }


