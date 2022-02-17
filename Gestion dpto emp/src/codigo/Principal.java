package codigo;

import java.time.LocalDate;

/**
 * @author Juan Carlos Ruiz Garcia
 * @version 1
 * @date 17/02/2022
 * @description aplicacion de gestion de departamentos y empleados
 */
public class Principal {

    private static final int TAMANO = 5;

    public static void main(String[] args) {

        Departamento[] listadoDepartamentos = new Departamento[TAMANO];

        Empleado[] listadoEmpleadosVentas = new Empleado[TAMANO];

        Empleado[] listadoEmpleadosInnovacion = new Empleado[TAMANO];

        listadoDepartamentos[0] = new Departamento(15,"Ventas","Barcelona",listadoEmpleadosVentas);
        listadoDepartamentos[1] = new Departamento(7,"Innovacion","Helechosa de los montes",listadoEmpleadosInnovacion);

        listadoEmpleadosVentas[0] = new Empleado(10,"Maria","programadora", LocalDate.of(1980,4,10),3000,200,listadoDepartamentos[0]);
        listadoEmpleadosVentas[1] = new Empleado(20,"Luis","java developer",LocalDate.of(1980,4,10),2600,200,listadoDepartamentos[0]);

        listadoEmpleadosInnovacion[0] = new Empleado(30,"Ana","Investigadora",LocalDate.of(2018,2,18),5000,400,listadoDepartamentos[1]);
        listadoEmpleadosInnovacion[1] = new Empleado(40,"Alba","Investigadora",LocalDate.of(2016,1,3),6000,100,listadoDepartamentos[1]);

        //dpto ventas
        System.out.println(listadoDepartamentos[0]);
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0]);
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[1]);

        //dpto innovacion
        System.out.println(listadoDepartamentos[1]);
        System.out.println(listadoDepartamentos[1].getListaEmpleados()[0]);
        System.out.println(listadoDepartamentos[1].getListaEmpleados()[1]);

    }



}
