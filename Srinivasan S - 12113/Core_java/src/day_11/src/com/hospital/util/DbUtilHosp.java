package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.hospital.bean.Hospital;

public class DbUtilHosp {
	
	public static Connection getDBConnection(){
		Connection c=null;
		final String URL="jdbc:mysql://localhost:3306/hospital_management";
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
