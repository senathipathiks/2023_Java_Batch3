package Day5;

abstract class Loan{
	abstract void intrest();
}
class HousingLoan extends Loan{
	@Override
	void intrest() {
		System.out.println("Interst Rate is : 8.0");
	}
	
}

class PersonalLoan extends Loan{
	@Override
	void intrest() {
		System.out.println("Interst Rate is : 11.0");
	}
	
}

class VehiclelLoan extends Loan{
	@Override
	void intrest() {
		System.out.println("Interst Rate is : 15.0");
	}
	
}

public class mainLoan {

	public static void main(String[] args) {
		
		
		HousingLoan h=new HousingLoan();
		h.intrest();
		
		PersonalLoan p=new PersonalLoan();
		p.intrest();
		
	VehiclelLoan v=new VehiclelLoan();
		v.intrest();
		
		

	}

}
