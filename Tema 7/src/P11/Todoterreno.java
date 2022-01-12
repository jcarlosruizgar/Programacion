package P11;

public class Todoterreno extends Coche{

    protected boolean antivuelcos;

    public Todoterreno() {
    }

    public Todoterreno(boolean antivuelcos) {
        this.antivuelcos = antivuelcos;
    }

    public Todoterreno(int puertas, boolean antivuelcos) {
        super(puertas);
        this.antivuelcos = antivuelcos;
    }

    public Todoterreno(int ruedas, int combustible, int puertas, boolean antivuelcos) {
        super(ruedas, combustible, puertas);
        this.antivuelcos = antivuelcos;
    }

    public Todoterreno(int velocidad, int ruedas, int combustible, int puertas, boolean antivuelcos) {
        super(velocidad, ruedas, combustible, puertas);
        this.antivuelcos = antivuelcos;
    }

    public boolean isAntivuelcos() {
        return antivuelcos;
    }

    public void setAntivuelcos(boolean antivuelcos) {
        this.antivuelcos = antivuelcos;
    }

    @Override
    public String toString() {
        return "Todoterreno{" +
                "ruedas=" + ruedas +
                ", combustible=" + combustible +
                ", puertas=" + puertas +
                ", antivuelcos=" + antivuelcos +
                ", velocidad=" + velocidad +
                '}';
    }
}
