package com.pay.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	public static Connection getDBConnection() {
        Connection con=null;
        final String URL="jdbc:mysql://localhost:3306/payroll";
        final String User="root";
        final String pass="root";
        try {
  
            con=DriverManager.getConnection(URL,User,pass);
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        return con;
    }


}
