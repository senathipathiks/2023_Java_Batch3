package Day_5;

interface Loan1{
	void interest1();
}

class HousingLoan1 implements Loan1{

	@Override
	public void interest1() {
		System.out.println("Housing loan Interest rate is: 8.0 %");
		
	}
	
}

class PersonalLoan1 implements Loan1{

	@Override
	public void interest1() {
		System.out.println("Personal loan Interest rate is: 11.5 %");
		
	}
}

class VehicleLoan1 implements Loan1{

	@Override
	public void interest1() {
		System.out.println("Vehicle loan Interest rate is: 15.2 %");
		
	}
	
}

public class InterfaceEg1 {

	public static void main(String[] args) {
		HousingLoan1 h1=new HousingLoan1();
		PersonalLoan1 p1=new PersonalLoan1();
		VehicleLoan1 v1=new VehicleLoan1();
		
		h1.interest1();
		p1.interest1();
		v1.interest1();
		

	}

}
