package com.junit.day61;

public class TestMe2 {

	public int divideNumbers(int[] arr) {

		int result = arr[arr.length-1] != 0 ? arr[0]/arr[arr.length-1] : -1 ; // with business logic

//		int result = arr[0] / arr[arr.length - 1]; // Without Business logic

		return result;
	}

}
