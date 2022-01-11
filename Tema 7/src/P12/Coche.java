package P12;

public class Coche extends Vehiculo{

    public int ruedas = 4;
    public int gasolina;

    public void repostar(int litros){
        gasolina += litros;
    }

    public void acelerar(int kmh){
        super.acelerar(kmh);
        gasolina*=0.9;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", gasolina=" + gasolina +
                "} " + super.toString();
    }

    public Coche(int v, int g){
        super(v);
        gasolina = g;
    }

}
