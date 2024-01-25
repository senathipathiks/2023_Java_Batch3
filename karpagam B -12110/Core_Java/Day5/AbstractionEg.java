package Com.Day5;

abstract class Loan{
	public Loan() {
		System.out.println("This is a Constructor..");
	}
	abstract void interest();
	
}
class housingLoan extends Loan{

	@Override
	void interest() {
      System.out.println("Interest rate for Housing is 8.0%");	
	}
	
}
class personalLoan extends Loan{

	@Override
	void interest() {
	      System.out.println("Interest rate for personal is 11.0%");	

	}
	
}
class vehicleLoan extends Loan{

	@Override
	void interest() {
	      System.out.println("Interest rate for vehicle  is 13.0%");	
		
	}
	
}
public class AbstractionEg {

	public static void main(String[] args) {
		Loan obj1=new vehicleLoan();
		obj1.interest();
		
		Loan obj2=new personalLoan();
		obj2.interest();
		

	}

}
