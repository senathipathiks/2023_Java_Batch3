package com.day28;

import java.sql.*;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","sam@6383587926");
		
		Statement state = con.createStatement();
		
		boolean flag = state.execute("create table student_tbl(stu_rollno int primary key,stu_name varchar(30))");
		if(!flag)
			System.out.println("Table Created....");
		
		System.out.println("Enter no of record : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the RollNo and Name : ");
			int rollno = sc.nextInt();
			String name = sc.next();
			boolean fl = state.execute("insert into student_tbl value("+rollno+",'"+name+"')");
			if(!fl)
				System.out.println((i+1)+" row inserted sucessfully");
		}
		
//		boolean flag = state.execute("drop table student_tbl");
//		if(!flag)
//			System.out.println("Table is distroyed...");
		sc.close();
	}

}
