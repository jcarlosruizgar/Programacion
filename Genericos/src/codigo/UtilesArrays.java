package codigo;

public class UtilesArrays {

    public static <T> T tomarAleatorio(T a[]){
        int i = (int)(Math.random()*a.length);
        return a[i];
    }

}
