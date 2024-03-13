package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDBConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root", "Password@12345");
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
