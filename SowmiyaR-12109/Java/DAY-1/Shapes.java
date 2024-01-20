package Day1;
//Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
//Square. Override the draw method in the subclasses.
abstract class Shape{
	abstract void  drawmethod();
}
class Circle extends Shape{
	public void drawmethod() {
		System.out.println("Circle");
	}	
}
class Rectangle extends Shape{
	public void drawmethod() {
		System.out.println("Rectangle");
	}	
}
class Square extends Shape{
	public void drawmethod() {
		System.out.println("Square");
	}	
}

public class Shapes {

	public static void main(String[] args) {
		Shape obj=new Circle();
		obj.drawmethod();
		
		Shape obj1=new Rectangle();
		obj1.drawmethod();
		
		Shape obj2=new Square();
		obj2.drawmethod();

	}

}
