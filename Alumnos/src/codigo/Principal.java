package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static boolean salir = false;
    private static TreeSet<Alumno> aula1 = new TreeSet<Alumno>();
    //private static TreeSet<Alumno> aula2 = new TreeSet<Alumno>();
    //private static TreeSet<Alumno> aula3 = new TreeSet<Alumno>();
    //private static Aula aulaDos = new Aula();

    public static void main(String[] args) {
        /*
        Alumno a1 = new Alumno("pedro","perez",26,"badajoz");
        Alumno a2 = new Alumno("maria","garcia",36,"madrid");
        Alumno a3 = new Alumno("fernando","ruiz",22,"merida");
        Alumno a4 = new Alumno("luis","gallardo",19,"don benito");
        Alumno a5 = new Alumno("luis","xcvs",29,"zafra");
        Alumno a6 = new Alumno("jghf","dfghfgh",33,"caceres");
        Alumno a7 = new Alumno("dfgdf","fgfdhd",21,"plasencia");
        Alumno a8 = new Alumno("jhjgh","gfghgf",22,"barcelona");
        System.out.println(insertarAlumno(a1));
        System.out.println(insertarAlumno(a2));
        System.out.println(insertarAlumno(a3));
        System.out.println(insertarAlumno(a4));
        aula2.add(a5);
        aula2.add(a6);
        aula2.add(a7);
        aula2.add(a8);
        */
        //insertarAlumnos(aula1,aula2);
        //mostrarAlumnos();
        //mostrarAlumnosIt();
        //aulaDos.insertarAulumnos(aula1);
        //System.out.println(aulaDos);
        //clonarAula(aula2,aula3);
        /*for(Alumno alumno: aula3){
            System.out.println(alumno);
        }*/
        /*
        System.out.println(borrarAlumno(a1));
        System.out.println(borrarAlumno(a6));
        mostrarAlumnos();
        System.out.println(primerAlumno());
        System.out.println(ultimoAlumno());
        */
        do {
            try {
                switch (menu()) {
                    case 1:
                        insertarAlumno();
                        break;
                    case 2:
                        borrarAlumno();
                        break;
                    case 3:
                        mostrarAlumnos();
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Eso no es una opcion valida.");
                        break;
                }
            } catch (IOException ioe) {
                System.out.println("Error en la entrada de datos.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (!salir);
    }

    public static int insertarAlumnoOperativo(Alumno a) {
        if (aula1.add(a)) return 1;
        else return 0;
    }

    public static void insertarAlumno() throws IOException {
        int edad = 0;
        System.out.println("Introduzca el nombre del alumno:");
        String nombre = br.readLine();
        System.out.println("Introduzca el apellido del alumno:");
        String apellido = br.readLine();
        System.out.println("Introduzca la edad del alumno:");
        try {
            edad = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
        }
        System.out.println("Introduza la poblacion del alumno:");
        String poblacion = br.readLine();
        insertarAlumnoOperativo(new Alumno(nombre, apellido, edad, poblacion));
    }

    public static void mostrarAlumnos() {
        for (Alumno alumno : aula1) {
            System.out.println(alumno);
        }
    }

    public static void mostrarAlumnosIt() {
        Iterator it = aula1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void insertarAlumnos(TreeSet aulaOrigen, TreeSet aulaDestino) {
        aulaDestino.addAll(aulaOrigen);
    }

    public static void clonarAula(TreeSet aulaOrigen, TreeSet aulaDestino) {
        //aulaDestino = (TreeSet)aulaOrigen.clone();
        aulaDestino.clear();
        aulaDestino.addAll(aulaOrigen);
    }

    public static void borrarAlumno() throws IOException{
        int edad = 0;
        System.out.println("Introduzca el nombre de alumno a borrar:");
        String nombre = br.readLine();
        System.out.println("Introduzca el apellido del alumno a borrar:");
        String apellido = br.readLine();
        System.out.println("Introduza la edad del alumno a borrar:");
        try{
            edad = Integer.parseInt(br.readLine());
        }
        catch (NumberFormatException nfe){
            System.out.println("Eso no es un numero.");
        }
        System.out.println("Introduzca la poblacion del alumno a borrar:");
        String poblacion = br.readLine();
        borrarAlumnoOperativo(new Alumno(nombre,apellido,edad,poblacion));
    }

    public static int borrarAlumnoOperativo(Alumno a) {
        if (aula1.remove(a)) {
            return 1;
        } else return 0;
    }

    public static Alumno primerAlumno() {
        return aula1.first();
    }

    public static Alumno ultimoAlumno() {
        return aula1.last();
    }

    public static int menu() throws IOException{
        int opcion;
        System.out.println("Seleccione una operacion a realizar:");
        System.out.println("1- Insertar un alumno.");
        System.out.println("2- Borrar un alumno.");
        System.out.println("3- Mostrar los alumnos.");
        System.out.println("0- Salir.");
        try {
            return Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
            return -1;//opcion no contemplada
        }
    }

}
