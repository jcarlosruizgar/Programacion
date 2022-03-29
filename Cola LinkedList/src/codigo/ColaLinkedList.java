package codigo;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ColaLinkedList {

    private LinkedList<Integer> cola = new LinkedList<Integer>();

    public void meter(Integer numero){
        cola.addLast(numero);
    }

    public Integer sacar(){
        try{
            return cola.removeFirst();
        }
        catch(NoSuchElementException nsee){
            System.out.println("No hay ningun numero que mostrar.");
            return -1;
        }
    }

    public LinkedList<Integer> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Integer> cola) {
        this.cola = cola;
    }
}
