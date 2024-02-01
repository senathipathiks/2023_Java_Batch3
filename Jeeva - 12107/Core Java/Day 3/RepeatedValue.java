package com.corejava.day3;

public class RepeatedValue {
	 public static void main(String[] args) {
	        int count=0;
	        int [] arr = {10,60,40,30,60};
	      
	        for(int i=0;i<arr.length;i++) {
	            for(int j=i+1;j<arr.length;j++) {
	                if(arr[i]==arr[j]) {
	                    count++;
	                }
	            }
	        }
	        System.out.println("The no of Repeated elements is: "+count);

	    

	
	}

}
