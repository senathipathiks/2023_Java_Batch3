package CoreTopic;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Shapemain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}

