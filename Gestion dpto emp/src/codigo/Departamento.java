package codigo;

public class Departamento {

    private int dept_no;//numero de departamento
    private String dnombre;//nombre del departamento
    private String localizacion;//nombre de la poblacion donde esta el departamento

    public Departamento() {
        super();
    }

    public Departamento(int dept_no, String dnombre, String localizacion) {
        super();
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.localizacion = localizacion;
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

    @Override
    public String toString() {
        return "Departamento numero "+dept_no+" de "+dnombre+" ubicado en "+localizacion;
    }

}