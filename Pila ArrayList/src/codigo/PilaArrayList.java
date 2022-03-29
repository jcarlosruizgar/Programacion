package codigo;

import java.util.ArrayList;
import java.util.List;

public class PilaArrayList {

    private List<Integer> pila = new ArrayList<Integer>();

    public void meter(Integer numero){
        pila.add(numero);
    }

    public List<Integer> getPila() {
        return pila;
    }

    public void setPila(List<Integer> pila) {
        this.pila = pila;
    }

    public Integer sacar(){
        try{
            return pila.remove(pila.size()-1);
        }
        catch (IndexOutOfBoundsException ioobe){
            System.out.println("No hay ningun numero que sacar de la pila.");
            return -1;
        }
    }

}
