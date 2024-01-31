package com.day1;

abstract class Shapes {
	abstract void draw(); 
}

class Circle extends Shapes {
	void draw() {
		System.out.println("Draw a circle with compass make a perfect round");
	}
}
class Square extends Shapes {
	void draw() {
		System.out.println("Draw a Square with ruler make a perfect line");
	}
}
class Rectangle extends Shapes {
	void draw() {
		System.out.println("Draw a rectangle with ruler with the klength and breadth ");
	}
}

public class Draw {

	public static void main(String[] args) {
		Shapes c1 = new Circle();
		Shapes s1 = new Square();
		Shapes r1 = new Rectangle();
		
		c1.draw();
		s1.draw();
		r1.draw();
	}

}
