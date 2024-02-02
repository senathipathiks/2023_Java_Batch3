package com.sms.main;

import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class SMSMain {
static Scanner sc= new Scanner(System.in);

public static int displaymenu()
{
	System.out.println("1.Insert  2.Delete  3.Update  4.Find  5.FindAll  6.Exit");
	System.out.println("Enter your choice: ");
	int choice=sc.nextInt();
	return choice;
}
public static Student insertStudent()
{
	System.out.println("Enter Student No,Student Name and Student City");
	return new Student(sc.nextInt(),sc.next(),sc.next());
}
public static int deleteStudent()
{
	System.out.println("Enter the Student ID to delete");
	return (sc.nextInt());
}
public static Student updateStudent()
{
	System.out.println("Enter Student No,Student Name and Student City");
	return new Student(sc.nextInt(),sc.next(),sc.next());
}
public static int findStudent()
{
	System.out.println("Enter  the Id to Find");
	return (sc.nextInt());
}


	public static void main(String[] args) {
		String msg=" ";
		int n;
		StudentDAO dao = new StudentDAO();
		do {
			switch(displaymenu())
			{
			case 1:
				Student st1= insertStudent();
				n=dao.insertStudent(st1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
				
			case 2:
				int id= deleteStudent();
				n=dao.deleteStudent(id);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deleted Failure");
				break;
				
			case 3:
				Student st2= updateStudent();
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
