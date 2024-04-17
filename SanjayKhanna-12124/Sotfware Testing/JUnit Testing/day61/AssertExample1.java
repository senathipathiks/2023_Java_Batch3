package com.junit.day61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertExample1 {

	@Test
	void test() {
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		//assertEquals(arr1, arr2);
		assertArrayEquals(arr1, arr2);
	}

}
