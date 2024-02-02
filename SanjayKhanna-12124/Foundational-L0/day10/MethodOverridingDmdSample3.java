package com.day10;

class Bird{
	String color = "black";
	void skinColor() {
		System.out.println("All birds have their own skin color : "+color);
	}
}

class Parrot extends Bird{
	String color = "Green";
	
	void skinColor() {
		System.out.println("Parrot skin color : "+color);
	}
	
}

public class MethodOverridingDmdSample3 {

	public static void main(String[] args) {
		Bird obj = new Parrot();
		System.out.println("Color : "+obj.color);
		obj.skinColor();
	}

}
