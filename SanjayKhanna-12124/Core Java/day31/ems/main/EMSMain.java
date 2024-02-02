package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static EmployeeDAO dao = new EmployeeDAO();
	
	public static int displayMenu() {
		System.out.println("1)Add record\n2)Delete Record\n3)Update Record\n4)Search Record\n5)View All Record\n6)Delete All Record\n7)Exit\nEnter your Option :");
		return sc.nextInt();
	}
	
	public static Employee insertEmployee() {
		System.out.println("Enter Employee Id, Name, and Age :");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt());
	}
	
	public static int deleteEmployee() {
		System.out.println("Enter Id : ");
		return sc.nextInt();
	}
	
	public static Employee updateEmployee() {
		System.out.println("Enter id :\nEnter Updating Name\nEnter Updating Age");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt());
	}
	
	public static int searchEmployee() {
		System.out.println("Enter Id : ");
		return sc.nextInt();
	}

	public static String deleteAllEmployee() {
		System.out.println("Are you sure?\nPlease Enter Password : ");
		return sc.next();
	}
	public static void main(String[] args) {
		
		boolean decision = true;
		System.out.println("Welcome to Employee Management System\n");
		do {
			switch(displayMenu()){
			case 1 :{
				Employee emp = insertEmployee();
				int n = dao.insertEmployee(emp);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
			}
			
			case 2:{
				int id = deleteEmployee();
				int n = dao.deleteEmployee(id);
				if(n==1)
					System.out.println("Record Deleted Sussessfully");
				else
					System.out.println("Record deletion Failure");
				break;
			}
			case 3:{
				Employee emp = updateEmployee();
				int n = dao.updateEmployee(emp);
				if(n==1)
					System.out.println("Record Update Successfully");
				else
					System.out.println("Record Updation Failure");
				break;
			}
			case 4:{
				int id = searchEmployee();
				Employee emp = dao.searchEmployee(id);
				if(emp==null)
					System.out.println("Record Not Found!");
				else
					System.out.println("Record Found!\n"+emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpAge());
				break;
			}
			case 6:{
				String pass = deleteAllEmployee();
				int n = dao.deleteAllEmployee(pass);
				if(n==0)
					System.out.println("Deletion All Record Failure");
				else
					System.out.println("All Record Deleted Successfully");
				break;
			}
			
			case 5:{
				List<Employee> list = dao.viewAll();
				if(list.isEmpty())
					System.out.println("No Record Found!");
				else {
					System.out.println("Total No of Record: "+list.size());
					for(Employee emp : list)
						System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpAge());
				}
				break;
			}
			case 7:{
				System.out.println("Are you Confirm Quiting ? [y/n]");
				char ch = sc.next().charAt(0);
				if(ch=='y')
					decision=false;
				else
					System.out.println("Quiting Cancelled");
			}
			default: System.out.println("Invalid Option \nPlease Enter Only 1-7");
			}
			System.out.println("\n------------------------------------------------------------------\n");
		}while(decision);
		System.out.println("Thank you for using this system");

	}

}
