package com.day7;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		
		String Q = "insert into student values (?,?,?,?,?)";
		
		PreparedStatement p = c.prepareStatement(Q);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter Std Id");
			int id = sc.nextInt();
			
			System.out.println("Enter std Name");
			String name = sc.next();
			
			System.out.println("Enter std age");
			String age = sc.next();
			
			System.out.println("Enter std Gender");
			String gender = sc.next();
			
			System.out.println("Enter std Location");
			String loc = sc.next();
			 
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, age);
			p.setString(4, gender);
			p.setString(5, loc);
			
			p.addBatch();
			
		}
		
		int arr[] = p.executeBatch();
		System.out.println(Arrays.toString(arr));

	}

}
