package P12;

public class PruebaCoche {

    public static void main(String[] args) {

        Vehiculo cascajo = new Vehiculo(0);

        Coche carro = new Coche(0,50);

        cascajo = carro;

        System.out.println(cascajo);






    }

}
