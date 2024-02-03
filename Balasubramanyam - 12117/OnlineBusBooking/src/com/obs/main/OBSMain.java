package com.obs.main;

import java.util.Scanner;

import com.obs.bean.OnlineBusBooking;
import com.obs.dao.*;

public class OBSMain {
static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.Insert  2.Delete  3.Update   4.Find  5.FindAll  6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static OnlineBusBooking insertOnlineBusBooking()
	{
		int Busno;
		System.out.println("Enter Bus No: ");
		Busno=sc.nextInt();
		String Busname;
		System.out.println("Enter Bus Name: ");
		sc.nextLine();
		Busname=sc.next();
		String BusFrom;
		System.out.println("Enter Bus Route From: ");
		sc.nextLine();
		BusFrom=sc.next();
		String BusTo;
		System.out.println("Enter Bus Route To: ");
		sc.nextLine();
		BusTo=sc.next();
		String BusType;
		System.out.println("Enter Bus Bus Type: ");
		sc.nextLine();
		BusType=sc.next();
		String BusDep;
		System.out.println("Enter Bus Departure: ");
		sc.nextLine();
		BusDep=sc.next();
		String BusArr;
		System.out.println("Enter Bus Arriaval: ");
		sc.nextLine();
		BusArr=sc.next();
		int BusT;
		System.out.println("Enter Bus Total seats: ");
		BusT=sc.nextInt();
		int BusA;
		System.out.println("Enter Bus Available Seats: ");
		BusA=sc.nextInt();
		int BusF;
		System.out.println("Enter Bus Fare: ");
		BusF=sc.nextInt();
				
		return new OnlineBusBooking(Busno,Busname,BusFrom,BusTo,BusType,BusDep,BusArr,BusT,BusA,BusF);
	}
	
	public static int deleteOnlineBusBooking()
	{
		System.out.println("Enter the Bus No to delete ");
		return (sc.nextInt());
	}
	
	public static OnlineBusBooking updateOnlineBusBooking()
	{	int Busno;
	System.out.println("Enter Bus No: ");
	Busno=sc.nextInt();
	String Busname;
	System.out.println("Enter Bus Name: ");
	sc.nextLine();
	Busname=sc.next();
	String BusFrom;
	System.out.println("Enter Bus Route From: ");
	sc.nextLine();
	BusFrom=sc.next();
	String BusTo;
	System.out.println("Enter Bus Route To: ");
	sc.nextLine();
	BusTo=sc.next();
	String BusType;
	System.out.println("Enter Bus Bus Type: ");
	sc.nextLine();
	BusType=sc.next();
	String BusDep;
	System.out.println("Enter Bus Departure: ");
	sc.nextLine();
	BusDep=sc.next();
	String BusArr;
	System.out.println("Enter Bus Arriaval: ");
	sc.nextLine();
	BusArr=sc.next();
	int BusT;
	System.out.println("Enter Bus Total seats: ");
	BusT=sc.nextInt();
	int BusA;
	System.out.println("Enter Bus Available Seats: ");
	BusA=sc.nextInt();
	int BusF;
	System.out.println("Enter Bus Fare: ");
	BusF=sc.nextInt();
			
	return new OnlineBusBooking(Busno,Busname,BusFrom,BusTo,BusType,BusDep,BusArr,BusT,BusA,BusF);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=" ";
		int n;
		OnlineBusBookingDAO dao=new OnlineBusBookingDAO();
		do {
			switch(displaymenu())
			{
			case 1:
				OnlineBusBooking obs1=insertOnlineBusBooking();
				n=dao.insertOnlineBusBooking(obs1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
				
			case 2:
				int BusNo=deleteOnlineBusBooking();
				n=dao.deleteOnlineBusBooking(BusNo);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
			
		  
			case 3:
				OnlineBusBooking obs2=updateOnlineBusBooking();
				n=dao.updateOnlineBusBooking(obs2);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updation Failure");
				break;
				
			case 4:
				System.out.println("Enter the Bus No to find ");
				int BusNo1=sc.nextInt();
				OnlineBusBooking obs3=dao.findOnlineBusBooking(BusNo1);
				if(obs3!=null)
					System.out.println(obs3);
				else
					System.out.println("Record Not Found");
				break;
				
			case 5:
				OnlineBusBooking[] obs4=dao.findAllOnlineBusBooking();
				if(obs4!=null)
				{
					for(OnlineBusBooking s:obs4)
						System.out.println(s);
				}
				else
					System.out.println("No Records Found");
				break;
			}
			
			
			
			
			System.out.println("Do you wish to continue(yes/no)");
		  msg=sc.next();
			
		} while(msg.equals("yes"));
	}

}


