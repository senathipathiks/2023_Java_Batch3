package com.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection c =null;
		try {
			 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
		} catch (Exception e) {
			
			System.out.println(e);
		}
		return c;
	}
}
