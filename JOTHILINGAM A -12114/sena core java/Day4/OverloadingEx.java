package Day4;

public class OverloadingEx {
	
	public static void area() {
		System.out.println("area of circle is: "+3.14*7*7);
	}
	
	public static void area(int side) {
		System.out.println("area of square is: "+side*side);
	}
	
	public static void area(int l,int b) {
		System.out.println("area of Rectangle is: "+l*b);
	}

	public static void main(String[] args) {
		
		area();
		area(7);
		area(6, 7);
	}

}
