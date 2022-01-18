package d18;

public class Operario extends Empleado {

    @Override
    public String toString() {
        return ("Operario " + super.toString());
    }

    public Operario(String nombre) {
        super(nombre);
    }
}
