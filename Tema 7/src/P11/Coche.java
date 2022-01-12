package P11;

public class Coche extends Automovil{

    Protected int puertas;

    public Coche() {
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public Coche(int ruedas, int combustible, int puertas) {
        super(ruedas, combustible);
        this.puertas = puertas;
    }

    public Coche(int velocidad, int ruedas, int combustible, int puertas) {
        super(velocidad, ruedas, combustible);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", puertas=" + puertas +
                ", velocidad=" + velocidad +
                '}';
    }
}
