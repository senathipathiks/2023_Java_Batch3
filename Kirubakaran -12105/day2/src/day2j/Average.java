package day2j;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=a+b+c;
		int avg=d/3;
		System.out.println("Total num is :"+d);
		System.out.println("Average num is :"+avg);

	}

}
