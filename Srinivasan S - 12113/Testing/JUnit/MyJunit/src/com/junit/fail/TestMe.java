package com.junit.fail;

public class TestMe {
	// WAP to accept an array as input,divide first element by last element
	// if the last element is zero return -1

	public int divideNums(int[] arr) {

		if (arr[arr.length - 1] == 0) {
			return -1; //code with business logic 
		} else

			return arr[0] / arr[arr.length - 1];
	}

}
