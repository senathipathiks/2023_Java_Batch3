package com.myJunit.algorithm;


public class MinorAgeException extends RuntimeException {

	@Override
	public String getMessage() {

		return "Minor age Negative age";
	}

}
