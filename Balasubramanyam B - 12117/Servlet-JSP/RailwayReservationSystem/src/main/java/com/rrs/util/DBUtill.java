package com.rrs.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	private static final String url = "jdbc:mysql://127.0.0.1:6703/rrs";
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
