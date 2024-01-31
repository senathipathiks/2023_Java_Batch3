package com.sms.main; 

import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.*;

public class SMSMain {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Student insertStudent() {
		System.out.println("Enter the student No,Student Name,Student no and Student City :");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
		
	}
	
	public static int deleteStudent() {
		System.out.println("Enter the Student Id to delete:");
		return (sc.nextInt());
	}
	
	public static Student updateStudent() {
		System.out.println("Enter the student No,Student Name,Student Phoneno and Student address :");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
		
	}
	
	public static int findStudent() {
		System.out.println("Enter the Studentid to find ");
		return (sc.nextInt());
	}
	
	public static int findAllStudent() {
		System.out.println("Enter the table name to find all values");
		return(sc.next());
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String msg=" ";
		int n;
		
		StudentDAO dao=new StudentDAO();
		
		do {
			switch(displaymenu()) 
			{
			
			case 1: 
				Student st1=insertStudent();
				n=dao.insertStudent(st1);
				if(n==1) 
					System.out.println("Record Inserted Successfully");
					else
						System.out.println("Record Insertion Failure");
					break;
					
					
					
			case 2:
				int id=deleteStudent();
				n=dao.deleteStudent(id);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
				
				
				
			case 3:
				Student st2=updateStudent();
				n=dao.updateStudent(st2);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updated Failure");
				break;
				
				
				
			case 4:
				int id1=findStudent();
				n=dao.findStudent(id1);
				if(n==1)
					System.out.println("Record Find Successfully");
				else
					System.out.println("Failure to find the record");	
				break;
				
				
				//find all
			case 5: 
				n=dao.findAllStudent();
				if(n==1)
					System.out.println("Successfull");
				else
					System.out.println("Failed");
				break;
				
				//Exit
			case 6: 
				System.exit(0);
				
			}	
					
					System.out.println("Do you want to continue(Yes/No)");
					msg=sc.next();
				}
				while(msg.equals("yes"));
					if(msg.equals("no"));
					System.out.println("ThankYou.....");

		}


		
	}



//why static ? i no need to creat object for it