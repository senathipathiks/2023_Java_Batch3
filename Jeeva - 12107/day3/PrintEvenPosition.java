package com.corejava.day3;

public class PrintEvenPosition {
	public static void main(String[] args) {
	    int arr[]= {10,20,30,40,50,60,70,80};
       
        System.out.println("Even Position Elements: ");
       
        for(int i=0;i<arr.length;i++) {
            
            if(i%2==0) {
            	System.out.println(arr[i]);
            }
        }

   
		
		
	}

}
