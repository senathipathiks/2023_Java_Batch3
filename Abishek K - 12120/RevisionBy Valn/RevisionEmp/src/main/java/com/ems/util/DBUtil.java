package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getDBConnection() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision", "root", "root");
		
		return con;
	}

}
