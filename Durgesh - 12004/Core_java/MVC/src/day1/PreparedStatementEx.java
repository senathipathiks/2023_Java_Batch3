package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {

	public static void main(String[] args) throws SQLException {
		Connection n = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy_db","root","root");
		
		String a = "insert into book values(?,?,?);";
		
		String a1 = "delete from book where b_id = ?;";
		String a2 = "UPDATE book SET b_name=? where (b_id=?);";
		
		PreparedStatement p = n.prepareStatement(a1);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the book id:");
//
//		int bid = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.println("Enter the book name:");		
//		String bn = sc.nextLine();
//		
//		System.out.println("Enter the Book Author name:");
//		String ba = sc.nextLine();
//
//		p.setInt(1, bid);
//		p.setString(2, bn);
//		p.setString(3, ba);
//		
//		int c = p.executeUpdate();
//		
//		if(c==1)
//			System.out.println("1 Row affected");
		
//		
//		//View Table
//		
//		String a3 = "select * from book;";
//		
//		ResultSet rs= p.executeQuery(a3);
//        
//        while (rs.next()) 
//            System.out.println("Book id   :"+rs.getInt(1)+ "\n Book name :"+rs.getString(2)+ "\n Book Author :" +rs.getString(3));
//        
        
        //Update table
        
//        System.out.println("Enter the name which is to be updated");
//        
//        String s = sc.nextLine();
//        p.setString(1, s);
//        
//        System.out.println("Enter the existing Book id");
//        int b = sc.nextInt();
//        p.setInt(2, b);
//        
//        int v = p.executeUpdate();
//        if(v==1)
//        	System.out.println("1 Row Updated");
//        
        
        //Delete Data
        
        System.out.println("Enter the id you want to delete");
        int id=sc.nextInt();
        p.setInt(1, id);
        int l= p.executeUpdate();
        if(l==1) {
            System.out.println("1 row deleted");
            }
        
		
	}

}
