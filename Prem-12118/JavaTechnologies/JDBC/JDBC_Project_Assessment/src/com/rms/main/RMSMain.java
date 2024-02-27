package com.rms.main;

import com.rms.bean.*;
import com.rms.dao.*;
import java.util.Scanner;

public class RMSMain {

	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println(
				"1.Insert Restaurant   2.Delete Restaurant  3.Update details  4.Find Restaurant  5.Find All Restaurants  6.Exit\n");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static Restaurant insertRestaurant() {
		System.out.println("Enter the Restaurant Id number:");
		System.out.println("Enter the Restaurant Name:");
		System.out.println("Enter the Restaurant type: Eg[like, Veg or Non Veg ]");
		System.out.println("Enter the Restaurant Address:");
		System.out.println("Enter the Restaurant Phone number:");
		System.out.println("Enter the Restaurant Email:");
		System.out.println("Enter the Restaurant Rating:");
		System.out.println("Enter the Restaurant Owner name:");
		return new Restaurant(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat(),
				sc.next());
	}

	public static int deleteRestaurant() {
		System.out.println("Enter the Restaurant ID to delete ");
		return (sc.nextInt());
	}

	public static Restaurant updateRestaurant() {

		System.out.println("Enter the key and then all the details of the Restaurant\n");

		return new Restaurant(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat(),
				sc.next());
	}

	public static int findRestaurant() {
		System.out.println("Enter the Restaurant ID to find ");
		return (sc.nextInt());
	}

	public static String findAllRestaurant() {
		System.out.println("Enter the  Table Name of Restaurant to see details");
		return (sc.next());
	}

	public static String exit() {
		System.out.println("Do you want to exit from the Application?(yes/no)");
		return (sc.next());
	}

	public static void main(String[] args) {

		String msg = " ";
		int n;
		RestaurantDAO dao = new RestaurantDAO();
		do {
			switch (displaymenu()) {

			case 1:
				Restaurant rms1 = insertRestaurant();
				n = dao.insertRestaurant(rms1);
				if (n == 1)
					System.out.println("Restaurant Inserted Successfully");

				else
					System.out.println("Restaurant Insertion Failure");
				break;

			case 2:
				int id = deleteRestaurant();
				n = dao.deleteRestaurant(id);
				if (n == 1)
					System.out.println("Restaurant Deleted Successfully");
				else
					System.out.println("Restaurant Deletion Failure");
				break;

			case 3:
				Restaurant rms2 = updateRestaurant();
				n = dao.updateRestaurant(rms2);
				if (n == 1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updation Failure");
				break;

			case 4:
				int id1 = findRestaurant();
				n = dao.findRestaurant(id1);
				if (n == 1)
					System.out.println("Found Restaurant Successfully");
				else
					System.out.println("Try with Restaurant correct id");
				break;

			case 5:
				String s1 = findAllRestaurant();
				n = dao.findAllRestaurant(s1);
				if (n == 1)
					System.out.println("Found Table values Successfully");
				else
					System.out.println("Try with other Valid Table");
				break;
			case 6:
				String userInput = exit();

				if (userInput.equals("yes")) {
					System.out.println("Exited from the App operations");
					System.exit(0);
				} else
					System.out.println("Exit cancelled ..!\n");

				break;

			}
			System.out.println("Do you wish to continue(yes/no)");
			msg = sc.next();

		} while (msg.equals("yes"));
	}

}
