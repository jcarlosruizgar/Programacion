package codigo;

import java.io.*;

public class Prueba2 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static boolean salir = false;
    private static RandomAccessFile raf;

    public static void main(String[] args) {
        do{
            try{
                raf = new RandomAccessFile(new File("./fichero.obj"),"rw");
                System.out.println("Introduzca:");
                System.out.println("1 - para anadir un numero al inicio.");
                System.out.println("2 - para anadir un numero al final.");
                System.out.println("3 - para mostrar los numeros almacenados.");
                System.out.println("4 - para sustituir un numero por otro.");
                System.out.println("5 - para salir.");
                int opcion = Integer.parseInt(br.readLine());
                switch (opcion){
                    case 1:
                        anadirNumeroInicio();
                        break;
                    case 2:
                        anadirNumeroFinal();
                        break;
                    case 3:
                        mostrarNumeros();
                        break;
                    case 4:
                        sustituirNumero();
                        break;
                    case 5:
                        salir = true;
                        raf.close();
                        System.out.println("Finalizando el programa...");
                        break;
                    default:
                        System.out.println("Eso no es una opcion valida.");
                }
            }catch (NumberFormatException nfe){
                System.out.println("Eso no es un numero.");
            }catch (IOException ieo){
                System.out.println("Error de E/S.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (!salir);
    }

    public static void anadirNumeroInicio() throws IOException{//no anade al inicio, solo cambia el primero, ver como hacerlo bien
        raf.seek(0);
        System.out.println("Introduce un numero para anadir al inicio:");
        double numero = Double.parseDouble(br.readLine());
        raf.writeDouble(numero);
    }

    public static void anadirNumeroFinal() throws IOException{
        raf.seek(raf.length());
        System.out.println("Introduce un numero para anadir al final:");
        double numero = Double.parseDouble(br.readLine());
        raf.writeDouble(numero);
    }

    public static void mostrarNumeros() throws IOException{
        System.out.println("Los numeros almacenados son:");
        raf.seek(0);
        try{
            while(true){
                System.out.println(raf.readDouble());
            }
        }catch(EOFException eofe){
            System.out.println("Fin del fichero.");
        }
    }

    public static void sustituirNumero() throws IOException{
        System.out.println("Introduce el numero que quieres sustituir:");
        double numeroSustituir = Double.parseDouble(br.readLine());
        System.out.println("Introduce el nuevo numero:");
        double numeroSustituto = Double.parseDouble(br.readLine());
        boolean sustituido = false;
        raf.seek(0);
        int i = 0;
        while(!sustituido){
            if(raf.readDouble()==numeroSustituir){
                raf.seek(i*8);
                raf.writeDouble(numeroSustituto);
                sustituido = true;
            }else{
                i++;
            }
        }
    }

}
