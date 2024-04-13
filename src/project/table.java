/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author mymoo
 */
public class table {
    public static void main (String[] args) {
        Connection connection =null;
        Statement statement =null;
        try {
           connection=ConnectionHandler.getConnection();
           statement=connection.createStatement ();
           statement.executeUpdate ("create table users (name varchar (200),email varchar (200),password varchar (50), address varchar (200),securityQuestion varchar (200),answer varchar (200),status varchar (20))");
           statement.executeUpdate ("create table car (carID varchar (10),carModel varchar (200),totalSeats varchar (200), price int, status varchar (21))");
           statement.executeUpdate ("create table customer (id int, name varchar (200),mobileNumber varchar (30), gender varchar(50), nationality varchar(200), email varchar(200),  idNumber varchar(200), address varchar(450),checkIn varchar(50),carID varchar(20),carModel varchar(200),totalSeats varchar(200),pricePerDay int, numberOfDaysRent int,totalAmount varchar(200),checkOut varchar(60))");
            JOptionPane.showMessageDialog (null,"Table has been created successfully");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog (null,e);
        }
        finally {
            try {
             connection.close ();
             statement.close ();
            }
            catch (Exception e){

            }
        }
    }  
}