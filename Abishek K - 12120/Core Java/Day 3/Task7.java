//Reverse a word 

package com.day3;

public class Task7 {

	public static void main(String[] args) {
		String str = new String("Abishek");
		System.out.println("Original String word is: "+str);
		char arr[] = str.toCharArray();
		System.out.println("Reversed String word is ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
