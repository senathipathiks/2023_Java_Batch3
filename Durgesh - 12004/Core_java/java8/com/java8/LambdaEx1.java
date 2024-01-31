package com.java8;

//functional interface
interface Paint {
	public void coloring();
}
public class LambdaEx1 {
	public static void main(String[]args) {
		String color = "Green";
		
		Paint d = new Paint() {
			
			@Override
			public void coloring() {
				System.out.println("Color of the Paint: "+color);
			}
		};
		d.coloring();
		
		Paint dr =()->{
			var localvar = color;
			System.out.println("Color of the Paint : "+color);
		};
		dr.coloring();
	}
}
