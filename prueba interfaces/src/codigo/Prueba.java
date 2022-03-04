package codigo;

public class Prueba {

    Escribible escritor;

    public Prueba(Escribible e){
        this.escritor = e;
    }

    public void enviaTexto(String s){
        escritor.escribe(s);
    }

}
