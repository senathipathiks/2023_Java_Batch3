package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestClass {

	@Test
	void test_makeUpper_1() {
		TestClass tc = new TestClass();
		String result = tc.makeUpper("google");
		assertEquals("GOOGLE", result);
	}
	
	@Test
	void test_makeUpper_2() {
		TestClass tc = new TestClass();
		String result = tc.makeUpper("prem");
		assertEquals("PREM", result);
	}
	
	@Test
	void test_findSum_1() {
		TestClass tc = new TestClass();
		int result = tc.findSum(10, 20);
		assertEquals("PREM", result);
	}
	
	

}
