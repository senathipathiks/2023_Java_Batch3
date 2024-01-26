package com.day4;

class Vehical{
	void noOfWheels() {
		System.out.println("Vehical will have wheels");
	}
}
class TwoWheeler extends Vehical{
	@Override
	void noOfWheels() {
		System.out.println("Vehicle will have only two wheels");
	}
}
class FourWheeler extends Vehical{
	@Override
	void noOfWheels() {
		System.out.println("Vehicle will have four wheels");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		Vehical bike=new TwoWheeler();
		bike.noOfWheels();
		
		Vehical car=new FourWheeler();
		car.noOfWheels();

	}

}
