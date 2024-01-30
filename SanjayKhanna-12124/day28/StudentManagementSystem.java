package com.day28;

import java.sql.*;
import java.util.Scanner; 

public class StudentManagementSystem {
	
	private static String url = "jdbc:mysql://localhost:3306/sms_db";
	private static String user = "root";
	private static String password = "sam@6383587926";
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args)throws SQLException {
		
		Connection con = DriverManager.getConnection(url,user,password);
		boolean decision = true;
		StudentManagementSystem obj = new StudentManagementSystem();
		
		System.out.println("Welcome to Student Management System\n\n");
		
		do {
			System.out.println("1)Add Record\n2)Delete Record\n3)Update Record\n4)View Record\n5)View All Record\n6)Quit\nEnter your option fromthe above :");
			int op = sc.nextInt();
			switch(op) {
			case 1:obj.insert(con);break;
			case 2:obj.delete(con);break;
			case 3:obj.update(con);break;
			case 4:obj.view(con);break;
			case 5:obj.viewAll(con);break;
			case 6:{
				System.out.println("Confirm are you quiting?[y/n]");
				String s = sc.next();
				if(s.equals("y")) 
					decision = false;
				else
					System.out.println("Quiting Cancelled");
				break;
			}
			default:System.out.println("Invalid Option\nPlease Enter 1-6 only!!!");
			}
			System.out.println("----------------------------------------------------\n");
		}while(decision);
		
		System.out.println("Thank you using this System");

	}
	
	//Adding Record
	public void insert(Connection con) throws SQLException {
		
		String q = "insert into tbl_student value(?,?,?,?,?)";
		
		PreparedStatement p = con.prepareStatement(q);
		
		System.out.println("Enter no of record : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Gender : ");
			String gender = sc.next();
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, gender);
			p.setInt(4, age);
			p.setInt(5, 1);
			p.addBatch();
		}
		
		int[] a = p.executeBatch();
		if(a.length==num)
			System.out.println(num+" Records Inserted ");
		else
			System.out.println("Insertion was UnSuccessful");
	}
	
	//Deleting Record
	public void delete(Connection con) throws SQLException {
		
		String q = "delete from tbl_student where stu_id = ?";
		PreparedStatement p = con.prepareStatement(q);
		System.out.println("Enter Id :");
		int id = sc.nextInt();
		System.out.println("Are you sure ?[y/n]");
		String op = sc.next();
		if(op.equals("y")) {
			p.setInt(1, id);
			int res = p.executeUpdate();
			if(res==1)
				System.out.println("1 row Deleted Successfully");
			else
				System.out.println("Record not Found!");
		}
		else {
			System.out.println("Deletion Process Interrupted");
		}
		
	}
	
	//Updating Record
	public void update(Connection con) throws SQLException {
		String q = "update tbl_student set stu_name = ? where stu_id = ?";
		PreparedStatement p = con.prepareStatement(q);
		System.out.println("Only name can be Updated \nEnter id : ");
		int id = sc.nextInt();
		System.out.println("Enter the Modified Name : ");
		String name = sc.next();
		p.setString(1, name);
		p.setInt(2, id);
		int res = p.executeUpdate();
		if(res==1)
			System.out.println("1 row Updated Successfully");
		else
			System.out.println("Record not Found!");	
	}
	
	//Viewing Record
	public void view(Connection con)throws SQLException {
		String q = "select * from tbl_student where stu_id = ? ";
		PreparedStatement p = con.prepareStatement(q);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		p.setInt(1, id);
		ResultSet result = p.executeQuery();
		if(result.next())
			System.out.println("Id : "+result.getInt(1)+"\tName : "+result.getString(2)+"\tGender : "+result.getString(3)+"\tAge : "+result.getInt(4)+"\tDepartment Id : "+result.getInt(5));
		else
			System.out.println("Record is Not Found !");		
		
	}
	
	//View All Record
	public void viewAll(Connection con) throws SQLException {
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery("select * from tbl_student");
		System.out.println("Records : ");
		while(result.next())
			System.out.println("Id : "+result.getInt(1)+"\tName : "+result.getString(2)+"\tGender : "+result.getString(3)+"\tAge : "+result.getInt(4)+"\tDepartment Id : "+result.getInt(5));		
	}
}
