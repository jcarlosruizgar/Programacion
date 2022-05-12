package codigo;

import java.io.Serializable;

public class Videojuego implements Serializable {

    private String nombre;
    private String genero;

    public Videojuego(String nombre, String fechaLanzamiento) {
        this.nombre = nombre;
        this.genero = fechaLanzamiento;
    }

    public Videojuego() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
