package com.day6;

public class LinearSearchBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int k=1;
		boolean flag=true;
		
		for (int i = 0; i < arr.length; i++) {
			if (i==k) {
				System.out.println("Element found");
				flag=false;
				break;	
			}
		}
		if(flag==true) {
			System.out.println("Element Not found");
		}
	}

}
