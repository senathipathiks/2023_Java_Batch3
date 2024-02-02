package Day7;

public class sampleException {

	public static void main(String[] args) {


			
		int a[]= {1,2,3,4,0};
			
			int b=10;
			
			try {
				int c=b/a[5];
			}
			
			catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
				
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBound Exception Exception hey");
			}
			catch (Exception e) {
				System.out.println(e+"hey");
			}

	}

}
