package Day7;

class InvalidNo extends Exception{
	public InvalidNo(String msg) {
		super(msg);
}
}

public class CustomException1 {

	public static void main(String[] args) {
		
		int num=110;
		
		try {
			if(num >100)
				throw new InvalidNo("Number Is Invalid:\n provide the number between 1 to 100");
			
		} catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n Custom Generated Exception");

	}

}


