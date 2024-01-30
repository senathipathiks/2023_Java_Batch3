package Day_5;

class InvalidNo extends Exception {
	public InvalidNo(String str) {
		
		super(str);
	}
}

public class ExceptionEgTwo {

	public static void main(String[] args) {
		
		int num = 110;
		try {
			if (num>100) {
				throw new InvalidNo("Number is Invalid : Provide the valid Number from 1 - 100" );
			}
		} catch (InvalidNo e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		System.out.println(" Custom Generated Exception !!");
	}

}
