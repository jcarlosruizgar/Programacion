package codigo;

import java.time.LocalDate;

public class Analista extends Empleado{

    /**
     * Constructor vacio de Analista
     */
    public Analista() {
    }

    /**
     * Constructor parametriza de Analista
     * @param numeroEmpleado numero del analista
     * @param apellido apellido del analista
     * @param fechaAlta fecha de alta del analista
     * @param salario salario del analista
     * @param departamentoEmpleado departamento al que pertenece el analista
     */
    public Analista(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado) {
        super(numeroEmpleado, apellido, fechaAlta, salario, departamentoEmpleado);
    }

    /**
     * Metodo saludar del analista
     */
    @Override
    public void saludar() {
        System.out.println("Saluda un analista.");
    }

    /**
     * Metodo para obtener el salario anual del analista
     * @return
     */
    public double salarioAnual(){
        return getSalario()*14;
    }

    /**
     * Metodo toString del analista
     * @return retorna el toString de la clase padre (Empleado)
     */
    public String toString(){
        return super.toString();
    }

}
