package com.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil {

	public static Connection getDBConnection() {
		Connection con=null;
		final String URL="jdbc:mysql://localhost:3306/pms_db";
		final String User="root";
		final String Pass="ahsiloniv@2000";
		try {
			con=DriverManager.getConnection(URL,User,Pass);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
