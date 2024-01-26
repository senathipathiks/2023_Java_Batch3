package com.day22;

import java.util.Scanner;

public class WeekDayPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number [1-7] ");
		int op = sc.nextInt();
		switch(op) {
		case 1:System.out.println("It's Monday");break;
		case 2:System.out.println("It's Tuesday");break;
		case 3:System.out.println("It's Wednesday");break;
		case 4:System.out.println("It's Thursday");break;
		case 5:System.out.println("It's Friday");break;
		case 6:System.out.println("It's Saturday");break;
		case 7:System.out.println("It's Sunday");break;
		default:System.out.println("Invalid number \nPlease select between 1 to 7 ...");
		}

	}

}
