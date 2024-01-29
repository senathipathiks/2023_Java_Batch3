package day3exception;

class CheckMonth extends Exception{
	public CheckMonth(String msg) {
		super(msg);
	}
}

class ValidMonth{
	public ValidMonth(int mon) throws CheckMonth {
		// TODO Auto-generated constructor stub
		if(mon<=0 || mon>12 )
          {
			throw new CheckMonth("Not valid month");
			
		}
		else {
			
			System.out.println("VALID Month");
		}
	}
}
public class CustomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidMonth v=new ValidMonth(8);
		} catch (CheckMonth e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
