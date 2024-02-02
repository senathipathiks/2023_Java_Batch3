package com.sms.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.sms.bean.*;
import com.sms.dao.*;

public class SMSMain {
	
	static Scanner sc = new Scanner(System.in);
	
	//view part
	public static int displaymenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static Student insertStudent() {
		System.out.println("Enter Student ID,Student Name,Student Age,Student Gender,Student Location ");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
	}
	
	public static int deleteStudent() {
		System.out.println("Enter the Student ID to delete");
		return (sc.nextInt());
	}
	
	public static Student updateStudent() {
		System.out.println("Enter the Details to Update Student ID,Student Name,Student Age,Student Gender,Student Location ");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
	}
	
	public static int  findStudent() {
		System.out.println("Enter the particular stdID");
		return (sc.nextInt());
	}
	
  public static void findAllStudent() {
	  System.out.println("Enter to view the All the Details");
	  
  }
	
	




public static void main(String[] args) throws SQLException {
	
	String msg = " ";
	int n;
	StudentDAO dao = new StudentDAO();
	
	do {
		switch(displaymenu()) {
		case 1:
			Student st1 = insertStudent();
			n=dao.insertStudent(st1);
			if(n==1) {
				System.out.println("Record Inserted Successfully");
			}
			else {
				System.out.println("Record Insertion Failure");
			}
			break;
			
		case 2:
			int id = deleteStudent();
			n=dao.deleteStudent(id);
			
			if(n==1) {
				System.out.println("Deletion Successfully");
			}
			else {
				System.out.println("Deletion Failure");
			}
			break;
			 
		case 3:
			Student st2 = updateStudent();
			n=dao.updateStudent(st2);
			
			if(n==1) {
				System.out.println("Updation Successfully");
			}
			else {
				System.out.println("Updation Failure");
			}
			break;
			
		case 4:
			int st3 = findStudent();
			ResultSet rs = dao.findStudent(st3);
			
			while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+"\nstdName: "+rs.getString(2)+"\nstdAge: "+rs.getString(3)+"\nstdGender: "+rs.getString(4)+"\nstdLocation: "+rs.getString(5));
			}
			break;
			
		case 5:
			findAllStudent();
			
			
            ResultSet rs1 = dao.findAllStudent();
			
			while(rs1.next()) {
			System.out.println("ID: "+rs1.getInt(1)+"\nstdName: "+rs1.getString(2)+"\nstdAge: "+rs1.getString(3)+"\nstdGender: "+rs1.getString(4)+"\nstdLocation: "+rs1.getString(5)+"\n------------------------");
			}
			break;
		
		case 6:
			System.out.println("Thank You For Using this Management System");
			System.exit(0);
			
			
			
			
			
			
		}
		System.out.println("Do you want to Continue yes or no");
		msg=sc.next();
	}
	while(msg.equals("yes"));
	
}

}