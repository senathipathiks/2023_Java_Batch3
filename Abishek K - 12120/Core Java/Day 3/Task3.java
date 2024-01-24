//Print a unique elements in an arrays

package com.day3;

public class Task3 {

	public static void main(String[] args) {
		int [] arr = {10,20,10,20,30,40,50,60};
		System.out.println("The original Arrays is: ");
		for(int i: arr) {
			System.out.println(i);
		}
		System.out.println("Elements other than duplicate are: ");
		for(int i=0;i<arr.length;i++) {
			boolean dup = false;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					dup=true;
					break;
				}
			}
			if(!dup) {
			
				System.out.println(arr[i]);
			}
		}
		

	}

}
