package com.coreday4;

abstract class Sports {
	abstract void player();

}

class Cricket {
	void player() {
		System.out.println("I am a cricket player");
	}
}

class Vollyball {
	void player() {
		System.out.println("I am a volly ball player");
	}
}

class Football {
	void player() {
		System.out.println("I am a football player");
	}
}

public class SportsMain {

	public static void main(String[] args) {

		Cricket obj1 = new Cricket();
		obj1.player();

		Vollyball obj2 = new Vollyball();
		obj2.player();

		Football obj3 = new Football();
		obj3.player();

	}

}
