package com.ofdm.util;

import java.sql.*;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/ofdm_db";
	private static final String user = "root";
	public static final String password = "sam@6383587926";
	
	
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
