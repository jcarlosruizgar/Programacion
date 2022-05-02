package codigo;

import java.util.Arrays;

public class Operaciones <T> implements Operable<T>{


    @Override
    public <T> void mostrarArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Override
    public <T> T[] ordenar(T[] a) {
        T lista[] = a;
        Arrays.sort(a);
        return a;
    }

    @Override
    public <T> T obtenerElemento(T[] a, int posicionProhibida) {
        int longitud = a.length;
        int aleatorio = -1;
        do{
            aleatorio = (int)Math.floor(Math.random())*longitud;
        }while(aleatorio == posicionProhibida);
        return a[aleatorio];
    }

    @Override
    public <T> T[] revertir(T[] a) {
        Object[] arrayRetorno = new Object[a.length];
        int j = 0;
        for (int i = a.length; i < 0; i--) {
            arrayRetorno[j] = a[i];
            j++;
        }
        return (T[]) arrayRetorno;
    }

    @Override
    public <T> T[] mezclaAleatoria(T[] a) {//TODO
        T[] arrayRetorno = a;
        for (int i = 0; i < a.length; i++) {
            a[(int)Math.floor(Math.random())*a.length] = a[i];
        }
        return arrayRetorno;
    }

    @Override
    public <T> T[] intercambio(T[] a, int i1, int i2) {
        if(a[i1] != null && a[i2] != null){
            T[] arrayRetorno = a;
            arrayRetorno[i1] = a[i2];
            arrayRetorno[i2] = a[i1];
            return arrayRetorno;
        }
        else{
            return null;
        }
    }

    @Override
    public <T extends Comparable> T minimo(T[] a) {
        int minimo = (int)a[0];
        T retorno = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(retorno.compareTo(a[i]) > 0){
                retorno = a[i];
            }
        }
        return retorno;
    }

    @Override
    public <T extends Comparable> T maximo(T[] a) {
        int maximo = (int)a[a.length-1];
        T retorno = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(retorno.compareTo(a[i]) < 0){
                retorno = a[i];
            }
        }
        return retorno;
    }

    /**
     * package codigo;
     *
     * public interface Operable <T> {
     *
     *     public void mostrarArray(T[] a);
     *
     *     public T[] ordenar(T[] a);
     *
     *     public T obtenerElemento(T[] a,int posicionProhibida);
     *
     *     public T[] revertir(T[] a);
     *
     *     public T[] mezclaAleatoria(T[] a);
     *
     *     public T[] intercambio(T[] a, int i1, int i2);
     *
     *     public T minimo(T[] a);
     *
     *     public T maximo(T[] a);
     *
     * }
     */

}
