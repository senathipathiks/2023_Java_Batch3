package com.coreday4;

import java.util.Scanner;

class Employee {
	int eNo;
	String name;

	Employee() {

	}

	void getdata(int no, String name) {

		eNo = no;
		this.name = name;
	}

	void display() {

		System.out.println("No:" + eNo);
		System.out.println("Name: " + name);
	}

}

public class ArrayofObject {
	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			emp[i] = new Employee();
			System.out.println("id");
			int n = sc.nextInt();
			System.out.println("name");
			String fn = sc.next();
			emp[i].getdata(n, fn);
		}
		for (int i = 0; i < 3; i++) {
			emp[i].display();

		}

	}

}
