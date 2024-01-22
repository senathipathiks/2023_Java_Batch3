package Day2;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			int m = n % 10;
			sum = sum + m;
		}
		System.out.println("Sum of the number is " + sum);
	}

}
