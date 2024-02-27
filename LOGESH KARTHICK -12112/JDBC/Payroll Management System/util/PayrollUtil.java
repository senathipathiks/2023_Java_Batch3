package com.ms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class PayrollUtil {


		public static Connection getDBConnection()
		{
			Connection con=null;
			final String URL="jdbc:mysql://localhost:3306/pms";
			final String User="root";
			final String pass="Password@12345";
					
			try {
//				Class.forName("com.mysql.jdbc.Driver");
			
				con=DriverManager.getConnection(URL,User,pass);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return con;
		}
	

	}


