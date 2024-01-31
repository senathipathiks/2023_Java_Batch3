package com.jdbc;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		// JDBC Practice 
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String password = "root";
		
		String query = "select * from employee"; //Place where you write your query
		
		Connection c = DriverManager.getConnection(url, user, password);
		
		//Here Connection is an Interface, c is the reference
		//and DriveManager is a class and getConnection is a method in the class.
		
		Statement st = c.createStatement();
		
		//We use Statement to execute the query.
		
		ResultSet rs = st.executeQuery(query);
		
		//when you use executeQuery method, it returns everything as a RecordSet,
		//So we have to assign them with the ResultSet class with a reference.
		
		rs.next();
		
		System.out.println("Id is " + rs.getInt(1));
		System.out.println("Name is " + rs.getString(2));
		System.out.println("Salary is " + rs.getInt(3));

		c.close();
	}

}
