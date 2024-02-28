package Day6;
 
interface Square{
	int Calculate(int x);
	String toString();
}

public class FunctionalInterface {

	public static void main(String[] args) {

		int size=15;
        Square s =(x)-> x*x;
  System.out.println("Square:"+ s.Calculate(size));
	}

}
