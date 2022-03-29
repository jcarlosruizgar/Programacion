package codigo;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PilaLinkedList {

    private LinkedList<Integer> cola = new LinkedList<Integer>();

    public void push(Integer numero){
        cola.addLast(numero);
    }

    public Integer pop(){
        try{
            return cola.removeLast();
        }
        catch(NoSuchElementException nsee){
            System.out.println("No hay ningun numero que mostrar.");
            return -1;
        }
    }

    public Integer top(){
        try{
            return cola.getLast();
        }
        catch(NoSuchElementException nsee){
            System.out.println("No hay ningun numero que mostrar.");
            return -1;
        }
    }

    public LinkedList<Integer> getPila() {
        return cola;
    }

    public void setPila(LinkedList<Integer> cola) {
        this.cola = cola;
    }
}
