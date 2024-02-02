package com.sms.main;

import java.util.Scanner;

import com.sms.bean.student;
import com.sms.dao.studentDAO;

public class SMSMain {
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1. Insert 2.Delete 3.Update 4.Find 5.FindAll ");
		System.out.println("Enter Your CHoice: ");
		int choice=sc.nextInt();
		return choice;
		
	}
	
	public static student insertstudent() {
		
		System.out.println("Enter StudentId,Student Name and Student city");
		
		return new student(sc.nextInt(),sc.next(),sc.next());
		
	}
	
	public static int deletestudent() {
		
		System.out.println("Enter the Student ID to Delete");
		return (sc.nextInt());
		
	}
	
	public static student updatestudent()
	{
		System.out.println("Enter Student No, Student Name and Student City ");
		return new student(sc.nextInt(),sc.next(),sc.next());
	}
	public static int fetchstudent() {
		System.out.println("Enter the student id");
		return (sc.nextInt());
	}
//	public static void fetchAll() {
//		System.out.println("Student Records\n\n");
//		
//		
//	}
//	
	
	public static void main(String[] args) {
		String msg=" ";
		int n;
		studentDAO dao=new studentDAO();
		
		do {
			switch(displaymenu())
			{
				case 1:
					student st1=insertstudent();
					n=dao.insertStudent(st1);
					if(n==1) {
						System.out.println("Record Inserted Succesfully");
					}
					else {
						System.out.println("Record Insertion Failure");
					}
					break;
				case 2:
					int id=deletestudent();
					n=dao.deleteStudent(id);
					if(n==1) {
						System.out.println("Recored Deleted Succesfully");
					}else {
						System.out.println("Record Deletion Failure");
					}break;
				case 3:
					student st2=updatestudent();
					n=dao.updateStudent(st2);
					
					if(n==1)
						System.out.println("Record Updated Successfully");
					else
						System.out.println("Record Updation Failure");
					break;
				case 4:
					
//					System.out.println("Student Id ");
					int id1= fetchstudent();
					n=dao.fetchstudent(id1);
					break;
				case 5:
					
					n=dao.fetchAll();
					
			}
			
			System.out.println("Do you want to continue(y/n)? ");
			msg=sc.next();
		}while(msg.equals("y"));
	}

}
