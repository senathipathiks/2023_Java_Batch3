package com.oops4;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	void noOfWheels() {
		System.out.println("Depends on the vehicle");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheels(){
		super.noOfWheels();
		System.out.println("I have two wheels");
	}
}

public class OverrideVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TwoWheeler bike = new TwoWheeler();
           bike.noOfEngine();
           bike.noOfWheels();
	}

}
