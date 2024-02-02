package com.emp_db.main;

import java.util.Scanner;

import com.emp_db.bean.Employee;
import com.emp_db.dao.EmployeeDAO;

public class emp_dbMain {

	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println("1.Insert 2.Update 3.Delete 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static Employee insertEmployee() {
		System.out.println("Enter Employee no,name,department,address");
		return new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next());

	}

	public static Employee updateEmployee() {
		System.out.println("Enter the employee id to update the record");
		return new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next());
	}

	public static int deleteEmployee() {
		System.out.println("Enter the employee id to delete the record ");
		return (sc.nextInt());
	}

	public static int findEmployee() {
		System.out.println("Enter the employee id to find the record");
		return (sc.nextInt());
	}

	public static void main(String[] args) {
		String msg = "";
		int n;
		EmployeeDAO dao = new EmployeeDAO();
		do {
			switch (displaymenu()) {
			case 1:
				Employee emp1 = insertEmployee();
				n = dao.insertEmployee(emp1);

				if (n == 1)
					System.out.println("Employee Record inserted successfully");
				else
					System.out.println("Employee Record inserted failure");
				break;

			case 2:
				Employee emp2 = updateEmployee();
				n = dao.updateEmployee(emp2);

				if (n == 1)
					System.out.println("Employee record updated successfully");
				else
					System.out.println("Employee record are not updated");
				break;

			case 3:
				int emp_no = deleteEmployee();
				n = dao.deleteEmployee(emp_no);

				if (n == 1)
					System.out.println("Employee record deleted successfully");
				else
					System.out.println("Employee record not deleted");
				break;

			case 4:
				int emp_no1 = findEmployee();
				n = dao.findEmployee(emp_no1);

				if (n == 1)
					System.out.println("Employee record found successfully");
				else
					System.out.println("Employee record not found");
				break;

			case 5:
				n = dao.findallEmployee();
				if (n == 1)
					System.out.println("All employee recors displayed successfully");
				else
					System.out.println("Record not found");
				break;

			case 6:
				System.out.println("Exited Successfully");
				System.exit(0);
			}
			System.out.println("Do you wish to continue(yes/no)");
			msg = sc.next();
		} while (msg.equals("yes"));

	}

}
