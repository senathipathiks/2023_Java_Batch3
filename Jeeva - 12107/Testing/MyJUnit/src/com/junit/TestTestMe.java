package com.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTestMe {

	
	
//	@Test
//	void test_makeUpper_1() {
//		
//		
////		Test1 tst1;
////		assertNotNull(tst1);   for Checking Null
//		
////		Test1 tst1=new Test1();
////		String result=tst1.makeUpper("amazon");
////		assertEquals("AMAZON", result);
//	}
	
	
//	@Test
//	void arrayEquals() {
//		
//		int[] arr1= {10,20,40};
//		int[] arr2= {10,20,40};
//		
//		//assertEquals(arr1, arr2);  Don't Use
//		
//		assertArrayEquals(arr1, arr2);
//		
//		// the assertArrayEquals also check the sequence of the value is same as the first array 
//		// or not 
//		
//	}

	
//	@Test
//	void test_findSum() {
//		
//		Test1 tst1=new Test1();
//		int result=tst1.findSum(10, 59);
//		assertEquals(69, result);
//	}
	
	
	// Using Fail Method  in test me ididn't check the last value 0 or not
//	
//	@Test
//	void using_fail() {
//		
//		int result=0;
//		Test1 tst1=new Test1();
//		
//		int[] divideArray= {80,3,5,0};
//		
//		try {
//		result=tst1.DevideBy(divideArray);
//		assertEquals(8, result);
//		}
//		catch(Exception e){
//			fail();
//		}
//		
//	}
	
	
	// With Using Business Logic Method  checking the last value 0 or not
	
		@Test
		void without_using_logic() {
			
			int result=0;
			Test1 tst1=new Test1();
			
			int[] divideArray= {80,3,5,0};
			
			try {
			result=tst1.DevideBy(divideArray);
			assertEquals(-1, result);
			}
			catch(Exception e){
				fail();
			}
			
		}
	
	
	
	
}
