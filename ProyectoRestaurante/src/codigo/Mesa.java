package codigo;

/**
 * Representa el lugar donde se van a situar las jarras
 */
public class Mesa {
    /**
     * NUMEROJARRAS es una constante que genera la cantida de jarras que tiene una mesa
     */
    private final int NUMEROJARRAS = 2;
    /**
     * jarras es un array de jarras que contiene la mesa
     */
    private Jarra[] jarras;

    public Mesa(Jarra[] jarras) {
        this.jarras = jarras;
    }

    public Mesa(Jarra j1,Jarra j2){
        jarras = new Jarra[NUMEROJARRAS];
        jarras[0] = j1;
        jarras[1] = j2;
    }

    /**
     * devuelve la capacidad de la jarra seleccionada , que puede ser 1 o 2 (valor de i)
     * @param posicionJarra dentro de la mesa
     * @return la capacidad de la jarra de esa posicion
     */
    public int capacidad (int posicionJarra){
        return this.jarras[posicionJarra].getCapacidad();
    }

    /**
     * devuelve el contenido de la jarra seleccionada , que puede ser 1 o 2 (valor de i
     * @param posicionJarra dentro de la mesa
     * @return el contenido de la jarra de esa posicion
     */
    public String contenido (int posicionJarra){
        return this.jarras[posicionJarra].getContenido();
    }

    /**
     * llena la jarra de esa posicion
     * @param posicionJarra posicion de la jarra en la mesa
     */
    public void llenar (int posicionJarra){

    }

    /**
     * vacia la jarra de esa posicion poniendo a 0 su capacidad
     * @param posicionJarra posicion de la jarra en la mesa
     */
    public void vacia(int posicionJarra){

    }

    /**
     * vacia la jarra jarra de esa posicion en la otra jarra hasta que la jarra de esa posicion esté vacia o la otra llena
     * @param posicionJarra
     */
    public void llenaDesde(int posicionJarra){

    }
}
