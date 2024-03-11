package com.employeeapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	
	public static Connection getConnetion() {
		
		Connection con = null;
		final String url = "jdbc:mysql://localhost:3306/ems_db";
		final String user = "root";
		final String Pass = "root";

		try {
			con = DriverManager.getConnection(url, user, Pass);

		} catch (SQLException e) {

			System.out.println(e);
		}
		
		return con;
		
	}

}
