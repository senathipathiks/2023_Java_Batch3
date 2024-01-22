//Write a Java program that takes three numbers as input to calculate and 
//print the average of the numbers.
package Day2;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Sum of the numbers is: "+(a+b+c));
		System.out.println("Average of three number is:"+(a+b+c)/3);

	}

}
