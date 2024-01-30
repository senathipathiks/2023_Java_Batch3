package com.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class reparedStatement {

	public static void main(String[] args) throws SQLException{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_db","root","ahsiloniv@2000");
		
		String q="insert into Studenttbl values(?,?,?,?);";
		String Q3="delete from studenttbl where studentid=?";
		String Q4="UPDATE studenttbl SET studentN=?WHERE(sid=?)"; //id deleted
		
		PreparedStatement p=c.prepareStatement(Q3);
		
		Scanner sc=new Scanner(System.in);
		
		//add details
		
//		System.out.println("Enter the id:");
//		int id=sc.nextInt();
//		
//		System.out.println("Enter the name:");
//		String name=sc.next();
//		
//		System.out.println("Enter your phone no:");
//		String no=sc.next();
//		
//		System.out.println("Enter your address:");
//		String addr=sc.next();
//		
//		p.setInt(1,id);
//		p.setString(2, name);
//		p.setString(3,no);
//		p.setString(4,addr);
//		
//		int a=p.executeUpdate();
//		if(a==1) {
//			System.out.println("1 row affected");
//		}
		
		//view tables
		
		String Q2="select*from studenttbl";
		ResultSet rs=p.executeQuery(Q2);
		
		while(rs.next()) {
			System.out.println("id:"+rs.getInt(1)+"\nname:"+rs.getString(2));
		}
		
		//delete records
		
		System.out.println("Enter the id you want to delete");
		int id=sc.nextInt();
		p.setInt(1, id);
		int a=p.executeUpdate();
		if(a==1) {
			System.out.println("1 row delted");
		}
		
		//update table
		
		System.out.println("Enter the name you want to update");
		String s=sc.nextLine();
		p.setString(1,s);
		
		System.out.println("Enter existing id");
		int idd=sc.nextInt();
		p.setInt(2, idd);
		
		int a1=p.executeUpdate();
		if(a1==1) {
			System.out.println("1 row updated");
		}
		
		
		
	}

}
