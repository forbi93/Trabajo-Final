
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD{
    public static Connection getConexion(){
         Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/little_pets?user=root&password=");
            System.out.println("Conexion Satisftoria");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return con;
    }
    public static void main(String[] args){
     getConexion();
    }
}
