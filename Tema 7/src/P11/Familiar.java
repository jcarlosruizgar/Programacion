package P11;

public class Familiar extends Coche{

    protected int plazas;

    public void recogerNiños(){
        System.out.println("Has recogido a los niños.");
    }

    public Familiar() {
    }

    public Familiar(int plazas) {
        this.plazas = plazas;
    }

    public Familiar(int puertas, int plazas) {
        super(puertas);
        this.plazas = plazas;
    }

    public Familiar(int ruedas, int combustible, int puertas, int plazas) {
        super(ruedas, combustible, puertas);
        this.plazas = plazas;
    }

    public Familiar(int velocidad, int ruedas, int combustible, int puertas, int plazas) {
        super(velocidad, ruedas, combustible, puertas);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", puertas=" + puertas +
                ", plazas=" + plazas +
                ", velocidad=" + velocidad +
                '}';
    }
}
