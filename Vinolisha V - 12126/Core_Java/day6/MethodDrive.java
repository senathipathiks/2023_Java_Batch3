package com.day6;

interface Pen{
	default void color() {
		
	}
	
	public void write();
	
	static void reWrite() {
		System.out.println("Hello");
	}
}

public class MethodDrive {

	public static void main(String[] args) {
		// MethodDrive  m=new MethodDrive();
		
//		Pen p=new MethodDrive()::write;
//		p.write();
//		System.out.println(p);

	}

}
