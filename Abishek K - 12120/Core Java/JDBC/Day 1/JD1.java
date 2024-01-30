package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JD1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		
		Statement s = c.createStatement();
		
//		boolean a = s.execute("Insert into user values (123,'Abishek','mohanur',10000)");
//		
//		System.out.println(a);
//		
//		if(a==false) {
//			System.out.println("1 row updated");
//		}
//		
		ResultSet rs = s.executeQuery("select * from user");
		
		while(rs.next()) {
			System.out.println("Empid: "+rs.getInt(1)+ "\nEmpname: "+rs.getString(2)+"\nEmpAddress: "+rs.getString(3)+"\nEmpSalary: "+ rs.getInt(4));
		}

	}

}
