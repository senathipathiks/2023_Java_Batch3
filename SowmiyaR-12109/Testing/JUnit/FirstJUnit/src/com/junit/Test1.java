package com.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

 public class Test1 {
	
	@Test
	 public void test_divideNums() {
		int []input= {100,20,5,0};
		int res=0;
		TestTestMe t=new TestTestMe();
		try {
			res=t.divideNums(input);
			assertEquals(-1, res);
		}
		catch(Exception e) {
			fail();
		}
	}
	
	
	
	
	
	
	
	
//	
//	public String makeUpper(String input) {
//		
//
//		return input.toUpperCase();
//	}
//
//	public int findSum(int num1, int num2) {
//		return num1 + num2;
//
//	}

}
