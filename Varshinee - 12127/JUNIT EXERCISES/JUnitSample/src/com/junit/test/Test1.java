package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {
	
	@Test
	void test_divideNums()
	{
		int []input = {100,20,5,0};
		int res=0;
		TestMe t=new TestMe();
		try
		{
			res=t.divideNums(input);
			assertEquals(-1, res);
		}
		catch(Exception e)
		{
			fail();
		}
	}

//	@Test
//	void test_makeUpper_1() {
//		TestMe tst1=new TestMe();
//		String result=tst1.makeUpper("google");
//		assertEquals("GOOGLE",result);
//		
//	}
//	@Test
//	void test_makeUpper_2() {
//		TestMe tst1=new TestMe();
//		String result=tst1.makeUpper("vino");
//		assertEquals("VINO",result);
//		
//	}
//	@Test
//	void test_findSum_1() {
//		TestMe tst1=new TestMe();
//		int result=tst1.findSum(10,20);
//		assertEquals(30,result);
//		
//	}

}
