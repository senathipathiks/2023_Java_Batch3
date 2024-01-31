package com.java8;

abstract sealed class Vehicle permits TwoWheeler {

	int regno;
	String name;
	String brand;

	public Vehicle(int regno, String name, String brand) {
		this.regno = regno;
		this.name = name;
		this.brand = brand;
	}

	void display() {
		System.out.println("Vehicle number: " + regno + " \nVehicle name: " + name + " \nVehicle brand: " + brand);
	}
}

public class SealedClassEx1 {
	public static void main(String[] args) {
		Scooty s = new Scooty(2003, "Jupiter", "Honda");
		s.display2();
		s.display1();
		s.display();
	}
}

non-sealed class TwoWheeler extends Vehicle {
	int tregno;
	String tname;
	String tbrand;

	public TwoWheeler(int tregno, String tname, String tbrand) {

		super(3747, "Meteor", "Royal Enfield");
		this.tregno = tregno;
		this.tname = tname;
		this.tbrand = tbrand;
	}

	void display1() {
		System.out.println("Vehicle number: " + tregno + " \nVehicle name: " + tname + " \nVehicle brand: " + tbrand);
	}
}

final class Scooty extends TwoWheeler {
	int sregno;
	String sname;
	String sbrand;

	public Scooty(int sregno, String sname, String sbrand) {

		super(5070, "Shine", "Honda");
		this.sregno = sregno;
		this.sname = sname;
		this.sbrand = sbrand;
	}

	void display2() {
		System.out.println("Vehicle number: " + tregno + " \nVehicle name: " + tname + " \nVehicle brand: " + tbrand);
	}
}
