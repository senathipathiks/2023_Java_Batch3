package com.day1;
class InvalidAge extends Exception {
	InvalidAge(String msg){
		super(msg);
	}
}

class ElectionComm {
	ElectionComm(int age) throws InvalidAge {
		if (age<=18 || age>110) {
			throw new InvalidAge("You're not eligible for Voting in the Election");
		}
		else {
			System.out.println("You're the voting citizen right now");
		}
	}
}

public class CustomEx2 {

	public static void main(String[] args) {
		
		try {
			ElectionComm ec = new ElectionComm(57);
		}
		catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
	}

}
