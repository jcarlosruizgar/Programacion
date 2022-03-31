package codigo;

public abstract class ParametroAbstracto<T> {

    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
