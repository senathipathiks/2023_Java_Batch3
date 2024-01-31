package com.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultsMetaDataEg {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/stud_db";
		final String User="root";
		final String pass="ahsiloniv@2000";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL,User,pass);
			PreparedStatement st=con.prepareStatement("Select* from studenttbl");
			
			ResultSet rs=st.executeQuery();
			
			ResultSetMetaData rsm=st.getMetaData();
			System.out.println("No of Columns:"+ rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1)+" "+rsm.getColumnName(2)+" "+rsm.getColumnClassName(3));
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
