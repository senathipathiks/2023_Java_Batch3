package com.annotated;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestAnnote {
	
	@BeforeEach
	public void saysBeforeTest()
	{
		System.out.println("Executed Before Test");
	}
	
	@AfterEach
	public void saysAfterTest()
	{
		System.out.println("Executed After Test");
	}
	
	@BeforeAll
	public static void saysBeforeAll()
	{
		System.out.println("START");
	}
	
	@AfterAll
	public static void saysAfterAll()
	{
		System.out.println("END");
	}
	@Test
	void test_1() {
		fail("Not yet implemented");
	}
	@Test
	void test_2() {
		fail("Not yet implemented");
	}
	@Test
	void test_3() {
		fail("Not yet implemented");
	}
	@Disabled
	@Test
	void test_4() {
		fail("Not yet implemented");
	}

}
