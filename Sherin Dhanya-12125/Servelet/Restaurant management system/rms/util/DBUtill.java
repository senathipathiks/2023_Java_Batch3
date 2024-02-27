package com.rms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {

	public static Connection getDBConnection() 
	{
		Connection con =null;
		final String URL="jdbc:mysql://localhost:3306/restaurant";
		final String User="root";
		final String pass="Password@12345";
		try {
			con =  DriverManager.getConnection(URL,User,pass);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
}

}