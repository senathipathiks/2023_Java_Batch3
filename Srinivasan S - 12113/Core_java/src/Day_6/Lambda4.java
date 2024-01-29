package Day_6;
@FunctionalInterface
interface Square{
	int calci(int x);
	String toString();
}

public class Lambda4 {

	public static void main(String[] args) {
		int side=15;
		Square sq=(x)-> x*x;
		System.out.println(sq.calci(side));

	}

}
