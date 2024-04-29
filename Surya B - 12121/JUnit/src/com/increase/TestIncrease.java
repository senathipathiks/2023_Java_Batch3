package com.increase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIncrease {

	@Test
	void test_findNum() {
		IncreasingNumber i = new IncreasingNumber();
		int num = i.findNum(1234);
		assertEquals(1, num);
	}
	
	@Test
	void test_findNum1() {
		IncreasingNumber i = new IncreasingNumber();
		int num = i.findNum(1220);
		assertEquals(1, num);
	}
	
	@Test
	void test_findNum2() {
		IncreasingNumber i = new IncreasingNumber();
		int num = i.findNum(1212);
		assertEquals(1, num);
	}
	
	@Test
	void test_findNum3() {
		IncreasingNumber i = new IncreasingNumber();
		int num = i.findNum(123);
		assertEquals(1, num);
	}
	
	@Test
	void test_findNum4() {
		IncreasingNumber i = new IncreasingNumber();
		int num = i.findNum(778);
		assertEquals(1, num);
	}

}
