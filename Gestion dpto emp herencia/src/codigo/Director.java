package codigo;

import java.time.LocalDate;

public class Director extends Empleado{

    private double comision;

    public Director() {
    }

    public Director(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado, double comision) {
        super(numeroEmpleado, apellido, fechaAlta, salario, departamentoEmpleado);
        this.comision = comision;
    }

    @Override
    public void saludar() {
        System.out.println("Saluda un director.");
    }

    public double salarioAnual(){
        return getSalario()*14+this.comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }


}
