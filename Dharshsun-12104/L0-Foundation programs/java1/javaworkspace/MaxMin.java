package com.java1;

public class MaxMin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	        int[] array = {5, 12, 9, 18, 3, 21};
	        int max = array[0]; 
	        int min = array[0]; 
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i]; 
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }
	
	}

