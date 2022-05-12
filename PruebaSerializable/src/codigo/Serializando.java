package codigo;

import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;

public class Serializando {
    @SuppressWarnings({ "unchecked" })
    public static void main(String[] arg) {

        ArrayList <Objeto> arrayList1 = new ArrayList <Objeto>();
        ArrayList <Objeto> arrayList2;

        System.out.println("Datos que vamos a escribir en el fichero:");
        for(int i = 0; i < 10; i++) {
            Objeto nuevoObjeto = new Objeto("Cadena" + i);
            arrayList1.add(nuevoObjeto);
            System.out.println( "arrayList1[" + i + "] = " + arrayList1.get(i) );
        }

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. ");

            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("objetos.dat") );
            escribiendoFichero.writeObject(arrayList1);
            escribiendoFichero.close();

            System.out.println("ok!");
            System.out.print("Leyendo ArrayList del fichero objetos.dat.. ");

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("objetos.dat") );
            arrayList2 = ( ArrayList <Objeto> )leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero:");

            for(int i = 0; i < arrayList2.size(); i++) {
                System.out.println( "arrayList2[" + i + "] = " + arrayList2.get(i) );
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }

    }

}

class Objeto implements Serializable {
    private String _dato;

    public Objeto (String dato) {
        this._dato = dato;
    }

    public String toString() {
        return this._dato;
    }
}
