package codigo;

public class Canario implements Cantable, Volable{

    String color;

    @Override
    public void cantar() {
        System.out.println("Piopio.");
    }

    @Override
    public void volar() {
        System.out.println("Canario volando.");
    }

    public Canario() {
    }

    public Canario(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
