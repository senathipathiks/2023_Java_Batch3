package com.Day6;


@FunctionalInterface

interface Drawable{
	
	void draw();
}

public class LamdaFunction {

	public static void main(String[] args) {
		
		int width = 10;
		
		
		Drawable d = new Drawable() {
			
			public void draw() {
				System.out.println("Draw width :"+width);
			}
		};
		
		d.draw();
		
		
		// Lambda function
		
		Drawable d2=()->{
			
			System.out.println("Draw width :"+width);
		};
		
		d2.draw();
			
			
		

	}

}
