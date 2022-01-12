package P11;

public class Tren extends Vehiculo {

    protected int plazas;

    public void ficharTicket(int pasajero){
        plazas += pasajero;
    }

    public void destino(){
        plazas = 0;
    }

    public Tren() {
    }

    public Tren(int plazas) {
        this.plazas = plazas;
    }

    public Tren(int velocidad, int plazas) {
        super(velocidad);
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
        return "Tren{" +
                "plazas=" + plazas +
                ", velocidad=" + velocidad +
                '}';
    }
}
