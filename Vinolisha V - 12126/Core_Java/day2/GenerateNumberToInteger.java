//9. Write a Java program that takes a number from the user and generates an integer between 1 and 7. 
//It displays the weekday name.

package com.day2;
import java.util.Scanner;


public class GenerateNumberToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Counting of day:");
		int a=sc.nextInt();
		
		switch(a) 
		{
		case 1:{
			System.out.println("Happy Monday");
			break;
		}
		
		case 2:{
			System.out.println("Happy Tuesday");
			break;
		}
		
		case 3:{
			System.out.println("Happy Wednesday");
			break;
		}
		
		case 4:{
			System.out.println("Happy Thursday");
			break;
		}
		
		case 5:{
			System.out.println("Happy Friday");
			break;
		}
		
		case 6:{
			System.out.println("Happy Saturday");
			break;
		}
		
		case 7:{
			System.out.println("A very Happy Sunday");
			break;
		}
		

	}

}
}
