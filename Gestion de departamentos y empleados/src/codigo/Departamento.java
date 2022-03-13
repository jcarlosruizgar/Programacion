package codigo;

import java.time.LocalDate;
import java.util.Arrays;

public class Departamento {

    /**
     * Atributos de la clase Departamento
     */
    private int dept_no;//numero de departamento
    private String dnombre;//nombre del departamento
    private String localizacion;//nombre de la poblacion donde esta el departamento
    private final int TAMANO = 5;//constante con el tamano del array de empleados
    private Empleado[] empleados;//declaracion del array de empleados
    private int numeroEmpleados = 0;//variable de control con el numero de empleados en el array de empledos
    private int posicionInserciones = 0;//posicion en la que se realizara la proxima insercion en el array de empleados

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
        this.empleados = new Empleado[TAMANO];
        this.empleados[0] = new Director(10,"Maria",LocalDate.of(1980,4,10),3000,this,600);
        this.empleados[1] = new Analista(20,"Luis",LocalDate.of(1980,4,10),2600,this);
        numeroEmpleados = 2;
        posicionInserciones = 2;
    }

    /**
     * Constructor parametrizado por agregacion de Departamento
     * @param dept_no numero del departamento
     * @param dnombre nombre del departamento
     * @param localizacion localizacion del departamento
     * @param empleados array de objetos Empleado
     */
    public Departamento(int dept_no, String dnombre, String localizacion, Empleado[] empleados){
        this.dept_no=dept_no;
        this.dnombre=dnombre;
        this.localizacion=localizacion;
        this.empleados = empleados;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null){
                numeroEmpleados++;
            }
        }
        posicionInserciones = numeroEmpleados;
    }

    /**
     * Getter & Setters clase Departamento
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
    public Empleado[] getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    public int getTAMANO() {
        return TAMANO;
    }
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    public int getPosicionInserciones() {
        return posicionInserciones;
    }
    public void setPosicionInserciones(int posicionInserciones) {
        this.posicionInserciones = posicionInserciones;
    }

    /**
     * Metodo toString de Departamento
     * @return retorna un string formateado con la informacion del departamento
     */
    @Override
    public String toString() {
        return "Departamento{" +
                "dept_no=" + dept_no +
                ", dnombre='" + dnombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", TAMANO=" + TAMANO +
                ", empleados=" + Arrays.toString(empleados) +
                ", numeroEmpleados=" + numeroEmpleados +
                ", posicionInserciones=" + posicionInserciones +
                '}';
    }

}