package com.sms.main;

import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class SMSMainClass {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1)Add Record\n2)Delete Record\n3)Delete ALL \n4)Update Record\n5)Search Record\n6)View All Record\n7)Quit\nEnter your option from the above :");
		int op = sc.nextInt();
		return op;
	}
	
	//Inserting a new record
	public static Student insertStudent() {
		System.out.println("Enter Student Details\n1)Student ID\n2)Student Name\n3)Student Gender\n4)Student age");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	}
	
	//deleting a Record;
	public static int deleStudent() {
		System.out.println("Enter the Student Id :");
		return(sc.nextInt());
	}
	
	//Delete All the Record
	public static String deleteAllStudent() {
		System.out.println("Are you Confirm ? \nPlease Enter Password to Continue :  ");
		return(sc.next());
	}
	
	//Update a Record
	public static Student updateStudent() {
		
		System.out.println("Enter the Id to update and Details\n1)Student Name\n2)Student Gender\n3)Student age");
		return new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		
	}
	
	//Retrieve a Record
	public static int searchStudent() {
		System.out.println("Enter the Student Id :");
		return(sc.nextInt());
	}
	
	public static void main(String[] args) {
		
		boolean decision = true;
		StudentDAO dao = new StudentDAO();
		
		System.out.println("Welcome to Student Management System \n");
		do {
			
			switch (displayMenu()) {
			
			case 1:{
				Student s1 = insertStudent();
				int n = dao.insertStudentDB(s1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Insertion Process Failure");
				break;
			}
			
			case 2 : {
				int id = deleStudent();
				int n = dao.deleteStudentDB(id);
				if(n==1)
					System.out.println("Record Deleted SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 3:{ 
				
				String pass = deleteAllStudent();
				boolean flag = dao.deleteAllStudentDB(pass);
				if(!flag)
					System.out.println("All Records was Deleted ");
				else
					System.out.println("Deletion was Interrupt.");
				break;
				
			}
			
			case 4:{
				Student s1 = updateStudent();
				int n = dao.updateStudentDB(s1);
				if(n==1)
					System.out.println("Record Updated SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 5:{
				int id = searchStudent();
				Student s1 = dao.searchStudentDB(id);
				if(s1==null)
					System.out.println("No Record Found");
				else
					System.out.println("Record Found \n"+s1.getId()+" "+s1.getName()+" "+s1.getGender()+" "+s1.getAge());
				break;
			}
			
			case 6: {
				List<Student> list = dao.searchAllStudentDB();
				if(list.isEmpty())
					System.out.println("No Record found!");
				else {
					System.out.println("Total no of Record : "+list.size());
					for(Student s1 : list) {
						System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getGender()+" "+s1.getAge());
					}
				}
				break;
			}
			
			case 7:{
				System.out.println("Confirm are you quiting?[y/n]");
				String s = sc.next();
				if(s.equals("y")) 
					decision = false;
				else
					System.out.println("Quiting Cancelled");
				break;
			}

			default:
				System.out.println("Invalid Option!\nPlease Enter 1-7 only ");
			}
			
			System.out.println("\n-------------------------------------------------\n");
			
		}while(decision);
		
		System.out.println("Thank you for using This Application");
		
	}

}
