package codigo;

import java.time.LocalDate;

public class PrincipalAgregacion {

    private static final int TAM = 5;
    private static Empleado listadoEmpleadosVentas[] = new Empleado[TAM];
    private static Empleado listadoEmpleadosInnovacion[] = new Empleado[TAM];
    private static Departamento listadoDepartamentos[] = new Departamento[TAM];

    public static void main(String[] args) {

        listadoEmpleadosVentas[0] = new Empleado(10,"Maria","programadora", LocalDate.of(1980,4,10),3000,200,null);
        listadoEmpleadosVentas[1] = new Empleado(20,"Luis","java developer",LocalDate.of(1980,4,10),2600,200,null);

        listadoDepartamentos[0] = new Departamento(15,"Ventas","Barcelona",listadoEmpleadosVentas);

        listadoDepartamentos[0].getListaEmpleados()[0].setDepartamentoEmpleado(listadoDepartamentos[0]);//son lo mismo
        listadoDepartamentos[0].getListaEmpleados()[1].setDepartamentoEmpleado(listadoDepartamentos[0]);
        listadoEmpleadosVentas[0].setDepartamentoEmpleado(listadoDepartamentos[0]);//son lo mismo

        //dpto ventas
        System.out.println(listadoDepartamentos[0]);
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0]);
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[1]);



        listadoEmpleadosInnovacion[0] = new Empleado(30,"Ana","Investigadora",LocalDate.of(2018,2,18),5000,400,null);
        listadoEmpleadosInnovacion[1] = new Empleado(40,"Alba","Investigadora",LocalDate.of(2016,1,3),6000,100,null);

        listadoDepartamentos[1] = new Departamento(7,"Innovacion","Helechosa de los montes",listadoEmpleadosInnovacion);

        listadoDepartamentos[1].getListaEmpleados()[0].setDepartamentoEmpleado(listadoDepartamentos[1]);
        listadoDepartamentos[1].getListaEmpleados()[1].setDepartamentoEmpleado(listadoDepartamentos[1]);

        //dpto innovacion
        System.out.println(listadoDepartamentos[1]);
        System.out.println(listadoDepartamentos[1].getListaEmpleados()[0]);
        System.out.println(listadoDepartamentos[1].getListaEmpleados()[1]);


    }



}
