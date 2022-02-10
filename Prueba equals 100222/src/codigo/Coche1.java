package codigo;

public class Coche1 extends Vehiculo1 {

    public Coche1(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public boolean equals(Object o) {
        if ((o != null) && (o instanceof Coche1)) {
            if (((Coche1)o).matricula==matricula && ((Coche1)o).marca==marca && ((Coche1)o).modelo==modelo) {
                return true;
            } else {
                return false;
            }

        }
        else return false;
    }
}