package com.sms.main;

import java.util.Scanner;

import com.sms.bean.Nanba;
import com.sms.dao.NanbaDAO;

public class NanbaMain {
static Scanner sc=new Scanner(System.in);

public static int displaymenu()
{
	System.out.println("1. Insert 2.Delete  3.Update  4.Find  5.Find All 6.Exit");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	return choice;
}
public static Nanba insertNanba()
{
	System.out.println("Enter Department, Category, MobileNumber, Location, Priority to Insert");
	return new Nanba(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next());

}
public static String deleteNanba()
{
	System.out.println("Enter the Department to delete");
	return (sc.next());
}
public static Nanba updateNanba()
{
	System.out.println("Enter Department, Category, MobileNumber, Location, Priority to Update");
	return new Nanba(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next());
}
public static String findNanba()
{
	System.out.println("Enter  the Department to Find");
	return (sc.next());
}


public static void main(String[] args) {
	String msg=" ";
	int n;
	NanbaDAO dao = new NanbaDAO();
	do {
		switch(displaymenu()) {
		case 1:
			Nanba n1=insertNanba();
			n=dao.insertNanba(n1);
			if(n==1)
				System.out.println("Record Inserted Successfully");
			else
				System.out.println("Record Insertion Failure");
			break;
			
		case 2:
			String department=deleteNanba();
			n=dao.deleteNanba(department);
			if(n==1)
				System.out.println("Record deleted successfully");
			else
				System.out.println("Record Deleted failure");
			break;
		case 3:
			Nanba n2=updateNanba();
			n=dao.updateNanba(n2);
			if(n==1) 
				System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updated Failure");
				break;
		case 4:
			String department1=findNanba();
			n=dao.findNanba(department1);
			if(n==1)
				System.out.println("Record founded");
			else
				System.out.println("Record not found");
			break;
		case 5:
			n=dao.FindAll();
			if(n==1)
				System.out.println("Record displayed successfully");
			else
				System.out.println("Record not found");
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("There is no process for your Input....!!!!!!");
			}
			System.out.println("Do you wish to continue(yes/no)");
			msg=sc.next();
	}
	while(msg.equals("yes"));
	}
}

