package codigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<String>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Ajolote");
        animales.add("Avestruz");

        /*
        Iterator it = animales.iterator();
        while (it.hasNext()) {
            System.out.println((String)it.next());
        }
        */

        for(String animal:animales){
            System.out.println(animal);
        }

        System.out.println(animales.get(0));

        animales.set(0,"Paloma");

        for (String animal:animales) {
            System.out.println(animal);
        }

        animales.remove(0);

        System.out.println(animales.size());

        //animales.clear();

        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i));
        }

        Collections.sort(animales);

        for (String animal:animales) {
            System.out.println(animal);
        }


    }

}
