package codigo;

import java.util.LinkedList;

public class PilaGenerica <T>{

    private LinkedList<T> lt = new LinkedList<>();

    public boolean estaVacia(){
        return this.lt.isEmpty();
    }

    public T extraer(){
        return this.lt.removeFirst();
    }

    public T primero(){
        return this.lt.getFirst();
    }

    public void aniadir(T obj){
        this.lt.addFirst(obj);
    }

    public LinkedList<T> getLt() {
        return lt;
    }

    public void setLt(LinkedList<T> lt) {
        this.lt = lt;
    }

    @Override
    public String toString() {
        return "PilaGenerica{" +
                "lt=" + lt +
                '}';
    }
}
