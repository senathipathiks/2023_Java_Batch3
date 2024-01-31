package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class TrialEx {

	public static void main(String[] args) throws SQLException {
		Connection n = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac_db","root","root");
		
		String q1 = "Insert into employee values(?,?,?);";
		String q2 = "Update employee SET emp_dept=? where emp_id=?;";
		String q3 = "delete from employee where emp_id=?; ";
		
		PreparedStatement ps = n.prepareStatement(q2);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the employee ID: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the employee name: ");
			sc.nextLine();
			String b = sc.nextLine();
			
			System.out.println("Enter the employee department: ");
			String c = sc.next();
			
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ps.addBatch();
		}
		
		int[] v = ps.executeBatch();
		
		System.out.println(Arrays.toString(v));
		
	}

}
