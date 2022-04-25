package codigo;

public class Fraccion<T extends Number>{

    private T numerador;
    private T denominador;

    public Fraccion() {
    }

    public Fraccion(T numerador, T denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion multiplicacion(Fraccion fraccion){
        return new Fraccion(this.numerador.doubleValue()*fraccion.numerador.doubleValue(),this.denominador.doubleValue()*fraccion.denominador.doubleValue());
    }

    public Fraccion division(Fraccion fraccion){
        return new Fraccion(this.numerador.doubleValue()*fraccion.denominador.doubleValue(),this.denominador.doubleValue()*fraccion.numerador.doubleValue());
    }

    public Fraccion suma(Fraccion fraccion){
        if(this.denominador.doubleValue()==fraccion.denominador.doubleValue()){
            return new Fraccion(this.numerador.doubleValue()+fraccion.numerador.doubleValue(),this.denominador);
        }
        else{
            return new Fraccion(this.numerador.doubleValue()*fraccion.denominador.doubleValue()+this.denominador.doubleValue()*fraccion.numerador.doubleValue(),this.denominador.doubleValue()*fraccion.denominador.doubleValue());
        }
    }

    public Fraccion resta(Fraccion fraccion){
        if(this.denominador.doubleValue()==fraccion.denominador.doubleValue()){
            return new Fraccion(this.numerador.doubleValue()-fraccion.numerador.doubleValue(),this.denominador);
        }
        else{
            return new Fraccion(this.numerador.doubleValue()*fraccion.denominador.doubleValue()-this.denominador.doubleValue()*fraccion.numerador.doubleValue(),this.denominador.doubleValue()*fraccion.denominador.doubleValue());
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
