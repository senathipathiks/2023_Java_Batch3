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

}
