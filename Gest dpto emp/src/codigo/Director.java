package codigo;

import java.time.LocalDate;

public class Director extends Empleado{

    private double comision;

    public Director() {
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Director(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado, double comision) {
        super(numeroEmpleado, apellido, fechaAlta, salario, departamentoEmpleado);
        this.comision = comision;
    }
}
