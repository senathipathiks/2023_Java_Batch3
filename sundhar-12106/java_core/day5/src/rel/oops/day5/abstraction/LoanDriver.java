package rel.oops.day5.abstraction;

abstract class Loan{
	abstract void intrest();
}

class HousingLoan extends Loan{

	@Override
	void intrest() {
		System.out.println("Housing Loan Intrest Rate is 8.0%");
	}
	
}
class PersonalLoan extends Loan{

	@Override
	void intrest() {
		System.out.println("Personal Loan Intrest Rate is 15.0%");
	}
	
}

class VehicleLoan extends Loan{

	@Override
	void intrest() {
		System.out.println("Vehicle Intrest Rate is 11.0%");
	}
	
}

public class LoanDriver {

	public static void main(String[] args) {
		
		Loan hl = new HousingLoan();
		Loan pl = new PersonalLoan();
		Loan vh = new VehicleLoan();
		
//		System.out.println();
		hl.intrest();
		pl.intrest();
		vh.intrest();
	}
}
