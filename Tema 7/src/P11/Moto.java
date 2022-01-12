package P11;

public class Moto extends Automovil{

    protected int cilindrada;

    public void caballito(){
        System.out.println("La moto hace un caballito.");
    }

    public Moto() {
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int ruedas, int combustible, int cilindrada) {
        super(ruedas, combustible);
        this.cilindrada = cilindrada;
    }

    public Moto(int velocidad, int ruedas, int combustible, int cilindrada) {
        super(velocidad, ruedas, combustible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", cilindrada=" + cilindrada +
                ", velocidad=" + velocidad +
                '}';
    }
}
