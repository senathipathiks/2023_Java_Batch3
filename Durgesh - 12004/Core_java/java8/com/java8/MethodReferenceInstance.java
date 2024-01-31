package com.java8;

interface Shape {
	void width();
}

public class MethodReferenceInstance {

	public void rectangle() {
		System.out.println("It is a rectangle with width = 10");
	}
	
	public static void main(String[] args) {
		MethodReferenceInstance obj = new MethodReferenceInstance();
		Shape s1 = obj::rectangle;
		s1.width();
		
		//anonymous call
		Shape h = new MethodReferenceInstance()::rectangle;
		h.width();
	}

}
