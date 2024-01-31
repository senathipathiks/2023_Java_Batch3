package com.JDBC_db.main;

import java.util.Scanner;

import com.JDBC_db.bean.Students;
import com.JDBC_db.dao.StudentsDAO;

public class JDBC_dbMain {
	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;

	}

	public static Students insertStudents() {
		System.out.println("Enter Student No,Student Name");
		return new Students(sc.nextInt(), sc.next());
	}

	public static int deleteStudents() {
		System.out.println("Enter the student ID to delete");
		return (sc.nextInt());
	}
	public static Students updateStudents() {
		System.out.println("Enter the student no & student name to update");
		return new Students(sc.nextInt(),sc.next());
	}

	public static void main(String[] args) {
		String msg = "";
		int n;
		StudentsDAO dao = new StudentsDAO();
		do {
			switch (displaymenu()) {
			case 1:
				Students st1 = insertStudents();
				n = dao.insertStudents(st1);
				if (n == 1)
					System.out.println("Record Inserted successfully");
				else
					System.out.println("Record Insertion failure");
				break;
			case 2:
				int no = deleteStudents();
				n = dao.deleteStudents(no);
				if (n == 1)
					System.out.println("Record deleted successfully");
				else
					System.out.println("Record deleted failure");
				break;
				
			case 3:
				Students st2=updateStudents();
				n=dao.updateStudents(st2);
				if(n==1)
					System.out.println("Record updated Successfully");
				else
					System.out.println("Record update failure");
			}
			
			System.out.println("Do you wish to continue(yes/no)");
			msg = sc.next();
		} while (msg.equals("yes"));
	}

}
