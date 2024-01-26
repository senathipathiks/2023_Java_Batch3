package Com.Day2;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		float avg;
		System.out.println("Enter 3 Numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		avg=(num1+num2+num3)/3;
		
		System.out.println("Average of 3 numbers is:" +avg);
		

	}

}
