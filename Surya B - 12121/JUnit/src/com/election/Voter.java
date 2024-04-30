package com.election;



public class Voter {
	
	void checkAge(int age) throws  MinorAgeException, InvalidAgeException {
		 if (age < 0) {
	            throw new InvalidAgeException("Negative Age");
	        } else if (age < 10) {
	            throw new MinorAgeException("Minor Age Exception");
	        } else if (age >= 18) {
	            
	        } else {
	            
	        }
	}
}

class MinorAgeException extends Exception {
    public MinorAgeException() {
        
    }
}

class InvalidAgeException extends Exception {
   
}
