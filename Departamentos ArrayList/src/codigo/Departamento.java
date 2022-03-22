package codigo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Departamento {

    /**
     * Atributos de la clase Departamento
     */
    private int dept_no;
    private String dnombre;
    private String localizacion;
    private ArrayList empleados = new ArrayList();

    /**
     * Constructor vacio de Departamento
     */
    public Departamento() {
    }

    /**
     * Constructor parametrizado por composicion de Departamento
     * @param dept_no numero del departamento
     * @param dnombre nombre del departamento
     * @param localizacion localizacion del departamento
     */
    public Departamento(int dept_no, String dnombre, String localizacion) {
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.localizacion = localizacion;
        this.empleados.add(new Director(10,"Maria", LocalDate.of(1980,4,10),3000,this,600));
        this.empleados.add(new Analista(20,"Luis",LocalDate.of(1980,4,10),2600,this));
    }

    /**
     * Constructor parametrizado por agregacion de Departamento
     * @param dept_no numero del departamento
     * @param dnombre nombre del departamento
     * @param localizacion localizacion del departamento
     * @param empleados ArrayList de objetos Empleado
     */
    public Departamento(int dept_no, String dnombre, String localizacion, ArrayList empleados){
        this.dept_no=dept_no;
        this.dnombre=dnombre;
        this.localizacion=localizacion;
        this.empleados = empleados;
    }

    /**
     * Getters & Setters clase Departamento
     */
    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "dept_no=" + dept_no +
                ", dnombre='" + dnombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
