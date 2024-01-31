package com.day29;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class JDBCBatchExample2 {
	private final static String url = "jdbc:mysql://localhost:3306/sms_db";
	private final static String user = "root";
	private final static String password = "sam@6383587926";
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)throws Exception {
		int id;
		String name;
		String gender;
		int age;
		char op;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		PreparedStatement ps = con.prepareStatement("insert into student value(?,?,?,?,?)");
		
		do {
			System.out.println("Enter Id: ");
			id = sc.nextInt();
			System.out.println("Enter Name : ");
			name = sc.next();
			System.out.println("Enter Gender : ");
			gender = sc.next();
			System.out.println("Enter Age : ");
			age = sc.nextInt();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3,gender);
			ps.setInt(4, age);
			ps.setInt(5,1);
			System.out.println("Do you want to add more..?[y/n]");
			op=sc.next().charAt(0);
		}while(op=='y');
		
		int a[] = ps.executeBatch();
		System.out.println(Arrays.toString(a).length()+" Inserted Successfully");
		
	}

}
