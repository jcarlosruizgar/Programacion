package codigo;

public class Coche implements Arrancable{

    @Override
    public void arrancar() {
        System.out.println("Arranca motor de coche.");
    }

    @Override
    public void detenerMotor() {
        System.out.println("Detiene motor de coche");
    }
}
