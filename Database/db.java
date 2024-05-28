/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*; //this is a pre-defined java package to doing the database interaction

/**
 *
 * @author sasin
 */
public class db {
   
    //a static method to connect the database
    public static Connection conn(){
        String url, user, pass; //declare the variables to assign the database details
        url = "jdbc:mysql://localhost:3306/passwordmanager"; //url of the database
        user = "root";// user name of the databse
        pass = "Pass@123"; //password of the database
        Connection con = null; //connection of the databse
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //called to the java mysql database connector
            con = DriverManager.getConnection(url,user,pass);// get the connection to the databse
            System.out.println("connect"); 
            
        }
        catch(Exception e)
                {
                    System.out.println(e);
                 } 
        
        return con; //return the connection
    }
}
