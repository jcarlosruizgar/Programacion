package codigo;

public class Persona implements Cantable, Volable{

    String Nombre;

    @Override
    public void cantar() {
        System.out.println("Soy minero.");
    }

    @Override
    public void volar() {
        System.out.println("Volando voy.");
    }

    public Persona() {
    }

    public Persona(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
