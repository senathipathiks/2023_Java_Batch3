package Java_Day_5;

interface Loan1{
	void interest();
}

class HousingLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is : 8.0");
	}
}
class PersonalLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is : 11.0");
	}
}
class VehicleLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is : 15.0");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		VehicleLoan1 obj1=new VehicleLoan1();
		obj1.interest();
		
		HousingLoan1 obj2=new HousingLoan1();
		obj2.interest();
		
		PersonalLoan1 obj3=new PersonalLoan1();
		obj3.interest();

	}

}
