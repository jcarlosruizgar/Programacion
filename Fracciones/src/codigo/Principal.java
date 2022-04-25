package codigo;

import static java.lang.Integer.valueOf;

public class Principal {

    public static void main(String[] args) {

        Fraccion<Integer> f1 = new Fraccion<>(valueOf(6),valueOf(2));
        Fraccion<Integer> f2 = new Fraccion<>(valueOf(3),valueOf(3));

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.multiplicacion(f2));
        System.out.println(f1.division(f2));
        System.out.println(f1.suma(f2));
        System.out.println(f1.resta(f2));
    }

}
