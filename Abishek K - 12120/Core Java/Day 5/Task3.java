package com.day5;

import java.util.Scanner;

abstract class Payment{
	abstract void transcation();
}
class Upipayment extends Payment{
	int val;
	float coms;
	void transcation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to Transfer in UPI Payment");
		val=sc.nextInt();
		coms=10.5f*val;
		System.out.println("The Final Transcation Amount for UPI is: "+coms);
	}
}
class BankAccount extends Payment{
	int val;
	float coms;
	void transcation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to Transfer in UPI Payment");
		val=sc.nextInt();
		coms=2.5f*val;
		System.out.println("The Final Transcation Amount for Bank is: "+coms);
	}
}
public class Task3 {

	public static void main(String[] args) {
		Payment obj = new Upipayment();
		obj.transcation();
		Payment obj1 = new BankAccount();
		obj1.transcation();

	}

}
