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

public class Principal {

    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        do{
            try{
                System.out.println("Programa de gestion de departamentos y empleados, versión 1.0");
                System.out.println("Introduzca:\n1 - Para gestionar los departamentos.\n2 - Para gestionar los empleados.\n3 - Carga automatica.\n0 - Para salir.");
                switch(Integer.parseInt(br.readLine())){
                    case 1:
                        menuDepartamentos();
                        break;
                    case 2:
                        menuEmpleados();
                        break;
                    case 3:
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

}
