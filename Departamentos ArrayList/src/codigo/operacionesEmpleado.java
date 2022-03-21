package codigo;

public interface operacionesEmpleado{

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

    /**
     * Metodo para saber si un empleado de un departamento existe por medio de su numero de empleado
     * @param d objeto departamento
     * @param num numero de empleado
     * @return retorna -1 si no existe o la posicion en el array si existe
     */
    int existeEmpleados(Departamento d, int num);

}
