package Day5;

interface  Loan1{
	void intrest();
}
class HousingLoan1 implements Loan1{
	@Override
	public
	void intrest() {
		System.out.println("Interest Rate is : 8.0");
	}
	
}

class PersonalLoan1 implements Loan1{
	@Override
	public
	void intrest() {
		System.out.println("Interest Rate is : 11.0");
	}
	
}

class VehiclelLoan1 implements Loan1{
	@Override
	public
	void intrest() {
		System.out.println("Interest Rate is : 15.0");
	}
	
}

public class MainLoanInterface {

	public static void main(String[] args) {
		
		
		HousingLoan1 h=new HousingLoan1();
		h.intrest();
		
		PersonalLoan1 p=new PersonalLoan1();
		p.intrest();
		
	VehiclelLoan1 v=new VehiclelLoan1();
		v.intrest();
		
		

	}

}
