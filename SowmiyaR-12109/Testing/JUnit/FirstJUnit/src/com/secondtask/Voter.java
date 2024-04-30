package com.secondtask;

class MinorAgeException extends Exception {
    public MinorAgeException() {
        super("Minor Age Exception");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Negative Age");
    }
}

class Voter {
    public String checkAge(int age) throws MinorAgeException, InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        } else if (age < 10) {
            throw new MinorAgeException();
        } else if (age >= 18) {
            return "Eligible";
        } else  {
            return "Not Eligible";
        }
    }

}
