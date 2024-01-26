package Day5;

abstract class Loan {
	abstract void interest();
}

class HousingLoan extends Loan {

	@Override
	void interest() {
		System.out.println("Interest rate is:8.0");

	}

}

class PersonalLoan extends Loan {

	@Override
	void interest() {
		System.out.println("Interest rate is:11.0");

	}

}

class VehicleLoan extends Loan {

	@Override
	void interest() {
		System.out.println("Interest rate is:15.0");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		VehicleLoan obj1 = new VehicleLoan();
		obj1.interest();

		PersonalLoan obj2 = new PersonalLoan();
		obj2.interest();

		HousingLoan obj3 = new HousingLoan();
		obj3.interest();

	}

}
