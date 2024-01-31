package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdation {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		
		String user = "root";
		
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String q = "Select * from employee";
		
		String q2 = "insert into employee values(?,?,?)";
		
		String q3 = "delete from employee where empid = ?";
		
		String q4 = "Update employee Set empname = ? where empid = ?";
		
		PreparedStatement p = con.prepareStatement(q4);
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the id");
//		
//		String id = sc.next();
//		
//		System.out.println("Enter the Name");
//		
//		String name = sc.next();
//		
//		System.out.println("Enter the Salary");
//		
//		int salary = sc.nextInt();
//		
//		p.setString(1, id);
//		p.setString(2, name);
//		p.setInt(3, salary);
//		
//		int a = p.executeUpdate();
//		
//		if(a==1) {
//			System.out.println("1 element Updated");
//		}
		
		
		//Delete Operation 
//		System.out.println("Enter the ID you want to delete : ");
//		
//		int id = sc.nextInt();
//		
//		p.setInt(1, id);
//		
//		int a = p.executeUpdate();
//		
//		
//		if(a==1) {
//			System.out.println("1 Item deleted");
//		}
		
		//Update Operation
		
			System.out.println("Enter the name you want to update:");
	        
	        String s =sc.nextLine();
	        p.setString(1, s);
	        
	        System.out.println("Enter exisiting id");
	        
	        int idd=sc.nextInt();
	        
	        p.setInt(2, idd);
	        
	        int a=p.executeUpdate();
	        
	        if (a==1) {
	            System.out.println("1 row updated");
	        }
		

	}

}
