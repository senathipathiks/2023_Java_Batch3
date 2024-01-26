package Day1;
class AllShapes {
    void draw() {
        System.out.println("There is a set of procedures to draw shapes");
    }
}

class Square extends AllShapes {
    void draw() {
        System.out.println("Make the Diagram of Square with equal four lines");
    }
}

class Rectangle extends AllShapes {
    void draw() {
        System.out.println("Make the Diagram of Rectangle  with equal two length lines and  two breadth lines");
    }
}


class Circle extends AllShapes {
	void draw() {
        System.out.println("Make the Diagram of Circle  with a diameter which is equal to half of a radius");
    }
}
public class Shapes {

	public static void main(String[] args) {
		
		AllShapes A1 =new AllShapes();
		A1.draw();
		Square S1 =new Square();
		S1.draw();
		Rectangle R1 = new Rectangle();
		R1.draw();
		Circle C1 =new Circle();
		C1.draw();
		
	}

}
