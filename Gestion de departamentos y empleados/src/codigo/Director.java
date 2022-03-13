package codigo;

import java.time.LocalDate;

public class Director extends Empleado{

    /**
     * Atributo comision que solo tienen los objetos de la clase Director
     */
    private double comision;

    /**
     * Constructor vacio de Director
     */
    public Director() {
    }

    /**
     * Constructor parametrizado de Director
     * @param numeroEmpleado numero del director
     * @param apellido apallido del director
     * @param fechaAlta fecha de alta del director
     * @param salario salario del director
     * @param departamentoEmpleado departamento del director
     * @param comision comision del director
     */
    public Director(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado, double comision) {
        super(numeroEmpleado, apellido, fechaAlta, salario, departamentoEmpleado);
        this.comision = comision;
    }

    /**
     * Metodo saludar del director
     */
    @Override
    public void saludar() {
        System.out.println("Saluda un director.");
    }

    /**
     * Metodo con el salario anual del director
     * @return retorna el salario anual
     */
    public double salarioAnual(){
        return (getSalario()+this.comision)*14;
    }

    /**
     * Getters & Setters de director
     */
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }


}
