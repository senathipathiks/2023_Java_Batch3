package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookMyShow {

	public static void main(String[] args) throws SQLException {
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Enter 1 to Book Bus Ticket \n2.Enter 2 to Cancel Bus Ticket "
				+ "\n3.Enter 3 to View Bus Booking Status ");
		
		int select = sc.nextInt();
		
		BookMyShow b = new BookMyShow();
		
		switch (select) {
		case 1: {
			
			b.ticketBooking();
			break;
			
		}
		
		case 2 : {
			
		
			b.Cancelation();
			break;
		}
		
		case 3 : {
			b.status();
			break;
		}
	}
	}

	
	void ticketBooking() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/bus";
		
		String user = "root";
		
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String insertquery = "insert into bus1 values(?, ?, ?)";
		
		PreparedStatement p = con.prepareStatement(insertquery);
		
		System.out.println("Enter the Ticket Number 1 - 60 : ");
		
		Scanner sc2 = new Scanner(System.in);
		
		int id = sc2.nextInt();
		
		p.setInt(1, id);
		
		System.out.println("Enter the Name : ");
		
		String name = sc2.next();
		
		p.setString(2, name);
		
		System.out.println("Enter the Preferred Seat : ");

		int seat = sc2.nextInt();
		
		p.setInt(3, seat);
		
		int a = p.executeUpdate();
		
		if(a==1)
		{
			System.out.println("Successfully Booked the Ticket");
		}
		
	}
	
	void Cancelation() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/bus";
		
		String user = "root";
		
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String deletequery = "delete from bus1 where cid = ?";
		
		PreparedStatement p1 = con.prepareStatement(deletequery);
		
		Scanner s3 = new Scanner(System.in);
		
		System.out.println("Enter the Customer ID to Cancel Ticket");
		
		int id = s3.nextInt();
		
		p1.setInt(1, id);
		
		
		int a = p1.executeUpdate();
		
		if(a==1) {
			System.out.println("Ticket Cancelation Confirmed");
		}
	}
	
	void status() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/bus";
		
		String user = "root";
		
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String readquery = "select * from bus1";
		
		PreparedStatement p1 = con.prepareStatement(readquery);
		
		ResultSet rs = p1.executeQuery();
		
		while(rs.next()) {
			System.out.println("Customer Id - " + rs.getInt(1) + " Name - " + rs.getString(2) 
			+ " Seat Number - " + rs.getInt(3) );
		}
		
	}
}
