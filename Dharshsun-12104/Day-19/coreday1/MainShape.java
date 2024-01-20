package com.coreday1;

//Base class
abstract class Shape {
 abstract void draw();
}

//Subclass for Circle
class Circle extends Shape {
 void draw() {
     System.out.println("Drawing Circle");
 }
}

//Subclass for Rectangle
class Rectangle extends Shape {
 void draw() {
     System.out.println("Drawing Rectangle");
 }
}

//Subclass for Square
class Square extends Shape {
 void draw() {
     System.out.println("Drawing Square");
 }
}

//Main class
public class MainShape {
 public static void main(String[] args) {
     Shape s;
     s = new Circle();
     s.draw();

     s = new Rectangle();
     s.draw();

     s = new Square();
     s.draw();
 }
}
