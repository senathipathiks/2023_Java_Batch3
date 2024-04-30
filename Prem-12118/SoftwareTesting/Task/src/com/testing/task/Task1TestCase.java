package com.testing.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;






class Task1TestCase {

	@Test
	void incresingTest_1() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(1234);
		assertEquals(1,result);
		
	}
	
	@Test
	void incresingTest_2() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(1220);
		assertEquals(1,result);
		
	}
	@Test
	void incresingTest_3() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(1212);
		assertEquals(1,result);
		
	}

	
	@Test
	void incresingTest_4() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(123);
		assertEquals(1,result);
		
	}
	
	
	@Test
	void incresingTest_5() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(778);
		assertEquals(1,result);
		
	}
	
	@Test
	void incresingTest_6() {
		
		
		TestingTask1  test1=new TestingTask1();
		int result = test1.findIncreasing(776);
		assertEquals(1,result);
		
	}



}
