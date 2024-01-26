package com.Day3;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int count=0;
		int arr[] = {3,5,8,1,3,5};
		System.out.println("The Duplicate values are :");
		
		for (int i = 0; i < arr.length; i++) {
			
			
			
			for (int j = i+1; j < arr.length; j++) {
				
				
				
				if(arr[i]==arr[j]) {
					
					count++;
					
				
					System.out.println(arr[j]);
				}
				
			}
			
		}
		
           System.out.println("The total count of duplicate :"+count);
	}

}
