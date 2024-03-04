package com.oopsassign4;

abstract class Shape1 {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Circle.java
// Subclass Circle
class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
// Rectangle.java
// Subclass Rectangle
class Rectangle1 extends Shape1 {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}


class Triangle1 extends Shape1 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class AssignProg6 {
    public static void main(String[] args) {
		double r = 4.0;
        Circle1 circle = new Circle1(r);
		double rs1 = 4.0, rs2 = 6.0;
		double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Rectangle1 rectangle = new Rectangle1(rs1, rs2);
        Triangle1 triangle = new Triangle1(ts1, ts2, ts3);
        System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());
		System.out.println("\nSides of the rectangle are: "+rs1+','+rs2);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
		System.out.println("\nSides of the Triangle are: "+ts1+','+ts2+','+ts3);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
    }
}

