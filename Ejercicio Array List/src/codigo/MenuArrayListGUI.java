package codigo;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Juan Carlos
 * @version 1
 * @date 17/03/2022
 * @description menu interactivo, añadir, borrar, modificar numeros
 */
public class MenuArrayListGUI {

    private static boolean salir = false;
    private static ArrayList<Integer> numeros = new ArrayList<Integer>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Aplicacion operaciones Array List.");
        do {
            try {
                int seleccionMenu = Integer.parseInt(JOptionPane.showInputDialog("Introduzca:" +
                        "\n1 - Para anadir un numero." +
                        "\n2 - Para borrar un numero." +
                        "\n3 - Para modificar un numero." +
                        "\n4 - Para mostrar los numeros almacenados." +
                        "\n5 - Para buscar un numero." +
                        "\n0 - Para salir."));
                //int seleccionMenu = Integer.parseInt(br.readLine());
                switch (seleccionMenu) {
                    case 1:
                        anadirNumero();
                        break;
                    case 2:
                        borrarNumero();
                        break;
                    case 3:
                        modificarNumero();
                        break;
                    case 4:
                        mostrarNumeros();
                        break;
                    case 5:
                        buscarNumero();
                        break;
                    case 0:
                        salir = true;
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Eso no es un numero.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!salir);
    }

    /**
     * Metodo para mostrar los numeros almacenados en el ArrayList numeros
     */
    public static void mostrarNumeros() {
        if (numeros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun numero almacenado.");
        } else {
            String mostrar = "Los numeros almacenados son:";
            for (Integer numero : numeros) {
                mostrar += "\n" + numero;
            }
            JOptionPane.showMessageDialog(null, mostrar);
        }
    }

    /**
     * Metodo para anadir un numero al ArrayList numeros
     *
     * @throws IOException
     */
    public static void anadirNumero() throws IOException {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que quiere anadir:"));
        numeros.add(numero);
    }

    /**
     * Metodo para borrar un numero registrado en el ArrayList numeros
     *
     * @throws IOException
     */
    public static void borrarNumero() throws IOException {
        if (numeros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun numero almacenado.");
        } else {
            System.out.println("Introduzca el numero que quiere borrar:");
            int posicion = numeros.indexOf(Integer.parseInt(br.readLine()));
            if (posicion == -1) {
                System.out.println("El numero elegido no existe.");
            } else {
                numeros.remove(posicion);
            }
        }
    }

    /**
     * Metodo para modificar un numero registrado en el ArrayList numeros
     *
     * @throws IOException
     */
    public static void modificarNumero() throws IOException {
        if (numeros.isEmpty()) {
            System.out.println("No hay ningun numero almacenado.");
        } else {
            System.out.println("introduzca el numero que quiere modificar:");
            int numeroBuscado = numeros.indexOf(Integer.parseInt(br.readLine()));
            if (numeroBuscado == -1) {
                System.out.println("El numero buscado no existe.");
            } else {
                System.out.println("Introduzca el nuevo numero:");
                numeros.set(numeroBuscado, Integer.parseInt(br.readLine()));
            }
        }
    }

    public static void buscarNumero() throws IOException {
        if (numeros.isEmpty()) {
            System.out.println("No hay ningun numero almacenado");
        } else {
            System.out.println("Introduzca el numero que quiere buscar:");
            int numeroBuscado = Integer.parseInt(br.readLine());
            int posicionNumeroBuscado = numeros.indexOf(numeroBuscado);
            if (posicionNumeroBuscado == -1) {
                System.out.println("El numero buscado no existe.");
            } else {
                System.out.println("El numero " + numeroBuscado + " se encuentra en la posicion numero " + posicionNumeroBuscado + " del ArrayList");
            }
        }
    }

}
