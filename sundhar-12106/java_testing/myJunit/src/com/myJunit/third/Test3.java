package com.myJunit.third;

import org.junit.jupiter.api.Test;

public class Test3 {

	@Test
	public int test_divideNums(int[] arr) {
		
//		if (arr[arr.length-1] == 0) {
//			return -1;
//		}
		return arr[0] / arr[arr.length-1];
		
	}

}
