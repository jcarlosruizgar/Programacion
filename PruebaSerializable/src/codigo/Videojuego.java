package codigo;

import java.io.Serializable;
import java.time.LocalDate;

public class Videojuego implements Serializable {

    private String nombre;
    private LocalDate fechaLanzamiento;

    public Videojuego(String nombre, LocalDate fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
    }

    public Videojuego() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
