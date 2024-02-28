package com.oops.day4;

class Vehiclee{
	void speedUp() {
		System.out.println("All vehicles are runs in particular speed");
	}
	
}

class Bicycle extends Vehiclee{
	void speedUp(){
		System.out.println("Cycle can runs in 30kmph");
	}
	
}

class Car extends Vehiclee{
	void speedUp() {
		System.out.println("Car can runs upto 150kmph");
		
	}
	
}

public class Mainclass {

	public static void main(String[] args) {
		Bicycle ref=new Bicycle();
		Car ref2=new Car();
		ref.speedUp();
		ref2.speedUp();

	}

}
