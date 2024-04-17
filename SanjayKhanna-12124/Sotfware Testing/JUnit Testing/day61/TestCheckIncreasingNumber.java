package com.junit.day61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckIncreasingNumber {

	@Test
	void test_checkNumber_1() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(1, obj.checkNumber(1234));
	}
	
	@Test
	void test_checkNumber_2() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(0, obj.checkNumber(1220));
	}
	
	@Test
	void test_checkNumber_3() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(0, obj.checkNumber(1212));
	}
	
	@Test
	void test_checkNumber_4() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(1, obj.checkNumber(123));
	}
	
	@Test
	void test_checkNumber_5() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(1, obj.checkNumber(778));
	}
	
	@Test
	void test_checkNumber_6() {
		CheckIncreasingNumber obj = new CheckIncreasingNumber();
		assertEquals(0, obj.checkNumber(776));
	}

}
