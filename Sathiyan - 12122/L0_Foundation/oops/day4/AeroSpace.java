package com.oops.day4;

interface Flyable{
	void fly_obj();
}

class Aeroplane implements Flyable{
	public void fly_obj() {
		System.out.println("Aeroplane Comes with Two engine");
	}
}

class Helicopter implements Flyable{
	public void fly_obj(){
		System.out.println("Helicopter comes with single Fan");
	}
}

class SpaceCraft implements Flyable{
	public void fly_obj() {
		System.out.println("SpaceCraft is a Advanced Technology");
	}
}

public class AeroSpace {

	public static void main(String[] args) {
		Flyable a=new Aeroplane();
		Flyable h=new Helicopter();
		Flyable s=new SpaceCraft();
		a.fly_obj();
		h.fly_obj();
		s.fly_obj();

	}

}
