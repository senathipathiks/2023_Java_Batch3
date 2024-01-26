package com.Day2;

public class DaysInAMonth {

	public static void main(String[] args) {
		
		int month = 12;
		
		int year = 2023;
		
		if(month==2 || year%4 ==0 && year%100==0) {
			
			System.out.println("This month have 29 days");
			
		}
		
		else if(month==2) {
			System.out.println("This month have 28 days");
		}
		
		else if(month==1 || month==3 ||month==5 || month==7 || month==8 || month==10 || month==12 ) {
			System.out.println("This month have 31 days");
		}
		else {
			System.out.println("This month have 30 days");
		}
	}

}
