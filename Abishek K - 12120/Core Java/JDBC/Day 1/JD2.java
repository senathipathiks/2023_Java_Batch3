package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JD2 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		
		 String q="insert into user values (?,?,?,?)";
	        
	        String Q3 = "delete from user where empid =?";
	        
	        String Q4 = "UPDATE user SET empname = ? WHERE (empid = ?)";        // id deleted
	        

	        
	        PreparedStatement p = c.prepareStatement(Q4);
	                
	        Scanner sc=new Scanner(System.in);
//	        // add details
//	        
//	        System.out.println("Enter the Empid");
//	        int id=sc.nextInt();
//	        
//	        System.out.println("Enter the Empname");
//	        String name=sc.next();
//	        
//	        System.out.println("Enter EmpAddress");
//	        String add=sc.next();
//	        
//	        System.out.println("Enter the EmpSalary");
//	        int sal=sc.nextInt();
//	        
//	        p.setInt(1, id);
//	        p.setString(2, name);
//	        p.setString(3,add);
//	        p.setInt(4, sal);
//	        
//	        int a=p.executeUpdate();
//	        if(a==1) {
//	            System.out.println("1 Row Affected");
//	        }
	    
	        
	        
	        // view tables
	        
	        String Q2 ="select*from user";
	        ResultSet rs= p.executeQuery(Q2);
	        
	        while (rs.next()) {
	            System.out.println("id   :"+rs.getInt(1)+ "\nname :"+rs.getString(2)+"\nAddress: "+rs.getString(3)+"\nSalary: "+rs.getInt(4));
	                    
	        }
	        
//	        
//	        //delete records
	        
//	        System.out.println("Enter the id you want to delete");
//	        int id=sc.nextInt();
//	        p.setInt(1, id);
//	        int a= p.executeUpdate();
//	        if(a==1) {
//	            System.out.println("1 row deleted");
//	            }
	        
	        
	        
	        
	        // update table
//	        
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
//	        
	}

}
