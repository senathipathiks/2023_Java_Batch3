package com.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sampleclasses.IncreasingNumber;

class IncreasingNumberTest {

	@Test
	void test1() {
		int num = 1234;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(1, result);

	}

	@Test
	void test2() {
		int num = 123;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(1, result);

	}

	@Test
	void test3() {
		int num = 1220;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(0, result);

	}

	@Test
	void test4() {
		int num = 1212;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(0, result);

	}

	@Test
	void test5() {
		int num = 778;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(1, result);

	}

	@Test
	void test6() {
		int num = 776;

		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(num);
		assertEquals(0, result);

	}
}
