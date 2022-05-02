package tree;

import java.util.HashMap;

public class PruebaMapa {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("alberto", 7);
        Alumno a2 = new Alumno("mateo", 8.5);
        Alumno a3 = new Alumno("julián", 7.2);
        Alumno a4 = new Alumno("adrian", 8);
        Alumno a5 = new Alumno("alberto", 7);
        Alumno a6 = new Alumno("adrian", 8);
        HashMap<Integer, Alumno> l = new HashMap<>();
        l.put(1, a1);
        l.put(2, a2);
        l.put(3, a3);
        l.put(4, a4);
        l.put(5, a5);
        l.put(6, a6);
        System.out.println(l.get(4));
        l.remove(4);
        System.out.println(l);

    }

}
