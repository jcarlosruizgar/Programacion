package codigo;

import java.util.ArrayList;
import java.util.List;

public class prueba {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.removeIf(i -> i%2 == 0);

        System.out.println(integers);

    }
}
