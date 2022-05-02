package codigo;

import java.io.File;

public class Principal {

    public static void main(String[] args) {

        /*
        File ruta1 = new File("C:/Users/Juan Carlos/IdeaProjects/Programacion/ClaseFile/src/codigo");
        System.out.println(ruta1.getAbsolutePath());
        System.out.println(ruta1.getParent());
        System.out.println(ruta1.isAbsolute());
        File ruta2 = new File("./ClaseFile/src/codigo/Principal.java");
        System.out.println(ruta2);
        System.out.println(ruta2.canExecute());
        System.out.println(ruta2.canWrite());
        System.out.println(ruta2.canRead());
        System.out.println(ruta2.getParent());
        System.out.println(ruta2.exists());
        System.out.println(ruta2.isHidden());
        System.out.println(ruta2.isAbsolute());
        System.out.println(ruta2.equals(ruta1));
        System.out.println(ruta2.getAbsolutePath());
        System.out.println(ruta2.getName());
        System.out.println(ruta2.isDirectory());
        System.out.println(ruta1.isDirectory());
         */

        //System.out.println(existeRuta(new File("./ClaseFile/src/codigo/Principal.java")));
        File f1 = new File(args[0]);
        if (f1.exists()) {
            System.out.println("La ruta existe.");
            System.out.println(f1.getAbsolutePath());
        } else {
            System.out.println("La ruta no existe.");
            f1.mkdirs();
            System.out.println(f1.getAbsolutePath());
        }
        if (f1.isFile()) {
            System.out.println("Es un fichero, se llama " + f1.getName() + " su tamano es " + f1.length() + " bytes.");
        } else {
            System.out.println("Es una carpeta, se llama " + f1.getName() + " su tamano es " + f1.length() + " bytes.");
        }
        if(f1.isFile() && f1.canExecute()){
            System.out.println("Se puede ejecutar.");
        }
        if (f1.canWrite()){
            System.out.println("Se puede escribir.");
        }
        if(f1.canRead()){
            System.out.println("Se puede leer.");
        }
        if(f1.isDirectory()){
            System.out.println(f1.listFiles());
        }

    }

}
