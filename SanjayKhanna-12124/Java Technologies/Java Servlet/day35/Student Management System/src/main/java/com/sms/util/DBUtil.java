package com.sms.util;

import java.sql.*;

	public class DBUtil {
		
		private final static String url = "jdbc:mysql://localhost:3306/sample_db";
		private final static String user = "root";
		private final static String password = "sam@6383587926";
		
		public static Connection getDBConnection() {
			
			Connection con = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url,user,password);
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			return con;
		}

	}



