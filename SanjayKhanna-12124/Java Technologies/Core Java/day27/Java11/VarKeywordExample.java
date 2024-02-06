package com.day27.Java11;

interface Drawable{
	void draw();
}

public class VarKeywordExample {

	public static void main(String[] args) {
		
//		int width = 10;
		
		var width = 10;
		
//		Drawable d1 = () -> {
//			System.out.println("Width : "+width);
//		};
//		
//		d1.draw();
		
		Drawable d1 = () -> {
			var localWidth = width;
			System.out.println("Width : "+localWidth);
		};
		
		d1.draw();
		
		

	}

}
