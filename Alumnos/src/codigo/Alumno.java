package codigo;

import java.util.TreeSet;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private String apellidos;
    private int edad;
    private String poblacion;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad, String poblacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", poblacion='" + poblacion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        if(((nombre.compareToIgnoreCase(o.nombre) == 0) &&
                (apellidos.compareToIgnoreCase(o.apellidos) == 0) &&
                (poblacion.compareToIgnoreCase(o.poblacion) == 0) &&
                edad == o.edad)){
            return 0;
        }
        else return nombre.compareToIgnoreCase(o.nombre);
    }

}
