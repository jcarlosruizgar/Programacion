package codigo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(9);
        listaEnteros.add(3);
        listaEnteros.add(12);
        Matematicas<Integer> numeroEntero = new Matematicas<>(9,listaEnteros);
        //System.out.println(numeroEntero);
        ArrayList<Double> listaDecimales = new ArrayList<>();
        listaDecimales.add(9.32);
        listaDecimales.add(100.5);
        listaDecimales.add(.77);
        Matematicas<Double> numeroDecimal = new Matematicas<>(3.7,listaDecimales);
        /*
        System.out.println(numeroDecimal);
        System.out.println(numeroDecimal.reciproco());
        System.out.println(numeroEntero.reciproco());
        System.out.println(numeroDecimal.potencia());
        System.out.println(numeroEntero.potencia());
        System.out.println(numeroEntero.parteDecimal());
        System.out.println(numeroDecimal.parteDecimal());
         */

        System.out.println(numeroEntero);
        System.out.println(numeroDecimal);

        System.out.println(numeroEntero.existeNumero());
        System.out.println(numeroDecimal.existeNumero());

    }



}
