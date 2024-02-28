package com.rms.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/rms";
		String User = "root";
		String pass = "Prem@1234";

		Connection con = DriverManager.getConnection(URL,User, pass);

		return con;
	}

}
