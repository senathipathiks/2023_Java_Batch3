package com.day6;

@FunctionalInterface
interface Drawable{
	void draw();
}

public class LambdaExpressionEg {

	public static void main(String[] args) {
		
		int width=10;
		
		//without lambda, Drawable implementation using anonymous class
		
		Drawable obj=new Drawable() {
			public void draw() {
				System.out.println("Drawing" +width);
				}
			};
			obj.draw();
			
			//with lambda
			
			Drawable obj2=()->{
				System.out.println("Drawing" + width);
				
			};
			obj2.draw();
		}
	
}


