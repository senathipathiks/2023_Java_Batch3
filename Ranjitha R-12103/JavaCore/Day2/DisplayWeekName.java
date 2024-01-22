/*Write a Java program that takes a number from the user and generates an integer between 1 and 7. 
It displays the weekday name.*/
package Day2;

import java.util.Scanner;

public class DisplayWeekName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7");
		int num=sc.nextInt();
		String Day;
		switch(num) {
		case 1:
			Day="Sunday";
			break;
		case 2:
			Day="Monday";
			break;
		case 3:
			Day="Tuesday";
			break;
		case 4:
			Day="Wednesday";
			break;
		case 5:
			Day="Thursday";
			break;
		case 6:
			Day="Friday";
			break;
		case 7:
			Day="Saturday";
			break;
		default:
			Day="Invalid input,Please enter the number between 1to 7";
			break;
		}
		System.out.println("The number of " +num+ " day is : "+Day);

	}

}
