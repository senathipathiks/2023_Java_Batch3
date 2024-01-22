package com.coreday1;

import java.util.Scanner;

public class Addtwobinarynum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the two binary numbers");
		String num1 = sc.next();
		String num2 = sc.next();
		StringBuilder result = new StringBuilder();

		int x = num1.length() - 1;
		int y = num2.length() - 1;
		int carry = 0;

		while (x >= 0 || y >= 0) {
			int sum = carry;
			if (x >= 0) {
				sum += num1.charAt(x) - '0';
			}
			if (y >= 0) {
				sum += num2.charAt(y) - '0';
			}

			if (sum == 0 || sum == 1) {
				result.append(sum);
				carry = 0;
			}

			else if (sum == 2) {
				result.append(0);
				carry = 1;
			} else {
				result.append(1);
				carry = 1;
			}
			x--;
			y--;

		}
		if (carry == 1) {
			result.append(1);
		}
		System.out.println("Sum : " + result.reverse().toString());
	}

}
