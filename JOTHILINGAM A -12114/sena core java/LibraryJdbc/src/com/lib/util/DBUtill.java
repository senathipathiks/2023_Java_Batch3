package com.lib.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {

	public static Connection getDBCOnnection() {
		Connection con=null;
		final String URL ="jdbc:mysql://localhost:3306/library";
		final String User="root";
		final String Pass="root";
		
		try {
			con=DriverManager.getConnection(URL,User,Pass);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
		
	}

}
