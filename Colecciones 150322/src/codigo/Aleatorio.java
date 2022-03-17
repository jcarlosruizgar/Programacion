package codigo;

import java.util.ArrayList;
import java.util.Collections;

public class Aleatorio {

    private static ArrayList<Double> aleatorios = new ArrayList<Double>();

    public static void main(String[] args) {

        //array list de 10 numeros enteros, que cargue los 10 numeros de forma aleatoria y los muestre


        for (int i = 0; i < 10; i++) {
            aleatorios.add(Math.random()*100);
        }

        for(double aleatorio:aleatorios){
            System.out.println(aleatorio);
        }

        System.out.println(numeroMenor());
        System.out.println(posicionNumeroMenor(numeroMenor()));

        System.out.println(aleatorios.size());

        Collections.sort(aleatorios);
        for(double aleatorio:aleatorios){
            System.out.println(aleatorio);
        }

        System.out.println(media());


        //debe decir, el menor, el mayor, la media y la cantidad de numeros que tiene



    }

    public static double numeroMenor(){
        double numMenor = aleatorios.get(0);
        for (int i = 1; i < aleatorios.size(); i++) {
            if(numMenor > aleatorios.get(i)){
                numMenor = aleatorios.get(i);
            }
        }
        return numMenor;
    }

    public static int posicionNumeroMenor(double numeroBuscado){
        return aleatorios.indexOf(numeroBuscado);
    }

    public static double media(){
        double suma = 0;
        for (double numero:aleatorios){
            suma += numero;
        }
        return suma/aleatorios.size();
    }

}
