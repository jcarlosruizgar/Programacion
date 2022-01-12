package P11;

public class Vehiculo {

    protected int velocidad;

    public void acelerar(int kmh){
        velocidad += kmh;
    }

    public Vehiculo() {
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                '}';
    }
}
