package hash;

import java.util.LinkedHashSet;

public class Prueba {

    public static void main(String[] args) {


        Alumno a1 = new Alumno("alberto", 7);
        Alumno a2 = new Alumno("alberto", 6);
        Alumno a3 = new Alumno("alberto", 7);
        Alumno a4 = new Alumno("adrian", 7);
        Alumno a5 = new Alumno("alberto", 7);
        Alumno a6 = new Alumno("adrian", 8);
        /*
        HashSet<Alumno> l = new HashSet<Alumno>();

         */
        LinkedHashSet<Alumno> l = new LinkedHashSet<Alumno>();

        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        l.add(a6);
        for (Alumno alumno : l) {
            System.out.println(alumno);
        }






    }

}
