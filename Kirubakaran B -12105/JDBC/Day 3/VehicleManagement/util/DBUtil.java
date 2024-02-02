package com.veh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() {
		Connection c=null;
		final String URL="jdbc:mysql://localhost:3306/vehicle";
		final String user="root";
		final String pwd="root";
		  try {
			 c=DriverManager.getConnection(URL,user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
		
		 

}
