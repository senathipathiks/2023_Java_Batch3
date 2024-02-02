package com.day10;

class Transport{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
	void noOfWheels() {
		System.out.println("All Vehicle have Wheels");
	}
}

class Bike extends Transport{
	
	void noOfWheels() {
		System.out.println("Bike have Two Wheels");
	}
}

public class MethodOverridingDmdSample1 {

	public static void main(String[] args) {
		Transport obj = new Bike();
		obj.noOfEngine();
		obj.noOfWheels();

	}

}
