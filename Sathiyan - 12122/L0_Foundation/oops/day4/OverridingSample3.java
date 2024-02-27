package com.oops.day4;

class Vehicles{
	void noOfEngine() {
		System.out.println("All Vehicles are having Single Engines...");
	}
	
	void noOfWheels() {
		System.out.println("All Vehicles are having a Wheels...");
	}
}

class TwoWheelers extends Vehicles{
	void noOfWheels() { //Overrides the method of super-class...
		System.out.println("I have two wheels");
	}
}



public class OverridingSample3 {

	public static void main(String[] args) {
		Vehicles ref=new TwoWheelers();//DMD (Upcasting)...(Dynamic Method Dispatch)...
		ref.noOfWheels();
		ref.noOfEngine();
	}

}
