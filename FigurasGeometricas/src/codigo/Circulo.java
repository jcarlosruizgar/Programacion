package codigo;

public class Circulo extends Punto implements Operable{

    private int radio;

    public Circulo() {
    }

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public void mover(int posX,int posY){
        super.setX(posX);
        super.setY(posY);
    }

    public double area(){
        return 2*Math.pow(Math.PI,2);
    }

    public double perimetro(){
        return 2*Math.PI*this.radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo con un punto x="+super.getX()+", con un punto y="+super.getY()+" y con un radio de "+this.radio+".";
    }
}
