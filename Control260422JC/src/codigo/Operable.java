package codigo;

public interface Operable <T> {

    public void mostrarArray(T[] a);

    public T[] ordenar(T[] a);

    public T obtenerElemento(T[] a,int posicionProhibida);

    public T[] revertir(T[] a);

    public T[] mezclaAleatoria(T[] a);

    public T[] intercambio(T[] a, int i1, int i2);

    public T minimo(T[] a);

    public T maximo(T[] a);

}
