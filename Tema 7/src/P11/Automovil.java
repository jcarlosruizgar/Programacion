package P11;

public class Automovil extends Vehiculo {

    protected int ruedas;
    protected int combustible;

    public void repostar(int litros){
        combustible += litros;
    }

    public Automovil() {
    }

    public Automovil(int ruedas, int combustible) {
        this.ruedas = ruedas;
        this.combustible = combustible;
    }

    public Automovil(int velocidad, int ruedas, int combustible) {
        super(velocidad);
        this.ruedas = ruedas;
        this.combustible = combustible;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", velocidad=" + velocidad +
                '}';
    }
}
