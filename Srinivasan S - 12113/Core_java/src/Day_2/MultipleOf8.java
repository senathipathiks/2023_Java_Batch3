package Day_2;

/*
 *  Write a Java program that takes a number as input and 
	prints its multiplication table up to 10.

 */

import java.util.Scanner;

public class MultipleOf8 {
	static int multiple;

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			 multiple=i*num;
			 System.out.println(i+"*"+num+"="+multiple);
		}
		
	}

}
