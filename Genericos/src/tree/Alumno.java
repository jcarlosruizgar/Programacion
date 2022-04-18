package tree;

public class Alumno implements Comparable<Alumno> {
    protected String nombre;
    protected double nota;

    public int compareTo(Alumno o) {
        int comparacion = nombre.compareToIgnoreCase(o.nombre);
        if (comparacion == 0){
            return (int)(nota-o.nota);
        }
        else return comparacion;
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
