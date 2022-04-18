package tree;

import java.util.Comparator;

public class ComparadorAlumnos implements Comparator<Alumno> {

    public int compare(Alumno o1, Alumno o2) {
        int comparacion = o1.nombre.compareToIgnoreCase(o2.nombre);
        if (comparacion == 0) {
            return (int) (o1.nota - o2.nota);
        } else return comparacion;
    }


}
