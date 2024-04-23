package com.junit.task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVoterTest {

	// Eligible code
	@Test
	void test_checkAge_01() {
		int age = 25;
		Voter voter = new Voter();
		String res;
		try {
			res = voter.checkAge(age);
			assertEquals("Eligible", res);

		} catch (MinorAgeException e) {
			e.printStackTrace();
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		}
	}

	// Not Eligible code
	@Test
	void test_checkAge_02() {
		int age = 17;
		Voter voter = new Voter();
		String res;
		try {
			res = voter.checkAge(age);
			assertEquals("Not Eligible", res);

		} catch (MinorAgeException e) {
			e.printStackTrace();
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		}

	}

	// Invalid Age code
	@Test
	void test_checkAge_03() {
		int age = 8;
		Voter voter = new Voter();
		String res;
		try {
			res = voter.checkAge(age);
			assertEquals("Minor Age", res);

		} catch (MinorAgeException e) {
			e.printStackTrace();
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		}
	}

	// Invalid Age code
	@Test
	void test_checkAge_04() {
		int age = -6;
		Voter voter = new Voter();
		String res;
		try {
			res = voter.checkAge(age);
			assertEquals("Invalid Age", res);

		} catch (MinorAgeException e) {
			e.printStackTrace();
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		}
	}

}
