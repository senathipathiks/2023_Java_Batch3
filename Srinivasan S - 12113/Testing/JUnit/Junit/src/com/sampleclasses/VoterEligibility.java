package com.sampleclasses;


public class VoterEligibility {

	

	public String eligibility(int age) throws MinorAgeException, InvalidAgeException {
		if (age >= 18) {
			return "Eligible";
		} else if (age >= 16 && age < 18) {
			return "Not eligible";
		} else if (age <= 10 && age>=0) {
			throw new MinorAgeException("Minor age");
		}
		else if(age<0) {
			throw new InvalidAgeException("Invalid age");
		}
		return null;
	}
}
