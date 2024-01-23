package day2;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the range value");
		int range = sc.nextInt();
		int flag = 0;

		if (range == 0 || range == 1)
			System.out.println("the given number is neither prime nor composite");
		else {
			for (int i = 2; i <= range; i++) {
				for (int j = 2; j < i; j++) {
					if(i%j == 0) {
						flag=1;
						break;
					}else {
						flag=0;
					}
				}
				if(flag == 0	)
					System.out.print(i+" ");
			}
		}
	}

}
