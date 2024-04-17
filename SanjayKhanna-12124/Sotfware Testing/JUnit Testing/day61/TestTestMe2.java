package com.junit.day61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestMe2 {

	@Test
	void test_divideNumbers() {

		int[] input = { 100, 20, 5, 0 };
		int res = 0;
		TestMe2 obj = new TestMe2();

		try {
			res = obj.divideNumbers(input);
			assertEquals(-1, res);
		} catch (Exception e) {
			fail("/ by zero error");
		}

	}

}
