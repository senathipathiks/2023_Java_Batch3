package com.coreday6;

class InvalidAgeException extends Exception {

	InvalidAgeException(String msg) {
		super(msg);
	}

}

class ElectionCommision {

	ElectionCommision(int age) throws InvalidAgeException {
		if (age < 18 || age > 110) {
			throw new InvalidAgeException("Not Eligiable to vote");
		} else {
			System.out.println("Welcome to Election Commision of India");
		}
	}

}

public class CustomExceptionExample2 {
	public static void main(String[] args) {

		try {
			ElectionCommision obj = new ElectionCommision(13);

		} catch (InvalidAgeException e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}

	}
}
