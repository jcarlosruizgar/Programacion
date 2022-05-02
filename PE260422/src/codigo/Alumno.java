package codigo;

public class Alumno <T> implements Comparable<Alumno>{

    private String nombre;
    private String apellidos;
    private Double notaMedia;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, Double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaMedia = notaMedia;
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

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", notaMedia=" + notaMedia +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        int comparacion = nombre.compareToIgnoreCase(o.nombre)+apellidos.compareToIgnoreCase(o.apellidos);
        if(comparacion == 0){
            return 0;
        }
        return comparacion;
    }
}
