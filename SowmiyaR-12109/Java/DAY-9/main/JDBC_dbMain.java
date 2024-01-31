package com.JDBC_db.main;

import java.util.Scanner;

import com.JDBC_db.bean.Student;
import com.JDBC_db.dao.StudentDAO;

public class JDBC_dbMain {
	
	static Scanner sc=new Scanner(System.in);

	public static int displaymenu()
	{
	System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
	System.out.println("Enter your Choice");
    int choice =sc.nextInt();
    return choice;
	}
	public static Student insertStudent()
	{
		System.out.println("Enter Student No,Student Name");
		return new Student(sc.nextInt(),sc.next());
	}
	public static int deleteStudent()
	{
		System.out.println("Enter the Student ID to delete");
		return(sc.nextInt());
	}
	public static Student UpdateStudent()
	{
		System.out.println("Enter the  Student name to update");
		return new Student(sc.nextInt(),sc.next());
	}
	public static void main (String[] args) {
		String mgs=" ";
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
				Student st2=UpdateStudent();
				n=dao.UpdateStudent(st2);
				if(n>0)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updation Failure");
			     break;
			}
			
			
			System.out.println("Do you wish to continue(yes/no");
			mgs=sc.next();
		} while(mgs.equals("yes"));
	}
	}


