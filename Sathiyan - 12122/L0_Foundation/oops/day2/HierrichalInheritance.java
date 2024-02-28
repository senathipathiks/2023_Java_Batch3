package com.oops.day2;


class Vehicles{
	void noofEngine() {
		System.out.println("I have one engine");
	}
	
}

class TwoWheelerss extends Vehicles{
	
	void noOfWheels(){
		System.out.println("I have 2 wheels");
	}
}

class FourWheelers extends Vehicles{
	void brandName() {
		System.out.println("My brand is KIA");
	}
}



public class HierrichalInheritance {

	public static void main(String[] args) {
		
		TwoWheelerss obj1=new TwoWheelerss();
		obj1.noofEngine();
		obj1.noOfWheels();
		
		System.out.println("*****************************************");
		
		FourWheelers obj2=new FourWheelers();
		obj2.noofEngine();
		obj2.brandName();
		
	}

}
