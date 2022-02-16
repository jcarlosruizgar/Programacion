/**
 * @author Juan Carlos Ruiz Garcia
 * @version 1
 * @date 15/02/2022
 * @description programa gestion de departamentos
 */
package codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {

    private final static int TAMANO = 5;//constante con el tamano del array
    private static Departamento[] listadoDepartamentos = new Departamento[TAMANO];
    private static int posOcupadas = 0;//contador de posiciones ocupadas del array
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int opcionMenu;//opcion tomada en el menu principal
    private static boolean salir = false;//variable bandera ejecucion del programa
    private static int decSubmenu;//opcion tomada en el submenu modificaciones
    private static int posSub;//posicion del array tomada en el submenu
    private static int posicionInserciones;//posicion donde se va a hacer la proxima insercion

}
