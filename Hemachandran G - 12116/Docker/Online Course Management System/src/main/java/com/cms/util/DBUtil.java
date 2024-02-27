package com.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static final String url = "jdbc:mysql://127.0.0.1:6703/oms_db";
	private static final String user = "root";
	private static final String password = "jsppassword";
	
	public static Connection getDBConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}}
