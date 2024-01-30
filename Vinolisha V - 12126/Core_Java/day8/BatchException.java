package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchException {
	static String url="jdbc:mysql://localhost:3306/stud_db";
	static String user="root";
	static String pass="ahsiloniv@2000";

	public static void main(String[] args) throws SQLException  {
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String Query="insert into stafftable values(?,?,?)";
		
		
		PreparedStatement pst=con.prepareStatement(Query);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Enter user id:");
			int id=sc.nextInt();
			
			System.out.println("Enter the user name:");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter the phone number:");
			
			int phone=sc.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, phone);
			pst.addBatch();
			}
		int[]a=pst.executeBatch();
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
