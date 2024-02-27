package com.oops.day4;

class Vehicle1{
	void noOfEngine() {
		System.out.println("All Vehicles are having Single Engines...");
	}
	
	static void noOfWheels() {
		System.out.println("All Vehicles are having a Wheels...");
	}
}

class TwoWheeler1 extends Vehicle1{
	static void noOfWheels() { //it is not possible to overrides the static method...
		System.out.println("I have two wheels");
	}
}

public class OverridingSample4 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Vehicle1 ref=new TwoWheeler1();//DMD (Upcasting)...(Dynamic Method Dispatch)...
		ref.noOfEngine();
		ref.noOfWheels();//Static method could not be overrided it shows only Superclass Wheels.
		
		TwoWheeler1 ref2=new TwoWheeler1();
		ref2.noOfWheels();
		

	}

}
