package com.oops.day2;



class TwoWheeler{
	
	void noOfWheels(){
		System.out.println("I have 2 wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("My brand is YAMAHA");
	}
}


public class Inhertance1 {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.noOfWheels();
		obj.brandName();

	}

}
