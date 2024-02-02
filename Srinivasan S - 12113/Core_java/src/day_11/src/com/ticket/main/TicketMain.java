package com.ticket.main;

import java.util.Scanner;

import com.ticket.bean.Ticket;
import com.ticket.dao.TicketDAO;

public class TicketMain {
	static Scanner sc=new Scanner(System.in);
	public static int menu() {	//method for entering choice to perform option
		
		System.out.println("1.Insert\n2.Delete\n3.Update\n4.Find\n5.FindAll\n6.Exit");
		System.out.println("Enter your option");
		int opt=sc.nextInt();
		return opt;
	}
	
	public static Ticket insert() {
		System.out.println("Enter Ticket Id,Description,Issuer Id ,Assigned to,status ");
		return new Ticket(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int delete() {
		System.out.println("Enter Ticket Id to delete");
		return(sc.nextInt());
	}
	
	public static Ticket update() {
		System.out.println("Enter details to update /nTicket Id,Description,Issuer Id,Assigned to,status");
		return new Ticket(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int find() {
		System.out.println("Enter Ticket id to search ");
		return sc.nextInt();
		
	}


	public static void main(String[] args) {
		
		int msg=0;
		int n;
		TicketDAO dao=new TicketDAO();
		
		do {
			switch (menu()) {
			case 1:
				Ticket t1=insert();
				n=dao.insert(t1);
				
				if(n==1) {
					System.out.println("Ticket inserted Successfully");
					}
				else
					System.out.println("Ticket inserting failed");
				break;
				
			case 2:
				int t2=delete();
				n=dao.delete(t2);
				if(n==1) {
					System.out.println("Ticket deleted Successfully");
					}
				else
					System.out.println("Ticket deleting failed");
				break;
				
			case 3:
				Ticket t3=update();
				n=dao.update(t3);
				if(n==1) {
					System.out.println("Ticket updated Successfully");
					}
				else
					System.out.println("Ticket updating failed");
				break;
				
			case 4:
				int t4=find();
				n=dao.find(t4);
				if(n==1) {
					System.out.println("Ticket readed Successfully");
					}
				else
					System.out.println("Ticket not found");
				break;
				
			case 5:
				n=dao.findall();
				if(n==1) {
					System.out.println("Ticket readed Successfully");
					}
				else
					System.out.println("Ticket not found");
				break;
				
			case 6:
				System.out.println("Thank You !");
				System.exit(0);
				
				
			default:
				break;
			}
			
			System.out.println("\nDo you want to continue \n1.Yes\n2.No");
	        msg=sc.nextInt();
	        
		} while (msg==1);
		System.out.println("Thank You !");

	}

}
