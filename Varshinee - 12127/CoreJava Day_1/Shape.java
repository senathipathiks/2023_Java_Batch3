//Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
//Square. Override the draw method in the subclasses.
package Day_1;

abstract class Shapes {
	abstract void draw() ;
}
	class Circle extends Shapes{
		void draw() {
			System.out.println("Drawing Circle");
		}
	}
	class Rectangle extends Shapes{
		void draw() {
				System.out.println("Drawing Rectangle");
		}
	}
	class Square extends Shapes{
		void draw() {
			System.out.println("Drawing Square");
		}
	}

public class Shape{ 
	
public static void main(String[] args) {
		Shapes obj =new Circle();
		obj.draw();
		
		Shapes obj1=new Rectangle();
		obj1.draw();
		
		Shapes obj2=new Square();
		obj2.draw();
		
	}

	}


