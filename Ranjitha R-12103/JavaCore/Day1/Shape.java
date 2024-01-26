//Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
//Square. Override the draw method in the subclasses.

package Day1;

class Shapes{
	void draw() {
		System.out.println("Shape");	
	}
}
class Circle extends Shapes{
	void draw() {
		System.out.println("Circle");
	}
}
class Rectangle extends Shapes{
	void draw() {
		System.out.println("Rectangle");
	}
}
class Square extends Shapes{
	void draw() {
		System.out.println("Square");
	}
}
public class Shape {

	public static void main(String[] args) {
		Shapes s1=new Shapes();
		s1.draw();
		Circle c1=new Circle();
		c1.draw();
		Rectangle r1=new Rectangle();
		r1.draw();
		Square sq1=new Square();
		sq1.draw();

	}

}
