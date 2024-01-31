package com.JDBC_db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {

	public static Connection getDBConnection() {
		// TODO Auto-generated method stub
            Connection con=null;
            final String URL="jdbc:mysql://localhost:3306/JDBC_db";
        	final String User="root";
        	final String pass="Password@12345";
        	try {
        		Class.forName("com.mysql.jdbc.Driver");
        		 con=DriverManager.getConnection(URL,User,pass);
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        	return con;
	}

}
