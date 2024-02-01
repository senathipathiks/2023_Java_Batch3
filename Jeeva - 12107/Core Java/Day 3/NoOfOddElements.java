package com.corejava.day3;

public class NoOfOddElements {
	public static void main(String[] args) {
		
	        int arr[] = {1,3,2,4,6,7,8,10};
	      
	        int count=0;
	        boolean dup=false;
	        System.out.println("Odd Elements are: ");
	        for(int i=0;i<arr.length;i++) {
	            if(arr[i]%2!=0) {
	              
	                System.out.println(arr[i]);
	                count++;
	            }
	        }
	        System.out.println("The no of odd elements are: "+count);
	}
}