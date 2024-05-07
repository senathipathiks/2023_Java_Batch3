package com.junit.test;

public class TestMe {
	
	public int divideNums(int []arr)
	{
		if(arr[arr.length-1]==0)
		{
			return -1;
		}
		else 
			return arr[0]/arr[arr.length-1]; 
	}
//	public String makeUpper(String input) {
//		return input.toUpperCase();
//	}
//	
//	public int findSum(int num1, int num2) {
//		return num1+num2;
//	}

}
