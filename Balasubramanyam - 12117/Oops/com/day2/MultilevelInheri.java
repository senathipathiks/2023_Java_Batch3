package com.day2;
//MultiLevel Inheritance
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheelers extends Vehicle {
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

class Bikes extends TwoWheelers {
	void brandname() {
		System.out.println("MY BRAND NAME IS HONDA");
	}
}
public class MultilevelInheri {

	public static void main(String[] args) {
		Bikes bik = new Bikes();
		bik.noOfEngine();
		bik.noOfWheels();
		bik.brandname();
		

	}

}
