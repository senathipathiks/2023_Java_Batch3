package com.day24;

class Vehical{
	
	void noOfWheels() {
		System.out.println("Vehical will have wheels");
	}
}

class TwoWheeler extends Vehical{
	@Override
	void noOfWheels() {
		System.out.println("Only Two Wheels");
	}
}

class FourWheeler extends Vehical{
	@Override
	void noOfWheels() {
		System.out.println("Only four Wheels");
	}
}
public class VehicalMainClass {

	public static void main(String[] args) {
		Vehical bike = new TwoWheeler();
		bike.noOfWheels();
		
		Vehical car = new FourWheeler();
		car.noOfWheels();

	}

}
