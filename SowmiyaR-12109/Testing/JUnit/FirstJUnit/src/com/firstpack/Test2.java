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
	public static void beforeallmethod() {
		System.out.println("BEGIN");
	}
	@AfterAll
	public static void afterallmethod() {
		System.out.println("END");
	}
	
	@BeforeEach
	public void saybeforetest() {
		System.out.println("Before TestCase");
	}
	@AfterEach
	public void sayaftertest() {
		System.out.println("After TestCase");
	}

	@Disabled
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
	@Test
	void test_4() {
		fail("Not yet implemented");
	}

}
