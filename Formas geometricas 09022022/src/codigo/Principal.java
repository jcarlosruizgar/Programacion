package codigo;

public class Principal {

    public static void main(String[] args) {

        Figura[] misFiguras = new Figura[2];

        misFiguras[0] = new Circulo(23,12,4);
        System.out.println(misFiguras[0].area());

        misFiguras[1] = new Cuadrado(12,24,7);
        System.out.println(misFiguras[1].area());

        if (misFiguras[0] instanceof Circulo){
            System.out.println("Es un circulo");
        }
        else if(misFiguras[1] instanceof Cuadrado){
            System.out.println("Es un cuadrado");
        }


    }

}
