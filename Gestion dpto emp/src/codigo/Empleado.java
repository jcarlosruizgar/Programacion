package codigo;

import java.time.LocalDate;

public class Empleado {

    private int numeroEmpleado;
    private String apellido;
    private String oficio;
    private LocalDate fechaAlta;
    private double salario;
    private double comision;
    //private int numeroDepartamento;
    private Departamento departamentoEmpleado;

    public Empleado() {
        super();
    }

    public Empleado(int numeroEmpleado, String apellido, String oficio, LocalDate fechaAlta, double salario, double comision, Departamento departamentoEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        this.apellido = apellido;
        this.oficio = oficio;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
        this.comision = comision;
        this.departamentoEmpleado = departamentoEmpleado;
    }

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

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
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

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
/*
    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(int numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }
*/
    public Departamento getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }

    public void setDepartamentoEmpleado(Departamento departamentoEmpleado) {
        this.departamentoEmpleado = departamentoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", apellido='" + apellido + '\'' +
                ", oficio='" + oficio + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", salario=" + salario +
                ", comision=" + comision +
                ", departamentoEmpleado=" + departamentoEmpleado +
                '}';
    }

}
