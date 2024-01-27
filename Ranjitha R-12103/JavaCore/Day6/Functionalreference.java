package Day6;

interface Square {
	int calculate(int x);

	String toString();
}

public class Functionalreference {

	public static void main(String[] args) {
		int side = 10;
		Square obj = (x) -> x * x;
		System.out.println("Square: " + obj.calculate(side));

	}

}
