package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamicsqljdbc {
	public static void main(String[] args) throws SQLException {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dharshsun_db", "root",
				"Password@12345");
		String q = "insert into tbl_students values(?,?,?,?,?,?);";
		
		String Q3 = "delete from tbl_students where id=?";
		
		String Q4 = "update tbl_students set name =? where(id=?)";
		
		PreparedStatement p = c.prepareStatement(Q4);
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id");;
//		int id=sc.nextInt();
//		System.out.println("enter the name");
//		String name=sc.next();
//		System.out.println("enter the email");
//		String email=sc.next();
//		System.out.println("Enter the phone");;
//		int phone=sc.nextInt();
//		System.out.println("enter the city");
//		String city=sc.next();
//		System.out.println("enter the pincode");
//		int pincode=sc.nextInt();
//		
//		p.setInt(1, id);
//		p.setString(2,name);
//		p.setString(3,email);
//		p.setInt(4,phone );
//		p.setString(5, city);
//		p.setInt(6, pincode);
//	
//		 int a=p.executeUpdate();
//       if(a==1) {
//           System.out.println("1 Row Affected");
//       }
//       String Q2 ="select*from tbl_students";
//       ResultSet rs= p.executeQuery(Q2);
//       
//       while (rs.next()) {
//           System.out.println("id   :"+rs.getInt(1)+ "\nname :"
//       +rs.getString(2) + "\nemail : "+rs.getString(3)+"\nphone:"
//        		   +rs.getInt(4)+"\ncity:"+rs.getString(5)
//        		   +"\npincode:"+rs.getInt(6));
//                   
//       }
//       System.out.println("Enter the id you want to delete");
//       int id=sc.nextInt();
//       p.setInt(1, id);
//      p.setString(2, name);
//       int a= p.executeUpdate();
//       if(a==1) {
//           System.out.println("1 row deleted");
//           }
//       
       
       
       
       // update table
      
     System.out.println("Enter the name you want to update:");
       
       String s =sc.nextLine();
       p.setString(1, s);
       
       System.out.println("Enter existing id");
       
       int id=sc.nextInt();
       
       p.setInt(2, id);
       
       
       int a=p.executeUpdate();
       System.out.println(a);
      
       if (a==1) {
           System.out.println("1 row updated");
       }
    }
}


