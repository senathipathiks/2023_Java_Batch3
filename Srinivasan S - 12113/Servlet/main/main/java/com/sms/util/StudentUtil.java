package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentUtil {
	
	public static Connection getDBConnection(){
		Connection c=null;
		final String URL="jdbc:mysql://localhost:3306/student_management_sys";
		final String user="root";
		final String pwd="Admin@123";
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(URL,user,pwd);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return c;	
		
	}              
}
