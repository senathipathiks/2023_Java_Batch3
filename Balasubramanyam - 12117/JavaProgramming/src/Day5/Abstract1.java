package Day5;
abstract class Loan{
	abstract void interest();
}
class HouseLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is: 0.8");
	}
}
class PersonalLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is: 11.0");
	}
}
class VehicleLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is: 15.0");
	}
}
public class Abstract1 {
	public static void main(String[] args) {
		Loan l = new HouseLoan();
		l.interest();
		Loan l1 = new PersonalLoan();
		l1.interest();
		Loan l2 = new VehicleLoan();
		l2.interest();
		

	}

}
