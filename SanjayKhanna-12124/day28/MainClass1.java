package com.day28;

import java.sql.*;

public class MainClass1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","sam@6383587926");
		
		Statement s = c.createStatement();
		
		boolean flag = s.execute("insert into user values(121,'khanna'),(122,'SanjayKhanna')");
		
		System.out.println(flag);
		
		if(!flag)
			System.out.println("1 row updated");
		
		ResultSet result = s.executeQuery("select * from user");
		
		while(result.next())
			System.out.println("Id : "+result.getInt(1)+ "\tName : "+result.getString(2));

	}

}

