//Find no of repeated elements in arrays

package com.day3;

public class Task2 {

	public static void main(String[] args) {
		int count=0;
		int [] arr = {10,20,10,20,30,40,30,60};
		System.out.println("The Original Arrays: ");
		for(int i :arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println("The no of Repeated elements is: "+count);

	}

}
