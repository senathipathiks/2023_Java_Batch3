package com.junit.day61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestMe {

	@Test
	void test_makeUpper_1() {
		TestMe testMe1 = new TestMe();
		String result = testMe1.makeUpper("sanjaykhanna");
		assertEquals("SANJAYKHANNA", result);
	}
	
	@Test
	void test_makeUpper_2() {
		TestMe testMe1 = new TestMe();
		String result = testMe1.makeUpper("google");
		assertEquals("GOOGLE", result);
	}
	
	@Test
	void test_findSum_1() {
		TestMe testMe1 = new TestMe();
		int result = testMe1.findSum(50, 100);
		assertEquals(150, result);
	}

}
