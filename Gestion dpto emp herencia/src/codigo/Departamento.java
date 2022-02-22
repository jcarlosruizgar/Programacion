package codigo;

import java.time.LocalDate;

public class Departamento {

    private int dept_no;//numero de departamento
    private String dnombre;//nombre del departamento
    private String localizacion;//nombre de la poblacion donde esta el departamento
    private Empleado[] listaEmpleados;

    public Departamento() {
        super();
    }

    public Departamento(int dept_no, String dnombre, String localizacion) {
        super();
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.localizacion = localizacion;
        this.listaEmpleados = new Empleado[5];
        this.listaEmpleados[0] = new Director(10,"Maria",LocalDate.of(1980,4,10),3000,this,600);
        this.listaEmpleados[1] = new Analista(20,"Luis",LocalDate.of(1980,4,10),2600,this);
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

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
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
            if(listaEmpleados[i] != null && listaEmpleados[i].getNumeroEmpleado()== emp_no){
                encontrado = true;
            }
            else i++;

        }
        while(!encontrado && i < listaEmpleados.length);
        if(encontrado)return i;
        else return -1;
    }

    @Override
    public String toString() {
        return "Departamento numero "+dept_no+" de "+dnombre+" ubicado en "+localizacion;
    }

}