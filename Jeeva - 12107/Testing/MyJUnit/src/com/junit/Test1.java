package com.junit;

public class Test1 {

	public String makeUpper(String input) {
		
		return input.toUpperCase();
	}
	
	
	public int findSum(int num1,int num2) {
		
		return num1+num2;
	}
	
	
	public int  DevideBy(int[] array) {
		if(array[array.length-1]==0) {
			return -1;
		}else
		return array[0]/array[array.length-1];	
		
	}


	
}
