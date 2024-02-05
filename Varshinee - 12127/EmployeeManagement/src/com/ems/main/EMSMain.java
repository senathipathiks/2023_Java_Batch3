package com.ems.main;

import java.util.Scanner;

import com.ems.bean.Employee;

import com.ems.dao.EmployeeDAO;



public class EMSMain {
	static Scanner sc=new Scanner(System.in);
	public static int displaymenu()
	{
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Employee insertEmployee()
	{
		System.out.println("Enter Employee Id, Employee Name, Employee DeptId, Employee DeptName");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
	}
	
	public static int deleteEmployee()
	{
		System.out.println("Enter the Employee id to delete");
		return (sc.nextInt());
	}
	
	public static Employee updateEmployee()
	{
		System.out.println("Enter Employee Id");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
	}
	
	public static int findEmployee()
	{
		System.out.println("Enter Employee Id to find");
		return (sc.nextInt());
	}
	
	

	public static void main(String[] args) {
		String msg=" ";
		int n;
		EmployeeDAO dao=new EmployeeDAO();
		do {
			switch(displaymenu()) {
			case 1:
				Employee st1=insertEmployee();
				 n=dao.insertEmployee(st1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
				
			case 2:
				int id=deleteEmployee();
				 n=dao.deleteEmployee(id);
	                if(n==1)
	                    System.out.println("Record deleted successfully :)");
	                else
	                    System.out.println("Record Deletion failure");
	                break;
	                
			case 3:
				Employee st2=updateEmployee();
				n=dao.updateEmployee(st2);
				if(n==1)
					System.out.println("Record updated successfully");
				else
					System.out.println("record updation failure");
				
			case 4:
				int id1 = findEmployee();
				n = dao.findEmployee(id1);
				if (n == 1)
					System.out.println("Record found successfully");
				else
					System.out.println("Record not found");
				break;

			case 5:
				n = dao.findallEmployee();
				if (n == 1)
					System.out.println("All Record found successfully");
				else
					System.out.println("Record not found");
				break;
			case 6:
				System.out.println("You are exit Successfully");
				System.exit(0);
			}
				
			
			System.out.println("Do you want to continue(yes/no)");
			msg=sc.next();
			
	}
		while(msg.equals("yes"));

}
}
