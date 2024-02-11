package com.ems.util;

import java.sql.*;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/ems";
	private static final String user = "root";
	private static final String password = "sam@6383587926";
	
	public static Connection getDBConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
