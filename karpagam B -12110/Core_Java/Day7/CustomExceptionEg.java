package Com.Day7;

class InvalidNo extends Exception{
    InvalidNo(String msg) {
     super(msg);
}
}
public class CustomExceptionEg {

	public static void main(String[] args) {
		int num=110;
		try {
			if(num>100)
				throw new InvalidNo("Number is invalid! please provide the number betweeb 1 to 100");
		}
		catch(InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("This is Custom generated Exception");
		

	}

}
