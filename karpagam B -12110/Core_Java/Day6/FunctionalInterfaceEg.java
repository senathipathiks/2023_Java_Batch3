package Com.Day6;

@FunctionalInterface

interface Square{
	int calculate(int x);
	
	String toString();
}
public class FunctionalInterfaceEg {

	public static void main(String[] args) {
		
		int side=15;
		
		Square obj1=(x)->x*x;
		System.out.println("Square is :"+obj1.calculate(side));

	}

}
