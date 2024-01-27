package Day_5;

abstract class Loan{
	abstract void interest();
	
}

class HousingLoan extends Loan{

	@Override
	void interest() {
		System.out.println("Housing loan Interest rate is: 8.0 %");
		
	}
	
}

class PersonalLoan extends Loan{

	@Override
	void interest() {
		System.out.println("Personal loan Interest rate is: 11.5 %");
		
	}
}

class VehicleLoan extends Loan{

	@Override
	void interest() {
		System.out.println("Vehicle loan Interest rate is: 15.2 %");
		
	}
	
}

public class AbsEg1 {

	public static void main(String[] args) {
		VehicleLoan v=new VehicleLoan();
		v.interest();
		
		Loan p=new PersonalLoan();
		p.interest();
		
		Loan ve=new VehicleLoan();
		ve.interest();
	}

}
