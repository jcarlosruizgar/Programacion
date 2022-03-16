package codigo;
/**
 * Clase Jarra representa un recipiente para guardar un contenido con una determinada capacidad
 * @author Juan Carlos
 * @date 14/03/2022
 * @version 1.0
 */
public class Jarra {
    /**
     * Contenido: Tipo de liquido
     */
    private String contenido;
    /**
     * Capacidad: cantindad maxima
     */
    private int capacidad;

    /**
     * Constructor sin parametros
     */
    public Jarra() {
    }

    /**
     * Constructor parametrizado
     * @param contenido tipo de liquido
     * @param capacidad cantidad de liquido
     */
    public Jarra(String contenido, int capacidad) {
        this.contenido = contenido;
        this.capacidad = capacidad;
    }

    /**
     * Getter del atributo contenido
     * @return el contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter del atributo contenido
     * @param contenido tipo de contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Getter del atributo capacidad
     * @return retorna la capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Setter del atributo capacidad
     * @param capacidad capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Metodo toString
     * @return los atributos formateados como cadena de caracteres
     */
    @Override
    public String toString() {
        return "Jarra{" +
                "contenido='" + contenido + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
