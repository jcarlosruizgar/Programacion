package hash;

import java.util.ArrayList;
import java.util.Iterator;
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
        LinkedHashSet<Alumno> l = new LinkedHashSet<>();

        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        l.add(a6);

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n");

        for(Alumno alumno:l){
            System.out.println(alumno);
        }

        System.out.println("\n");

        ArrayList<Alumno> ali = new ArrayList<>(l);
        System.out.println(ali);
    }

}
