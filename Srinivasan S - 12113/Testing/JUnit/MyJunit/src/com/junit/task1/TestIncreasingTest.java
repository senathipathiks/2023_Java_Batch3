package com.junit.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIncreasingTest {

	// 1234 is a increasing number or not
	@Test
	void test_increasingNumber_01() {
		int input = 1234;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(1, result);
	}

	// 1220 is a increasing number or not
	@Test
	void test_increasingNumber_02() {
		int input = 1220;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(0, result);
	}

	// 1212 is a increasing number or not
	@Test
	void test_increasingNumber_03() {
		int input = 1212;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(0, result);
	}

	// 123 is a increasing number or not
	@Test
	void test_increasingNumber_04() {
		int input = 123;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(1, result);
	}

	// 778 is a increasing number or not
	@Test
	void test_increasingNumber_05() {
		int input = 778;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(1, result);
	}

	// 1220 is a increasing number or not
	@Test
	void test_increasingNumber_06() {
		int input = 776;
		IncreasingNumber number = new IncreasingNumber();
		int result = number.findIncreasing(input);
		assertEquals(0, result);
	}

}
