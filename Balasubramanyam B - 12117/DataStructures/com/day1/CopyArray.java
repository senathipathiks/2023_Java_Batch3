package com.day1;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalArr = {2, 3, 4, 5, 6, 7};
		
	    int[] newArr = new int[originalArr.length];
		for (int i = 0; i < originalArr.length; i++) 
		newArr[i] = originalArr[i];
		for (int i = 0; i < originalArr.length; i++)
		    System.out.print(originalArr[i] + " ");
		System.out.println();
		
		for (int i = 0; i < newArr.length; i++)
		    System.out.print(newArr[i] + " ");
	}

}
