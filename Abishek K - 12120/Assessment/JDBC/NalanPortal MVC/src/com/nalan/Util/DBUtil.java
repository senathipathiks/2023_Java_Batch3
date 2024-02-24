package com.nalan.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getDBConecction() throws SQLException {
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nalan", "root", "root");
	
	return con;
	
	}
	

}
