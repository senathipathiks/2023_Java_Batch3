package com.hotel.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.hotel.bean.Hotel;
import com.hotel.dao.Hoteldao;


public class Hotelmain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("Enter Your Choice:");
		System.out.println("1.Insert Data  \n2.Delete Data  \n3.Update Data \n4.Find \n5.FindAll \n6.Exit");
		
		return(sc.nextInt());
	}
	
	public static Hotel insertHotel() {
		System.out.println("Enter the Customer ID, Customer Name, Customer MobileNo , Customer Location");
		return new Hotel(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	public static int deleteHotel() {
		System.out.println("Enter the Customer ID to delete");
		return (sc.nextInt());
		
	}
	
	public static Hotel updateHotel() {
		System.out.println("Enter the Update Details: 1.ID 2.Name 3.PHNo 4.Loct");
		return new Hotel(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	public static int findHotel() {
		System.out.println("Enter the Customer ID to find");
		return(sc.nextInt());
	}
	
	public static void findAllHotel() {
		System.out.println("Enter to view all the Details");
	
	}
	
	
	

	public static void main(String[] args) throws SQLException {
		
		String msg=" ";
		int n=0;
		
		
		Hoteldao dao = new Hoteldao();
		
		
		do {
			switch(displayMenu()) {
			case 1: 
				Hotel ht1 = insertHotel();
				n=dao.insertHotel(ht1);
				
				if(n>=1) {
					System.out.println("Insertion is Successfully Done");
				}
				else {
					System.out.println("Insertion Failure");
				}
				break;
				
			case 2:
				int id = deleteHotel();
				n=dao.deleteHotel(id);
				
				if(n>=1) {
					System.out.println("Deletion is Successfully Done");
				}
				else {
					System.out.println("Deletion is Failure");
				}
				break;
				
			case 3:
				Hotel ht2 = updateHotel();
				n=dao.updateHotel(ht2);
				
				if(n>=1) {
					System.out.println("Updation is SuccessFull");
				}
				else {
					System.out.println("Updation is Failure");
				}
				break;
				
			case 4:
				int it = findHotel();
				ResultSet rs1 = dao.findHotel(it);
				
				while(rs1.next()) {
					System.out.println("Customer ID: "+rs1.getInt(1)+"\nCustomer Name: "+rs1.getString(2)+"\nCustomer PHno: "+rs1.getString(3)+"\nCustomer Location: "+rs1.getString(4));
				}
				break;
				
			case 5:
				findAllHotel();
				ResultSet rs = dao.findAllHotel();
				
				while(rs.next()) {
					System.out.println("Customer ID: "+rs.getInt(1)+"\nCustomer Name: "+rs.getString(2)+"\nCustomer PHno: "+rs.getString(3)+"\nCustomer Location: "+rs.getString(4) +"\n----------------------");
				}
				break;
				
			case 6:
				System.out.println("****Thank You****");
				System.exit(0);
				break;
				
				default:
					System.out.println("Please Enter Valid Choice");
				
				
			
			}
			System.out.println("Do You Want to Continue yes or no");
			msg=sc.next();
		}
		while(msg.equals("yes"));

	}

}
