package P11;

public class Barco extends Vehiculo{

    protected int diasRestantes;

    public void inicioViaje(int dias){
        diasRestantes = dias;
    }

    public void diaTranscurrido(){
        diasRestantes--;
    }

    public Barco() {
    }

    public Barco(int duracionTravesia) {
        this.diasRestantes = duracionTravesia;
    }

    public Barco(int velocidad, int duracionTravesia) {
        super(velocidad);
        this.diasRestantes = duracionTravesia;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "duracionTravesia=" + diasRestantes +
                ", velocidad=" + velocidad +
                '}';
    }
}
