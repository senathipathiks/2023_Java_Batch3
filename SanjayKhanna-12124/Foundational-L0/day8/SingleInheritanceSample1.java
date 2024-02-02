package com.day8;

class TwoWheeler{
	void disMessage() {
		System.out.println("This will have Always 2 Wheels because It's belong to Two Wheeler");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name : Hero Honda Splender");
	}
}

public class SingleInheritanceSample1 {

	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.disMessage();
		bike.brandName();

	}

}
