package codigo;

import java.time.LocalDate;

public class Comentario {

    private String nombre;
    private String apellidos;
    private LocalDate fecha;
    private String comentario;

    public Comentario() {
    }

    public Comentario(String nombre, String apellidos, LocalDate fecha, String comentario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.comentario = comentario;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha=" + fecha +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
