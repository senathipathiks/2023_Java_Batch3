package com.stu_db.main;

import java.util.Scanner;

import com.stu_db.bean.Ticket;
import com.stu_db.dao.TicketDAO;

public class Ticket_dbMain {
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("Here is your menu..");
		System.out.println("1.INSERT 2.DELETE 3.UPDATE 4.FIND 5.FINDALL 6.EXIT");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
        return choice;
		}
	
	public static Ticket insertTicket() {
		System.out.println("Enter the Ticket Id, priority, Location ,mobileNo, Category and Work Location No:");
	    return new Ticket(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
		}
	public static int deleteTicket() {
		System.out.println("Enter Ticket Id to Delete the Record:");
		return (sc.nextInt());
	}
    public static Ticket updateTicket() {
		System.out.println("Enter the Ticket Id to update priority, Location ,mobileNo, Category and Work Location No:");
        return new Ticket(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
    }
    public static int findTicket() {
		System.out.println("Enter Ticket Id to display specific record:");
		return(sc.nextInt()) ;
    	
    }

	public static void main(String[] args) {
		String msg=" ";
		int n;
		TicketDAO dao=new TicketDAO();
		do {
			switch(displaymenu()) {
			case 1:
				Ticket tik1=insertTicket();
				n=dao.insertTicket(tik1);
				if(n==1)
					System.out.println("Ticket Details Inserted Successfully :)");
				else
					System.out.println("Ticket Details Insertion failure :(");
				break;
			case 2:
				int id=deleteTicket();
				n=dao.deleteTicket(id);
				if(n==1)
					System.out.println("Ticket Details Deleted Successfully :)");
				else
					System.out.println("Ticket Details Deletion failure :(");
				break;
			case 3:
				Ticket tik2=updateTicket();
				n=dao.updateTicket(tik2);
				if(n==1)
					System.out.println("Ticket Details Updated Successfully :)");
				else
					System.out.println("Ticket Details Updation failure :(");
				break;
			case 4:
				int id1=findTicket();
				n=dao.findTicket(id1);
				if(n==1)
					System.out.println("Ticket Details fetched Successfully :)");
				else
					System.out.println("Ticket Details fetching failure :(");
				break;
			case 5:
				n=dao.findAllTicket();
				if(n==1)
					System.out.println("Table Record fetched Successfully :)");
				else
					System.out.println("Table Record fetching failure :(");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("There is no Process for your Input -_-");
				}
			System.out.println("Do you want to Continue? (Yes/No)");
			msg=sc.next();
		}
		while(msg.equals("yes"));
		if(msg.equals("no"))
		System.out.println("you have been Quitted!!");
		
		

	}

}
