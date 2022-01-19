package EjComposicion;

public class Piso {

    private int metrosCuadrados;

    public Piso() {
        System.out.println("Se ha creado un Piso");
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
