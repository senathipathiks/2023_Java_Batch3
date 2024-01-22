package Day2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;

				}

				else {
					System.out.println(i);
					break;
				}
			}
		}

	}

}
