package com.junit.fail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestFail {

//	@Test
//	void test_divideNums {
//      int []input= {100,20,5,10};
//      TestMe t=new TestMe();
//      int res=t.divideNums(input);
//      assertEquals(10, res);
//      
	
	
   //if condition 
	@Test
	void test_divideNums_01() {
		int []input = { 100, 20, 5, 0 };
		int res = 0;
		TestMe t = new TestMe();
		try {
			 res = t.divideNums(input);
			assertEquals(-1, res);
		} catch (Exception e) {
			fail();
		}

	}
	
	//else condition
	@Test
	void test_divideNums_02() {
		int []input = { 100, 20, 5, 10 };
		int res = 0;
		TestMe t = new TestMe();
		try {
			 res = t.divideNums(input);
			assertEquals(10, res);
		} catch (Exception e) {
			fail();
		}

	}

}
