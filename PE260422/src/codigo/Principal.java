package codigo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        /*
        ArrayList<Alumno> alumnosAL = new ArrayList<>();
        alumnosAL.add(new Alumno("Mariano","Gallardo",8.6));
        alumnosAL.add(new Alumno("Perico","Perez",7.2));
        alumnosAL.add(new Alumno("Maria","Parejo",9));
        System.out.println(alumnosAL);
        Iterator it = alumnosAL.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Alumno alumno:alumnosAL){
            System.out.println(alumno);
        }*/

        LinkedList<Alumno> alumnosLL = new LinkedList<>();
        alumnosLL.add(new Alumno("Mariano","Gallardo",8.6));
        alumnosLL.add(new Alumno("Perico","Perez",7.2));
        Alumno<String> a1 = new Alumno("Maria","Parejo",9.);
        alumnosLL.add(a1);
        /*
        Iterator it2 = alumnosLL.descendingIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        alumnosLL.remove(1);
        for (int i = 0; i < alumnosLL.size(); i++) {
            System.out.println(alumnosLL.get(i));
        }
        System.out.println(alumnosLL.size());
        System.out.println(alumnosLL.contains(a1));
        System.out.println(alumnosLL.remove(a1));
        for(Alumno alumno:alumnosLL){
            System.out.println(alumno);
        }*/

        ListIterator it3 = alumnosLL.listIterator(alumnosLL.size());
        while(it3.hasPrevious()){
            System.out.println(it3.previous());
        }

    }

}
