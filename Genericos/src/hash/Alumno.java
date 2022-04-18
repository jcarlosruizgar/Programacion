package hash;

public class Alumno {

    protected String nombre;
    protected double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public boolean equals(Object obj){
        if (obj instanceof Alumno){
            Alumno a = (Alumno) obj;
            return a.nombre.equals(nombre) && a.nota==nota;
        }
        else return false;
    }

    public int hashCode(){
        return nombre.hashCode()+(int)nota*1000;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

}
