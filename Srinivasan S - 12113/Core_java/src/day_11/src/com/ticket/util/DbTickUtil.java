package com.ticket.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbTickUtil {
	
	public static Connection getDBconnection() {
		Connection c=null;
		final String url="jdbc:mysql://localhost:3306/ticket_raising_system";
		final String user="root";
		final String pwd="Admin@123";
		
		try {
			c=DriverManager.getConnection(url, user, pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
		
	}
}
