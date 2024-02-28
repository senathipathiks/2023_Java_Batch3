package Day7;

class InvalidNo extends Exception {

	InvalidNo(String msg) {
		super(msg);
	}
}

public class CustomExceptionEx1{

	public static void main(String[] args) {

		int num1 = 100;
		try {
			if (num1 > 100) {
				throw new InvalidNo("Number is invalid:Provide the valid number between 1-100");

			}
		} catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Custom exception closed...!");
	}

}
