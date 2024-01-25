package rel.day4.oops.polymorphism;

public class StaticBinding {
	
	public static void main(String[] args) {
		
		System.out.println(add());
		System.out.println(add(5,9));
		System.out.println(add(5.0,4.6));
		System.out.println(add(5,7,4));
		
	}

	public static double add() {
		return 5+5;
	}
	
	public static double add(int a ,int b) {
		return a+b;
		
	}
	
	public static double add(double a, double b) {
		return a+b;
		
	}
	
	public static double add(int a,int b,int c) {
		return a+b+c;
		
	}
}
