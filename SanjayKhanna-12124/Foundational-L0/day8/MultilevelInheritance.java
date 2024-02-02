package com.day8;

class Vehical {
	void displayVehical() {
		System.out.println("This is a Vehical ");
	}
}

class FourWheeler extends Vehical{
	void displayFourWheeler() {
		System.out.println("This will Always have 4 Wheels because it's belong to Four Wheeler");
	}
}

class Car extends FourWheeler{
	void displayCar() {
		System.out.println("Brand Name : Maruti Suzuki");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.displayVehical();
		obj.displayFourWheeler();
		obj.displayCar();

	}

}
