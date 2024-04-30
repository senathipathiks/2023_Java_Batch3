package com.firstpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Test2 {


	@BeforeAll
	public static void sayBeforeClassMethod()
	{

	System.out.println("BEGIN --> Through BeforeAll \n");
	}
	
	@AfterAll
	public static void sayAfterClassMethod()
	{

	System.out.println("END --> Through AfterAll");
	}
	
	@BeforeEach
	public void sayBeforeTest()
	{

	System.out.println("Before test case executed \n");
	}

	
	@AfterEach
	public void sayAfterTest()
	{

	System.out.println("After test case executed");
	}

	@Test
	//@Disabled
	@Ignore("Under Working")
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
	@Test
	void test_4() {
		fail("Not yet implemented");
	}
	@Test
	void test_5() {
		fail("Not yet implemented");
	}

}
