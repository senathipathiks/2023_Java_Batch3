package com.oops.day4;

class Vehicle{
	void noOfEngine() {
		System.out.println("All Vehicles are having Single Engines...");
	}
	
	void noOfWheels() {
		System.out.println("All Vehicles are having a Wheels...");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheels() { //Overrides the method of super-class...
		System.out.println("I have two wheels");
	}
}

public class OverridingSample2 {

	public static void main(String[] args) {
		TwoWheeler ref = new TwoWheeler();
		ref.noOfEngine();
		ref.noOfWheels();
	}

}
