package day2oops;

interface Loan1{
	void intrest();
}
class HouseLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Intrest rate for HouseLoan is 88.0");
	}
}
class PersonalLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Intrest rate for PersonalLoan is 111.0");
	}
}
class VechicleLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Intrest rate for VechicleLoan is 133.0");
	}
}
public class LoanInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseLoan1 h=new HouseLoan1();
		h.intrest();
		PersonalLoan1 p=new PersonalLoan1();
		p.intrest();
		VechicleLoan1 l=new VechicleLoan1();
		l.intrest();
	}

}
