package GenericoComodin;

public class EltoAleatorio <T> {
    T elemento;
    int indice;
    public EltoAleatorio(T array[]) {
        indice=(int)(Math.random()*array.length);
        elemento=array[indice];
    }
    public T getElemento() {
        return elemento;
    }
    public boolean mismoÍndice(EltoAleatorio<T> elto){
        return elto.indice==this.indice;
    }
}
