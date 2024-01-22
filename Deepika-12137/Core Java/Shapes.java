package oops;

public abstract class Shapes {
    public abstract void draw();
}


class Circle extends Shapes {
    
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shapes {
   
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Square extends Shapes {

    public void draw() {
        System.out.println("Drawing a square");
    }

public static void main(String shape[]) {
	Shapes s=new Circle();
	s.draw();
	Shapes s1=new Rectangle();
	s1.draw();
	Shapes s2=new Square();
	s2.draw();
}}