package com.day6;
interface Shape{
	void draw();
	
	}
public class MethodRef {
	public static void construct() {
		System.out.println("Shape constructing process... ");
	}
	public static void main(String[] args) {
		Shape obj= MethodRef::construct;
		obj.draw();
	}

}
