package com.day1;
import java.sql.*;

public class Example {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		
		String user = "root";
		
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String query = "Select * from employee";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
//		boolean a = st.execute(query);
//		
//		System.out.println(a);
//		
//		if(a==false)
//		{
//			System.out.println("1 Row Updated");
//		}
		
		while(rs.next()) {
			System.out.println("id is " + rs.getInt(1) + "\n name is " + rs.getString(2) + "\n Salary is " + rs.getString(3) );
		}
		

	}

}
