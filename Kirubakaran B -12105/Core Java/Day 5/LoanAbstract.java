package day2oops;

abstract class Loan{
	abstract void intrest();
}
class HouseLoan extends Loan{
	void intrest() {
		System.out.println("Intrest rate for HouseLoan is 8.0");
	}
}
class PersonalLoan extends Loan{
	void intrest() {
		System.out.println("Intrest rate for PersonalLoan is 11.0");
	}
}
class VechicleLoan extends Loan{
	void intrest() {
		System.out.println("Intrest rate for VechicleLoan is 13.0");
	}
}


public class LoanAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseLoan h=new HouseLoan();
		h.intrest();
		PersonalLoan p=new PersonalLoan();
		p.intrest();
		VechicleLoan l=new VechicleLoan();
		l.intrest();
		
		

	}

}
