package core.day6;

class InvalidNo extends Exception {
	InvalidNo(String msg) {
		super(msg);
	}
}

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 110;
		try {
			if (num1 > 100)
				throw new InvalidNo("the number is invalid provide the valid number");

		} catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("custom generated exception");
	}

}
