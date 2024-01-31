package com.stu_db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
//establishing the connection
	public static Connection getDBConnection() {
		Connection con=null;
		

		final String url="jdbc:mysql://localhost:3306/stu_db";
		final String User="root";
		final String pass="Password@12345";
		
		try {
			
			con=DriverManager.getConnection(url,User,pass);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
		

	}

}
