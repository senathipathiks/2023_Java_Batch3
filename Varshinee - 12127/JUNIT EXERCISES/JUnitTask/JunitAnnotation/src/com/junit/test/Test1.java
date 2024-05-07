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

}
