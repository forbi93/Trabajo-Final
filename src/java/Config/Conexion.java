
package Config;

import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/little_pets?user=root&password=");            
        } catch (Exception e) {
            
        }
    }
    public Connection getConnection(){
        return con;
    }
}
