package com.Day4Oops;
class Vehicle{
	void name() {
		System.out.println("Both Two and Four wheelers");
	}
}
class TwoWheeler extends Vehicle{
	void name() {
		System.out.println("Two wheelers");
	}
}
class FourWheeler extends Vehicle{
	void name() {
		System.out.println("Four wheelers");
	}
}
public class Vehicles {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.name();
		TwoWheeler two = new TwoWheeler();
		two.name();
		FourWheeler four = new FourWheeler();
		four.name();

	}

}
