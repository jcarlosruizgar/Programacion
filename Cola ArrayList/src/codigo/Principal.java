package codigo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        /*
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(22);
        numeros.add(51);

        System.out.println(numeros);

        int tamano = numeros.size();
        for (int i = 0; i < tamano; i++) {
            System.out.println(numeros.remove(0));
        }

        System.out.println(numeros);
        */

        ColaArrayList cal = new ColaArrayList();
        for (int i = 0; i < 5; i++) {
            cal.meter(i);
        }

        do{
            System.out.println(cal.sacar());
        }
        while(cal.getCola().size()!=0);

        System.out.println(cal.sacar());
    }


}
