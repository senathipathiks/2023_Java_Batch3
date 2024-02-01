package com.exe.util;

import java.sql.*;

public class EmployeeUtil {

    public static Connection getDBConnection() {
        // TODO Auto-generated method stub
        
        Connection con=null;
        final String URL="jdbc:mysql://localhost:3306/jdbc";
        final String User="root";
        final String pass="Password@12345";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(URL,User,pass);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return con;
    }

}
