package Day_1;

/*
 * Create a class named Shape as base class and create the subclasses named Circle,Rectangle,Square.
 *  Override the draw method in the subclasses.

 */

class Shape{
	void draw() {
		System.out.println("We can draw so many shapes");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Circle has one centre");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle has 4 corners and adjacent sides are equal");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Square has 4 corners and all sides are equal");
	}
}

public class Draw {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape r=new Rectangle();
		Shape s=new Square();
		
		c.draw();
		r.draw();
		s.draw();
		

	}

}
