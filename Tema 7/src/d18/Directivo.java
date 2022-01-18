package d18;

public class Directivo extends Empleado{

    @Override
    public String toString() {
        return ("Directivo " + super.toString());
    }

    public Directivo(String nombre) {
        super(nombre);
    }
}
