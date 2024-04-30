package com.assertpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseAssert {

	@Test
	void test_divideNum()
	{
		int []input = {100, 20, 50, 0};
		int res = 0;
		TestAssert ta = new TestAssert();
		try {
			res = ta.divideNum(input);
			assertEquals(-1, res);
		}
		catch (Exception e) {
			fail();
		}
	}

}
