package codigo;

import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Perico",6);
        Alumno a2 = new Alumno("Fran",7);
        Alumno a3 = new Alumno("Paco",8.2);
        Alumno a4 = new Alumno("Perica",5);
        Alumno a5 = new Alumno("Francisca",3);
        Alumno a6 = new Alumno("Paca",7);

        HashMap<Integer,Alumno> mapa = new HashMap<>();

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

    }

}
