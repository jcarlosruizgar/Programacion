package codigo;

public class Principal {

    private static Departamento[] listadoDepartamentos;

    public static void main(String[] args) {

        listadoDepartamentos = new Departamento[5];
        listadoDepartamentos[0] = new Departamento(15,"Ventas","Barcelona");
        listadoDepartamentos[1] = new Departamento(7,"Innovacion","Madrid");

        System.out.println(listadoDepartamentos[0]);

        esInstanciaDe(listadoDepartamentos[0].getListaEmpleados()[0]);
        esInstanciaDe(listadoDepartamentos[0].getListaEmpleados()[1]);

        listadoDepartamentos[0].getListaEmpleados()[0].saludar();
        listadoDepartamentos[0].getListaEmpleados()[1].saludar();


        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0].salarioAnual());
        System.out.println(listadoDepartamentos[0].getListaEmpleados()[1].salarioAnual());

        System.out.println(listadoDepartamentos[0].getListaEmpleados()[0]);

        System.out.println(sueldoMayor());

        System.out.println(posicionDepartamento(15));

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

    //sueldoMayor no recibe nada, retorna el apellido del empleado con el mayor sueldo
    public static String sueldoMayor(){
        double max = 0;
        String apellido = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (listadoDepartamentos[i]!=null && listadoDepartamentos[i].getListaEmpleados()[j]!=null && listadoDepartamentos[i].getListaEmpleados()[j].getSalario() > max){
                    max = listadoDepartamentos[i].getListaEmpleados()[j].getSalario();
                    if(listadoDepartamentos[i].getListaEmpleados()[j].getSalario()==max)
                        apellido = listadoDepartamentos[i].getListaEmpleados()[j].getApellido();
                }
            }
        }
        return apellido;
    }

    //metodo para convertir el numero de departemento en la posicion del array
    public static int posicionDepartamento(int dept_no) {
        int posLoc = -1;
        for (int i = 0; i < listadoDepartamentos.length; i++) {
            if (listadoDepartamentos[i] != null && listadoDepartamentos[i].getDept_no() == dept_no) {
                posLoc = i;
                i = listadoDepartamentos.length;
            }
        }
        return posLoc;
    }

}
