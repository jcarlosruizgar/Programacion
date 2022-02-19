package codigo;

public class Principal {

    public static void main(String[] args) {

        Departamento[] listadoDepartamentos = new Departamento[5];
        listadoDepartamentos[0] = new Departamento(15,"Ventas","Barcelona");

        System.out.println(listadoDepartamentos[0]);

        esInstanciaDe(listadoDepartamentos[0].getListaEmpleados()[0]);
        esInstanciaDe(listadoDepartamentos[0].getListaEmpleados()[1]);

        listadoDepartamentos[0].getListaEmpleados()[0].saludar();
        listadoDepartamentos[0].getListaEmpleados()[1].saludar();


        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0].salarioAnual());
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[1].salarioAnual());

        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0]);


    }

    public static void esInstanciaDe(Empleado e){
        if(e instanceof Director){
            System.out.println("Es un director");
        }
        else if(e instanceof Analista){
            System.out.println("Es una analista.");
        }
        else if(e instanceof Empleado){
            System.out.println("Es un empleado.");
        }
    }

}
