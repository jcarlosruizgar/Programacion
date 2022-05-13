package codigo;

import java.io.Serializable;

public class Rectangulo implements Serializable {

    private Punto coordenada;
    private int base;
    private int altura;
    private String color;

    public Rectangulo() {
    }

    //constructor composicion
    public Rectangulo(int base, int altura, String color) {
        this.coordenada = new Punto(0,0);
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    //constructor agregacion
    public Rectangulo(Punto coordenada, int base, int altura, String color){
        this.coordenada = coordenada;
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public Punto getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Punto coordenada) {
        this.coordenada = coordenada;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "El rectangulo tiene:"+
                "\n\tUna base de "+this.base+
                "\n\tUna altura de "+this.altura+
                "\n\tParte de punto X="+this.coordenada.getX()+
                " y un punto Y="+this.coordenada.getY()+
                "\n\tEs de color "+this.color;
    }
}
