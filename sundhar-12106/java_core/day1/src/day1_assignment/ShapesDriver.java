package day1_assignment;

abstract class Shapes{
	
	public abstract void draw();
}

class Circle extends Shapes{

	@Override
	public void draw() {
		System.out.println("I'm Drawing a Circle");
	}
	
}

class Rectangle extends Shapes{

	@Override
	public void draw() {
		System.out.println("I'm Drawing Rectangle");
	}
	
}

class  Square extends Shapes{

	@Override
	public void draw() {
		System.out.println("I'm Drawing Square");
	}
	
}

public class ShapesDriver {
	
	public static void main(String[] args) {
		
		Shapes circle = new Circle();
		Shapes rectangle = new Rectangle();
		Shapes square = new Square();
		
		circle.draw();
		rectangle.draw();
		square.draw();
	}

}
