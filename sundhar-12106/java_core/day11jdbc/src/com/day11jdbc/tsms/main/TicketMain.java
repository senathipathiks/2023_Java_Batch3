package com.day11jdbc.tsms.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.day11jdbc.tsms.bean.Ticket;
import com.day11jdbc.tsms.dao.TicketDAO;

public class TicketMain {

	static Scanner sc = new Scanner(System.in);
	static TicketDAO dao;

	public static void main(String[] args) throws SQLException {

		boolean b = true;
		
		

		System.out.println("\t\t\tWelcome to Ticket management System");

		do {
			switch (display()) {
			case 1: {
				int n= dao.addTicket(addTicket());
				if (n == 1)
					System.out.println("Ticket Created successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 2: {
				int n = dao.deleteById(deleteTicket());
				if (n == 1)
					System.out.println("ticket closed successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 3: {
				//delete All
				boolean res = dao.deleteAll();
				if (res)
					System.out.println("\t\tTechnical error");
				else
					System.out.println("All the tickets are deleted from the table");
				break;
			}
			case 4: {
				//fetch by id
				ResultSet rs = dao.fetchByID(getTicket());
				while (rs.next())
					System.out.println(
							"Ticket ID : " + rs.getInt(1) + "\ndept name : " + rs.getString(2) + "\nCategory : " + rs.getString(3)
							+"\nDescription: "+rs.getString(4)+"\nStatus : "+rs.getString(5)+"\nMobile Number : "+rs.getLong(6));

				break;
			}
			case 5: {
				ResultSet rs = dao.fetchAll();
				while (rs.next()) {
					System.out.println(
							"Ticket ID : " + rs.getInt(1) + "\ndept name : " + rs.getString(2) + "\nCategory : " + rs.getString(3)
				+"\nDescription: "+rs.getString(4)+"\nStatus : "+rs.getString(5)+"\nMobile Number : "+rs.getLong(6));
					System.out.println("---------------------------");
				}
				break;
			}
			case 6: {
				int n = updateTicket();
				if (n == 1)
					System.out.println("Ticket updated successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 7: {
				b = false;
				break;
			}

			default:
				System.err.println("\t\tInvalid Input");
				break;
			}
		} while (b);
	}

	public static int display() {
		System.out.println("\t\t\tSelect the Options");
		System.out.println("1.Insert\n2.delete by Id \n3.delete All\n4.fetch By ID\n5.fetch All\n6.update\n7.exit");
		return sc.nextInt();
	}
	
	public static Ticket addTicket() {
		System.out.println("Enter ticket ID");
		int id = sc.nextInt();
		System.out.println("Enter your dept name");
		String dept= sc.next();
		sc.nextLine();
		System.out.println("Enter the category of the issue");
		String cate = sc.nextLine();
		System.out.println("enter the description of the issue");
		String desc = sc.nextLine();
		System.out.println("enter mobile number");
		long mob = sc.nextLong();
		System.out.println("enter the status of the ticket");
		String sta = sc.next();
		return new Ticket(id,dept,cate,desc,sta, mob);
		
	}
	
	public static int getTicket() {
		System.out.println("Enter the ticket id");
		return sc.nextInt();	
	}
	
	public static int deleteTicket() {
		System.out.println("Enter the ticket id");
		return sc.nextInt();	
	}
	
	public static int updateTicket() throws SQLException {
		System.out.println("enter the ticket id and status of the ticket");
		return dao.updateTicket(sc.nextInt(), sc.next());
	}

}
