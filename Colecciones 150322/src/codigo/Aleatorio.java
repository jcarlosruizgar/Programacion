package codigo;

import java.util.ArrayList;

public class Aleatorio {

    public static void main(String[] args) {
        //array list de 10 numeros enteros, que cargue los 10 numeros de forma aleatoria y los muestre

        ArrayList<Double> aleatorios = new ArrayList<Double>();

        for (int i = 0; i < 10; i++) {
            aleatorios.add(Math.random()*100);
        }

        for(Double aleatorio:aleatorios){
            System.out.println(aleatorio);
        }

    }

}
