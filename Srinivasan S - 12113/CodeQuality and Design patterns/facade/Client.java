package com.code.facade;

import java.io.IOException;
import java.util.Scanner;

public class Client {

	static Scanner sc = new Scanner(System.in);

	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print("========= Mobile Shop ============ \n");
			System.out.print("            1. IPHONE              \n");
			System.out.print("            2. SAMSUNG             \n");
			System.out.print("            3. Exit                \n");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			ShopKeeper shopkeeper = new ShopKeeper();

			switch (choice) {
			case 1: {
				shopkeeper.appleSale();
				
			}
				break;
			case 2: {
				shopkeeper.samsungSale();
			}
				break;

			default: {
				System.out.println("Thank You");
			}
				return;
			}

		} while (choice != 3);
	}
}
