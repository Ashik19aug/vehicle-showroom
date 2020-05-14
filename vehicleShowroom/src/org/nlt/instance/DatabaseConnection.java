package org.nlt.instance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private Connection conn;
    private static DatabaseConnection databasecon;
    private DatabaseConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver access Successful");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleShowroom", "root", "");
            System.out.println("Connection Successful");
        } catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    public static DatabaseConnection getDatabaseConnection()
    {
        if(databasecon==null)
        {
            databasecon = new DatabaseConnection();
        }
        return databasecon;
    }
    
    public static void main(String[] args){
        new DatabaseConnection();
    }
    
    public Connection getConnection()
    {
        return conn;
    }
}
