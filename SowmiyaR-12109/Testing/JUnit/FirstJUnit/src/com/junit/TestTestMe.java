package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 public class TestTestMe {

//	@Test
//	void test_makeUpper_1() {
//		Test1 tst1=new Test1();
//		String result = tst1.makeUpper("google");
//		assertEquals("GOOGLE",result);
//	}
//	@Test
//	void test_makeUpper_2() {
//		Test1 tst1=new Test1();
//		String result = tst1.makeUpper("vino");
//		assertEquals("VINO",result);
//	}
//	@Test
//	void test_findSum_1() {
//		Test1 tst1=new Test1();
//		int result = tst1.findSum(10,20);
//		assertEquals(30,result);
//	}
	public int divideNums(int[] arr) {

		if (arr[arr.length - 1] == 0) {
			return -1;
		} else
			return arr[0] / arr[arr.length - 1];
	}

}
