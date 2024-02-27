package com.day6.seminar;

interface Shape{
	void draw();
}

public class MethodReferenceExample {
	
	public static void construction() {
		System.out.println("Constructing...");
	}

	public static void main(String[] args) {
		Shape obj=MethodReferenceExample::construction;
		obj.draw();
	}

}
