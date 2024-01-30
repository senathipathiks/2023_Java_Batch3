package com.day28;

import java.sql.*;
import java.util.Scanner;

public class MainClass3 {
	private static Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","sam@6383587926");
		
		String q1 = "insert into stud_tbl value(?,?,?);";
		
		String q2 = "delete from stud_tbl where stud_id= ?";
		
		String q3 = "update stud_tbl set stud_name = ? where stud_id = ?";
		
		PreparedStatement ps = c.prepareStatement(q1);
		
//		System.out.println("Enter no of record : ");
//		int num = sc.nextInt();
//		for(int i=0;i<num;i++) {
//			System.out.println("Enter the RollNo and Name : ");
//			int rollno = sc.nextInt();
//			String name = sc.next();
//			ps.setInt(1, i+1);
//			ps.setInt(2,rollno);
//			ps.setString(3, name);
//			ps.addBatch();
//		}
//		
//		int[] a = ps.executeBatch();
//		if(a.length==num)
//			System.out.println(num+" Records Inserted ");
//		
//		System.out.println("Table Output : ");
//		
		ResultSet result = ps.executeQuery("select * from stud_tbl");
		
		while(result.next())
			System.out.println("Id : "+result.getInt(1)+"\tRollno : "+result.getInt(2)+ "\tName : "+result.getString(3));
		
//		Statement s = c.createStatement();
//		boolean flag = s.execute("delete from stud_tbl");
//		if(!flag)
//			System.out.println("All Record Deleted");
		
		sc.close();
		
		
	}

}
