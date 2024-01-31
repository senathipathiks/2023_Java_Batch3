package com.day29;

import java.sql.*;

public class JDBCMetaDataExample1 {
	private final static String url = "jdbc:mysql://localhost:3306/sms_db";
	private final static String user = "root";
	private final static String password = "sam@6383587926";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			DatabaseMetaData dbms = con.getMetaData();
			
			String table[] = {"Table"};
			
			ResultSet rs = dbms.getTables(null, null, null, table);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : "+rs.getString(3));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
