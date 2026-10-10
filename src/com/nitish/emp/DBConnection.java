package com.nitish.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
     static Connection con;
     public static Connection createDBConnection(){

         try{
             // load the driver class
             Class.forName("com.mysql.cj.jdbc.Driver");
             // get connection
             String url = "jdbc:mysql://localhost:3306/employeeDB";
             String username="root";
             String password="password";
            con= DriverManager.getConnection(url,username,password);
         }catch (Exception e){
             e.printStackTrace();
         }
         return con;
     }
}
