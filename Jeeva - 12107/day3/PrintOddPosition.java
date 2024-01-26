package com.corejava.day3;

public class PrintOddPosition {
	public static void main(String[] args) {
	    int arr[]= {10,20,30,40,50,60,70,80};
       
        System.out.println("Odd Position Elements: ");
       
        for(int i=0;i<arr.length;i++) {
            
            if(i%2!=0) {
            	System.out.println(arr[i]);
            }
        }

   
		
		
	}

}
