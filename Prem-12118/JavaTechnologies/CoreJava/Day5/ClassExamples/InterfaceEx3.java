package Day5.ClassExamples;

interface Loan1{
	//abstract 
	void interest();
}
class HouseLoan implements Loan1{
	public void interest()
	{
		System.out.println("Interst is 8.00");
	}
}

class PersonLoan implements Loan1{
	public void interest()
	{
		System.out.println("Interst is 11.00");
	}
}
class VehLoan1 implements Loan1{
	public void interest()
	{
		System.out.println("Interst is 9.00");
	}
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		 VehLoan1 obj1 = new VehLoan1();
		 obj1.interest();
		 Loan1 obj2 = new PersonLoan();
		 obj2.interest();

	}

}
