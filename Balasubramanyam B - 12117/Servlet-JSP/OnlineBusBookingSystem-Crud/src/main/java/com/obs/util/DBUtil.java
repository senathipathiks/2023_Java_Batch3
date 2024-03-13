package com.obs.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private static final String url = "jdbc:mysql://localhost:3306/obs";
	private static final String user = "root";
	private static final String password = "root";
	
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
