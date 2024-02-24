package com.nalan.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.nalan.bean.Nalan;
import com.nalan.dao.NalanDao;

public class Nalmain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1.Insert Data \n2.Delete Data \n3.Update Data \n4.Find \n5.Find All \n6.Exit");
		System.out.println("Enter Your Choice");
		return(sc.nextInt());
	}
	
	public static Nalan insertTicket() {
		System.out.println("Enter 1.Ticket ID 2.Ticket Raisedby 3.Ticket Assigned To 4.Ticket Status");
		return new Nalan(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	public static int deleteTicket() {
		System.out.println("Enter Ticket ID to delete");
		return (sc.nextInt());
	}
	
	public static void updateTicket() {
		System.out.println("Enter the Details to update the Ticket");
	}
	
	public static int findTicket() {
		System.out.println("Enter Ticket ID to change");
		return (sc.nextInt());
	}
	
	public static void findAllTicket() {
		System.out.println("Enter to View the Table");
	}

	public static void main(String[] args) throws SQLException {
		
		int n=0;
		String msg=" ";
		NalanDao dao = new NalanDao();
		
		do {
			switch(displaymenu()) {
			
			case 1:
				Nalan n1 = insertTicket();
				n= dao.insertTicket(n1);
				
				if(n>=1) {
					System.out.println("Insertion is Successful");
				}
				else {
					System.out.println("Insertion Failure");
				}
				break;
				
			case 2:
				
				int id = deleteTicket();
				n=dao.deleteTicket(id);
				
				if(n>=1) {
					System.out.println("Delete is successful");
				}
				else {
					System.out.println("Deletion is failure");
				}
				break;
				
			case 3:
				
				updateTicket();
				n=dao.updateTicket();
				
				if(n>=1) {
					System.out.println("Update is Succesfully done");
				}
				else {
					System.out.println("Update is Failure");
				}
				break;
				
			case 4:
				
				int it1 = findTicket();
				ResultSet rs = dao.findTicket(it1);
				
				while(rs.next()) {
					System.out.println("Ticket ID: "+rs.getInt(1)+"\nTicket Raised By: "+rs.getString(2)+"\nTicket Assigned By: "+rs.getString(3)+"\nTicket Status: "+rs.getString(4));
				}
				break;
				
			case 5:
				findAllTicket();
				ResultSet rs1 = dao.findAllTicket();
				
				while(rs1.next()) {
					System.out.println("Ticket ID: "+rs1.getInt(1)+"\nTicket Raised By: "+rs1.getString(2)+"\nTicket Assigned By: "+rs1.getString(3)+"\nTicket Status: "+rs1.getString(4)+"\n--------------------------------------");
				}
				break;
				
			case 6:
				System.out.println("****Thank You****");
				System.exit(0);
				break;
				
				default:
					System.out.println("Choice valid Input");
				
			}
			System.out.println("Do You want to Continue yes or no");
			msg = sc.next();
		}
		while(msg.equals("yes"));
		
		

	}

}
