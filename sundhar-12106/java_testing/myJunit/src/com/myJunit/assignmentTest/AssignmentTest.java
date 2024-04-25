package com.myJunit.assignmentTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.myJunit.age.VoterAgeCalculation;
import com.myJunit.algorithm.NumberIncreasingAlgorithm;

class AssignmentTest {

	@Test
	public void testAge_1() {
		VoterAgeCalculation age = new VoterAgeCalculation();

		try {
			age.checkAge(8);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAge_2() {
		VoterAgeCalculation age = new VoterAgeCalculation();

		try {
			String result = age.checkAge(16);
			assertEquals("Not Eligle to vote", result);
		} catch (Exception e) {
				
		}
	}

	@Test
	public void testAge_3() {
		VoterAgeCalculation age = new VoterAgeCalculation();

		try {
			String result = age.checkAge(23);
			assertEquals("Eligle to vote", result);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAge_4() {
		VoterAgeCalculation age = new VoterAgeCalculation();

		try {
			age.checkAge(-3);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIncresingNumber_1() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(1234);

		assertEquals(1, result);

	}
	
	@Test
	public void testIncresingNumber_2() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(1220);

		assertEquals(0, result);

	}
	
	@Test
	public void testIncresingNumber_3() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(1212);

		assertEquals(0, result);

	}
	
	@Test
	public void testIncresingNumber_4() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(123);

		assertEquals(1, result);

	}
	
	@Test
	public void testIncresingNumber_5() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(778);

		assertEquals(1, result);

	}
	
	@Test
	public void testIncresingNumber_6() {

		NumberIncreasingAlgorithm increasingAlgorithm = new NumberIncreasingAlgorithm();

		int result = increasingAlgorithm.checkIncreasing(776);

		assertEquals(0, result);

	}

}
