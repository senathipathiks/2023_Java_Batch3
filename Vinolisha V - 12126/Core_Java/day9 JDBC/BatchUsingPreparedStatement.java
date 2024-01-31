package com.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class BatchUsingPreparedStatement{

	public static void main(String[] args) throws Exception {
		final String URL="jdbc:mysql://localhost:3306/stud_db";
		final String User="root";
		final String pass="ahsiloniv@2000";
		
		Scanner sc=new Scanner(System.in);
			int id;
			String name;
			String no;
			String address;
			char ch;
			
//			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL,User,pass);
			
			PreparedStatement ps=con.prepareStatement("insert into studenttbl values(?,?,?,?)");
			do {
				System.out.println("Enter the id:");
				id=sc.nextInt();
				System.out.println("Enter the name:");
				name=sc.next();
				System.out.println("Enter the phone no:");
				no=sc.next();
				System.out.println("Enter the address:");
				address=sc.next();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, no);
				ps.setString(4, address);
				ps.addBatch();
				System.out.println("Do you wish to continue:(Y/N)");
				ch=sc.next().charAt(0);
			}
			while(ch=='Y'|| ch=='Y');
			
			int[] rs=ps.executeBatch();
			
			System.out.println(Arrays.toString(rs));
			
	}

}
