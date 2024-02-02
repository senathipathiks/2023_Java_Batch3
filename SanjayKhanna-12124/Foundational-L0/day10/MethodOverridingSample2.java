package com.day10;

class Vehicle{
	
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
	void noOfWheels() {
		System.out.println("All Vehicle have Wheels");
	}
}

class Car extends Vehicle{

	void noOfWheels() {
		System.out.println("Car have Four Wheels");
	}
	
}

public class MethodOverridingSample2 {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.noOfEngine();
		obj.noOfWheels();

	}

}
