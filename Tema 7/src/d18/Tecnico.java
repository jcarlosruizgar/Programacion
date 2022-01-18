package d18;

public class Tecnico extends Operario{

    @Override
    public String toString() {
        return ("Tecnico " + super.toString());
    }

    public Tecnico(String nombre) {
        super(nombre);
    }
}
