package codigo;

public class BombaAgua implements Arrancable{

    @Override
    public void arrancar() {
        System.out.println("Arranca motor de bomba de agua.");
    }

    @Override
    public void detenerMotor() {
        System.out.println("Detiene motor de bomba de agua");
    }
}
