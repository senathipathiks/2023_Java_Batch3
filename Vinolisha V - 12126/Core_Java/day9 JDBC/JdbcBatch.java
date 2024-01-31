package com.day2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatch {

	public static void main(String[] args) throws Exception{
		final String URL="jdbc:mysql://localhost:3306/stud_db";
		final String User="root";
		final String pass="ahsiloniv@2000";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(URL,User,pass);
		
		Statement stmt=con.createStatement();
		
		stmt.addBatch("insert into Studenttbl values(1,'Sherin','0987654','Chennai')");
		stmt.addBatch("insert into Studenttbl values(2,'kav','456789678','velu')");
		stmt.executeBatch(); //execute the batch
		
		con.close();
				

	}

}
