package com.myJunit.age;

import com.myJunit.algorithm.MinorAgeException;

public class VoterAgeCalculation {
	
	public String checkAge(int age) throws Exception {
		
		if (age < 0 ) {
				throw new Exception("Negative age");
		}else if (age > 0 && age < 10) {
			throw new MinorAgeException();
		} else if (age > 10 && age < 18) {
			
			return "Not Eligle to vote";
		} else {
			
			return "Eligle to vote";
		}
		
	}

}
