package day2;

import java.util.Scanner;

public class ReversingNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number to reverse");
		Integer num = sc.nextInt(),last = 0;
		String rev = "";
		
		while (num !=0) {
			last = num%10;
			rev= rev.concat(last.toString());
			num/=10;
		}
		System.out.println(rev);
	}

}
