package com.junit.day61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.day61.exception.InvalidAgeException;
import com.junit.day61.exception.MinorAgeExpection;

class TestVoterClass {

	@Test
	void test_checkEligibility_1() throws MinorAgeExpection, InvalidAgeException {

		VoterClass obj = new VoterClass();
		assertEquals("Eligible", obj.checkEligibility(21));
	}

	@Test
	void test_checkEligibility_2() throws MinorAgeExpection, InvalidAgeException {

		VoterClass obj = new VoterClass();
		assertEquals("Not Eligible", obj.checkEligibility(14));
	}

	@Test
	void test_checkEligibility_3() throws MinorAgeExpection, InvalidAgeException {

		try {
			VoterClass obj = new VoterClass();
			assertEquals("Minor Age Expection", obj.checkEligibility(5));
		} catch (MinorAgeExpection e) {
			fail(e.getMessage());
		}
	}

	@Test
	void test_checkEligibility_4() throws MinorAgeExpection, InvalidAgeException {

		try {
			VoterClass obj = new VoterClass();
			assertEquals("Invalid Age Expection", obj.checkEligibility(-1));
		} catch (InvalidAgeException e) {
			fail(e.getMessage());
		}
	}

}
