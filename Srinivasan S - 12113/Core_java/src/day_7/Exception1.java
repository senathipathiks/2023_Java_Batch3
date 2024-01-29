package day_7;
/*
 * It is only possible to put specific catch block first (eg: Arithmetic Exception at line 14,IndexOutOfBounds Exception at line 17)
 * and generalized catch block at last(eg: Exception at line 20).
 * 
*/

public class Exception1 {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			int c=a/b;
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (IndexOutOfBoundsException  e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e+"General exception");
		}
			

	}

}
