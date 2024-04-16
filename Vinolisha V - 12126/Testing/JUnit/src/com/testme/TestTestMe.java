package com.testme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestMe {

	@Test
	void test_makeUpper_1() {
		TestMe tst1= new TestMe();
		String result=tst1.makeUpper("google");
		assertEquals("GOOGLE", result);
	}
	
	@Test
	void test_makeUpper_2() {
		TestMe tst1= new TestMe();
		String result=tst1.makeUpper("vino");
		assertEquals("VINO", result);
	}
	@Test
	void test_makeUpper_3() {
		TestMe tst1=new TestMe();
		String result=tst1.makeUpper("VinoLishA");
		assertEquals("VINOLISHA", result);
	}
	@Test
	void test_findSum_1() {
		TestMe tst1=new TestMe();
		int result=tst1.findSum(1, 3);
				assertEquals(4, result);
	}

}
