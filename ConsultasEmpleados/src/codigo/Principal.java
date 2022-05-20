package codigo;


import java.sql.*;


public class Principal {

    private static Connection conexion;
    private static Statement consulta;
    private static ResultSet resultado;
    private static final String RUTA = "jdbc:mysql://localhost:3306/empleados_departamentos";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    public static void main(String[] args) {
        mayorSalario();
        noComision();
        deVentas();
    }

    public static void mayorSalario(){
        try{
            conexion = DriverManager.getConnection(RUTA,USUARIO,CONTRASENA);
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT APELLIDO,SALARIO FROM EMPLEADOS ORDER BY SALARIO DESC LIMIT 1;");
            while (resultado.next()){
                System.out.println("El empleado con un mayor salario es "+resultado.getString("apellido")+
                        " y percibe un salario de "+resultado.getInt("salario"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        }catch (SQLException sqle){
            System.out.println("ERROR de conexion con la base de datos.");
        }
    }

    public static void noComision(){
        try{
            conexion = DriverManager.getConnection(RUTA,USUARIO,CONTRASENA);
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT APELLIDO FROM EMPLEADOS WHERE COMISION IS NULL;");
            System.out.println("Empleados que no tienen salario asignado:");
            while (resultado.next()){
                System.out.println(resultado.getString(1));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        }catch (SQLException sqle){
            System.out.println("ERROR de conexion con la base de datos.");
        }
    }

    public static void deVentas(){
        try{
            conexion = DriverManager.getConnection(RUTA,USUARIO,CONTRASENA);
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT APELLIDO FROM EMPLEADOS E INNER JOIN DEPARTAMENTOS D ON E.DEPT_NO=D.DEPT_NO WHERE D.DNOMBRE LIKE \"VENTAS\";");
            System.out.println("Empleados del departamento de ventas:");
            while (resultado.next()){
                System.out.println(resultado.getString(1));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        }catch (SQLException sqle){
            System.out.println("ERROR de conexion con la base de datos.");
        }
    }

}
