package com.Ass.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/petition";
	private static final String user = "root";
	private static final String password = "root";
	
	public static Connection getDBConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(con);
		return con;
	}
}
