//To print the no of ODD elements 

package com.day3;

public class Task6 {

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,6,7,8,10};
		System.out.println("The Arrays are: ");

		for(int i: arr) {
			System.out.println(i);
		}
		int count=0;
		boolean dup=false;
		System.out.println("Odd Elements are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				dup=true;
			}
			else {
				
				System.out.println(arr[i]);
				count++;
			}
		}
        System.out.println("The no of odd elements are: "+count);
	}

}
