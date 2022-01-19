package EjAgregacion;

public class Piso {

    private int metrosCuadrados;

    public Piso(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
        System.out.println("Se ha creado un piso con " + metrosCuadrados + " metros cuadrados.");
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
