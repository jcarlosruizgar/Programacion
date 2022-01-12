package P11;

public class Camion extends Automovil{

    protected final int TARA = 2000;
    protected int pesoTotal;

    public void cargarCamion(int kg){
        pesoTotal = TARA + kg;
    }

    public Camion() {
    }

    public Camion(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public Camion(int ruedas, int combustible, int pesoTotal) {
        super(ruedas, combustible);
        this.pesoTotal = pesoTotal;
    }

    public Camion(int velocidad, int ruedas, int combustible, int pesoTotal) {
        super(velocidad, ruedas, combustible);
        this.pesoTotal = pesoTotal;
    }

    public int getTARA() {
        return TARA;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", TARA=" + TARA +
                ", pesoTotal=" + pesoTotal +
                ", velocidad=" + velocidad +
                '}';
    }
}
