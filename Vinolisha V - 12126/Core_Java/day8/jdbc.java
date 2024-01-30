package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class jdbc {

	public static void main(String[] args) throws SQLException {
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_db","root","ahsiloniv@2000");
		
		Statement s=c.createStatement(); //to call the drive manager
		
//		boolean a=s.execute("insert into studenttbl values(125,'vinisha','9860620420','KanniyaKumari')");
//		System.out.println(a);
		
//		if(a==false) {
//			System.out.println("1 row updated");
//		}
		
			ResultSet rs= s.executeQuery("select*from studenttbl");
			
			while(rs.next()) {
				System.out.println("User id:" + rs.getInt(1)+ "User Name:"+ rs.getString(2) + "Phone No:" + rs.getString(3)+"Address:" + rs.getString(4));
			
			}
		
			
		
		
		
	}

}
