package com.Day2;

import java.util.Scanner;

public class WeeklyNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Week day in Numbers with in 1 to 7???");
		
		
		
		int w = sc.nextInt();
		
		if(w>7) {
			System.out.println("Enter right no !!!");
		}
		
		switch (w) {
		case 1:
			System.out.println("This is Monday");
			break;
		case 2:
			System.out.println("This is ThusDay");
			break;
		case 3:
			System.out.println("This is Wednesday");
			break;
		case 4:
			System.out.println("This is Thursday");
			break;
		case 5:
			System.out.println("This is Friday");
			break;
			
		case 6:
			System.out.println("This is Saturday");
			break;
		case 7:
			System.out.println("This is Sunday");
			break;

		default:
			break;
		}
	}

}
