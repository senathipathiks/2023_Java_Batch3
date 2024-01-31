package com.emp.main;

import java.util.Scanner;

import com.emp.bean.Employee;
import com.emp.dao.EmployeeDao;

public class EMPMain {

	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println("1.Insert   2.Delete  3.Update  4.Find  5.FindAll  6.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static Employee insertEmployee() {
		System.out.println("Enter employee no,employee name ,employee city");

		return new Employee(sc.nextInt(), sc.next(), sc.next());

	}

	public static int deleteEmployee() {
		System.out.println("Enter employee id to delete");

		return (sc.nextInt());

	}

	public static Employee updateEmployee() {
		System.out.println("Enter employee no,employee name ,employee city");

		return new Employee(sc.nextInt(), sc.next(), sc.next());

	}

	public static int findEmployee() {
		System.out.println("Enter employee no");

		return sc.nextInt();

	}

	public static void main(String[] args) {
		String msg = "";
		int n;

		EmployeeDao dao = new EmployeeDao();
		do {
			switch (displaymenu()) {
			case 1:
				Employee e1 = insertEmployee();
				n = dao.insertEmployee(e1);
				if (n == 1)
					System.out.println("record inserted successfully");
				else
					System.out.println("record not inserted");

				break;
			case 2:
				int id = deleteEmployee();
				n = dao.deleteEmployee(id);
				if (n == 1)
					System.out.println("record deleted succesfully");
				else
					System.out.println("record not deleted");

				break;
			case 3:
				Employee e2 = updateEmployee();
				n = dao.updateEmployee(e2);
				if (n == 1)
					System.out.println("record updated succesfully");
				else
					System.out.println("record not updated");

				break;

			case 4:
				int e3 = findEmployee();
				n = dao.findEmployee(e3);
				if (n == 1)
					System.out.println("record finded succesfully");
				else
					System.out.println("record not finded");

				break;
			case 5:

				n = dao.findAllEmployee();

				if (n == 1)
					System.out.println("All record finded succesfully");
				else
					System.out.println("All record not finded");

				break;

			case 6:
				System.exit(0);

				System.out.println("Thanks for using JDBC");

			}System.out.println("do you want to continue(y/n)");
			msg = sc.next();
		} while (msg.equals("y"));

	}
}
