package codigo;

import java.util.ArrayList;
import java.util.List;

public class ColaArrayList {

    private List<Integer> cola = new ArrayList<Integer>();

    public void meter(Integer numero){
        cola.add(numero);
    }

    public List<Integer> getCola() {
        return cola;
    }

    public void setCola(List<Integer> cola) {
        this.cola = cola;
    }

    public Integer sacar(){
        try{
            return cola.remove(0);
        }
        catch (IndexOutOfBoundsException ioobe){
            System.out.println("No hay ningun numero que sacar de la cola.");
            return -1;
        }
    }

}
