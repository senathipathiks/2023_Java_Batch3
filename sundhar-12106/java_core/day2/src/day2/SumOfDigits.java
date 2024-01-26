package day2;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the multi digit number");
		int digit = sc.nextInt(),sum = 0,last = 0;
		
		while (digit !=0) {
			last = digit%10;
			sum+=last;
			digit/=10;
		}
		System.out.println("the sum of the digit is : "+sum);
	}
}
