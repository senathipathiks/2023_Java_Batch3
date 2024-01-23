package day2;

import java.util.Scanner;

public class DaysInMonth {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	
	 try {
		 System.out.println("enter month *in number");
		int month = sc.nextInt();
		 if (month > 12 || month == 0 ) {
				System.out.println("enter valid month");
			}else if(month == 2){
				
				System.out.println("please enter year to get the correct answer");
				int year = sc.nextInt();
				if(year%4 == 0)
					System.out.println("Number of days is "+29);
				else
					System.out.println("Number of days is "+28);
				
			}else {
				if(month%2 == 1) {
					if(month == 7)
						System.out.println("number of days is : "+31);
					else
					    System.out.println("Number of days is : "+ 30);
					}
				else
					System.out.println("number of days is : "+31);
			}
	} catch (Exception e) {
		System.out.println("* please follow instruction");
	}
	 
	 
		
	}

}
