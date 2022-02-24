package codigo;

import java.time.LocalDate;
import java.util.Arrays;

public class Departamento {

    private int dept_no;//numero de departamento
    private String dnombre;//nombre del departamento
    private String localizacion;//nombre de la poblacion donde esta el departamento
    private final int TAMANO = 5;//constante con el tamano del array de empleados
    private Empleado[] empleados;//declaracion del array de empleados
    private int numeroEmpleados = 0;//variable de control con el numero de empleados en el array de empledos
    private int posicionInserciones = 0;//posicion en la que se realizara la proxima insercion en el array de empleados

    public Departamento() {
    }

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

    public Departamento(int dept_no, String dnombre, String localizacion, Empleado[] empleados){
        this.dept_no=dept_no;
        this.dnombre=dnombre;
        this.localizacion=localizacion;
        this.empleados = empleados;
        numeroEmpleados = empleados.length;
        posicionInserciones = numeroEmpleados;
    }

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

    //metodo que convierte el numero de empleado, en la posicion del array en la que se encuentra el mismo
    public int posicionEmpleado(int emp_no){
        /*
        int posicionLocalizada = -1;
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] != null && listaEmpleados[i].getNumeroEmpleado()== emp_no) {
                posicionLocalizada = i;
                break;
            }
        }
        return posicionLocalizada;
        */
        int i = 0;
        boolean encontrado = false;
        do{
            if(empleados[i] != null && empleados[i].getNumeroEmpleado()== emp_no){
                encontrado = true;
            }
            else i++;

        }
        while(!encontrado && i < empleados.length);
        if(encontrado)return i;
        else return -1;
    }

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
}