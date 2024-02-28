package Day5.ClassExamples;
abstract class Loan{
	abstract void display();
	
}
class HousingLoan extends Loan{
	
	void display() {
		System.out.println("Interest is :8.0");
	}
}
class PersonalLoan extends Loan{
	
	void display() {
		System.out.println("Interest is :11.0");
	}
}
class VehicleLoan extends Loan{
	
	void display() {
		System.out.println("Interest is: 15.0");
	}
}


public class AbstractEx1 {

	public static void main(String[] args) {
	 
		HousingLoan h=new HousingLoan();
		h.display();
		PersonalLoan p=new PersonalLoan();
		p.display();
		VehicleLoan v =new VehicleLoan();
		v.display();
 
	}

}
