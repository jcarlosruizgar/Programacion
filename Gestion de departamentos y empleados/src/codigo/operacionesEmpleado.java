package codigo;

public interface operacionesEmpleado extends operaciones{

    /**
     * Metodo para mostrar los empleados de un departamento
     * @param d objeto departamento
     */
    void mostrarEmpleados(Departamento d);

    /**
     * Metodo para saber si el array de empleados de un departamento esta vacio
     * @param d objeto departamento
     * @return retorna verdadero si no hay empleados
     */
    boolean empleadosVacio(Departamento d);

    /**
     * Metodo para saber si el array de empleados de un departamento esta lleno
     * @param d objeto departamento
     * @return retorna verdadero si el array esta lleno
     */
    boolean empleadosLLeno(Departamento d);

    int existeEmpleados(int num_dpto, int num);//cambiar a Departamento d

}
