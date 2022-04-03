package codigo;

import java.util.LinkedList;

public class PilaGenerica <T>{

    private LinkedList<T> pila = new LinkedList<>();

    public boolean estaVacia(){
        return this.pila.isEmpty();
    }

    public T extraer(){
        return this.pila.removeFirst();
    }

    public T primero(){
        return this.pila.getFirst();
    }

    public void aniadir(T obj){
        this.pila.addFirst(obj);
    }

    public LinkedList<T> getPila() {
        return pila;
    }

    public void setPila(LinkedList<T> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        return "PilaGenerica{" +
                "lt=" + pila +
                '}';
    }
}
