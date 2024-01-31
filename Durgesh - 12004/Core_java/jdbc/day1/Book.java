package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Book {

	public static void main(String[] args) throws SQLException {
		Connection n = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy_db","root","root");
		Statement s = n.createStatement();
		
		boolean a = s.execute("Insert into book values(3, 'Harry Potter and the prisoner of Azkabhan ','J.K.Rowling')");
		System.out.println(a);
		
		if(a==false)
			System.out.println("1 row updated");
		
		ResultSet r = s.executeQuery("select * from book");
		
		while(r.next())
			System.out.println("Book ID: "+r.getInt(1)+ " Book Name: "+r.getString(2)+" Book Author: "+r.getString(3));
	}
	

}
