package Day_4;

public class Polymorphism1 {
//	method overloading
	static void area() {
		System.out.println(3.14*7*7);
	}
	
	static void area(int side) {
		System.out.println(side * side);
	}
	
	static void area(int l,int b) {
		System.out.println(l*b);
	}

	public static void main(String[] args) {
		area();
		area(45);
		area(5,6);

	}

}
