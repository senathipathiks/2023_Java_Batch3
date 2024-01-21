package Com.Day1;

/*Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
Square. Override the draw method in the subclasses.*/

class Shape{
	void draw() {
		System.out.println("We can draw various shapes..");
	}
}
class Circle extends Shape{
		void draw() {
			System.out.println("Circle is round in shape..");
		}
		}
	class Rectangle extends Shape{
		void draw() {
			System.out.println("Rectangle have length and breadth..");
		}
	}
	class Triangle extends Shape{
		void draw() {
			System.out.println("Triangle has 3 corners..");
		}
	}
	
public class Shapes {

	public static void main(String[] args) {
		Shape obj1=new Shape();
		Circle obj2=new Circle();
		Rectangle obj3=new Rectangle();
		Triangle obj4=new Triangle();

		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj4.draw();
		

}

}
