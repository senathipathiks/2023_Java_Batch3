package com.firstpack;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test2 {

	@BeforeEach
	public void sayBeforeTest()
	{
		System.out.println("Before TestCase");
	}
	@AfterEach
	public void sayAfterTest()
	{
		System.out.println("After Testcase");
	}
	@Test
	void test_1() {
		fail("Not yet implementsd");
		
	}
	@Test
	void test_2() {
		fail("Not yet implementsd");
		
	}
	@Test
	void test_3() {
		fail("Not yet implementsd");
		
	}
	@Test
	void test_4() {
		fail("Not yet implementsd");
		
	}


}
