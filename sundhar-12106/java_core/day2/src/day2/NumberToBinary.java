package day2;

import java.util.Arrays;
import java.util.Scanner;

public class NumberToBinary {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
//		System.out.println(32%2);
		
		System.out.println("enter a number ");
		int num = sc.nextInt();
		
		int arr[] = new int[8];
		int i = 8;
		
		while (num != 0 ) {
			arr[--i] = num%2;
			num/=2;
//			System.out.println(num + "modulus : "+arr[i]);
		}
		
		System.out.println("the binary of the given number is : "+Arrays.toString(arr).replaceAll("\\[|\\]|\\,", ""));
	}

}
