package codigo;

public class Departamento {

    private String nombre;
    private String localizacion;
    private int dept_no;

    public Departamento() {
    }

    public Departamento(String nombre, String localizacion, int dept_no) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.dept_no = dept_no;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public String toString() {
        return "Departamento nº"+dept_no+", "+nombre+" ubicado en "+localizacion;
    }
}
