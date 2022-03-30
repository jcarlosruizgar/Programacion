package codigo;

public class EltoAleatorio <T>{
    T elemento;

    public EltoAleatorio(T array[]){
        elemento = array[(int)(Math.random()*array.length)];
    }

    public T getElemento(){
        return elemento;
    }

}
