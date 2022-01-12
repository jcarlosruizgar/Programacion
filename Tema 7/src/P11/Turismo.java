package P11;

public class Turismo extends Coche{

    protected int caballos;

    public void trucar(int cv){
        caballos += cv;
        System.out.println("El coche ahora chuta con " + cv + " caballos extra.");
    }

    public Turismo() {
    }

    public Turismo(int caballos) {
        this.caballos = caballos;
    }

    public Turismo(int puertas, int caballos) {
        super(puertas);
        this.caballos = caballos;
    }

    public Turismo(int ruedas, int combustible, int puertas, int caballos) {
        super(ruedas, combustible, puertas);
        this.caballos = caballos;
    }

    public Turismo(int velocidad, int ruedas, int combustible, int puertas, int caballos) {
        super(velocidad, ruedas, combustible, puertas);
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Turismo{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", puertas=" + puertas +
                ", caballos=" + caballos +
                ", velocidad=" + velocidad +
                '}';
    }
}
