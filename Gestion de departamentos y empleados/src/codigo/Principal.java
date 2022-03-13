package codigo;
/**
 * @author Juan Carlos Ruiz Garcia
 * @version 1
 * @date 22/02/2022
 * @description programa gestion de departamentos y de empleados
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Principal implements operacionesDepartamento,operacionesEmpleado {

    /**
     * Atributos de la clase Principal
     */
    private static boolean salir = false;//variable bandera que controla la ejecucion del programa
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private int final TAM = 5;//constante que determina el tamano del array de departamentos
    private Departamento[] departamentos = new Departamento[p.TAM];
    private int numeroDepartamentos = 0;//variable de control con el numero de departamentos ocupados
    private int posicionInserciones = 0;//variable donde se hara la proxima insercion
    private static Principal p = new Principal();

    /**
     * Metodo main con la ejecucion del programa
     * @param args
     */
    public static void main(String[] args) {
        p.cargaAutomaticaConComposicion();
        //p.cargaAutomaticaConAgregacion();
        System.out.println(p.buscarDepartamento("Logistica"));
        System.out.println("Programa de gestion de departamentos y empleados, versión 1.0");
        do {
            try {
                System.out.println("Introduzca:\n1 - Para gestionar los departamentos.\n2 - Para gestionar los empleados.\n0 - Para salir.");
                switch (Integer.parseInt(br.readLine())) {
                    case 1:
                        p.menuDepartamentos();
                        break;
                    case 2:
                        p.menuEmpleados();
                        break;
                    case 0:
                        salir = true;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (!salir);
    }

    public void menuDepartamentos() throws IOException {
        System.out.println("Menu de gestion de departamentos.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Mostrar un departamento.");
        System.out.println("2 - Insertar un departamento.");
        System.out.println("3 - Borrar un departamento.");
        System.out.println("4 - Modificar un departamento.");
        System.out.println("0 - Volver al menu anterior.");
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                p.mostrarDepartamentos();
                break;
            case 2:
                p.mostrarDepartamentos();
                p.insertarDepartamentoSinEmpleadosInteractivo();
                break;
            case 3:
                p.mostrarDepartamentos();
                p.borrarDepartamentoInteractivo();
                break;
            case 4:
                p.mostrarDepartamentos();
                p.modificarDepartamentoInteractivo();
                break;
            case 0:
                break;
        }
    }

    public void modificarDepartamentoInteractivo() throws IOException {
        int[] datos = new int[2];
        if (p.departamentosVacio()) {
            System.out.println("No hay ningun departamento registrado.");
        } else {
            System.out.println("Introduzca el numero de departamento del que quiere realizar una modificacion:");
            datos[0] = p.existeDepartamento(Integer.parseInt(br.readLine()));
            if (datos[0] == -1) {
                System.out.println("Ese departamento no existe.");
            } else {
                System.out.println("¿Que dato quiere modificar?");
                System.out.println("1 - Para numero.\n2 - Para nombre.\n3 - Para localizacion.");
                datos[1] = Integer.parseInt(br.readLine());
                p.modificarDepartamento(datos);
            }
        }
    }

    public void modificarDepartamento(int[] datos) throws IOException {
        switch (datos[1]) {
            case 1:
                p.modificarNumeroDepartamenteInteractivo(datos[0]);
                break;
            case 2:
                p.modificarNombreDepartamenteInteractivo(datos[0]);
                break;
            case 3:
                p.modificarLocalizacionDepartamenteInteractivo(datos[0]);
                break;
        }
    }

    public void modificarNumeroDepartamento(int departamento, int nuevo_dept_no) {
        departamentos[departamento].setDept_no(nuevo_dept_no);
    }

    public void modificarNumeroDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca el nuevo numero de departamento");
        try {
            p.modificarNumeroDepartamento(departamento, Integer.parseInt(br.readLine()));
        } catch (NumberFormatException nfe) {
            System.out.println("Ese no es un numero de departamento valido.");
        }
    }

    public void modificarNombreDepartamento(int departamento, String nombre) {
        departamentos[departamento].setDnombre(nombre);
    }

    public void modificarNombreDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca el nuevo nombre del departamento");
        p.modificarNombreDepartamento(departamento, br.readLine());
    }

    public void modificarLocalizacionDepartamento(int departamento, String localizacion) {
        departamentos[departamento].setLocalizacion(localizacion);
    }

    public void modificarLocalizacionDepartamenteInteractivo(int departamento) throws IOException {
        System.out.println("Introduzca la nueva localizacion del departamento");
        p.modificarLocalizacionDepartamento(departamento, br.readLine());
    }

    public void menuEmpleados() throws IOException {
        System.out.println("Menu de gestion de empleados.\nSeleccione que operacion quiere realizar:");
        System.out.println("1 - Insertar un empleado.");
        System.out.println("2 - Mostrar empleados.");
        System.out.println("3 - Modificar un empleado.");
        System.out.println("4 - Borrar un empleado.");
        System.out.println("5 - Carga automatica.");
        System.out.println("0 - Volver al menu anterior.");
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                p.mostrarDepartamentosEmpleados();
                p.insertarEmpleadoInteractivo();
                break;
            case 2:
                p.mostrarDepartamentosEmpleados();
                break;
            case 3:
                p.mostrarDepartamentosEmpleados();
                p.modificarEmpleadoInteractivo();
                break;
            case 4:
                p.mostrarDepartamentosEmpleados();
                p.borrarEmpleadoInteractivo();
                break;
            case 5:
                break;
            case 0:
                break;
        }
    }

    public void cargaAutomaticaConComposicion() {
        departamentos[0] = new Departamento(7, "Ventas", "Madrid");//creo el primer departamento por composicion
        departamentos[1] = new Departamento(2, "Logistica", "Barcelona");//creo el segundo departamento por composicion
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public void cargaAutomaticaConAgregacion() {
        int tamanoEmpleados = TAM;//tamano de los array de empleados

        //creacion del array de empleados de ventas y 2 empleados
        Empleado[] empleadosVentas = new Empleado[tamanoEmpleados];
        empleadosVentas[0] = new Analista(20, "Luis", LocalDate.of(1980, 4, 10), 2600, null);
        empleadosVentas[1] = new Director(10, "Maria", LocalDate.of(1980, 4, 10), 3000, null, 600);

        //creacion del array de empleados de logistica y 2 empleados
        Empleado[] empleadosLogistica = new Empleado[tamanoEmpleados];
        empleadosLogistica[0] = new Analista(29, "Luisa", LocalDate.of(1989, 6, 15), 1900, null);
        empleadosLogistica[1] = new Director(3, "Mario", LocalDate.of(2012, 10, 2), 2700, null, 200);

        //creacion del primer departamento de ventas
        departamentos[0] = new Departamento(7, "Ventas", "Madrid", empleadosVentas);

        //creacion del segundo departamento de logistica
        departamentos[1] = new Departamento(2, "Logistica", "Barcelona", empleadosLogistica);

        //asignacion del departamento a los empleados del primer departamento, ventas
        departamentos[0].getEmpleados()[0].setDepartamentoEmpleado(departamentos[0]);
        departamentos[0].getEmpleados()[1].setDepartamentoEmpleado(departamentos[0]);

        //asignacion del departamento a los empleados del segundo departamento, logistica
        departamentos[1].getEmpleados()[0].setDepartamentoEmpleado(departamentos[1]);
        departamentos[1].getEmpleados()[1].setDepartamentoEmpleado(departamentos[1]);
        numeroDepartamentos = 2;
        posicionInserciones = 2;
    }

    public void mostrarDepartamentos() {
        if (p.departamentosVacio()) {//si no hay datos, no muestra departamentos
            System.out.println("No hay ningun departamento que mostrar.");
        } else {//si los hay, muestra los departamentos
            for (int i = 0; i < TAM; i++) {
                if (departamentos[i] != null) System.out.println(departamentos[i]);
            }
        }
    }

    public void mostrarDepartamentosEmpleados() {
        if (p.departamentosVacio()) {//si no hay datos, no muestra nada
            System.out.println("No hay ningun dato que mostrar.");
        } else {//si los hay, ejecuta el metodo
            for (int i = 0; i < TAM; i++) {//bucle que recorre los departamentos
                if (departamentos[i] != null) {
                    System.out.println("\nEl departamento de " + departamentos[i].getDnombre() +
                            " con numero de departamento " + departamentos[i].getDept_no() +
                            " esta ubicado en " + departamentos[i].getLocalizacion());
                    for (int j = 0; j < departamentos[i].getEmpleados().length; j++) {//bucle que recorre los empleados
                        if (departamentos[i] != null && departamentos[i].getEmpleados()[j] != null) {
                            if(departamentos[i].getEmpleados()[j] instanceof Director){
                                System.out.println("\tEl Director " + departamentos[i].getEmpleados()[j].getApellido() +
                                        " con numero de empleado " + departamentos[i].getEmpleados()[j].getNumeroEmpleado() +
                                        " se dio de alta el dia " + departamentos[i].getEmpleados()[j].getFechaAlta() +
                                        " percibe un salario de " + departamentos[i].getEmpleados()[j].getSalario() +
                                        " percibe una comision de " + ((Director)departamentos[i].getEmpleados()[j]).getComision());
                            }
                            else{
                                System.out.println("\tEl Analista " + departamentos[i].getEmpleados()[j].getApellido() +
                                        " con numero de empleado " + departamentos[i].getEmpleados()[j].getNumeroEmpleado() +
                                        " se dio de alta el dia " + departamentos[i].getEmpleados()[j].getFechaAlta() +
                                        " percibe un salario de " + departamentos[i].getEmpleados()[j].getSalario());
                            }
                        }
                    }
                }
            }
            System.out.println("\nHay " + numeroDepartamentos + " departamentos registrados en el sistema.");
            if (numeroDepartamentos == TAM) {
                System.out.println("\nLa estructura esta llena.");
            } else {
                System.out.println("\nEl proximo departamento se insertara en la posicion " + (posicionInserciones + 1) + ".");
            }
        }
    }

    //departamentos llenos
    public boolean departamentosLLeno() {
        return numeroDepartamentos == TAM;
    }

    //departamentos vacios
    public boolean departamentosVacio() {
        return numeroDepartamentos == 0;
    }

    //metodo para insertar un departamento sin empleados, retorna -1 si no se ha podido insertar o la posicion en la que se ha insertado y recibe por argumentos los 3 atributos de los departamentos
    public void insertarDepartamentoSinEmpleadosInteractivo() throws IOException {
        if (p.departamentosLLeno()) {
            System.out.println("No se pueden insertar mas departamentos.");
        } else {
            try {
                System.out.println("Introduzca el numero de departamento:");
                int nDpto = Integer.parseInt(br.readLine());
                System.out.println("Introduzca el nombre del departamento:");
                String nomDpto = br.readLine();
                System.out.println("Introduzca donde se ubica el departamento:");
                String locDpto = br.readLine();
                p.insertarDepartamentoSinEmpleados(nDpto, nomDpto, locDpto);
            } catch (NumberFormatException nfe) {
                System.out.println("Lo que ha introducido como numero de departamento, no es un numero.");
            }
        }
    }

    public void insertarDepartamentoSinEmpleados(int nDpto, String nomDpto, String locDpto) {
        departamentos[p.buscaHueco()] = new Departamento(nDpto, nomDpto, locDpto);
        numeroDepartamentos++;
    }

    //modificarlo a que retorne un int, -1 si no encontrado o numero encontrado
    public int buscaHueco() {
        boolean noEncontrado = false;
        int i = 0;
        do {
            if (departamentos[i] == null) {
                noEncontrado = true;
            } else i++;
        }
        while (!noEncontrado && i < TAM);
        if (noEncontrado) return i;
        else return -1;
    }

    //existe departamento, devuelve -1 si no existe o devuelve la posicion del array donde se encuentra dicho departamento
    public int existeDepartamento(int num) {
        boolean encontrado = false;
        int contador = 0;
        do {
            if (departamentos[contador] != null && departamentos[contador].getDept_no() == num) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while (!encontrado && contador < TAM);
        if (encontrado) return contador;
        else return -1;
    }

    //borrar departamento recibe el numero de departamento a borrar, devuelve 1 si se ha borrado correctamente y 0 en caso contrario
    public int borrarDepartamento(int numero) {
        int borrado = 1;//retorno de 1 si ha borrado correctamente
        if (p.departamentosVacio()) {
            borrado = 0;//no hay departamentos a borrar
        } else {
            if (p.existeDepartamento(numero) == -1) {
                borrado = -1;//no existe el departamento elegido
            } else if (p.existeDepartamento(numero) == -2) {
                borrado = -2;//no hay ningun departamento registrado
            } else {
                departamentos[p.existeDepartamento(numero)] = null;
                posicionInserciones = numero;
                numeroDepartamentos--;
            }
        }
        return borrado;
    }

    //interactura con el usuario para borrar un departamento.
    public void borrarDepartamentoInteractivo() throws IOException {
        if (p.departamentosVacio()) {
            System.out.println("No hay ningun departamento registrado.");
        } else {
            System.out.println("Introduzca el numero de departamento que quiere borrar:");
            int departamentoBorrar = Integer.parseInt(br.readLine());
            switch (p.borrarDepartamento(departamentoBorrar)) {
                /**
                 * case 0:
                 *                     System.out.println("No hay ningun departamento registrado en el sistema.");
                 *                     break;
                 */
                case 1:
                    System.out.println("El departamento ha sido eliminado del sistema.");
                    break;
                case -1:
                    System.out.println("El departamento elegido no existe.");
                    break;
            }
        }
    }

    //devuelve -1 si no existe empleado, o la posicion del empleado buscado en un departamento
    public int existeEmpleados(Departamento d, int num) {
        boolean encontrado = false;
        int contador = 0;
        int dptoBuscar = p.existeDepartamento(d.getDept_no());
        do {
            if (departamentos[dptoBuscar].getEmpleados()[contador] != null && departamentos[dptoBuscar].getEmpleados()[contador].getNumeroEmpleado() == num) {
                encontrado = true;
            } else {
                contador++;
            }
        }
        while (!encontrado && contador < departamentos[dptoBuscar].getTAMANO());
        if (encontrado) return contador;
        else return -1;
    }

    public boolean empleadosVacio(Departamento d) {
        return d.getNumeroEmpleados() == 0;
    }

    public boolean empleadosLLeno(Departamento d) {
        return d.getNumeroEmpleados() == d.getTAMANO();
    }

    public void mostrarEmpleados(Departamento d) {
        if (p.empleadosVacio(d)) {
            System.out.println("No existen empleados registrados en el departamento " + d.getDnombre());
        } else {
            for (int i = 0; i < d.getEmpleados().length; i++) {//bucle que recorre los empleados
                if (d.getEmpleados()[i] != null) {
                    System.out.println("\tEl empleado " + d.getEmpleados()[i].getApellido() +
                            " con numero de empleado " + d.getEmpleados()[i].getNumeroEmpleado() +
                            " se dio de alta el dia " + d.getEmpleados()[i].getFechaAlta() +
                            " percibe un salario de " + d.getEmpleados()[i].getSalario());
                }
            }
            System.out.println("Hay " + d.getNumeroEmpleados() + " empleados en el departamento " + d.getDnombre());
            if (d.getNumeroEmpleados() == d.getTAMANO()) {
                System.out.println("La estructura esta llena.");
            } else {
                System.out.println("El proximo empleado se insertara en la posicion " + (d.getPosicionInserciones() + 1) + ".");
            }
        }
    }

    //metodo para insertar un empleado en un departamento, recibe un empleado y un departamento, 1 ok, 0 ya existe, -1 esta lleno. modificarlo para que lo haga aqui con el getter
    public int insertarEmpleado(Empleado emp, Departamento dept) {
        //dept.insertarEmpleado(emp);
        dept.getEmpleados()[p.buscarHuecoEmpleados(dept)]=emp;
        dept.setPosicionInserciones(p.buscarHuecoEmpleados(dept));
        dept.setNumeroEmpleados(dept.getNumeroEmpleados()+1);
        return 1;
    }

    //metodo interactivo para insertar un empleado en un departamento
    public void insertarEmpleadoInteractivo() throws IOException{
        System.out.println("Seleccione en que departamento quiere insertar un empleado.");
        int deptInsertar = Integer.parseInt(br.readLine());//lee el numero de departamento
        int posDeptInsertar = p.existeDepartamento(deptInsertar);//convierte el numero de departamento en la posicion del departamento
        if (posDeptInsertar == -1){//comrpueba que exista el departamento elegido
            System.out.println("El departamento elegido no existe.");
        }
        else{
            if (p.empleadosLLeno(departamentos[posDeptInsertar])){//comprueba que no este lleno el array de empleados del departamento
                System.out.println("No caben mas empleados en este departamento.");
            }
            else{
                Empleado emp;//objeto empleado
                System.out.println("Indique el numero del empleado:");
                int numEmp = Integer.parseInt(br.readLine());//numero de empleado
                if (p.existeEmpleados(departamentos[posDeptInsertar], numEmp) != -1){//comprueba si ya existe ese empleado
                    System.out.println("Ese empleado ya existe en el departamento.");
                }
                else{
                    System.out.println("Que quiere insertar:\n1 - Un analista.\n2 - Un Director.");
                    int tipoEmpleado = Integer.parseInt(br.readLine());//tipo empleado
                    System.out.println("Indique el apellido del empleado:");
                    String apellidoEmp = br.readLine();//apellido de empleado
                    System.out.println("Indique la fecha de alta del empleado:\nFormato aaaa-mm-dd");
                    LocalDate fechaAltaEmp = LocalDate.parse(br.readLine());//fecha de alta de empleado
                    System.out.println("Indique el salario del empleado:");
                    double salarioEmp = Integer.parseInt(br.readLine());//salario de empleado
                    if(tipoEmpleado == 1){//si es analista, llama a su constructor
                        emp = new Analista(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos[posDeptInsertar]);
                    }
                    else{//si es director pide la comision y llama a su constructor
                        System.out.println("Indique la comision del empleado:");
                        double comisionEmp = Integer.parseInt(br.readLine());//comision de director
                        emp = new Director(numEmp,apellidoEmp,fechaAltaEmp,salarioEmp,departamentos[posDeptInsertar],comisionEmp);
                    }
                    if(insertarEmpleado(emp,departamentos[posDeptInsertar]) == 1){//llama a insertar empleado con el empleado y el departamento, si es 1 se ha insertado correctamente
                        System.out.println("Operacion realizada correctamente.");
                    }
                }
            }
        }
    }

    //metodo para borrar un empleado, devuelve -1 si no existe el empleado,0 si esta vacio, 1 si se ha realizado correctamente
    public int borrarEmpleado(int numeroEmpleado, Departamento dept){
        int posicionEmpleado = p.existeEmpleados(dept,numeroEmpleado);
        if(p.empleadosVacio(dept)){
            return 0;
        }
        else if(posicionEmpleado == -1){
            return -1;//no existe el empleado
        }
        else{
            dept.getEmpleados()[posicionEmpleado]=null;
            dept.setNumeroEmpleados(dept.getNumeroEmpleados()-1);
            dept.setPosicionInserciones(dept.getPosicionInserciones()-1);
            return 1;//se ha eliminado el empleado
        }
    }

    //metodo interactivo para borrar un empleado
    public void borrarEmpleadoInteractivo() throws IOException{
        if(p.departamentosVacio()){//control de error si no hay departamentos registrados
            System.out.println("No hay ningún departamento");
        }
        else{
            System.out.println("Introduzca el numero de departamento del que quiere borrar un empleado:");
            int numeroDepartamento = Integer.parseInt(br.readLine());
            int posicionDepartamento = p.existeDepartamento(numeroDepartamento);
            if(posicionDepartamento == -1){//control de error si no existe el departamento
                System.out.println("No existe el departamento elegido.");
            }
            else{
                System.out.println("Introduzca el numero de empleado que quiere borrar");
                int numeroEmpleado = Integer.parseInt(br.readLine());
                switch (p.borrarEmpleado(numeroEmpleado,departamentos[posicionDepartamento])){
                    case -1:
                        System.out.println("No existe el empleado elegido.");
                        break;
                    case 0:
                        System.out.println("No hay empleados registrados en ese departamento.");
                        break;
                    case 1:
                        System.out.println("Operacion realizada correctamente.");
                        break;
                }
            }
        }
    }

    //metodo que busca el hueco de insercion de empleados en el departamento elegido, retorna -1 no encontrado o la posicion
    public int buscarHuecoEmpleados(Departamento dept){
        boolean noEncontrado = false;
        int i = 0;
        do{
            if(dept.getEmpleados()[i] == null){
                noEncontrado = true;
            } else i++;
        }
        while(!noEncontrado && i < dept.getTAMANO());
        if(noEncontrado) return i;
        else return -1;
    }

    public int buscarDepartamento(String nombreDepartamento){
        boolean encontrado = false;
        int contador = 0;
        do{
            if(departamentos[contador] != null && departamentos[contador].getDnombre() == nombreDepartamento){
                encontrado = true;
            }else{
                contador++;
            }
        }
        while(!encontrado && contador < TAM);
        if (encontrado) return contador;
        else return -1;
    }

    //implementar buscar departamento interactivo

    public void modificarEmpleadoInteractivo() throws IOException {
        int[] datos = new int[3];
        if(p.departamentosVacio()){
            System.out.println("No hay ningun departamento registrado.");
        }
        else{
            System.out.println("Introduzca el numero de departamento:");
            datos[0] = p.existeDepartamento(Integer.parseInt(br.readLine()));
            if (datos[0] == -1){
                System.out.println("Ese departamento no existe.");
            }
            else{
                System.out.println("Introduza el numero de empleado del que quiere realizar una modificacion:");
                datos[1] = p.existeEmpleados(departamentos[datos[0]],Integer.parseInt(br.readLine()));
                if(datos[1] == -1){
                    System.out.println("Ese empleado no existe.");
                }
                else{
                    System.out.println("¿Que dato quiere modificar?");
                    System.out.println("1 - Para numero del empleado.");
                    System.out.println("2 - Para apellido del empleado.");
                    System.out.println("3 - Para fecha de alta del empleado.");
                    System.out.println("4 - Para salario del empleado.");
                    if(departamentos[datos[0]].getEmpleados()[datos[1]] instanceof Director){
                        System.out.println("5 - Para comision del director.");
                    }
                    datos[2] = Integer.parseInt(br.readLine());
                    p.modificarEmpleado(datos);
                }
            }
        }
    }

    public void modificarEmpleado(int[] datos) throws IOException {
        switch (datos[2]){
            case 1:
                p.modificarNumeroEmpleadoInteractivo(datos);
                break;
            case 2:
                p.modificarApellidoEmpleadoInteractivo(datos);
                break;
            case 3:
                p.modificarFechaAltaEmpleadoInteractivo(datos);
                break;
            case 4:
                p.modificarSalarioEmpleadoInteractivo(datos);
                break;
            case 5:
                if(departamentos[datos[0]].getEmpleados()[datos[1]] instanceof Director){
                    p.modificarComisionDirectorInteractivo(datos);
                }
                break;
        }
    }

    public void modificarNumeroEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca el nuevo numero del empleado:");
        int numeroEmpleado = Integer.parseInt(br.readLine());
        departamentos[datos[0]].getEmpleados()[datos[1]].setNumeroEmpleado(numeroEmpleado);
    }

    public void modificarApellidoEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca el nuevo apellido del empleado:");
        String apellidoEmpleado = br.readLine();
        departamentos[datos[0]].getEmpleados()[datos[1]].setApellido(apellidoEmpleado);
    }

    public void modificarFechaAltaEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca la nueva fecha de alta del empleado.\n(Formato aaaa-mm-dd)");
        LocalDate fechaAltaEmpleado = LocalDate.parse(br.readLine());
        departamentos[datos[0]].getEmpleados()[datos[1]].setFechaAlta(fechaAltaEmpleado);
    }

    public void modificarSalarioEmpleadoInteractivo(int[] datos) throws IOException{
        System.out.println("Introduza el nuevo salario del empleado.");
        double salarioEmpleado = Double.parseDouble(br.readLine());
        departamentos[datos[0]].getEmpleados()[datos[1]].setSalario(salarioEmpleado);
    }

    public void modificarComisionDirectorInteractivo(int[] datos) throws IOException{
        System.out.println("Introduzca la nueva comision del director:");
        double comisionDirector = Double.parseDouble(br.readLine());
        ((Director)departamentos[datos[0]].getEmpleados()[datos[1]]).setComision(comisionDirector);
    }
}


