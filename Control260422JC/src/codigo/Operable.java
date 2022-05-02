package codigo;

public interface Operable <T> {

    public <T> void mostrarArray(T[] a);

    public <T> T[] ordenar(T[] a);

    public <T> T obtenerElemento(T[] a,int posicionProhibida);

    public <T> T[] revertir(T[] a);

    public <T> T[] mezclaAleatoria(T[] a);

    public <T> T[] intercambio(T[] a, int i1, int i2);

    public <T extends Comparable<T>> T minimo(T[] a);

    public <T extends Comparable<T>> T maximo(T[] a);

}
