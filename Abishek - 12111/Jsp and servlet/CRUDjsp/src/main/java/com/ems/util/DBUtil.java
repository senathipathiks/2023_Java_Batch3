package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/ems";
	private static final String user = "root";
	private static final String password = "Password@12345";
	
	public static Connection getDBConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}