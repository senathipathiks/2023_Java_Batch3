package com.exe.main;

import java.util.Scanner;

import com.exe.bean.EmployeeModel;
import com.exe.dao.EmployeeDAO;

public class EmployeeMain {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1. Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static EmployeeModel insertEmployeeModel() {
		System.out.println("Enter Employee ID and Employee Name");
		return new EmployeeModel(sc.nextInt(),sc.next());
	}
	
	public static int deleteEmployeeModel() {
		System.out.println("Enter the Employee ID to delete");
		return (sc.nextInt());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg=" ";
		int n;
		EmployeeDAO dao=new EmployeeDAO();
		do {
			switch(displaymenu()) {
			case 1:
				EmployeeModel ep1=insertEmployeeModel();
				n=dao.insertEmployeeModel(ep1);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
				
			case 2:
				int id=deleteEmployeeModel();
				n=dao.deleteEmployeeModel(id);
				if(n==1) 
					System.out.println("Record deleted Successfully");
				else
						System.out.println("Record delection failed");
					break;
				
			}
			
			
			System.out.println("Do you wish to continue(yes/no)");
			msg=sc.next();
			
		
		}while(false);

	}
}
