package Com.Day5;

interface Loan1{
	void interest();
}
class personalLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("Personal loan interest is 8.0%");
	}
	
}
class vehicleLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("vehicle loan interest is 13.0%");
}
}
class housingLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("Housing loan interest is 11.0%");
		
	}
	}
	


public class InterfaceEg {

	public static void main(String[] args) {
      Loan1 obj1 =new housingLoan1();
      obj1.interest();
      System.out.println("---------------------");
      
      Loan1 obj2 =new personalLoan1();
      obj2.interest();
      System.out.println("---------------------");
      
      Loan1 obj3 =new vehicleLoan1();
      obj3.interest();
      
	}
	

}
