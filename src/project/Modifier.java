
package project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mymoo
 */
public class Modifier {

    public static void setData(String Query, String message) {
        Connection connection =null;
        Statement statement =null;
        try{
             connection=ConnectionHandler.getConnection();
             statement=connection.createStatement();
             statement.executeUpdate(Query);
             if(!message.equals(""))
              JOptionPane.showMessageDialog(null, message);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
        finally { 
            try{
                
            }
              catch(Exception e){
      
    }
        }
}}
