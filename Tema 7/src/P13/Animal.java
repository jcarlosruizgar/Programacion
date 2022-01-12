package P13;

public class Animal {

    protected int numeroPatas;
    protected int edad;

    public void comer(){
        System.out.println("Animal comiendo.");
    }

    public void dormir(){
        System.out.println("Animal durmiendo.");
    }

    public void reproducir(){
        System.out.println("Animal reproduciendo");
    }

    public Animal() {
    }

    public Animal(int numeroPatas, int edad) {
        this.numeroPatas = numeroPatas;
        this.edad = edad;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numeroPatas=" + numeroPatas +
                ", edad=" + edad +
                '}';
    }

}
