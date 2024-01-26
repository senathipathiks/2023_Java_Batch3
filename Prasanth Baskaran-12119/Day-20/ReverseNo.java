package com.Day2;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 2365;
		int rev=0;
		
		while(number!=0) {
			
			
			int rem = number %10;
			
			 rev = rev*10 + rem;
			 
			 number = number/10;
			
			
		}
		
		System.out.println(rev);
	}

}
