package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SMSUtil {

		public static Connection getDBConnection() {
			
			Connection a =null;
			final String url = "jdbc:mysql://localhost:3306/sms2_db";
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
