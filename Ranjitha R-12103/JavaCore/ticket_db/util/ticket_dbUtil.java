package com.ticket_db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ticket_dbUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		final String URL = "jdbc:mysql://localhost:3306/ticket_db";
		final String User = "root";
		final String Pass = "Password@12345";

		try {
			con = DriverManager.getConnection(URL, User, Pass);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
	}

}
