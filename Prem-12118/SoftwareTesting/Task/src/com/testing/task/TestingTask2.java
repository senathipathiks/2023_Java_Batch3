package com.testing.task;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid Age: Age cannot be negative or zero");
    }
}

@SuppressWarnings("serial")
class MinorAgeException extends Exception {
    public MinorAgeException() {
        super("Minor Age: Age must be greater than or equal to 10");
    }
}

public class TestingTask2 {

    public String checkAge(int age) throws InvalidAgeException, MinorAgeException {

        if (age < 10) {
            throw new MinorAgeException();
        } else if (age <= -1) {
            throw new InvalidAgeException();
        } else if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }

    }
}
