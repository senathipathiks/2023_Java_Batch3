package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test_makeUpper_1() 
	{
		Testme tst1 = new Testme();
		String result=tst1.makeUpper("google");
		assertEquals("GOOGLE",result);
	}

	@Test
	void test_makeUpper_2() 
	{
		Testme tst1 = new Testme();
		String result=tst1.makeUpper("vino");
		assertEquals("VINO",result);
	}
	
	@Test
	void test_findSum_1() 
	{
		Testme tst1 = new Testme();
		int result=tst1.findSum(10,20);
		assertEquals(30,result);
	}
	
	
	
}
