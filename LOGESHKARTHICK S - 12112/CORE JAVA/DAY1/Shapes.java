package DAY1;

public class Shapes {
	interface Shape {
	    void draw();
	}

	class Circle implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

	class Rectangle implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing Rectangle");
	    }
	}

	class Square implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing Square");
	    }
	}

}
