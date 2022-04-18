package tree;

import java.util.TreeSet;

public class Prueba {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("alberto", 7);
        Alumno a2 = new Alumno("alberto", 6);
        Alumno a3 = new Alumno("alberto", 7);
        Alumno a4 = new Alumno("adrian", 7);
        Alumno a5 = new Alumno("alberto", 7);
        Alumno a6 = new Alumno("adrian", 8);
        TreeSet<Alumno> tre = new TreeSet<Alumno>(new ComparadorAlumnos());
        tre.add(a1);
        tre.add(a2);
        tre.add(a3);
        tre.add(a4);
        tre.add(a5);
        tre.add(a6);
        for (Alumno alumno : tre) {
            System.out.print(alumno +" ");
        }

    }

}
