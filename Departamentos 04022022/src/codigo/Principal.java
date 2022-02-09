package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    private static final int TAMANO = 3;
    private static Departamento[] arrayDepartamentos = new Departamento[TAMANO];
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int departamentosOcupados = 0;
    private static int posicionInserciones = 0;//donde se insertara los objetos departamento

    public static void main(String[] args) {

        arrayDepartamentos[0] = new Departamento("Informatica","Don benito",7);
        arrayDepartamentos[1] = new Departamento("Administracion","Villanueva de la serena",2);
        //arrayDepartamentos[2] = new Departamento("Sistemas","Merida",1);
        departamentosOcupados = 2;
        posicionInserciones = 2;
/*
        try{
            cargaInteractiva();
        }
        catch (IOException | NumberFormatException ioe){
            System.out.println("Error en la carga del departamento.");
        }
*/
        Departamento prueba = new Departamento("admin","vva",1);
        insertarDepartamento(prueba);
        mostrarDepartamentos();



    }

    public static void cargaInteractiva() throws IOException,NumberFormatException {
        if (departamentosVacio()){
            for (int i = 0; i < TAMANO; i++) {
                System.out.println("Introduzca los datos del "+(i+1)+"º departamento");
                System.out.println("Introduzca el nombre del departamento:");
                String nombreDepartamento = br.readLine();
                System.out.println("Introduzca la ciudad donde se ubica el departamento:");
                String nombreCiudad = br.readLine();
                System.out.println("Introduzca el numero de departamento:");
                int numeroDepartamento = Integer.parseInt(br.readLine());
                arrayDepartamentos[i] = new Departamento(nombreDepartamento,nombreCiudad,numeroDepartamento);
                departamentosOcupados++;
                posicionInserciones++;//eliminar despues cuando se recalcule
            }
        }
    }

    public static void mostrarDepartamentos(){
        for (int i = 0; i < TAMANO; i++) {
            System.out.println(arrayDepartamentos[i].toString());
        }
    }

    //retorna true si el array de departamentos esta lleno
    public static boolean departamentosLlenos(){
        return departamentosOcupados == TAMANO;
    }

    //retorna true si el array de departamentos esta vacio
    public static boolean departamentosVacio(){
        return departamentosOcupados == 0;
    }

    public static int insertarDepartamento(Departamento a){
        if(departamentosLlenos()) return -1;
        else{
            arrayDepartamentos[posicionInserciones] = a;
            departamentosOcupados++;
            posicionInserciones++;//a cambiar luego
            return 1;
        }
    }

}
