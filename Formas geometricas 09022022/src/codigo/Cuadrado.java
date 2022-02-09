package codigo;

public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(double x, double y, int lado) {
        super(x, y);
        this.lado = lado;
    }

    public double area(){
        return Math.pow(lado,2);
    }
}
