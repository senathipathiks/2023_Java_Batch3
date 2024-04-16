package com.junitvoter;

public class Voter {
    public String checkEligibility(int age) throws MinorAgeException, InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Negative Age");
        } else if (age < 10) {
            throw new MinorAgeException("Minor Age Exception");
        } else if (age >= 18) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
}


@SuppressWarnings("serial")
class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
