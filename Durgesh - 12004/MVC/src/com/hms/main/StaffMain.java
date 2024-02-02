package com.hms.main;

import java.util.Scanner;
import com.hms.bean.Staff;
import com.hms.dao.StaffDao;

public class StaffMain {
	static Scanner sc = new Scanner(System.in);

	
	public static int displaymenu() {
		System.out.println("Choose anyone below: "
				+ "\n1.Insert" +
				"\n2.Update" +
				"\n3.Delete"+
				"\n4.Find"+
				"\n5.Exit");
		System.out.println("Enter the Choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static Staff insertStaff() {
		System.out.println("Enter the Staff ID, Staff Name, Staff Role");
		return new Staff(sc.nextInt(),sc.next(), sc.next());
	}
	
	public static Staff updateStaff() {
		System.out.println("Enter the Staff Role");
		return new Staff(sc.nextInt(),sc.next(), sc.next());
	}
	
	public static int deleteStaff() {
		System.out.println("Enter the Staff ID");
		return  sc.nextInt();
	}
	
	public static int findStaff() {
		System.out.println("Enter the Staff ID");
		return  sc.nextInt();
	}

	public static void main(String[] args) {
		String pop;
		int b;
		StaffDao dao = new StaffDao();
		
		do {
			switch (displaymenu()) {
			case 1: {
				Staff s1 = insertStaff();
				b=dao.insertStaff(s1);
				if(b==1) {
					System.out.println("Record Inserted Successfully");
				}
				else {
					System.out.println("Record Inserted Failed");
				}
				break;
			}
			case 2: {
				Staff s1 = updateStaff();
				b=dao.updateStaff(s1);
				if(b==1) {
					System.out.println("Record Updated Successfully");
				}
				else {
					System.out.println("Record Updation Failed");
				}
				
				break;				
			}
			case 3: {
				int s_id = deleteStaff();
				b=dao.deleteStaff(s_id);
				if(b==1)
					System.out.println("Record deleted successfully");
				
				else
					System.out.println("Record cannot be deleted");
			}
			
			case 4:{
				int s_id = findStaff();
				b=dao.findStaff(s_id);
				if(b==1)
					System.out.println("Record found");
				else
					System.out.println("Record cannot be found");
			}
			case 5:{
				System.out.println("Thank You");
				System.exit(0);
			}
			
			
		}
			System.out.println("Do you want to continue: (Y/N) ");
			pop = sc.next();
			}while (pop.equals("yes"));

	}
}
