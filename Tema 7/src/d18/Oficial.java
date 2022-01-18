package d18;

public class Oficial extends Operario{

    @Override
    public String toString() {
        return ("Oficial " + super.toString());
    }

    public Oficial(String nombre) {
        super(nombre);
    }
}
