package codigo;

public interface operacionesDepartamento extends operaciones{

    /**
     * Carga automatica del programa haciendo uso de la agregacion
     */
    void cargaAutomaticaConAgregacion();

    /**
     * Carga automatica del programa haciendo uso de la composicion
     */
    void cargaAutomaticaConComposicion();

    /**
     * Metodo para mostrar los departamentos del array
     */
    void mostrarDepartamentos();

    /**
     * Metodo para saber si no hay ningun departamento en el array
     * @return retorna verdadero si esta vacio
     */
    boolean departamentosVacio();

    /**
     * Metodo para saber si el array de departamentos esta lleno
     * @return retorna verdadero si esta lleno
     */
    boolean departamentosLLeno();

    /**
     * Metodo para buscar donde hacer la proxima insercion
     * @return retorna -1 si la estructura de departamentos esta llena, o la primera posicion vacia (null)
     */
    int buscaHueco();

    /**
     * Metodo que comprueba que el departamento pasado por argumento existe o no
     * @param num numero de departamento que queremos comprobar si existe
     * @return retorna -1 si no existe, o la posicion donde se encuentra si existe
     */
    int existeDepartamento(int num);

    /**
     * Metodo que comprueba que el departamento pasado por argumento existe o no
     * @param nombreDepartamento nombre del departamento que queremos comprobar si existe
     * @return retorna -1 si no existe, o la posicion donde se encuentra si existe
     */
    int buscarDepartamento(String nombreDepartamento);

}
