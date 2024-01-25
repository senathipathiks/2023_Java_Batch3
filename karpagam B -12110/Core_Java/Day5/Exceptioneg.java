package Com.Day5;

public class Exceptioneg {

	public static void main(String[] args) {
      
		int a=10,b=0;
		
		//int c=a/b; -- by zero exception
		
		try {   //exception handling using try and catch
			int c=a/b;
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(a);
	}

}
