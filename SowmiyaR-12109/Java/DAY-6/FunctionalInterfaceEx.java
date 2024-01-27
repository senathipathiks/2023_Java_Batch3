package Day6;

interface Square{
	int calculate(int x);
	
	String toString();
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int side=15;
           Square square=(x)->x*x;
           System.out.println("Square: "+square.calculate(side));
	}

}
