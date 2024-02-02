package com.day11;

abstract class Vehicle{

	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	abstract void noOfWheels();
	
	abstract void brandName();	
}

abstract class TwoWheeler extends Vehicle{
	
	 void noOfWheels() {
		 System.out.println("Two wheelers will have Two Wheels");
	 }
	
}
 class Bike extends TwoWheeler{
	 
	 void brandName() {
		 System.out.println("Brand Name : Hero Honda");
	 }
	
}

public class AbstractClassSample2 {

	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();


	}

}
