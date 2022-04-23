package codigo;

public class Fracciones <T extends Number>{

    private T numerador;
    private T denominador;

    public Fracciones() {
    }

    public Fracciones(T numerador, T denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracciones multiplicacion(Fracciones fraccion){
        return new Fracciones(this.numerador.doubleValue()*fraccion.numerador.doubleValue(),this.denominador.doubleValue()*fraccion.denominador.doubleValue());
    }

    public Fracciones division(Fracciones fraccion){
        return new Fracciones(this.numerador.doubleValue()*fraccion.denominador.doubleValue(),this.denominador.doubleValue()*fraccion.numerador.doubleValue());
    }

    public Fracciones suma(Fracciones fraccion){
        if(this.denominador.doubleValue()==fraccion.denominador.doubleValue()){
            return new Fracciones(this.numerador.doubleValue()+fraccion.numerador.doubleValue(),this.denominador);
        }
        else{
            return null;
        }
    }

    public Fracciones resta(Fracciones fraccion){
        if(this.denominador.doubleValue()==fraccion.denominador.doubleValue()){
            return new Fracciones(this.numerador.doubleValue()-fraccion.numerador.doubleValue(),this.denominador);
        }
        else{
            return null;
        }
    }

    public T getNumerador() {
        return numerador;
    }

    public void setNumerador(T numerador) {
        this.numerador = numerador;
    }

    public T getDenominador() {
        return denominador;
    }

    public void setDenominador(T denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Fracciones{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
