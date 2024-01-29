package day_7;
//custom generated exception

class InvalidNo extends Exception{
	public InvalidNo(String msg) {
		super(msg);
	}
}


public class Exception2 {

	public static void main(String[] args) {
		int n=1000;
		try {
			if(n>100) {
				throw new InvalidNo("Number is invalid..Pls enter valid number");
			}
		} catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Custom generated exception");
	}

}
