package P13;

public class Perro extends Mamifero{

    protected String raza;

    public void comer(){
        System.out.println("Perro comiendo.");
    }

    public void gruñir(){
        System.out.println("Perro gruñendo.");
    }

    public void ladrar(){
        System.out.println("Perro ladrando.");
    }

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String habitat, String raza) {
        super(habitat);
        this.raza = raza;
    }

    public Perro(int numeroPatas, int edad, String habitat, String raza) {
        super(numeroPatas, edad, habitat);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "numeroPatas=" + numeroPatas +
                ", edad=" + edad +
                ", habitat='" + habitat + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

}
