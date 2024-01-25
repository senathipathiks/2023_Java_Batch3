package rel.oops.day5.abstraction;

interface Loan1 {
	void intrest();
}

class HousingLoan1 implements Loan1 {

	@Override
	public void intrest() {
		System.out.println("Housing Loan intrest Rate is 8.0");
	}

}

class PersonalLoan1 implements Loan1 {

	@Override
	public void intrest() {
		System.out.println("Housing Loan intrest Rate is 15.0");
	}

}

class VehicleLoan1 implements Loan1 {

	@Override
	public void intrest() {
		System.out.println("Vehicle Loan intrest Rate is 11.0");
	}

}

public class Loan1Driver {
	
	public static void main(String[] args) {
		
		Loan1 hl = new HousingLoan1();
		Loan1 pl = new PersonalLoan1();
		Loan1 vh = new VehicleLoan1();
		
		hl.intrest();
		pl.intrest();
		vh.intrest();
		
	}

}
