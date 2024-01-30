package Day_4;

abstract class Loan{
	abstract void interest(); 
	
}

class PersonalLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is: 8.0");
	}
}

class HouseLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is: 15.0");
	}
}

class VehicleLoan extends Loan{
	
	void interest() {
		
		System.out.println("Interest Rate is: 11.0");
	}
}

public class AbstractClassEx1 {

	public static void main(String[] args) {
		
		VehicleLoan v = new VehicleLoan();
		v.interest();
		Loan l = new HouseLoan();
		l.interest();
		
		Loan l1 = new PersonalLoan();
		l1.interest();

	}

}
