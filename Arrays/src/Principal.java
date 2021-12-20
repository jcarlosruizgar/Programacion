/*
 * Enunciado: Calculadora
 * Fecha: 16/11/2021
 * Autor: David Mateos Lorenzo
 * Ultima version
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    private static int num1;
    private static int num2;

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) throws NumberFormatException, IOException {
        MenuPrincipal();
    }

    // Menu Principal

    public static void MenuPrincipal() throws NumberFormatException, IOException {
        int opcion; // variable que controla cada opcion del menu que introduzca el usuario
        int salir = 0;

        while (salir != 3) { // cuando salir es distinto de 3 se ejecuta el bucle
            opcion = 0;
            System.out.println(" __________________________");
            System.out.println("|                          |");
            System.out.println("|1. Operaciones Aritméticas|");
            System.out.println("|2. Operaciones Lógicas    |");
            System.out.println("|3. Salir                  |");
            System.out.println("|__________________________|");
            System.out.println(" "); // esto es un espacio en blanco
            System.out.println("Que operaciones desea realizar?");

            try {
                opcion = Integer.parseInt(br.readLine()); // guardará la opcion que haya elegido el usuario
            } catch (NumberFormatException e) { // control de errores por si introduces un un numero no valido
                System.out.println(" ________________________________");
                System.out.println("|                                |");
                System.out.println("|!POR FAVOR INTRODUZCA UN NUMERO!|");
                System.out.println("|________________________________|");
            }

            switch (opcion) { // dependiendo del valor de opcion entrará en un caso o en otro
                case 1:
                    MenuOperacionesAritmeticas();
                    break;
                case 2:
                    MenuOperacionesLogicas();
                    break;
                case 3:
                    salir = 3; // la variable salir toma el valor 3 y saldría del bucle
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 3"); // esto te muestra un mensaje si es que introduces
                    // otro numero distinto del rango
                    break;
            }
        }
    }

    // Menu Operaciones Aritmeticas

    public static void MenuOperacionesAritmeticas() throws NumberFormatException, IOException {
        int opcionmenu = 0; // variable que controla cada opcion del menu que introduzca el usuario
        int volverAtras = 0;

        while (volverAtras != 5) { // cuando la variable volveratras tenga un valor distitno de 5
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|1. Sumar       |");
            System.out.println("|2. Restar      |");
            System.out.println("|3. Multiplicar |");
            System.out.println("|4. Dividir     |");
            System.out.println("|5. Volver Atras|");
            System.out.println("|_______________|");
            System.out.println(" "); // esto es un espacio en blanco
            System.out.println("Introduce un una opcion del menu");

            try {
                opcionmenu = Integer.parseInt(br.readLine()); // guardará la opcion que haya elegido el usuario
            } catch (NumberFormatException e) { // control de errores por si introduces un un numero no valido
                System.out.println(" ________________________________");
                System.out.println("|                                |");
                System.out.println("|!POR FAVOR INTRODUZCA UN NUMERO!|");
                System.out.println("|________________________________|");
            }

            switch (opcionmenu) {
                case 1:
                    pedirDatos();
                    System.out.println("La suma de " + num1 + " y " + num2 + " es " + Sumar());
                    break;
                case 2:
                    pedirDatos();
                    System.out.println("La resta de " + num1 + " y " + num2 + " es " + Restar());
                    break;
                case 3:
                    pedirDatos();
                    System.out.println("La multiplicaion de " + num1 + " y " + num2 + " es " + Multiplicar());
                    break;
                case 4:
                    pedirDatos();
                    try {
                        if (num1 % num2 != 0)
                            System.out.println("La division de " + num1 + " y " + num2 + " es " + Dividir());
                        else {
                            System.out.println("La division de sus numeros es " + (int) Dividir());
                        }
                    } catch (ArithmeticException e) { // Control de errores por si introduces un numero no valido
                        System.out.println(" ______________________");
                        System.out.println("|                      |");
                        System.out.println("|El numero no es valido|");
                        System.out.println("|______________________|");
                        System.out.println(" " /* espacio en blanco */);
                    }
                    break;
                case 5:
                    volverAtras = 5; // volveratras toma el valor 5 para poder salir del bucle
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 5"); // esto te muestra un mensaje si es que introduces
                    // otro numero distinto del rango
                    break;
            }
        }

    }

    // Menu Operaciones Logicas

    public static void MenuOperacionesLogicas() throws NumberFormatException, IOException { // Menu de operaciones
        // logicas
        int opcion = 0; // variable que controla cada opcion del menu que introduzca el usuario
        int volverAtras = 0;

        while (volverAtras != 4) {
            System.out.println(" ______________________");
            System.out.println("|                      |");
            System.out.println("|1. Mayor que          |");
            System.out.println("|2. Menor que          |");
            System.out.println("|3. Igual o Diferente  |");
            System.out.println("|4. Volver Atras       |");
            System.out.println("|______________________|");

            System.out.println("Introduce un una opcion del menu"); // esto te muestra un mensaje si es que introduces
            // otro numero distinto del rango

            try {
                opcion = Integer.parseInt(br.readLine()); // guardará la opcion que haya elegido el usuario
            } catch (NumberFormatException e) { // control de errores por si introduces un un numero no valido
                System.out.println(" ________________________________");
                System.out.println("|                                |");
                System.out.println("|!POR FAVOR INTRODUZCA UN NUMERO!|");
                System.out.println("|________________________________|");
            }

            switch (opcion) {
                case 1:
                    pedirDatos();
                    if (num1 == num2) {
                        System.out.println("Por favor introduzca un numero mayor que otro!");
                    } else {
                        System.out.println("El numero mas grande es: " + MayorQue());
                    }
                    break;
                case 2:
                    pedirDatos();
                    if (num1 == num2) {
                        System.out.println("Por favor introduzca un numero menor que otro!");
                    } else {
                        System.out.println("El numero mas pequeño es: " + MenorQue());
                    }
                    break;
                case 3:
                    pedirDatos();
                    if (DiferenteOIgual()) { // dependiendo si el numero es igual o bien es distinto mostrara un mensaje u
                        // otro
                        System.out.println(num1 + " es distinto de " + num2);
                    } else {
                        System.out.println(num1 + " y " + num2 + " son iguales");
                    }
                case 4:
                    volverAtras = 4; // volveratras toma el valor 4 para poder salir del bucle
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 5");
            }
        }

    }

    // Operaciones Aritmeticas

    private static int Sumar() {
        return num1 + num2; // devuelve el resultado de la suma
    }

    private static int Restar() {
        return num1 - num2; // devuelve el resultado de la resta
    }

    private static int Multiplicar() {
        return num1 * num2; // devuelve el resultado de la multiplicacion
    }

    private static double Dividir() {
        double resultado;

        resultado = (double) num1 / num2; // devuelve el resultado de la division
        return resultado;
    }

    // Operaciones Logicas

    private static int MayorQue() {
        ReordenarMayor();
        if (num1 < num2) {
        }
        return num1; // compara el numero 1 y el numero 2 y devuelve el numero mayor
    }

    private static int MenorQue() {
        ReordenarMenor();
        if (num1 > num2) {
        }
        return num1; // compara el numero 1 y el numero 2 y devuelve el numero menor
    }

    private static boolean DiferenteOIgual() {
        return (num1 != num2); // retorna que num1 es distinto de num2
    }

    public static void pedirDatos() throws NumberFormatException, IOException { // metodo para introducir datos
        boolean numeroNoValido = true; // variable bandera que servira para poder salir de bucle de try/catch
        while (numeroNoValido) { // cuando numeronovalido sea true ejecutará el bucle
            try {

                System.out.println("Introduzca el primer numero");
                num1 = Integer.parseInt(br.readLine()); // guarda el valor del primer numero introducido
                System.out.println("Introduca el segundo numero"); // guarda el valor del segundo numero introducido
                num2 = Integer.parseInt(br.readLine());

                numeroNoValido = false; // numeronovalido toma el valor false para poder salir del bucle
            } catch (NumberFormatException e) { // control de errores por si introduces un un numero no valido
                System.out.println(" ________________________________");
                System.out.println("|                                |");
                System.out.println("|!POR FAVOR INTRODUZCA UN NUMERO!|");
                System.out.println("|________________________________|");
            }
        }
    }

    public static void ReordenarMayor() { // metodo para reordenar los numeros para que primero aparezca el mayor

        if (num1 < num2) {
            int comodin; // esta variable se utilizara de ayuda para ordenar los numeros como comodin
            comodin = num1;
            num1 = num2;
            num2 = comodin;
        }
    }

    public static void ReordenarMenor() { // metodo para reordenar los numeros para que primero aparezca el menor

        if (num1 > num2) {
            int comodin; // esta variable se utilizara de ayuda para ordenar los numeros como comodin
            comodin = num1;
            num1 = num2;
            num2 = comodin;
        }
    }
}
