package com.day29;

import java.sql.*;

public class JDBCExample1 {
	private final static String url = "jdbc:mysql://localhost:3306/sms_db";
	private final static String user = "root";
	private final static String password = "sam@6383587926";
	

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select * from tbl_student");
			System.out.println("Records : ");
			while(result.next())
				System.out.println("Id : "+result.getInt(1)+"\tName : "+result.getString(2)+"\tGender : "+result.getString(3)+"\tAge : "+result.getInt(4)+"\tDepartment Id : "+result.getInt(5));		
			
			con.close();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
