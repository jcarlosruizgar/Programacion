package P16;

public class B extends A {

    char caracter;

    public B(int v, char c){

        super(v);
        caracter = c;

    }

    public void escribir(){

        System.out.println((valor*2) + " " + caracter);

    }

}
