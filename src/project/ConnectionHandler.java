package project;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author mymoo
 */
public class ConnectionHandler {
    public static Connection getConnection ( ) {
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", "12345");
            return connection;
        } catch ( Exception e ) {
            return null;
        }

    }
}