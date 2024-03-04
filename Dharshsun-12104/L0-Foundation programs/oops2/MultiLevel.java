package com.oops2;


class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class Scooty extends Vehicle{
		void noOfWheels() {
			System.out.println("I have two wheels");
		}
	}
class Moped extends Scooty{
		void bikeName() {
			System.out.println("My brand name is RE" );
		}
	}

	
	public class MultiLevel {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scooty bike = new Scooty();
			Moped bike1 = new Moped();
			bike.noOfEngine();
			bike.noOfWheels();
			bike1.bikeName();
		}
	}
