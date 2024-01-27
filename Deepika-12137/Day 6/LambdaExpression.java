package com.day6;

interface Drawable{
	void draw();
}
public class LambdaExpression {
	public static void main(String[] args) {
		int width=10;
		
	    Drawable obj=new Drawable() {
			public void draw() {System.out.println("Drawing "+width);}
		};
		    obj.draw();
			Drawable d1=()->{
				System.out.println("Drawing "+width);
			};
		d1.draw();
	}
}
	    


