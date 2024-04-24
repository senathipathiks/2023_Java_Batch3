package com.junit.annotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Test1 {

	// call before all methods
	@BeforeAll
	public static void beforeAllMethods() {
		System.out.println("Begin");
	}

	// call After all methods
	@AfterAll
	public static void AfterAllMethods() {
		System.out.println("End");
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

}
