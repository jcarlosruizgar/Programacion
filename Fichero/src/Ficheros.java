/*
@author Juan Carlos Ruiz García
@date 10/01/2022
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ficheros {

    static double numero1;
    static double numero2;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca 2 números para realizar tres ficheros:\nEl 1º realizará la suma de ambos.\nEl 2º realizará la resta de ambos.\nEl 3º realizará el producto de ambos.");
        try{
            System.out.println("Introduzca el 1º número:");
            numero1 = Double.parseDouble(br.readLine());
            System.out.println("Introduzca el 2º número:");
            numero2 = Double.parseDouble(br.readLine());
            proceso1();
            proceso2();
            proceso3();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void proceso1(){
        try{
            PrintWriter pw = new PrintWriter("proceso1","UTF-8");
            pw.println("El número " + numero1 + " + el número " + numero2 + " = " + (numero1+numero2) + ".");
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void proceso2(){
        try{
            PrintWriter pw = new PrintWriter("proceso2","UTF-8");
            pw.println("El número " + numero1 + " - el número " + numero2 + " = " + (numero1-numero2) + ".");
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void proceso3(){
        try{
            PrintWriter pw = new PrintWriter("proceso3","UTF-8");
            pw.println("El número " + numero1 + " * el número " + numero2 + " = " + (numero1*numero2) + ".");
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
