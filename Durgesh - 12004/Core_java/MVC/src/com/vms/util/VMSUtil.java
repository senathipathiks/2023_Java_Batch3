package com.vms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class VMSUtil {

	public static Connection getDBConnection() {
		
		Connection a =null;
		final String url = "jdbc:mysql://localhost:3306/vms_db";
		final String u = "root";
		final String p = "root";
		try {
		          a = DriverManager.getConnection(url,u,p);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}
}
