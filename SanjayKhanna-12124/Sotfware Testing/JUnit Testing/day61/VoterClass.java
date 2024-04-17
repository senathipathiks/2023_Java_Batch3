package com.junit.day61;

import com.junit.day61.exception.InvalidAgeException;
import com.junit.day61.exception.MinorAgeExpection;

public class VoterClass {

	public String checkEligibility(int age) throws MinorAgeExpection, InvalidAgeException {
		
		if (age >= 18)
			return "Eligible";
		else if (age < 0)
			throw new InvalidAgeException("Invalid Age Exception");
		else if (age < 10)
			throw new MinorAgeExpection("Minor age Expection");
		else
			return "Not Eligible";
	}

}
