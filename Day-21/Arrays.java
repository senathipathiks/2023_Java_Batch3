package com.Day3;

public class Arrays {

	public static void main(String[] args) {
		
		int arr[]= {1,4,6,8,9};
		
		String arr1[]= {"Prashanth","Surya","Jeeva"};
		
		System.out.println(arr.length);//size of arr
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(" "+arr[i]);
			
		}
		System.out.println();
		
		System.out.println("************************************************************");
		
		// For each 
		
		for (int i : arr) {
			
			
			
			System.out.print(" "+i);
		}
       
		
		System.out.println();
		
		//String foreach
		
		for (String string : arr1) {
			System.out.println(string);
		}
	}

}
