package codigo;

import java.io.ObjectStreamField;
import java.util.Arrays;

public class Principal{

    public static void main(String[] args) {


        Operaciones<Integer> m = new Operaciones<>();


        Integer enteros[]={2,5,9,7,1,3};



        System.out.println("Array de ENTEROS:");

        m.mostrarArray(enteros);

        System.out.println("Aleatorio EXCEPTO LA POSICION 2: " + m.obtenerElemento(enteros, 2));

        System.out.println("Máximo: " + m.maximo(enteros));

        System.out.println("Mínimo: " + m.minimo(enteros));

        System.out.println("Array de ENTEROS --> ORDENADO !!");

        System.out.println(Arrays.toString(m.ordenar(enteros)));

        System.out.println("Array de ENTEROS --> REVERTIDO !!");

        System.out.println(Arrays.toString(m.revertir(enteros)));

        System.out.println("Array de ENTEROS --> MEZCLA ALEATORIA !!");

        System.out.println(Arrays.toString(m.mezclaAleatoria(enteros)));

        System.out.println("Array de ENTEROS --> INTERCAMBIO  POSICIONES: 0,1 !!");

        System.out.println(Arrays.toString(m.intercambio(enteros,0,1)));





    }

}
