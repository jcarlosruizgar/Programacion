package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;



public class Principal {

    private static Connection conexion;
    private static Statement consulta;
    private static ResultSet resultado;
    private static final String RUTADB = "jdbc:mysql://localhost:3306/inmuebles";
    private static final String usuario = "root";
    private static final String contrasena = "";
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static boolean salir = false;
    private static int opcion;

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Conexion con la base de datos inmuebles, tabla provincias.");
                System.out.println("Operaciones disponibles:");
                System.out.println("1 - Mostrar provincias.");
                System.out.println("2 - Insertar una provincia.");
                System.out.println("3 - Modificar id de una provincia.");
                System.out.println("4 - Modificar nombre de una provincia.");
                System.out.println("5 - Borrar una provincia.");
                System.out.println("0 - Salir del programa.");
                opcion = Integer.parseInt(br.readLine());
                switch(opcion) {
                    case 1:
                        mostrarProvincias();
                        break;
                    case 2:
                        insertarProvinciaInteractivo();
                        break;
                    case 3:
                        modificarIdProvinciaInteractivo();
                        break;
                    case 4:
                        modificarNombreProvinciaInteractivo();
                        break;
                    case 5:
                        borrarProvinciaInteractivo();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("Cerrando el programa...");
                        break;
                    default:
                        System.out.println("Eso no es una opcion correcta.");
                        break;
                }
            }catch(IOException ioe) {
                System.out.println("Error de E/S.");
            }catch(Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if(conexion != null) conexion.close();
                    if(consulta != null) consulta.close();
                    if(resultado != null) resultado.close();
                }catch(Exception ignored) {
                }
            }
        }while(!salir);
    }

    public static void mostrarProvincias() {
        try {
            conexion = DriverManager.getConnection(RUTADB, usuario, contrasena);
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provincias_programacion;");
            while (resultado.next()) {
                System.out.println("ID de provincia "+resultado.getInt("id")+
                        " nombre de la provincia "+resultado.getString("nombre"));
            }
            resultado.close();
            consulta.close();
            conexion.close();
        }catch(SQLException ex) {
            System.out.println("Error de conexion con la base de datos.");
        }
    }

    public static void insertarProvincia(String provincia) {
        try {
            conexion = DriverManager.getConnection(RUTADB, usuario, contrasena);
            consulta = conexion.createStatement();
            consulta.executeUpdate("insert into provincias_programacion (nombre) values (\""+provincia+"\");");
            consulta.close();
            conexion.close();
        }catch(SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion con la base de datos.");
        }
    }

    public static void insertarProvinciaInteractivo() throws IOException{
        System.out.println("Introduza el nombre de la provincia a insertar");
        String provincia = br.readLine();
        insertarProvincia(provincia);
    }

    public static void modificarNombreProvincia(int id,String provincia) {
        try {
            conexion = DriverManager.getConnection(RUTADB, usuario, contrasena);
            consulta = conexion.createStatement();
            consulta.executeUpdate("update provincias_programacion set nombre=\""+provincia+"\" where id="+id+";");
            consulta.close();
            conexion.close();
        }catch(SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion con la base de datos.");
        }
    }

    public static void modificarNombreProvinciaInteractivo() throws IOException{
        mostrarProvincias();
        System.out.println("Introduza el id de la provincia a modificar:");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Introduza el nuevo nombre de la provincia:");
        String nombre = br.readLine();
        modificarNombreProvincia(id,nombre);
        System.out.println("Operacion realizada con exito.");
    }

    public static void modificarIdProvincia(int viejoId,int nuevoId) {
        try {
            conexion = DriverManager.getConnection(RUTADB, usuario, contrasena);
            consulta = conexion.createStatement();
            consulta.executeUpdate("update provincias_programacion set id="+nuevoId+" where id="+viejoId+";");
            consulta.close();
            conexion.close();
        }catch(SQLIntegrityConstraintViolationException sqlicve) {
            System.out.println("Error, ya existe ese id de provincia.");
        }catch(SQLException ex) {
            System.out.println("Error de conexion con la base de datos.");
        }
    }

    public static void modificarIdProvinciaInteractivo() throws IOException{
        mostrarProvincias();
        System.out.println("Introduza el id de la provincia a modificar:");
        int viejoId = Integer.parseInt(br.readLine());
        System.out.println("Introduza el nuevo ie de la provincia:");
        int nuevoId = Integer.parseInt(br.readLine());
        modificarIdProvincia(viejoId,nuevoId);
        System.out.println("Operacion realizada con exito.");
    }

    public static void borrarProvincia(int id) {
        try {
            conexion = DriverManager.getConnection(RUTADB, usuario, contrasena);
            consulta = conexion.createStatement();
            consulta.executeUpdate("delete from provincias_programacion where id ="+id+";");
            consulta.close();
            conexion.close();
        }catch(SQLException ex) {
            System.out.println("Error de conexion con la base de datos.");
        }
    }

    public static void borrarProvinciaInteractivo()throws IOException{
        mostrarProvincias();
        System.out.println("Introduza el id de la provincia a borrar:");
        int id = Integer.parseInt(br.readLine());
        borrarProvincia(id);
        System.out.println("Operacion realizada con exito.");
    }

}
