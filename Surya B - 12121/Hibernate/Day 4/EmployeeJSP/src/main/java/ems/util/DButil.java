package ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {

	public static Connection getDBConnection()
	{
		Connection con = null;
		final String URL = "jdbc:mysql://localhost:3306/employee";
		final String User = "root";
		final String pass = "root";
		
		try {
			//Class.forName("com.mysql.jdbc.Driver.class");
			con= DriverManager.getConnection(URL, User, pass);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		return con;
	
}
}
