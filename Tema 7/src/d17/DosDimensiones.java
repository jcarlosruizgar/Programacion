package d17;

public class DosDimensiones {

    private double base;
    private double altura;

    public void mostrarDimensiones(){
        System.out.println("La base es: " + base + " y la altura es: " + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
