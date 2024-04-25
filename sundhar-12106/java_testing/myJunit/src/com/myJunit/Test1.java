package com.myJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Test1 {
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before all cases");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After All cases");
	}
	
	
	@BeforeEach
	public void beforeTest() {
		System.out.println("Before testcase");
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("After testcase");
	}

	@Test
	void test_makeUpper_1() {
		TestMe testMe = new TestMe();

		String result = testMe.makeUpper("google");
		assertEquals("GOOGLE", result);
	}
	@Test
	void test_makeUpper_2() {
		TestMe testMe = new TestMe();

		String result = testMe.makeUpper("prem");
		assertEquals("PREM", result);
	}
	
	@Disabled
	@Test
	void test_addition_1() {
		TestMe testMe = new TestMe();
		
		int result = testMe.makeAddition(10, 25);
		
		assertEquals(35, result);
	}

}
