package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Principal {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static HashMap<Integer,Alumno> mapa = new HashMap<>();

    public static void main(String[] args) {

        /*
        Alumno a1 = new Alumno("Perico",6);
        Alumno a2 = new Alumno("Fran",7);
        Alumno a3 = new Alumno("Paco",8.2);
        Alumno a4 = new Alumno("Perica",5);
        Alumno a5 = new Alumno("Francisca",3);
        Alumno a6 = new Alumno("Paca",7);
        mapa.put(1,a1);
        mapa.put(2,a2);
        mapa.put(3,a3);
        mapa.put(4,a4);
        mapa.put(5,a5);
        mapa.put(6,a6);
        System.out.println(mapa.get(4));
        mapa.remove(4);
        System.out.println(mapa);
        System.out.println(mapa.get(3));
        mapa.remove(4);
        System.out.println(mapa);
        mapa.clear();
         */

    }

    public static void menu(){
        int opcion;
        System.out.println("Seleccione una operacion a realizar:");
        System.out.println("1- Insertar un alumno");
        System.out.println("2- Borrar un alumno");
        System.out.println("3- Mostrar los alumnos");
        try{
            opcion = Integer.parseInt(br.readLine());
        }
        catch (IOException ioe){
            System.out.println("Error en la entrada de datos.");
        }
    }

    public static void insertarAlumno(){
        String nombre;
        double nota;
        int clave;
        System.out.println("Introduzca el nombre del alumno:");
        try{
            nombre = br.readLine();
        }
        catch (IOException ioe){
            System.out.println("Error en la entrada de datos.");
        }
        System.out.println("Introduzca la nota del alumno:");
        try{
            nota = Double.parseDouble(br.readLine());
        }
        catch ()
    }

    public static void instertarAlumnoOperativo(String nombre,double nota,int clave){
        mapa.put(clave,new Alumno(nombre,nota));
    }

}
