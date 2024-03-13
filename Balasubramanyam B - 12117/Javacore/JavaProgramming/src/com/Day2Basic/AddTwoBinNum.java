package com.Day2Basic;

import java.util.*;

public class AddTwoBinNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary1 : ");
		String binary1 = sc.nextLine();
		System.out.println("Enter the binary2 : ");
		String binary2 = sc.nextLine();
		int decimal1 = Integer.parseInt(binary1, 2);
		int decimal2 = Integer.parseInt(binary2, 2);
		int sum = decimal1 + decimal2;
		String binarySum = Integer.toBinaryString(sum);

		System.out.println("Binary 1: " + binary1);
		System.out.println("Binary 2: " + binary2);
		System.out.println("Sum in binary: " + binarySum);
	}
}
