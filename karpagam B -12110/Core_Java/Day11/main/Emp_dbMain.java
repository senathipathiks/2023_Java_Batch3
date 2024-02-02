package com.stu_db.main;

import java.util.Scanner;

import com.stu_db.bean.Employee;
import com.stu_db.dao.EmployeeDAO;

public class Emp_dbMain {
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1.INSERT 2.DELETE 3.UPDATE 4.FIND 5.FINDALL 6.EXIT");
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		return choice;
		}
	public static Employee insertEmployee() {
		System.out.println("Enter Employee Id, Employee Name, Employee Employee Location and Employee Salary");
		return new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		}
	public static int deleteEmployee() {
		System.out.println("Enter Employee Id to delete the Record:");
		return (sc.nextInt());
		}
	public static Employee updateEmployee() {
		System.out.println("Enter Employee Id, Employee Name, Employee Employee Location and Employee Salary");
		return new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		}
	public static int findEmployee() {
		System.out.println("Enter Employee Id to display specific record:");
		return (sc.nextInt());
		}
	
   public static void main(String[] args) {
		
		String msg=" ";
		int n;
		
		EmployeeDAO dao=new EmployeeDAO();
		
		do {
			switch(displaymenu()) {
			case 1:
				Employee emp1=insertEmployee();
				n=dao.insertEmployee(emp1);
				if(n==1) 
					System.out.println("Employee Record Inserted Successfully :)");
				
				else 
					System.out.println("Employee Record Insertion failure :(");
				break;
			case 2:
				int id=deleteEmployee();
				n=dao.deleteEmployee(id);
				if(n==1) 
					System.out.println("Employee Record Deleted Successfully :)");
				
				else 
					System.out.println("Employee Record Deletion Failure :(");
				break;
			case 3:
				Employee emp2=updateEmployee();
				n=dao.updateEmployee(emp2);
				if(n==1) 
					System.out.println("Employee Record Updated Successfully :)");
				
				else 
					System.out.println("Employee Record Updation failure :(");
				break;
			case 4:
				int id1=findEmployee();
				n=dao.findEmployee(id1);
				if(n==1) 
					System.out.println("Employee details :)");
				
				else 
					System.out.println("Employee details fetching Failure :(");
				break;
			case 5:
				n=dao.findAllEmployee();
				if(n==1) 
					System.out.println("successfull");
				else
					System.out.println("failure");
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("There is no process for your Input..");
				
			}
			System.out.println("Do you want to Continue? (Yes/no)");
			msg=sc.next();
		}
		while(msg.equals("yes"));
		if(msg.equals("no")) {
			System.out.println("you have been terminated..");
			}

	}

}
