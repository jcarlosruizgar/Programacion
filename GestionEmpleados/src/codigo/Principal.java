/*
 * @author Juan Carlos Ruiz García
 * @date 19/12/21
 */

package codigo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {


    private static final int TAM = 10;//tamaño del array de empleados
    private static Empleado[] arrayEmpleados = new Empleado[TAM];

    public static void main(String[] args) {



        //arrayEmpleados[0] = new Empleado(3, "Gómez", "Programadora", LocalDate.of(2018, 10, 02) , 3000, 500, 1);
        //arrayEmpleados[1] = new Empleado(5, "Pérez", "Analista", LocalDate.of(2017, 07, 03), 4500, 1000, 2);

        cargaAutomatica();
		/*try {
			cargaInteractiva();
		} catch (DateTimeParseException dtpe) {
			System.out.println("Fecha introducida en un formato no valido. " + dtpe);
		}
		catch (IOException ioe) {
			System.out.println("Valor introducido no valido. " + ioe);
		}
		catch (NumberFormatException nfe) {
			System.out.println("Valor introducido no valido, " + nfe);
		}*/
        mostrarEmpleados();
        try{
            System.out.println("El empleado con el mayor salario esta en la posición: " + mayorSalario());//devuelve el entero de la posicion del array del empleado con el mayor salario
        }
        catch (NullPointerException npe) {
            System.out.println("No se ha podido obtener el salario. " + npe);
        }
        try {
            System.out.println("El empleado que lleva más tiempo en la empresa esta en la posición: " + mayorAntiguedad());
        }
        catch(NullPointerException npe) {
            System.out.println("No se ha podido obtener la fecha de alta. " + npe);
        }
        salarioMas1000();
        System.out.println(modificarNumeroEmpleado(2,99));
        System.out.println(modificarApellido(2,"XXXXX"));
        System.out.println(modificarOficio(2,"YYYYY"));
        System.out.println(modificarFechaAlta(2,"1000-01-01"));
        System.out.println(modificarSalario(2,80000));
        System.out.println(modificarComision(2,20000));
        System.out.println(modificarNumeroDepartamento(2,88));
        mostrarEmpleados();
    }

    static void mostrarEmpleados() {
        int i;
        int j = 0;
        for (i = 0; i < TAM; i++) {
            if(arrayEmpleados[i] != null) {
                System.out.println(arrayEmpleados[i]);
                j++;
            }
        }
        System.out.println("Tenemos en total: " + j + " empleados.");
    }

    static void cargaAutomatica() {
        arrayEmpleados[0] = new Empleado(3, "Gómez", "Programadora", LocalDate.of(2018, 10, 02) , 3001, 533, 1);
        arrayEmpleados[1] = new Empleado(5, "Pérez", "Analista", LocalDate.of(2017, 07, 03), 14502, 202, 2);
        arrayEmpleados[2] = new Empleado(9, "García", "Cerero", LocalDate.of(2014, 06, 02) , 303, 575, 3);
        arrayEmpleados[3] = new Empleado(1, "Bolaños", "Tester", LocalDate.of(2015, 07, 07), 4504, 1120, 4);
        arrayEmpleados[4] = new Empleado(2, "Hereje", "Vago", LocalDate.of(2016, 11, 02) , 3005, 550, 5);
        arrayEmpleados[5] = new Empleado(12, "Ruiz", "Hacker", LocalDate.of(2014, 02, 03), 506, 1000, 6);
        arrayEmpleados[6] = new Empleado(21, "Flores", "Programador", LocalDate.of(2015, 01, 02) , 3407, 510, 7);
        arrayEmpleados[7] = new Empleado(7, "Terrón", "Java developer", LocalDate.of(2016, 05, 03), 4508, 1050, 8);
        arrayEmpleados[8] = new Empleado(19, "Tena", "Bbdd", LocalDate.of(2010, 12, 02) , 1039, 500, 9);
        arrayEmpleados[9] = new Empleado(20, "Godoy", "Bigdata", LocalDate.of(2016, 07, 03), 510, 1000, 10);
    }

    static void cargaInteractiva() throws  IOException, NumberFormatException, DateTimeParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TAM; i++) {
            System.out.println("Registro del empleado nº " + (i+1));
            System.out.println("Introduza el número de empleado:");
            int numeroEmpleado = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el apellido del empleado:");
            String apellido = br.readLine();
            System.out.println("Introduzca el puesto de trabajo del empleado:");
            String oficio = br.readLine();
            System.out.println("Introduzca la fecha de alta del empleado (formato aaaa-mm-dd):");
            LocalDate fechaAlta = LocalDate.parse(br.readLine());
            System.out.println("Introduzca el salario del empleado:");
            int salario = Integer.parseInt(br.readLine());
            System.out.println("Introduzca la comisión del empleado:");
            int comision = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el departamento en el que trabaja el empleado:");
            int numeroDepartamento = Integer.parseInt(br.readLine());
            arrayEmpleados[i] = new Empleado(numeroEmpleado, apellido, oficio, fechaAlta, salario, comision, numeroDepartamento);
        }
    }

    static int mayorSalario() throws NullPointerException{
        double max = 0;
        int posicionMax = 0;
        for(int i = 0; i<TAM;i++) {
            if (arrayEmpleados[i].getSalario() > max) {
                max = arrayEmpleados[i].getSalario();
                posicionMax = i;
            }
        }
        return posicionMax;
    }

    static int mayorAntiguedad() throws NullPointerException {
        LocalDate añoMenor = LocalDate.of(9999, 12, 31);
        int fechaMenor = 0;
        for(int i = 0; i<TAM;i++) {
            if (arrayEmpleados[i].getFechaAlta().compareTo(añoMenor) < 0) {
                añoMenor = arrayEmpleados[i].getFechaAlta();
                fechaMenor = i;
            }
        }
        return fechaMenor;
    }

    //metodo para mostrar por pantalla el apellido de los empleados que cobren mas de 1000€
    static void salarioMas1000() {
        for (int i = 0; i < TAM; i++) {
            if(arrayEmpleados[i].getSalario() > 1000) {
                System.out.println(arrayEmpleados[i].getApellido());
            }
        }
    }

    //posicion del array y nuevo valor, retorna codigo segun error o si es correcta(1 o !1), modificarNumeroEmpleado
    static int modificarNumeroEmpleado(int posicion, int nuevoValor) {//controlar el try catch en este metodo
        try {
            arrayEmpleados[posicion].setNumeroEmpleado(nuevoValor);
            if (arrayEmpleados[posicion].getNumeroEmpleado() == nuevoValor) {
                return 1;
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;
    }

    static int modificarApellido(int posicion, String apellido) {
        try {
            arrayEmpleados[posicion].setApellido(apellido);
            if (arrayEmpleados[posicion].getApellido().compareTo(apellido) == 0) {
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;
    }

    static int modificarOficio(int posicion, String oficio) {
        try {
            arrayEmpleados[posicion].setOficio(oficio);
            if(arrayEmpleados[posicion].getOficio().compareTo(oficio) == 0) {
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;
    }

    static int modificarFechaAlta(int posicion, String fechaAlta) {
        try {
            LocalDate fechaA = LocalDate.parse(fechaAlta);
            arrayEmpleados[posicion].setFechaAlta(fechaA);
            if(arrayEmpleados[posicion].getFechaAlta().compareTo(fechaA) == 0) {
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        catch (DateTimeParseException dtpe) {
            System.out.println("Fecha en formato no valido. " + dtpe);
        }
        return 0;
    }

    static int modificarSalario(int posicion, double salario) {
        try {
            arrayEmpleados[posicion].setSalario(salario);
            if(arrayEmpleados[posicion].getSalario() == salario) {
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;
    }

    static int modificarComision(int posicion, double comision) {
        try {
            arrayEmpleados[posicion].setComision(comision);
            if(arrayEmpleados[posicion].getComision() == comision) {
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;
    }

    static int modificarNumeroDepartamento(int posicion, int numeroDepartamento) {
        try {
            arrayEmpleados[posicion].setNumeroDepartamento(numeroDepartamento);
            if(arrayEmpleados[posicion].getNumeroDepartamento() == numeroDepartamento) {
                return 1;
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ese nº de empleado no existe. " + aioobe);
        }
        return 0;

    }

}
