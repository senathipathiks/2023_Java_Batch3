public class Calculator{
	public static void main(String[] arg){
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		System.out.println("Sum : "+(a+b));
		System.out.println("Subract : "+(a-b));
		System.out.println("Multiply : "+(a*b));
		System.out.println("Divide : "+(a/b));
		System.out.println("Reminder : "+(a%b));
	}
}