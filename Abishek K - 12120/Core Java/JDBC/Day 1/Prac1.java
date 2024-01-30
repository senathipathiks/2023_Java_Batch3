package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Prac1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		
		String Q1 = "insert into student values(?,?,?,?,?)";
		String Q2 = "delete from student where stdid=?";
		String Q3 = "update student set stdlocation = ? where (stdid = ?)";
		
		PreparedStatement p = c.prepareStatement(Q3);
		
		//Inserting Values
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student ID");
//		int id = sc.nextInt();
//		
//		System.out.println("Enter Student Name");
//		String name = sc.next();
//		
//		System.out.println("Enter Student Age");
//		String age = sc.next();
//		
//		System.out.println("Enter Student Gender");
//		String gender = sc.next();
//		
//		System.out.println("Enter Student Location");
//		String location = sc.next();
//		
//		p.setInt(1, id);
//		p.setString(2,name);
//		p.setString(3, age);
//		p.setString(4, gender);
//		p.setNString(5, location);
//		
//		int a = p.executeUpdate();
//		
//		if(a==1) {
//			System.out.println("Row1 is affected");
//		}

		//View the Values
		
		ResultSet s = p.executeQuery("select * from student");
		
		while (s.next()) {
			System.out.println("Student ID: "+ s.getInt(1) + "\nStudent Name: "+s.getString(2)+"\nStudent Age: "+s.getString(3)+"\nStudent Gender: "+s.getString(4)+"\nStudent Location: "+s.getString(5));
		}
		
		//Delete Values
		
//		System.out.println("Enter Student ID to Delete:");
//		int del = sc.nextInt();
//		
//		p.setInt(1, del);
//		
//		int a = p.executeUpdate();
//		
//		if(a==1) {
//			System.out.println("row1 is affected");
//		}
		
		//Update values
		
		System.out.println("Enter the Changing Student Location");
		String loc = sc.nextLine();
		p.setString(1, loc);
		
		System.out.println("Enter the specific student ID");
		int id = sc.nextInt();
		p.setInt(2, id);
		
		int a = p.executeUpdate();
		
		if(a==1) {
			System.out.println("Row1 is affected");
		}
		
		
		
		
		
		
	

	}

}
