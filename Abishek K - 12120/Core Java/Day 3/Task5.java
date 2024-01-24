//Print Even Position Elements

package com.day3;

public class Task5 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90};
		System.out.println("The Original Arrays are: ");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("Even Position Elements are: ");
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=(2*i)+1;j<arr.length;j++) {
				System.out.println(arr[j]);
				break;
			}
		}

	}

}
