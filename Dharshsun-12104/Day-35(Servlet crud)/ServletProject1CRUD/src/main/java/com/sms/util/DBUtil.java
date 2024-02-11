package com.sms.util;

import java.sql.*;
public class DBUtil {

	public static Connection getDBConnection()
	{
		
		final String URL="jdbc:mysql://localhost:3306/sms_db";
		final String User="root";
		final String pass="Password@12345";
		Connection con = null;		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(URL,User,pass);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
