package com.day12;

class Vehicle{
	protected int regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	public Vehicle(int regnNumber, int speed, String color, String ownerName) {
		this.regnNumber=regnNumber;
		this.speed=speed;
		this.color=color;
		this.ownerName=ownerName;
	}
	void showData() {
		System.out.println("This is a Vehicle class");
	}
}

class Bus extends Vehicle{
	private int routeNumber;
	public Bus(int num,int speed,String color,String name,int routeNumber) {
		super(num,speed,color,name);
		this.routeNumber=routeNumber;
	}
	public void showData() {
		System.out.println("This is a Bus class");
		System.out.println("Registration Number :"+regnNumber);
		System.out.println("Speed : "+speed);
		System.out.println("Color : "+color);
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Route Number : "+routeNumber);
		System.out.println("--------------------------------------");
	}
}

class Car extends Vehicle{
	private String manufacturerName;
	public Car(int num,int speed,String color,String name,String manufacturerName) {
		super(num,speed,color,name);
		this.manufacturerName=manufacturerName;
	}
	public void showData() {
		System.out.println("This is a Car class");
		System.out.println("Registration Number :"+regnNumber);
		System.out.println("Speed : "+speed);
		System.out.println("Color : "+color);
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Manufacturer Name : "+manufacturerName);
		System.out.println("--------------------------------------");
	}
}

public class MainClass1 {

	public static void main(String[] args) {
		Vehicle bus = new Bus(12124, 80,"Green","Sanjay", 17);
		bus.showData();
		
		Vehicle car = new Car(12122, 150,"Grey","Khanna","Hundai Motors");
		car.showData();

	}

}
