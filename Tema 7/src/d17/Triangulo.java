package d17;

public class Triangulo extends DosDimensiones{

    private String tipo;

    public void mostrarTipo(){
        System.out.println("El triangulo es de tipo " + tipo);
    }

    public double area(){
        return getAltura()*getBase()/2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
