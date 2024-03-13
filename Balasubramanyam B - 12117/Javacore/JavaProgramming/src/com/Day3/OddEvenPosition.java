package com.Day3;

public class OddEvenPosition {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		String odd="";
		String even="";
		for(int i:arr) {
			if(i%2==0) {
				even=even+i;
			}
			else {
				odd=odd+i;
			}
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);

	}

}
