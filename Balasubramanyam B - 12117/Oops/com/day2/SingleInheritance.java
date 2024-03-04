package com.day2;
//Single Inheritance
class TwoWheeler  {
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

class Bike extends TwoWheeler {
	void brandname() {
		System.out.println("MY BRAND NAME IS HONDA");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandname();

	}

}
