package com.stu_db.main;

import java.util.Scanner;

import com.stu_db.bean.Student;
import com.stu_db.dao.StudentDAO;

public class Stu_dbMain {
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1.Insert  2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Student insertStudent() {
		System.out.println("Enter StudentID, StudentName and Student Initial");
		return new Student(sc.nextInt(),sc.next(),sc.next());
		
	}
	
	public static int deleteStudent() {
		System.out.println("Enter StudentID to Delete:");
		return (sc.nextInt());
		
	}
	public static Student  updateStudent() {
		System.out.println("Enter StudentID, StudentName and Student Initial");
		return new Student(sc.nextInt(),sc.next(),sc.next());
	}
	public static int findStudent() {
		System.out.println("Enter StudentID to find:");
		return  (sc.nextInt());

	}

	
	public static void main(String[] args) {
		
		String msg=" ";
		int n;
		
		StudentDAO dao=new StudentDAO();
		
		do {
			switch(displaymenu()) {
			case 1://insert 
				Student st1=insertStudent();
				n=dao.insertStudent(st1);
				if(n==1) 
					System.out.println("Record inserted Sucessfully");
				else
					System.out.println("Record insertion failure");
				break;

			case 2:
				int id=deleteStudent();
				n=dao.deleteStudent(id);
				if(n==1)
					System.out.println("Record deleted successfully :)");
				else
					System.out.println("Record Deletion failure");
				break;
				
			case 3://update
				Student st2=updateStudent();
				n=dao.updateStudent(st2);
				if(n==1) 
					System.out.println("Record updation Sucessfull");
				else
					System.out.println("Record updation failure");
				break;
			case 4://find
				int id1=findStudent();
				n=dao.findStudent(id1);
				if(n==1) 
					System.out.println("successfull");
				else
					System.out.println("failure");
				break;
			case 5://findall
				
				n=dao.findAllStudent();
				if(n==1) 
					System.out.println("successfull");
				else
					System.out.println("failure");
				break;
			case 6:
				System.exit(0);	    
				
			}	
				
				System.out.println("Do you want to continue (yes/no)");
				msg=sc.next();
		}
			while(msg.equals("yes"));
		    if(msg.equals("no"));
		         System.out.println("Terminated..");
			}
		
	}

