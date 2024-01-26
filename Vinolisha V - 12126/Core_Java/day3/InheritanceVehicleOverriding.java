package com.day3;

class Vehicle{
	int speed;
	
	public void speedUp() {
		speed+=10;
	}

	public int getSpeed() {
		return speed;
	}

	
}

class Car extends Vehicle{
	@Override
	public void speedUp() {
		
	}
}

public class InheritanceVehicleOverriding {

	public static void main(String[] args) {
		

	}

}
