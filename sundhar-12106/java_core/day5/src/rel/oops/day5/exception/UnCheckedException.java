package rel.oops.day5.exception;

public class UnCheckedException {
	
	public static void main(String[] args) {
		
		int a = 10 ,b = 0 ;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
