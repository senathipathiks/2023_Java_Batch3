package com.ms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class VehicleUtil {

	
public static Connection getDBConnection(){
		
		Connection c = null;
		final String url = "jdbc:mysql://localhost:3306/vms";
		final String name = "root";
		final String pass = "root";
		
		try {
			c = DriverManager.getConnection(url,name,pass);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return c;
		
	}

}
