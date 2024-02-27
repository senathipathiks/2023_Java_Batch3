package com.rms.main;

import java.util.Scanner;
import com.rms.bean.restaurant_tbl;
import com.rms.dao.RestaurantDAO;

public class RestaurantMain {

	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println("1. Insert 2.Delete  3.Update  4.Find  5.Display  6.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static restaurant_tbl insertRestaurant() {
		System.out.println("Enter RestID, RestName, RestType, Address, PhonenNo, E-mail, Rating, Proprietor to Insert");
		return new restaurant_tbl(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
				sc.next());

	}

	public static int deleteRestaurant() {
		System.out.println("Enter the RestId to delete");
		return (sc.nextInt());
	}

	public static restaurant_tbl updateRestaurant() {

		System.out.println(
				"Enter RestID:\n RestName:\n RestType:\n Address:\n PhonenNo:\n Email:\n Rating:\n Proprietor");
		return new restaurant_tbl(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
				sc.next());

	}

	public static int findRestaurant() {
		System.out.println("Enter the RestId to Find");
		return (sc.nextInt());
	}

	public static void main(String[] args) {
		String msg = " ";
		int n;
		RestaurantDAO dao = new RestaurantDAO();
		do {
			switch (displaymenu()) {
			case 1:
				restaurant_tbl n1 = insertRestaurant();
				n = dao.insertRestaurant(n1);
				if (n == 1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;

			case 2:
				int RestID = deleteRestaurant();
				n = dao.deleteRestaurant(RestID);
				if (n == 1)
					System.out.println("Record deleted successfully");
				else
					System.out.println("Record not found");
			case 3:
				restaurant_tbl n2 = updateRestaurant();
				n = dao.updateRestaurant(n2);
				if (n == 1)
					System.out.println("Record Update Successfully");
				else
					System.out.println("Record Updation Failure");
				break;
			case 4:
				int n4 = findRestaurant();
				n4 = dao.findRestaurant(n4);
				if (n4 == 1)
					System.out.println("Record founded");
				else
					System.out.println("Record not found");
				break;
			case 5:
				n4 = dao.Display();
				if (n4 == 1)
					System.out.println("Record displayed successfully");
				else
					System.out.println("Record not found");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("There is no process for your Input....!!!!!!");
			}
			System.out.println("Do you wish to continue(yes/no)");
			msg = sc.next();
		}

		while (msg.equals("yes"));
	}
}