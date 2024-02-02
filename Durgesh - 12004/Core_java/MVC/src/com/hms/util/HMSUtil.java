package com.hms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class HMSUtil {

	public static Connection getDBConnection() {
		Connection a = null;
		final String url = "jdbc:mysql://localhost:3306/hms_db";
		final String u = "root";
		final String p = "root";
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			a = DriverManager.getConnection(url,u,p);
//			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return a;

	}

	}
