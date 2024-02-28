package com.crs.util;

import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		final String URL = "jdbc:mysql://localhost:3306/crs";
		final String User = "root";
		final String pass = "Prem@1234";

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(URL, User, pass);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}