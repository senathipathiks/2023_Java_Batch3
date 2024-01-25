package Com.Day4;

public class OverloadingExample {
//method overloading
	public static void area()
	{
		System.out.println(3.14*7*7);
	}
	public static void area(int side) {
		System.out.println(side*side);
	}
	public static void area(int l,int b) {
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		area();// we can call the method without object creation when it is static++
		area(4);
		area(4,3);

	}

}
