package codigo;

import java.time.LocalDate;

public abstract class Empleado {

    /**
     * Atributos de Empleado
     */
    private int numeroEmpleado;
    private String apellido;
    private LocalDate fechaAlta;
    private double salario;
    private Departamento departamentoEmpleado;

    /**
     * Constructor vacio de Empleado
     */
    public Empleado() {
    }

    /**
     * Constructor parametrizado de Empleado
     * @param numeroEmpleado numero del empleado
     * @param apellido apellido del empleado
     * @param fechaAlta fecha de alta del empleado
     * @param salario salario del empleado
     * @param departamentoEmpleado departamento al que pertenece el empleado
     */
    public Empleado(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, Departamento departamentoEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
        this.departamentoEmpleado = departamentoEmpleado;
    }

    /**
     * Metodo saludar de empleado
     */
    public void saludar(){
        System.out.println("Saluda un empleado.");
    }

    /**
     * Metodo abstracto salario anual
     * @return retorna el salario anual
     */
    public abstract double salarioAnual();

    /**
     * Getters & Setters clase Empleado
     * @return
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Departamento getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }
    public void setDepartamentoEmpleado(Departamento departamentoEmpleado) {
        this.departamentoEmpleado = departamentoEmpleado;
    }

    /**
     * Metodo toString de empleado
     * @return retorna la informacion de empleado formateada
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", apellido='" + apellido + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", salario=" + salario +
                '}';
    }

}
