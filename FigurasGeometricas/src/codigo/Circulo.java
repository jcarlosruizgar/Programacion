package codigo;

public class Circulo extends Punto{

    private int radio;

    public Circulo() {
    }

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
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
