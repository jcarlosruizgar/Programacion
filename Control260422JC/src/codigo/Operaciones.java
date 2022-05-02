package codigo;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

public class Operaciones <T> implements Operable<T> {


    @Override
    public <T> void mostrarArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Override
    public <T> T[] ordenar(T[] a) {
        Arrays.sort(a);
        return a;
    }

    @Override
    public <T> T obtenerElemento(T[] a, int posicionProhibida) {
        int aleatorio;
        do{
            aleatorio = (int)Math.floor(Math.random())*a.length;
        }while(aleatorio == posicionProhibida);
        return a[aleatorio];
    }

    @Override
    public <T> T[] revertir(T[] a) {
        Collections.reverse(asList(a));
        return a;
    }

    @Override
    public <T> T[] mezclaAleatoria(T[] a) {
        Collections.shuffle(asList(a));
        return a;
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
    public <T extends Comparable<T>> T minimo(T[] a) {
        T retorno = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(retorno.compareTo(a[i]) > 0){
                retorno = a[i];
            }
        }
        return retorno;
    }

    @Override
    public <T extends Comparable<T>> T maximo(T[] a) {
        T retorno = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(retorno.compareTo(a[i]) < 0){
                retorno = a[i];
            }
        }
        return retorno;
    }

}
