package com.day6.seminar;

interface Drawable{
	void draw();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width=10;
		
		Drawable d=new Drawable() {
			public void draw() {
				System.out.println("Drawing : "+width);
			}
		};
		d.draw();
			
		Drawable d2=()->{
			System.out.println("Drawing : "+width);
		};
		d2.draw();
		
	};

}
