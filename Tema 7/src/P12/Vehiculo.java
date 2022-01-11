package P12;

public class Vehiculo {

    public int velocidad;
    public int ruedas;

    public void parar(){
        velocidad = 0;
    }

    public void acelerar(int kmh){
        velocidad += kmh;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                ", ruedas=" + ruedas +
                '}';
    }

    public Vehiculo(int v){
        velocidad = v;
    }

}
