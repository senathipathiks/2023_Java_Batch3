package com.sms.main;

import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;

public class SMSMain {
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.Insert  2.Delete   3.Update   4.Find    5.FindAll    6.Exit");
		System.out.println("ENter your choice");
		int choice=sc.nextInt();
		return choice;
	}
	public static Student insertStudent()
	{
		System.out.println("Enter the Student no, student Name and Student city");
		return new Student(sc.nextInt(),sc.next(),sc.next());
	}
	public static int deleteStudent()
	{
		System.out.println("enter the STudent ID to delete");
		return(sc.nextInt());
	}
	public static Student updateStudent()
	{
		System.out.println("Enter the Student no, Student name, student city to update the details");
		return new Student(sc.nextInt(),sc.next(),sc.next());
	}
	
	public static void main(String[]args)
	{
		String msg=" ";
		int n;
		StudentDao dao = new StudentDao();
		do
		{
			switch(displaymenu())
		 {
			case 1:
			Student st1 = insertStudent();
			n=dao.insertStudent(st1);
			if(n==1)
				System.out.println("Record inserted successfully ");
			else 
				System.out.println("record Insertion failure");
			break;
			
			case 2 :
				int id = deleteStudent();
				n=dao.deleteStudent(id);
				if(n==1)
					System.out.println("Record deleted successfully");
				else 
					System.out.println("record deletion failure");
				break;
			case 3 :
				Student st2 = updateStudent();
				n = dao.updateStudent(st2);
				if(n==1)
					System.out.println("Records updated successfully");
				else 
					System.out.println(("record updation failure"));
		 }
			System.out.println("Do you wish to continue Yes/No");
			msg=sc.next();
}
		while(msg.equals("yes"));
		
}
	
}

