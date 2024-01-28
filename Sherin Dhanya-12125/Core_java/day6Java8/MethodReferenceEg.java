package com.day6Java8;
interface Shape{
	void draw();
}
//reference to static method
public class MethodReferenceEg {

	public static void construct() {
System.out.println("Shape constructing process");
	}
	public static void main(String[] args) {
		Shape obj=MethodReferenceEg::construct;
		obj.draw();
	}

}
