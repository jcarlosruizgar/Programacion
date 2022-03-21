package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    private static ArrayList departamentos = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        cargaAutomatica();
        try{
            cargaInteractiva();
        }
        catch (IOException ioe){
            System.out.println("Error con la introduccion de datos.");
        }
        mostrarDepartamentos();

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
