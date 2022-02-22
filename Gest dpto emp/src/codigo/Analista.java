package codigo;

import java.time.LocalDate;

public class Analista extends Empleado{

    public Analista() {
    }

    public Analista(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado) {
        super(numeroEmpleado, apellido, fechaAlta, salario, departamentoEmpleado);
    }

    public String toStrin(){
        return super.toString();
    }

}
