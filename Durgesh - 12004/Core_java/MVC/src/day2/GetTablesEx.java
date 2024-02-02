package com.day2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class GetTablesEx {
	

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/dummy_db";
		final String user ="root";
		final String pass = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection n = DriverManager.getConnection(url,user,pass);
			DatabaseMetaData d = n.getMetaData();
			
			String t[]= {"Table"};
			
			ResultSet r = d.getTables(null, null, null, t);
			
			while(r.next()) {
				System.out.println(r.getString(3));
			}
			
			n.close();
	        }
		catch (Exception e) {
			System.out.println(e);			
		}
	}

}
