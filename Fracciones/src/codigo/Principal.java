package codigo;

import static java.lang.Integer.valueOf;

public class Principal {

    public static void main(String[] args) {

        Fracciones<Integer> f1 = new Fracciones<>(6,2);
        Fracciones<Integer> f2 = new Fracciones<>(3,3);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.multiplicacion(f2));
        System.out.println(f1.division(f2));
        System.out.println(f1.suma(f2));
        System.out.println(f1.resta(f2));
    }

}
