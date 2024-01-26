//Print the odd position values
package com.day3;

public class Task4 {

	public static void main(String[] args) {
	     int arr[]= {10,20,30,40,50,60,70,80};
	     System.out.println("The Arrays is: ");
	     for(int i:arr) {
	    	 System.out.println(i);
	    	 
	     }
	     System.out.println("Odd Position Elements: ");
	     int i,j,k;
	     for( i=0;i<arr.length;i++) {
	    	 
	    	 for( j=2*i;j<arr.length;j++) {
	    		 System.out.println(arr[j]);
	    		 break;
	    	 }
	     }

	}

}
