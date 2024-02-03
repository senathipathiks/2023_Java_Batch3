package com.tims.main;

import java.util.List;
import java.util.Scanner;


//import com.sms.bean.Student;
//import com.sms.bean.Student;
//import com.sms.dao.StudentDAO;
import com.tims.bean.Ticket;
import com.tims.dao.TicketDAO;

public class TIMSMain {
static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.Insert  2.Delete  3.Update   4.Find  5.FindAll  6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Ticket insertTicket()
	{
		System.out.println("Enter ticketid, deptno,category,priority,phoneno ");
		return new Ticket(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	}
	public static int deleteTicket()
	{
		System.out.println("Enter the Ticket ID to delete ");
		return (sc.nextInt());
	}
	public static Ticket updateTicket()
	{
		System.out.println("Enter ticketid, deptno,category,priority,phoneno");
		return new Ticket(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	}
	public static int searchTicket() {
		System.out.println("Enter the Ticket Id :");
		return (sc.nextInt());
	}
	public static void main(String[] args) {
		String msg=" ";
		int n;
		TicketDAO dao=new TicketDAO();
		do {
			switch(displaymenu())
			{
			case 1:
				Ticket tic=insertTicket();
				n=dao.insertTicket(tic);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
			case 2:
				int ticketid=deleteTicket();
				n=dao.deleteTicket(ticketid);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
			case 3:
				Ticket st2=updateTicket();
				n=dao.updateTicket(st2);
				System.out.println(n);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updation Failure");
				break;
			case 4:{
				int ticketid1 = searchTicket();
				Ticket s1 = dao.searchTicketDB(ticketid1);
				if(s1==null)
					System.out.println("No Record Found");
				else
					System.out.println("Record Found \n"+s1.getTicketid()+" "+s1.getDeptno()+" "+s1.getCategory()+" "+s1.getPriority()+" "+s1.getPhoneno());
				break;
			}
			case 5: {
				List<Ticket> list = dao.searchAllTicketDB();
				if(list.isEmpty())
					System.out.println("No Record found!");
				else {
					System.out.println("Total no of Record : "+list.size());
					for(Ticket s1 : list) {
						System.out.println(s1.getTicketid()+" "+s1.getDeptno()+" "+s1.getCategory()+" "+s1.getPriority()+" "+s1.getPhoneno());
					}
				}
			}
			}
				System.out.println("Do you wish to continue(yes/no)");
			  msg=sc.next();
	}while(msg.equals("yes"));


	}	
}