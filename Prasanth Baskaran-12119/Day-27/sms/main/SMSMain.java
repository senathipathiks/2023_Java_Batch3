package com.sms.main;

import java.util.Scanner;

import com.sms.bean.Students;
import com.sms.dao.StudentDAO;

public class SMSMain {
	
	static Scanner sc = new Scanner(System.in);
	
	// View Logic the options to the User part
	public static int displaymenu(){ 
		
		System.out.println("1.Insert  2.Delete  3.Update  4.Find  5.FindAll  6.Exit");
		
		System.out.println("Enter your Choice :");
		
		int choice =sc.nextInt();
		
		return choice;
		
	}
	
	
	public static Students insertStudent() {
		
		System.out.println("Enter Student No, Student Name and Student City ");
		
		return new Students(sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int deleteStudent() {
		
		System.out.println("Enter Student id : ");
		
		return (sc.nextInt());
		
	}
	
    public static Students UpdateStudent() {
		
		System.out.println("Enter Student No, Student Name and Student City ");
		
		return new Students(sc.nextInt(),sc.next(),sc.next());
		
	}
    
    
    public static int FindStudent() {
		
		System.out.println("Enter Student id : ");
		
		return (sc.nextInt());
		
	}
    
   
	
	
	
	//Controll Logic 
	public static void main(String[] args) {
		
		
		String msg =" ";
		
		int n;
		
		StudentDAO dao = new StudentDAO();
		
		do {
			switch(displaymenu()) {
			
			case 1 :
				
				Students st1 = insertStudent();
				
				n = dao.insertStudent(st1);
				
				if(n==1) {
					
					System.out.println("Record Inserted Successfully !!!");
				}
				else {
					
					System.out.println("Record Insersion is Faild,Retry again !");
				}
			
			break;
		
			case 2:
				
				int id = deleteStudent();
				
				n= dao.deleteStudent(id);
				
				if(n==1) {
					
					System.out.println("Record Delete Successfully");
				}
				else {
					
					System.out.println("Record Deleted Faild , Retry again!");
				}
				
			
			break;
			
			  
			case 3:
				
				Students st2 = insertStudent();
				
				n=dao.UpdateStudent(st2);
				
				if(n==1) {
					System.out.println("Record Update Successfully");
				}
				else {
					
					System.out.println("Record Updation Faild , Try Again");
				}
			
			
			break;
			
			
			case 4:
				
				int id1 = FindStudent();
				
				n= dao.FindStudent(id1);
				
				if(n==1) {
					System.out.println("Record Find Successfully");
				}
				else {
					
					System.out.println("Record Find is Faild , Try Again");
				}
			
			break;
			
			case 5 :
				
				n = dao.FindAllStudent();
				
				if(n>0) {
					System.out.println("All Record Shows Successfully");
				}
				else {
					
					System.out.println("Record Shows is Faild , Try Again");
				}
				
				break;
				
				
			case 6:
				
				System.exit(0);
			}
		
			
			System.out.println("Do you wish to continue the App ?? yes or no");
			
			msg = sc.next();
			
		}while(msg.equals("yes"));
		
		
		
		
	}



	
	
	
}
