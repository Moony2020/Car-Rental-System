/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mymoo
 */
public class SelectData {
    public static ResultSet getData(String query){ // passing the query & no need for the second value which is the message as i did modfier class
        Connection connection =null;
        Statement statement =null;
        ResultSet resultset =null;
        
         try{
            connection=ConnectionHandler.getConnection();
            statement=connection.createStatement();
            resultset = statement.executeQuery(query); // i will pass the query that i will get it from login page & return the result
             return resultset;                      
            
        
        }
        catch(Exception e){
              JOptionPane.showMessageDialog (null,e); 
              return null;
        }
       
    }
    
}
