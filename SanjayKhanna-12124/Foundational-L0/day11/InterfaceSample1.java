package com.day11;

interface VehiclePlan {
	void noOfENgine();
	void noOfWheels();
	void brandName();
}

class Bikes implements VehiclePlan{

	public void noOfENgine() {
		System.out.println("Bike will have Single Engine");
		
	}

	public void noOfWheels() {
		System.out.println("Bike will have Two Wheels ");
		
	}

	public void brandName() {
		System.out.println("Brand Name : YAMAHA");
		
	}
	

	
}

public class InterfaceSample1 {

	public static void main(String[] args) {
		VehiclePlan bike = new Bikes();
		bike.noOfENgine();
		bike.noOfWheels();
		bike.brandName();

	}

}
