package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {

		Connection con = null;
		final String url = "jdbc:mysql://localhost:6703/jsptutorial";
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