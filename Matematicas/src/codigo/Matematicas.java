package codigo;

import java.util.ArrayList;

public class Matematicas<T extends Number> {

    private T numero;

    private ArrayList<T> lista = new ArrayList<>();

    public Matematicas() {
    }

    public Matematicas(T atributo) {
        this.numero = atributo;
    }

    public Matematicas(T numero, ArrayList<T> lista) {
        this.numero = numero;
        this.lista = lista;
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Matematicas{" +
                "numero=" + numero +
                ", lista=" + lista +
                '}';
    }

    public double reciproco(){
        return 1/numero.doubleValue();
        //return 1/(double)numero;
    }

    public double potencia(){
        return numero.doubleValue()*numero.doubleValue();
    }

    public double parteDecimal(){
        return numero.doubleValue()-numero.intValue();
    }

    public boolean existeNumero(){
        return lista.contains(numero);
    }
}
