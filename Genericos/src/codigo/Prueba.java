package codigo;

public class Prueba {

    public static void main(String[] args) {
        /*
        String a[]={"a","b","c","d","e","f"};
        String toma=UtilesArrays.tomarAleatorio(a);
        System.out.println(toma);

        Integer b[] = {2,4,6,7,12,54,234,6765,3,2,6,};
        System.out.println(UtilesArrays.tomarAleatorio(b));
         */

        String a[] = {"uno","dos","tres","cuatro"};
        EltoAleatorio<String> e = new EltoAleatorio<>(a);

        System.out.println(e.getElemento());

        String a1[] = {"paco","perez","terror"};
        Integer a2[] = {1,5,2,34,77,1,2,4,6};

        EltoAleatorio<String> e1 = new EltoAleatorio<String>(a1);
        EltoAleatorio<Integer> e2 = new EltoAleatorio<Integer>(a2);

        System.out.println(e1.getElemento());
        System.out.println(e2.getElemento());

    }

}
