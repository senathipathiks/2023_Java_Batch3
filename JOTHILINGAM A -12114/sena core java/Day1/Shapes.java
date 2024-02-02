//Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
//Square. Override the draw method in the subclasses.


package Day1;

abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw() {
        System.out.println("Drawing Circle");
    }
    
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square extends Shape{
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Shapes {

    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.draw();
        
        Shape s2=new Rectangle();
        s2.draw();
        
        Shape s3=new Square();
        s3.draw();
        
    }

}