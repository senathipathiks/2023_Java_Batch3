package com.day6Java8;
interface Drawable{
	void draw();
}
public class LambdaExpression {

	public static void main(String[] args) {
	int width=40;
	int height=20;
	//without lambda expression
	Drawable d= new Drawable()
	{
		public void draw()
		{
	System.out.println("Drawing : "+height);
	}
		
	};
	d.draw();
	
	//with lambda
	Drawable d2=()->{
		System.out.println("Drawing : "+width);
	};
	d2.draw();
	}

}
