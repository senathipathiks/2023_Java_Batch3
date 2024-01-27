package Day6;
@FunctionalInterface
interface Square{
	int calculate(int x);
}
public class Functionalinterface {

	public static void main(String[] args) {
		Square s = (x)->x*x;
		System.out.println(s.calculate(5));

	}

}
