package com.practice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Iterator;

public class EmployeeUtil {

	public static Connection getDBConnection() {
		Connection c=null;
		final String URL="jdbc:mysql://localhost:3306/coffee_db";
		final String user="root";
		final String pwd="Admin@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(URL, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
