package P13;

public class Mamifero extends Animal{

    protected String habitat;

    public void reproducir(){
        System.out.println("Mamifero reproduciendo.");
    }

    public Mamifero() {
    }

    public Mamifero(String habitat) {
        this.habitat = habitat;
    }

    public Mamifero(int numeroPatas, int edad, String habitat) {
        super(numeroPatas, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "numeroPatas=" + numeroPatas +
                ", edad=" + edad +
                ", habitat='" + habitat + '\'' +
                '}';
    }

}
