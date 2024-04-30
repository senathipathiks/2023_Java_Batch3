package com.assertpack;

public class TestAssert {
	
//	public int divideNum (int []arr)
//	{
//		int div = arr[0]/arr[arr.length-1];
//		return div;
//	}
	public int divideNum (int []arr)
	{
		if(arr[arr.length-1] == 0)
		{
			return -1;
		}
		else 
			return arr[0]/arr[arr.length-1];
		
	}
}
