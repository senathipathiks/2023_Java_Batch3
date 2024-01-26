package com.corejava.day3;

public class DuplicateElements {
	public static void main(String[] args) {
		
		   int [] arr = {10,20,10,20,40,60,60,60,60,70,40};
	        System.out.print("The original Arrays is: ");
	        for(int i:arr) {
	            System.out.println(i);
	        }
	        System.out.println("The Duplicate Elements are:");
	        for(int i=0;i<arr.length;i++) {
	            for(int j=i+1;j<arr.length;j++) {
	                if(arr[i]==arr[j]) {
	                    System.out.println(arr[j]);
	                }
	            }
	        }
		
	}

}
