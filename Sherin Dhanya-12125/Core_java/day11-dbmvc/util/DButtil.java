package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

// this util class is to establish the connection
public class DButtil {

	public static Connection getDBConnection() 
	{
		Connection con =null;
		final String URL="jdbc:mysql://localhost:3306/jdbc";
		final String User="root";
		final String pass="Password@12345";
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection(URL,User,pass);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
}
}