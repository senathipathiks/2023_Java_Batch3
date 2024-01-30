package core.day6;

public class Exp {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		System.out.println("main starts");
		try
		{
			System.out.println("try starts");
			System.out.println(x/y);
			System.out.println("try ends");
		}
		catch(Exception e)
		{
			System.out.println("AE hANDLED");
		}
		System.out.println("main ends");
		}
	

}
