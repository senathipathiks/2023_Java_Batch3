package com.junit.annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class AddTest {

	// set up - call before the test method
	@BeforeEach
	public void sayBeforeTest() {
		System.out.println("Before Test Case");
	}

	// tear down - call After the test method
	@AfterEach
	public void sayAfterTest() {
		System.out.println("After Test Case");
	}

   
	@Test
	void test_1() {
		
		Addition add = new Addition();
		int result = add.findSum(3, 3);
		assertEquals(6, result);

	}

	//to skip the test case, we used disabled
	@Disabled
	@Test
	void test_2() {

	Addition add = new Addition();
	int result = add.findSum(4, 3);
	assertEquals(7, result);

	}
	
	@Test
	void test_3() {

	Addition add = new Addition();
	int result = add.findSum(4, 3);
	assertEquals(7, result);

	}

	
}
