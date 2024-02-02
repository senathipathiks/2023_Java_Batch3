package com.day10;

class Vehicles{
	void speedUp() {
		System.out.println("All vehicles Runs at Speed");
	}
}

class Bicycle extends Vehicles{
	void speedUp() {
		System.out.println("Bicycles can runs at Max speed of 30 KMH");
	}
}

class NanoCar extends Vehicles{
	void speedUp() {
		System.out.println("NanoCar can runs at Max speed of 100 KMH");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		Vehicles bicycle = new Bicycle();
		bicycle.speedUp();
		Vehicles car = new NanoCar();
		car.speedUp();

	}

}
