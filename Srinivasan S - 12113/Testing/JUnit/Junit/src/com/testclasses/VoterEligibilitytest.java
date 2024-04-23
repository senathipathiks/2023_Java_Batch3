package com.testclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sampleclasses.InvalidAgeException;
import com.sampleclasses.MinorAgeException;
import com.sampleclasses.VoterEligibility;

class VoterEligibilitytest {

	// method for eligible test case
	@Test
	void test1() throws MinorAgeException, InvalidAgeException {

		int age = 25;
		VoterEligibility eligibile = new VoterEligibility();
		String result = eligibile.eligibility(age);
		assertEquals("Eligible", result);
	}

	@Test
	void test2() {

		int age = 10;
		VoterEligibility eligibile = new VoterEligibility();
		String result;
		try {
			result = eligibile.eligibility(age);
			assertEquals("Minor age", result);
			
		} catch (MinorAgeException e) {
			System.out.println("Handled");
			
		} catch (InvalidAgeException e) {
			System.out.println("Handled");
		}
		
	}
		
	
	@Test
	void test3() {

		int age = -10;
		VoterEligibility eligibile = new VoterEligibility();
		String result;
		try {
			result = eligibile.eligibility(age);
			assertEquals("Invalid age", result);
			
		} catch (MinorAgeException e) {
			System.out.println("Handled");
			
		} catch (InvalidAgeException e) {
			System.out.println("Handled");
		}
		
	}
	
	@Test
	void test4() throws MinorAgeException, InvalidAgeException {

		int age = 17;
		VoterEligibility eligibile = new VoterEligibility();
		String result = eligibile.eligibility(age);
		assertEquals("Not eligible", result);
	}


}
