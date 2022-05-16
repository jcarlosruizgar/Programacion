package codigo;

import java.io.*;
import java.util.ArrayList;

public class Principal {

    private static FileOutputStream fos = null;
    private static ObjectOutputStream salida = null;
    private static FileInputStream fis = null;
    private static ObjectInputStream entrada = null;
    private static ArrayList<Rectangulo> listaRectangulos = new ArrayList<Rectangulo>();
    private static ArrayList<Circulo> listaCirculos = new ArrayList<Circulo>();
    private static final File RUTA_RECTANGULOS = new File("./rectangulos.dat");
    private static final File RUTA_CIRCULOS = new File("./circulos.dat");
    private static final File RUTA_INFORME_RECTANGULOS = new File("./rectangulos.txt");
    private static final File RUTA_INFORME_CIRCULOS = new File("./circulos.txt");
    private static FileWriter fw = null;

    public static void main(String[] args) {

        try{
            escribirRectangulo();
            leerRectangulo();
            mostrarRectangulos();
            crearInformeRectangulos();
            escribirCirculo();
            leerCirculo();
            mostrarCirculos();
            crearInformeCirculos();
            mostrarFicheroTexto1();
            mostrarFicheroTexto2();
        }
        finally {
            try{
                if(fos != null){
                    fos.close();
                }
                if(salida != null){
                    salida.close();
                }
                if(fis != null){
                    fis.close();
                }
                if(entrada != null){
                    entrada.close();
                }
                if(fw != null){
                    fw.close();
                }
            }catch (IOException ioe){
                System.out.println("Error E/S");
            }
        }
    }

    public static void escribirRectangulo(){
        try{
            fos = new FileOutputStream(RUTA_RECTANGULOS);
            salida = new ObjectOutputStream(fos);
            listaRectangulos.add(new Rectangulo(12,6,"azul"));
            listaRectangulos.add(new Rectangulo(new Punto(4,2),60,25,"morado"));
            salida.writeObject(listaRectangulos);
            fos.close();
            salida.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }
    }

    public static void leerRectangulo(){
        try{
            fis = new FileInputStream(RUTA_RECTANGULOS);
            entrada = new ObjectInputStream(fis);
            listaRectangulos = (ArrayList<Rectangulo>)entrada.readObject();
            fis.close();
            entrada.close();
        }catch(EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void mostrarRectangulos(){
        for(Rectangulo r:listaRectangulos){
            System.out.println(r);
        }
    }

    public static void crearInformeRectangulos(){
        int contador = 1;
        try{
            fw = new FileWriter(RUTA_INFORME_RECTANGULOS);
            for(Rectangulo r:listaRectangulos){
                fw.write("Rectangulo nº"+contador+":\n");
                fw.write(r.toString()+"\n\n");
                contador++;
            }
            fw.close();
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void escribirCirculo(){
        try{
            fos = new FileOutputStream(RUTA_CIRCULOS);
            salida = new ObjectOutputStream(fos);
            listaCirculos.add(new Circulo(9,6,20));
            listaCirculos.add(new Circulo(-20,32,95));
            salida.writeObject(listaCirculos);
            fos.close();
            salida.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }
    }

    public static void leerCirculo(){
        try{
            fis = new FileInputStream(RUTA_CIRCULOS);
            entrada = new ObjectInputStream(fis);
            listaCirculos = (ArrayList<Circulo>)entrada.readObject();
            fis.close();
            entrada.close();
        }catch(EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void mostrarCirculos(){
        try{
            fis = new FileInputStream(RUTA_CIRCULOS);
            entrada = new ObjectInputStream(fis);
            System.out.println((ArrayList<Circulo>)entrada.readObject());
            fis.close();
            entrada.close();
        }catch(EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void crearInformeCirculos(){
        int contador = 1;
        try{
            fw = new FileWriter(RUTA_INFORME_CIRCULOS);
            for(Circulo c:listaCirculos){
                fw.write("Circulo nº"+contador+":\n");
                fw.write(c.toString()+"\n\n");
                contador++;
            }
            fw.close();
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void mostrarFicheroTexto1(){
        FileReader fr = null;
        int x = 0;
        try{
            fr = new FileReader(RUTA_INFORME_CIRCULOS);
            while(x!=-1){
                x=fr.read();
                System.out.print((char)x);
            }
            fr.close();
        }catch (EOFException eofe){
            System.out.println("ADFDSKJFD");
        }catch (FileNotFoundException fnfe){
            System.out.println("Error fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
    }

    public static void mostrarFicheroTexto2(){
        FileReader fr = null;
        BufferedReader br = null;
        String linea ="";
        try{
            fr = new FileReader(RUTA_INFORME_CIRCULOS);
            br = new BufferedReader(fr);
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        }catch (EOFException eofe){
            System.out.println("Error fin de fichero.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Error fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
    }
}
